

import java.util.Scanner;
public class  MissingNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
                
            

        
    }
    int x=((n+1)*(n+2)/2)-sum;
    System.out.println(x);

    }
}
