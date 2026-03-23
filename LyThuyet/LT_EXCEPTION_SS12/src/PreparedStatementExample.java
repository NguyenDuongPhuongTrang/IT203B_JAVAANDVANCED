import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    // kế thừa Statement
    // // cho phép truyền tham số vào sql thông qua setter
    public static void main(String[] args) {
        // mở kết nối
        try (
                Connection conn = DBConnection.openConnection();
                // chuẩn bị câu lệnh
                PreparedStatement pre = conn.prepareStatement("Select * from Student where id = ?");
        ) {
            // truyền tham số nếu có
            pre.setInt(1, 2); // tìm theo mã student id = 2;
            // thực thi câu lệnh: excuteQuery nếu là SELECT, excuteUpdate nếu là INSERT, UPDATE, DELETE
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                // lấy thông qua get

            }

            // áp dụng thực hiện INSERT và UPDATE
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
