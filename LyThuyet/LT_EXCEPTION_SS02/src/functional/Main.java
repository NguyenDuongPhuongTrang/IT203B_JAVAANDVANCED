package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        IColorable obj = new Shape();
        obj.draw();
        obj.fly();
//        obj.erase(); -> không truy cập dc
        IColorable.erase();

        // functional interface dựng sẵn
//        Consumer //Nhận vào đtg để xử lí mà k trả về cái gì, chỉ in
//        Predicate -> trả về true false
//        Function -> chuyển đổi dữ liệu
//        Supplier -> tự động tạo giá trị

        // Lambda expression: là cú pháp viết gọn của 1 method dùng để tạo nhanh
        //                    đối tượng từ functional interface
        IFunctional lb = (a, b) -> 1;
        // Trước java8:
        IFunctional i1 = new Cat();
//        IFunctional i2 = new IFunctional() { // lớp không tên, chỉ dùng dc 1 lần
//            @Override
//            public void save() {
//
//            }
//        };

        Comparator<Cat> com1 = (c1, c2) -> -1;
        Comparator<Cat> com2 = (c2, c1) -> 1;
        Collections.sort(new ArrayList<>(),(c1, c2) -> 1);

        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).map(value -> value * value)
                .forEach(t-> System.out.println(t));
    }
}
