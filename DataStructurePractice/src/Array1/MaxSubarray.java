package Array1;

public class MaxSubarray {
    public static void main(String args[]){
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        int sum=0;
        for(int i=0;i<a.length;i++){

            sum+=a[i];
            max=Math.max(sum,max);

            if(sum<0)
                sum=0;
        }
        System.out.println(max);

    }
}
