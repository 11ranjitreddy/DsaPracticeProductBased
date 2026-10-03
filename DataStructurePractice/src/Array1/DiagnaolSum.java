package Array1;

import java.util.*;
public class DiagnaolSum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int a[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
      int sum=0;

        for(int i=0;i<n;i++){
            sum+=a[i][i];
            sum+=a[i][n-1-i];
        }
        if(n%2!=0){
        sum-=a[n/2][n/2];}
        System.out.println(sum);
    }
}
