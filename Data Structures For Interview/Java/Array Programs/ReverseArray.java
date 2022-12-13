class ReverseArray{

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reverse(int arr[]){

        int array[]=new int[arr.length];
        int index=0;

        for(int i=arr.length-1;i>=0;i--){
            array[index]=arr[i];
            index++;
        }

        return array;
    }

    public static void main(String s[]){

        int arr[]={10,20,30,40,50,60,70,80,90,100};

        arr=reverse(arr);

        printArray(arr);
    }
}