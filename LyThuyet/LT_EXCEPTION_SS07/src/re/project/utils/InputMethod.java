package re.project.utils;

import java.util.Scanner;

public class InputMethod {
    public static String inputString(){
        return input().nextLine();
    }

    private static Scanner input(){
        return new Scanner(System.in);
    }
}
