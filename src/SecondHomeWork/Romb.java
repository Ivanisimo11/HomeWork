package SecondHomeWork;

public class Romb {//________________________________________1.2_________________________
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