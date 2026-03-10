import java.util.Scanner;

public class InputMethod {
    private static Scanner input(){
        return new Scanner(System.in);
    }

    public static String inputString(String title){
        while (true){
            System.out.println(title);
            String str = input().nextLine();
            if (str.isBlank()){
                System.out.print("Không được để trống");
            }else {
                return str;
            }
        }
    }

}
