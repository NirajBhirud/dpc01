public class DayOne {
    public static void sortArr(int[] arr){
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0=count0+1;
            } else if (arr[i]==1) {
                count1++;
            }else {
                count2++;
            }

        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1;i<arr.length;i++){
            arr[i]=2;
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{0,2,1,2,1,2,2,1,0,0,1,2,0};
        sortArr(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
