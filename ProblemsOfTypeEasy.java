

public class ProblemsOfTypeEasy {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {      
        if (s1.length() != s2.length()) return false;      
        return (s1+s1).lastIndexOf(s2) >= 0;      
    }

   // Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 
  public static int countFreq(int[] arr, int target) { 
        int low = 0;
        int high = arr.length - 1;
        int freq = 0;
      
        while(low <= high){
            int mid =low + (high - low) / 2;            
            if(target == arr[mid] ){
                for(int i = low; i <= high; i++){
                    if(arr[i] == target) freq++;  
                }           
                break;
            }            
            if( target > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }        
        return freq;
    }

    // A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element. 
    public static int findMin(int[] arr) {        
        int low = 0;
        int high = arr.length - 1;        
        
        while(low < high ){
             int mid =  low + (high - low) / 2;            
            
            if(arr[low] < arr[high]) return  arr[low];          
            
            if(arr[mid] > arr[high]) low = mid + 1;
            else high = mid;            
        }
        return arr[low];      
    }
    


  
}
