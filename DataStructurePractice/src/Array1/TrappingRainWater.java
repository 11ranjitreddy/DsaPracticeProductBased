package Array1;

public class TrappingRainWater {
public static void main(String args[]){
    int a[]={0,1,0,2,1,0,1,3,2,1,2,1};


    int left[]=new int[a.length];
    left[0]=a[0];
    for(int i=1;i<a.length;i++)
        left[i]=Math.max(left[i-1],a[i]);


    int right[]=new int[a.length];
    right[a.length-1]=a[a.length-1];
    for(int i=a.length-2;i>=0;i--)
        right[i]=Math.max(a[i],right[i+1]);

    int maxwater=0;
    for(int i=0;i<a.length;i++){
        int tap=Math.min(left[i],right[i]);
         maxwater+=tap-a[i];

    }
    System.out.println(maxwater);


}
}
