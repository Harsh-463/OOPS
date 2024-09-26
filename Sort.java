
import java.util.*;
//Find the missing number
public class Sort{
    public static void main(String args[]){
        int arr[] = {-1,3,1,4};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Cycle(arr));
        
    }
    public static int  Cycle(int arr[]){
        int i = 0;
        while(i<arr.length){     
            int correct = arr[i] -1;
                if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr , i ,correct);
            }else{
               i++;
            }
            
        }// first missing positive number
        for(int index = 0 ; index < arr.length ; index++){
            if( arr[index]!= index+1){
                return index+1;
            }
        }
        
        return arr.length +1;
        
    }
    static void swap(int arr[] , int first , int second){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

