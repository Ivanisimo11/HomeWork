public class SecondHomeWork {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(6));

    }
}
class Match{// _____________________1.1___________________________________
    public int pariMatch(int schetPervoy,int schetVtoroy, int stavkaNaPervuy, int stavkaNaVtoruy){
        int x =(schetPervoy == stavkaNaPervuy && schetVtoroy== stavkaNaVtoruy) ? 2: 0;
        int y =(schetPervoy > schetVtoroy && stavkaNaPervuy > stavkaNaVtoruy || schetPervoy < schetVtoroy && stavkaNaPervuy < stavkaNaVtoruy || schetPervoy == schetVtoroy && stavkaNaPervuy== stavkaNaVtoruy) ? 1: 0;
        if (x == 2){
            return 2;
        }else if (y == 1){
            return 1;
        }else{
            return 0;
        }
    }
}
class Romb {//________________________________________1.2_________________________--
    public void rombikusik(int diamondLength){
        String stroka;
        String stroka1;
        for (int i =1;i<diamondLength;i++){
            stroka = new String(new char[diamondLength - i]).replace("\0"," ");
            stroka1 = new String(new char[2*i]).replace("\0","*");
            System.out.println(stroka + stroka1);
        }
        for (int i =diamondLength;i!=0;i--){
            stroka = new String(new char[diamondLength - i]).replace("\0"," ");
            stroka1 = new String(new char[2*i]).replace("\0","*");
            System.out.println(stroka + stroka1);
        }
    }
}
class Factorial {//_____________________________________1.4_____________________________

    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}