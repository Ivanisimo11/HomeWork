package SecondHomeWork;

public class VozvedenieV{//_______________________________________1.3______________________________
    public int stepen(int chislo,int vKakuyu){
        if (vKakuyu == 0){
            return 1;
        }
        int peremennaya = chislo;
        for (int i =0;i<vKakuyu - 1;i++){
            chislo = chislo * peremennaya;
        }
        return chislo;
    }
}
class Main5{
    public static void main(String[] args) {
        VozvedenieV v = new VozvedenieV();
        System.out.println(v.stepen(2,10));
        System.out.println(v.stepen(2,0));

    }
}