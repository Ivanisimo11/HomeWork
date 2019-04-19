package ThirdHomeWork;

import java.util.Arrays;

public class ArraySorter {
    public int[] sorter(int [] a,int[]b){
        int n = a.length + b.length;
        int[] glava = new int[n];
        for (int i = 0;i<a.length;i++){
            glava[i]=a[i];
        }
        for (int i = 0;i<b.length;i++){
            glava[a.length +i]=b[i];
        }
        Arrays.sort(glava);
        return glava;
    }
}
class Main{
    public static void main(String[] args) {
        int[] perviy = new int[]{1,3,4,7,3};
        int[] vtoroy = new int[]{4,8,9,4,313};
        ArraySorter arraySorter = new ArraySorter();
        int[] t =arraySorter.sorter(perviy,vtoroy);
        for (int i = 0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
