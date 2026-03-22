import java.sql.*;

public class DBConnection {
    // Khai báo các biến để kết nối với cơ sở dữ liệu
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";   // Tên driver của MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/";    // Địa chỉ của cơ sở dữ liệu
    private static final String USERNAME = "root";                        // Tên đăng nhập vào cơ sở dữ liệu
    private static final String PASSWORD = "061006";                      // Mật khẩu đăng nhập vào cơ sở dữ liệu
    private static final String SCHEMA = "student_management";           // Tên cơ sở dữ liệu

    // Hàm khởi tạo kết nối với cơ sở dữ liệu
    public static Connection openConnection(){
        try{
            // Đăng ký driver của MySQL
            Class.forName(DRIVER);
            // Trả về kết nối đến cơ sở dữ liệu
            System.out.println("Nguễn Dương Phương Trang kết nối thành công");
            return DriverManager.getConnection(URL+SCHEMA, USERNAME, PASSWORD);
        }catch (ClassNotFoundException e){
            // In ra thông báo nếu chưa cài đặt driver MySQL
            System.err.println("Chưa cài đặt mysql driver");
        } catch (SQLException e) {
            // In ra thông báo nếu kết nối thất bại
            System.err.println("Lỗi SQL: Kết nối thất bại");
            e.printStackTrace();
        }
        return null;
    }

    // Hàm tạo bảng Student nếu chưa tồn tại
    public static void main(String[] args) {
        try (
            Connection conn = openConnection();  // Mở kết nối với cơ sở dữ liệu
            Statement stm = conn.createStatement();  // Tạo đối tượng Statement để thực thi câu lệnh SQL
        ){
            String ddl = "create table if not exists Student(" +
                    "id int auto_increment primary key," +
                    "name varchar(255) not null," +
                    "gpa decimal(10,2) check(gpa > 0))";  // Câu lệnh tạo bảng Student nếu chưa tồn tại
            String sql = """
                    select name, gpa, id from Student
                    """;
            // Thực thi câu lệnh
            boolean isResult = stm.execute(sql); // true nếu có bản ghi trả về (ResultSet - SELECT) /false nếu không có bản ghi trả về
            // Xử lý kết quả trả về
            ResultSet rs = stm.getResultSet();
//            System.out.println(isResult);
            while (rs.next()){
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("GPA: " + rs.getString("gpa"));
                System.out.println("ID: " + rs.getString("id"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}