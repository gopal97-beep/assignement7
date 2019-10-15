import java.util.*;
public class stringarr{
    String a[]={"gopal","adassh","benjimin"};
    public static void main(String [] args){
        stringarr g=new stringarr();
        g.sort1();
    }
    public void sort1(){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}