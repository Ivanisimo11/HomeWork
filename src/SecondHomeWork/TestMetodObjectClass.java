package SecondHomeWork;

import java.util.Objects;

public class TestMetodObjectClass {
    int x =1;
    int y =2;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMetodObjectClass that = (TestMetodObjectClass) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
class Main1 {
    public static void main(String[] args) {
        TestMetodObjectClass testMetodObjectClass1 = new TestMetodObjectClass();
        TestMetodObjectClass testMetodObjectClass2 = new TestMetodObjectClass();
        boolean b = testMetodObjectClass1.equals(testMetodObjectClass2);
        System.out.println(b);
    }
}
