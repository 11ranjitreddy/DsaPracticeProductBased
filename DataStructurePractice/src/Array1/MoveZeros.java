package Array1;

public class MoveZeros {

    public static void main(String args[]){
        int a[]={0,1,0,3,12};

        int temp[]=new int[a.length];

        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                temp[k++]=a[i];
            }
        }
        for(int i=0;i<temp.length;i++)
            System.out.print(temp[i]+" ");
    }
}
