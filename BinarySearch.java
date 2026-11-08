import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        int low=0;
        int high=arr.length-1;
        int target=sc.nextInt();
        while(low<=high){
        int mid=low+(high-low)/2;//mid=(low+high)/2 also
        if(arr[mid]==target){
            System.out.println("Element found at index: "+mid);
            break;
        }else if(target<arr[mid]){
            high=mid-1;
        }else{
            low=mid+1;
        }

        }

    }}
    

