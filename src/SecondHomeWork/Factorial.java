package SecondHomeWork;

public class Factorial {//_____________________________________1.4_____________________________
    int fact(int n) {
        if (n == 1)
            return 1;
        return fact(n -1) * n;
    }
}
class Main2{
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(5));
        System.out.println(factorial.fact(1));
        System.out.println(factorial.fact(8));
        System.out.println(factorial.fact(2));

    }
}