import java.util.Random;
import java.util.Collections;
import java.util.ArrayList; 
public class Example{
    public static void sort(Comparable[] a){

    }
    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }
    public static void exch(Comparable[] a, int i,int j){
        Comparable t=a[i];a[i]=a[j];a[j]=t;
    }
    public static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){System.out.println(a[i]+"");}
    }
    public static boolean isSorted(Comparable[] a){
        for (int i=1;i<a.length;i++){
            if (less(a[i],a[i-1])) {return false;}
        }
        return true;
    }
    public static void main(String[] args){
        int N=10;
        Random r = new Random();
        Integer[] a=new Integer [N];
        for(int i=0 ; i<N ;  i++){
            int ran1 = r.nextInt(100);
            a[i]=ran1;
        }
        sort(a);
        assert isSorted(a):"not sorted";
        show(a);
    }
}