public class reverse{
    int a[]={1,2,3,4,6,7};
    public static void main(String [] args){
        reverse s1=new reverse();
        s1.rev();

    }
    public void rev(){
        System.out.println("The original array is:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("reverse of the array is:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }


}