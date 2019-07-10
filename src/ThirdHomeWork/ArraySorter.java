package ThirdHomeWork;

public class ArraySorter {
    public int[] sorter(int [] a,int[]b){
        int n = a.length + b.length;
        int[] glava = new int[n];
        int y = 0;
        int z = 0;
        for (int i =0;i<n;i++){
            if (y == b.length) {
                glava[i]=a[z];
                z++;
            }else if (z == a.length){
                glava[i]=b[y];
                y++;
            }
            else if (b[y]> a[z]){
                    glava[i]=a[z];
                    z++;
            }else {
                    glava[i]=b[y];
                    y++;
                }
        }
        return glava;
    }
}
class Main{
    public static void main(String[] args) {
        int[] perviy = new int[]{1,10,20,30,765};
        int[] vtoroy = new int[]{1,5,15,25,35,45};
        ArraySorter arraySorter = new ArraySorter();
        int[] t =arraySorter.sorter(perviy,vtoroy);
        for (int i = 0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
