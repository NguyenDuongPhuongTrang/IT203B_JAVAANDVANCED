package optional;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // optional
        Optional<Integer> op1 = Optional.empty();
        Optional<Integer> op2 = Optional.of(2);
        Optional<Integer> op3 = Optional.ofNullable(2);

        if (op3.isPresent()){
            // có giá trị kahsc Null
            // Lấy ra giá trị
            System.out.println(op3.get());
        }

        //Lấy trục tiếp giá trị nếu nó tồn tại hoặc 1 giá trị chỉ định
        Integer val1 = op3.orElse(100);

        // Lấy trực tiếp giá trị hoặc ném ngoại lệ
        Integer val2 = op3.orElseThrow(() -> new RuntimeException("Lỗi"));

        // Vi du:
        List<Integer> randomList = Stream.generate(() -> new Random().nextInt(400) - 200)
                .limit(10)
                .toList();
        System.out.println(randomList);
        // Tim gia tri lon nhat trong danh sach
        Integer max = randomList.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println("max: " + max);
        // Tim ra gia tri dau tien chia het cho 3 trong danh sach
        Integer find = randomList.stream().filter(integer -> integer % 3 == 0)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Khong co so nao chia het cho 3"));
        System.out.println("find: " + find);
    }
}
