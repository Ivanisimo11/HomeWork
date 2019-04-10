public class FirstHomeWork {
    public static void main(String[] args) {
        Human human1 = new Human() {
            public int calc(int x1, int y1) {
                return x1 + y1;
            }
        };
        int z1 = human1.calc(15,25);
        System.out.println(z1);
        Human human2 = (x2,y2)->x2+y2;
        int z2 = human2.calc(15,15);
        System.out.println(z2);
    }
}
interface Human{
    int calc(int x,int y);
}
