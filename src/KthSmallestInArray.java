public class KthSmallestInArray {
    public static void main(String[] args) {
        int givenArray[]={100,5,140,2,400,3,1,120};//1,2,3,5,100,140,300,400
        int k=3;//3rd smallest element
        int reqValue= quickSelect(givenArray,0,givenArray.length-1,k-1);
        System.out.println("req value=>"+ reqValue);
    }
    public static int quickSelect(int arr[], int lo, int hi, int k){
        int pivot = arr[hi];
        int pi=partition(arr, pivot, lo,hi);

        if(k > pi){
            return quickSelect(arr,pi+1, hi,k );
        }else if(k < pi){
            return quickSelect(arr, lo, pi-1,k);
        }else{
            return arr[pi];
        }
    }
    public static int partition(int arr[], int pivot, int lo, int hi){
        System.out.println("pivot=>"+pivot);
        int i=lo, j=lo;
        while(i <= hi){
            System.out.println("arr[i]="+arr[i]);
            if(arr[i] <= pivot){
                swap(arr,i,j);
                i++;
                j++;
                System.out.println("i="+i);
                System.out.println("j="+j);
            }else{
                i++;
                System.out.println("i=>"+i);
            }
        }
        return j-1;
    }
    public static void swap(int arr[], int i, int j){
        System.out.println("Swapping "+ arr[i] + " and "+arr[j]);
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        printArray(arr);
    }
    public static void printArray(int arr[]){
        String temp="";
        for(int i=0; i<arr.length; i++){
            if(temp== ""){
                temp=Integer.toString(arr[i]);
            }else
            temp=temp+" , "+arr[i];
        }
        System.out.println("array=>"+temp);
    }
}
