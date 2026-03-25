import java.sql.*;

public class Main {
    public static void transferMoney(String senderId, String receiverId, double amount) {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String checkMoneySql = "select balance from accounts where accountId = ?";
        try {
            connection.setAutoCommit(false);
            PreparedStatement smtCheckMoney = connection.prepareStatement(checkMoneySql);
            smtCheckMoney.setString(1, senderId);
            ResultSet resultSet = smtCheckMoney.executeQuery();
            if (resultSet.next()) {
                double balance = resultSet.getDouble("balance");
                if (balance < amount) {
                    System.out.println("Số dư không đủ");
                    connection.rollback();
                }
            }

            String updateBalanceSql = "call p_UpdateBalance(?,?)";
            CallableStatement stmUpdateBalanceSender = connection.prepareCall(updateBalanceSql);
            stmUpdateBalanceSender.setString(1, senderId);
            stmUpdateBalanceSender.setDouble(2, -amount);
            int result1 = stmUpdateBalanceSender.executeUpdate();

            CallableStatement stmUpdateBalanceReceiver = connection.prepareCall(updateBalanceSql);
            stmUpdateBalanceReceiver.setString(1, receiverId);
            stmUpdateBalanceReceiver.setDouble(2, amount);
            int result2 = stmUpdateBalanceReceiver.executeUpdate();

            if (result1 <= 0 || result2 <= 0) {
                System.out.println("Chuyển tiền thất bại");
            } else {
                System.out.println("Chuyển tiền thành công");
            }

            connection.commit();

        } catch (SQLException e) {
            System.out.println("Chuyển tiền thất bại");
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        transferMoney("ACC01", "ACC02", 1000);
    }
}