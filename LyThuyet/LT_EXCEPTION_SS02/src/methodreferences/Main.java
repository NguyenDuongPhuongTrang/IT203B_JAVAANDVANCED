package methodreferences;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tham chiếu của 1 phương thức

        // Duyệt qua 1 danh sách tên hsinh và in ra màn hình
        List<String> names = Arrays.asList("Sơn", "Trang");
        for (String name : names){
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        names.forEach(s -> {
            System.out.println(s);
        });

        names.forEach(Printer::print); // thay thế lambda

        // cách sử dụng:
        /*
        * ClassName :: method;
        * objName :: method;
        * ClasName :: new (hàm tọa)
        * */

        // biến đổi thành danh sách student
        List<Student> studentList = names.stream()
                .map(Student::new) // biến đổi từ chuỗi thành đối tượng student //s -> new Student(s)
                .toList();

        // Lọc ra những sinh viên trong tên có chữ h
        for (Student s : studentList){
            if (s.getName().contains("h")){
                System.out.println(s);
            }
        };

        studentList.stream().filter(student -> student.getName().contains("h"))
                .forEach(System.out::println);
    }
}
