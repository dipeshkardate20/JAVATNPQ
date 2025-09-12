
// BUBBLE SORT 


public class sorting{
    public static void bubblesort(int arr[]){
        for(int turn= 0 ; turn<=arr.length-1; turn++){
            for(int j = 0 ; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
    }
    // public static void printarr(int arr[]){
    //     for(int i = 0 ; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");

    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int arr[] = { 5,4,1,3,2};
    //     bubblesort(arr);
    //     printarr(arr);

    // }
    // 
    // 
    // 
    // 
    // 
    // 
    //   selection sort 
    public static void selectionsort(int arr[]){
        for(int i = 0 ; i <arr.length-1 ; i++){
            int minpos = i ;
            for(int j = i+1 ; j<arr.length ; j++){
                if (arr[minpos] > arr[j]){
                    // if we change the sign above to lessthan < 
                    //then the output will give us the sorting in decreasing order 
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    // public static void printarr(int arr[]){
    //     for(int i = 0 ; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");

    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int arr[] = { 5,4,1,3,2};
    //     selectionsort(arr);
    //     printarr(arr);
    // }

    // 
    // 
    // 
    // INSERTION SORT 
    
    
    public static void insertionsort(int arr[]){
        for(int i = 1 ; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // loop for the finding out to correct pos 
            while(prev >=0 && arr[prev]>curr){
                // if we change the sign above to lessthan < 
                    //then the output will give us the sorting in decreasing order 
                arr[prev + 1 ] = arr[prev];
                prev -- ;

            }
            // insertion
            arr[prev + 1 ] = arr[curr];
        }

    }
    // public static void printarr(int arr[]){
    //     for(int i = 0 ; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");

    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int arr[] = { 7,6,3,5,4,1,2,};
    //     selectionsort(arr);
    //     printarr(arr);
    // }





    // 
    // 
    // 
    // 
    // COUNTING SORT

    public static void countingsort( int arr[]){
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
            
        }
        int count[] = new int[largest+1];
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0 ;
        for(int i = 0 ; i<count.length;i++){
            while(count[i]>0){
                arr[j] = i ;
                j++;
                count[i]--;

            }
        }
        
    }
    public static void printarr(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 4,6,6,9,8,3,4,1,2,3,4, 7,6,3,5,4,1,2};
        selectionsort(arr);
        printarr(arr);
    }






}