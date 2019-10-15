import java.util.*;
public class search{
    String a[]={"gopal","adassh","benjimin"};
    boolean y=false;
    public static void main(String [] args){
        search g=new search();
        g.search1();
    }
    public void search1(){
        System.out.println("enter the item for search");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=0;i<a.length;i++)
        {
            if(s1.equals(a[i]))
            { y=true;
                break;
                
            }
        }
        if(y==false){
            System.out.println("elemenet is not present in the array of strings");
        }
        else{
            System.out.println("elemenet is  present in the array of strings");
        }


    }
}