package kha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhập năm sinh: ");
                String input = sc.nextLine();
                int birthYear = Integer.parseInt(input);
                int age = 2026 - birthYear;
                if (age < 0){
                    System.out.println("Năm sinh không hợp lệ");
                    continue;
                }
                System.out.println("Tuổi của bạn là: " + age);
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dang. Vui lòng nhập lại!");
            }finally {
                System.out.println("Thực hiện dọn dẹp tài nguyên");
            }
        }
        sc.close();
    }
}