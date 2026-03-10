package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // khái niệm stream api

        // duyệt mảng lúc trước
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer value : list){
            if (value == 2){
                list.remove(value);
            }
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 3){
                iterator.remove();
            }
        }
        System.out.println(list);

        // tạo stream: ARRAY và COLLECTION
        int[] arr = {1,2,3,4};
        IntStream streamInt = Arrays.stream(arr);

        Stream<Integer> stream2 = list.stream();

        // Thao tác trung gian: sorted, lits, distinct, filter, map,...
        IntStream stream3 = streamInt.filter(value -> value % 2 == 0);

        //Thao tác đầu cuối: sum, foreach, reduce, count, findFirst, findAny, anyMap, allMap, min,
        // max, average
        OptionalDouble avg = stream3.average();
        System.out.println(avg.getAsDouble());

        // Ví dụ: tạo 1 list 1000 số nguyên ngẫu nhiên từ -200 đến 200
        List<Integer> randomList = Stream.generate(() -> new Random().nextInt(400)-200)//tạo ngẫu nhiên
                .limit(1000)// giới hạn
                .toList(); // chuyển thành List
        //1. Lọc và in các số nguyên dương ra màn hình
        randomList.stream().filter(value -> value > 0).forEach(integer -> System.out.println(integer));
        //2. Loại bỏ các số trùng lặp
        List<Integer> distinctList = randomList.stream().distinct().toList();
        System.out.println("Loại bỏ trùng lặp: " + distinctList);
        //3. Sắp xếp từ lớn đến bé
        randomList.stream().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.println(integer));
        //4. min, max
        Integer min = randomList.stream().min(Comparator.comparingInt(o -> o)).get();
        Integer max = randomList.stream().max(Comparator.comparingInt(o -> o)).get();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        //5. tính tổng
        Integer sum = randomList.stream().reduce(0, Integer::sum);
        //6. kiểm tra giá trị n nhập vào có tồn tại trong danh sách hay k
        boolean isExist = randomList.stream().anyMatch(num -> num == 100);
        System.out.println("Số 100 có tồn tại trong list hay không: " + isExist);
        //7. chuyển số âm thành số đối của nó
        List<Integer> mapInteger = randomList.stream().map(num -> num < 0 ? -num : num).toList();
        System.out.println("Map Integer: " + mapInteger);
    }
}