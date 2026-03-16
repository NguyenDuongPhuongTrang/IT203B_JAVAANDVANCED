package re.project.utils;

public class Printer {
    // các phương thức chung cho các lớp sử dụng
    // in thông tin bthg
    public static void printInfo(String content){
        System.out.println(content);
    }

    // in cảnh báo Warning: vàng
    public static void printWarn(String content){
        System.out.println(content);
    }

    // in lỗi: đỏ
    public static void printError(String content){
        System.out.println(content);
    }
}
