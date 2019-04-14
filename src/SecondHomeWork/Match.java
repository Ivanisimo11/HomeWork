package SecondHomeWork;

public class Match{// _____________________1.1___________________________________
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