public class MinMaxInArray {
    public static void main(String[] args) {
        int givenArray[]={4, 5, 2,1,7,8,9};
        getMinMax(givenArray);
    }
    static void getMinMax(int array[]){
        int min=0;
        int max=0;
        if(array.length%2 == 0){
            min=array[0]<array[1]?array[0]:array[1];
            max=array[0]<array[1]?array[1]:array[0];
            if(array.length==2){
                printMinMax(min,max);
                return;
            }
        }else{
            min = max = array[0];
        }
        for(int i=2; i<array.length; i++){
            if(min > array[i]){
                min=array[i];
            }else if(max < array[i]){
                max=array[i];
            }
        }
        System.out.println("after finding min and max");
        printMinMax(min,max);
    }
    static void printMinMax(int min, int max){
        System.out.println("min=>"+ min);
        System.out.println("max=>"+ max);
    }
}
