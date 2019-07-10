package SecondHomeWork;

public class Fibonachi{//_________________________________________________1.4________________________________--
    public int fibonachi(int i)  {
        if(i == 0)
            return 0;
        else if(i == 1)
            return 1;
        else
            return fibonachi(i - 1) + fibonachi(i - 2);
    }
}
class Main{
    public static void main(String[] args) {
        Fibonachi fibonachi = new Fibonachi();
        System.out.println(fibonachi.fibonachi(0));
        System.out.println(fibonachi.fibonachi(1));
        System.out.println(fibonachi.fibonachi(2));
        System.out.println(fibonachi.fibonachi(3));
        System.out.println(fibonachi.fibonachi(4));
        System.out.println(fibonachi.fibonachi(5));
        System.out.println(fibonachi.fibonachi(6));
        System.out.println(fibonachi.fibonachi(7));
        System.out.println(fibonachi.fibonachi(8));
        System.out.println(fibonachi.fibonachi(9));
        System.out.println(fibonachi.fibonachi(10));
    }
}