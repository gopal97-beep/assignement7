public class arrsub{
    String a1[]={"lol","gg"};
    String a2[]={"lol"," "};
    String a3[];
    public static void main(String [] args)
    {  arrsub u=new arrsub();
        u.sub();

    }
    public void sub(){
        for(int i=0;i<a1.length;i++){
            if(a1[i].equals(a2[i]))
            {   a1[i]="";
            

            }
            
        }
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
       
    }
}