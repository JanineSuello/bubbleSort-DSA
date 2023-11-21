
import java.util.Arrays;


public class BubbleSort {
        public static void main (String[] args){
            int[] intArray = {60,12, 24, 48,36};
            
            System.out.println("Unsorted Int Array:" + Arrays.toString(intArray)); 
            
            bubbleSort(intArray);
            
            
            System.out.println("Sorted Int Array:" + Arrays.toString(intArray));
            
        }
        
       
        
        static void bubbleSort(int[] arr){
            int n = arr.length;
            for(int i= 0; i<n-1; i++){
                for(int j= 0; j<n -i-1; j++){
                    if (arr[j]> arr[j+1]){
                        int temp= arr[j];   
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }
}

  
