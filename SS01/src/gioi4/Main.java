package gioi4;

import java.io.IOException;

public class Main {
    public static void saveToFile() throws IOException {
        throw new IOException();
    }
    public static void processUserData() throws IOException{
        saveToFile();
    }
    public static void main(String[] args) {
        try{
            processUserData();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
