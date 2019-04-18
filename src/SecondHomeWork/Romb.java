package SecondHomeWork;

public class Romb {//________________________________________1.2___________________________________________
    public void rombikusik(int diamondLength){
        StringBuilder sb = new StringBuilder();
        int n = 1;
        for (int i =1;i<diamondLength;i++){
            sb.append(new String(new char[diamondLength-i]).replace("\0"," "));
            sb.append(new String(new char[n]).replace("\0","*"));
            sb.append(new String("\n"));
            n=n+2;
        }
        int a = 1;
        for (int i = diamondLength;i>0;i=i-2,a++){
            sb.append(new String(new char[a+1]).replace("\0"," "));
            sb.append(new String(new char[i]).replace("\0","*"));
            sb.append(new String("\n"));
        }
        System.out.println(sb.toString());
    }
}
class Main4{
    public static void main(String[] args) {
        Romb bmor = new Romb();
        bmor.rombikusik(5);
    }
}