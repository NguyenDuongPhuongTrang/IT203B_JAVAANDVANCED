package kha2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Nhập tổng số lượng người dùng: ");
                int n = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập số lượng nhóm muốn chia: ");
                int a = Integer.parseInt((sc.nextLine()));
                if (a > n){
                    System.out.println("Số nhóm không hợp lệ!");
                    continue;
                }
                try{
                    System.out.println(n/a);
                    return;
                } catch (ArithmeticException e) {
                    System.out.println("Không thể chia cho 0. Vui lòng nhập lại!");
                }
            }catch (NumberFormatException e){
                System.out.println("Định dạng không hợp lệ. Vui lòng thử lại!");
            }finally {
                System.out.println("Dọn dẹp tài nguyên");
            }
        }
    }
}
