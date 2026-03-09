package functional;

@FunctionalInterface
public interface IFunctional {
    // Khái niệm functional interface: là interface có 1 phương thức trừu tượng
    int save(int a, int b);
    // tất cả functional interface trong java8 đều nằm ở gosijava.util.function
}
