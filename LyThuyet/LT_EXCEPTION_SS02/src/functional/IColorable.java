package functional;

public interface IColorable {
    String RED = "abc";
    void printColor(String color);
//    void fly(); -> thêm vào gây lỗi vì các lớp khác đều phải ghi đè
    //Java 8
    // phương thức mặc định, không bắt buộc lớp con phải ghi đè
    default void draw(){
        System.out.println("Tô màu");
    }
    default void fly(){}; //không lỗi, mở rộng dự án 1 cách linh hoạt
    static void erase(){ // thuộc về interface, không kế thừa
        System.out.println("Xóa");
    }
    private void toStr(){} // Java 9
}
