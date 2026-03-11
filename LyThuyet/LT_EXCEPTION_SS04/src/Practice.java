public class Practice {
    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
    // Phương thức tính số fibonacci thứ n
    public static int fibonacci(int n){
        if (n < 0){
            throw new IllegalArgumentException("n phải >= 0");
        }
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        int next = 0;
        for (int i = 2; i < n; i++){
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
    // Xây dựng các test case cho tất cả các trường hợp có thể xảy ra của 2 phương thức
}
