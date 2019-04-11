public class SecondHomeWork {
    public static void main(String[] args) {
            Match match = new Match();
        System.out.println(match.pariMatch(22,22,11,10));
    }
}
class Match{
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