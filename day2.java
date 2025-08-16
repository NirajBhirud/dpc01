import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i] <= arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    public static void swap(int[] arr,int a,int b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int[] arr = new int[n-1];  // only n-1 elements
        System.out.println("Enter " + (n-1) + " numbers:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int missingNumber=findMissingNumber(arr);
        System.out.println(missingNumber);

    }
}
