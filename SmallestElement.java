public class SmallestElement {
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest is:"+smallest);
    }
}


