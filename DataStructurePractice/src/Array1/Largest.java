package Array1;

public class Largest {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};

        int max=0;
        int second=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                second=max;
                max=a[i];
            }else if(a[i]>second && a[i]!=max){
                second=a[i];
            }
        }
        System.out.println(second);
    }
}
