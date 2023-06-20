//Given an array (or string), the task is to reverse the array/string.
public class ArrayReversal {
    public static void main(String[] args) {
        int givenArray[]={1,2,3,4,5,6,7,8};
        printArray(givenArray);
        reverseArrayNew(givenArray);
        System.out.println("updated array=>");
        printArray(givenArray);
    }
    static void reverseArrayNew(int arr[]){
        int length=arr.length;
        for(int i=0; i < length/2; i++){
            int temp = arr[length-1-i];
            arr[length-1-i]=arr[i];
            arr[i]=temp;
        }
    }
    static void printArray(int array[]){
        for(int i=0; i< array.length; i++){
            System.out.println("array=>"+array[i]);
        }
    }
    static void reverseArray(int arr[]){
        int length= arr.length;
        int tempLength=(int)Math.ceil(length/2);
        for(int i=0; i< tempLength; i++){
            int temp=arr[length-1-i];
            arr[length-1-i]=arr[i];
            arr[i]=temp;
        }
    }
}
