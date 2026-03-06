package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputInteger();
    }

    public static int inputInteger(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhập một số nguyên: ");
                int a = Integer.parseInt(sc.nextLine());
                if (a <= 0){
                    System.out.println("Không được nhập số âm hoặc số 0");
                    continue;
                }
                return a;
            } catch (NumberFormatException ex){
                System.out.println("Bạn phải nhập 1 số nguyên, hãy nhập lại");
            }finally {
                System.out.println("Kết thúc xử lý");
            }
        }
    }
}