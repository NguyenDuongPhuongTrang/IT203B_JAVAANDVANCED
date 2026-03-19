public class Main {
    public static void main(String[] args) {
        // Một công ty xây dựng chương trình java để quản lý tập trung danh sách khách hàng
        /*
        *1 Xây dựng các thực thể (package rc.entity)
        * lớp customer gồm:
        * - thuộc tính:
        * + customer Id: String, mã khách hàng định dạng C + 3 số, không trùng lặp
        * + customerName String: Tên kahsch hàng, không được để trống
        * + email String: email hợp lệ chứa '@' và'.' không được trùng
        * + phone: String bằng đầu bằng 0, có 10-11 chữ soos
        * + customerType (String) loại khách hàng cá nhân, doanh nhiệp, wuu đaĩ
        * + registrationDate LocalDate: ngày đăng kí không lớn hơn nagyf hiện tại
        * - Phương thwusc:
        * + inputData(Scanner scanner): Nhập dữ liệu có validate
        * + displayData(): Hiển thị bảng rõ ràng
        * 2. Xây dựng lớp nghiệp vụ rc.business
        * Lớp CustomerBusiness:
        * Quản lý danh sách: List<Customer>
        Yêu cầu: Áp dụng Singleton Pattern, Bắt nuộc sử dụng StremAPI, Lambda, Optional
        * Chức năng:
        * + Hiển thị danh sách: dạng bảng, nêếu rỗng in thông báo lỗi
        * + Thêm mới: kiểm tra trùng id và email, nếu trùng in đã tồn tại
        * + Cập nhật: không cho sửa mã, nếu k tìm thấy in k tồn tại
        * + xóa: nếu không tìm thấy: báo lỗi
        * + Tìm kiếm theo tn: k phân biệt hoa thường, hiển thị kết quả + tôg số
        * + Sắp xếp: theo tên tăng dần
        * + Lọc theo laoij khách hàng
        * 3. xây dựng lớp giao diện rc. presentation
        * customermanagement:
        * MENU: System.out.println("=============== QUẢN LÝ KHÁCH HÀNG ===============");
        System.out.println("1. Hiển thị toàn bộ danh sách khách hàng");
        System.out.println("2. Thêm mới khách hàng");
        System.out.println("3. Cập nhật thông tin khách hàng theo mã");
        System.out.println("4. Xóa khách hàng theo mã");
        System.out.println("5. Tìm kiếm khách hàng theo tên");
        System.out.println("6. Lọc khách hàng theo loại");
        System.out.println("7. Sắp xếp khách hàng theo tên tăng dần");
        System.out.println("8. Thoát");
        System.out.println("Lựa chọn của bạn: ");
        * Quy tắc nghiệp vụ:
        * + Chức năng 2: Sau khi thêm, hỏi bạn có muốn thêm tiếp không Y/N
        * + chức năng 3 4: nếu k tìm thấy in ra k tồn tại
        * + cnang 3: cho phép chọn trường cập nhật, bỏ trống thì giữ nguyên
        * + cnang 6: Nhập loại kahsch hàng cần lọc
        * + tất cả chwusc nan phải dùng try-catch, không để chương tình bị dừng
        * */
    }
}
