
public class questiontwodarray{

    // Print the number of 7’s that are inthe 2d array.
    public static boolean  questionone(int matrix[][] , int number){
        int turn = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m;j++){
                if(matrix[i][j] == number){
                    turn ++;
                    
                }
            }
        }

        if(turn >0 ){
            System.out.print("The number " + number + " is " + turn +" times."); 
            return true ; 
                    
        } else {
        System.out.println("The number does not exist : error");
        return false ;
        }
        


    }

    // public static void main(String[] args) {
    //     int matrix[][] = {{7,9,8},
    //                       {8,7,7}};

        
    //     questionone(matrix, 7);                 

    public static boolean  question(int matrix[][], int key){
        
        if( key< 0 || key >matrix.length){
            System.out.println("error aa gya bc ");
            return false ; 
        }

        int sum = 0 ;
        
        int m = matrix[0].length-1;
        for(int j = 0 ; j<matrix[0].length;j++){
            sum += matrix[key][j];
            
            
        }

        System.out.println(sum);

        
        return true;
    }

    // choti choti chij notice kerna chahiye 


    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                          {4,11,3},
                          {2,2,3}};

        
        question(matrix,1); 
    }
                      
}

    