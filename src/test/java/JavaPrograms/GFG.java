package JavaPrograms;

class GFG {
    static int cntSquares (int n) { 
        /* Function to return the number 
        of squares inside an n*n grid */
      
        return n * (n + 1) * (2 * n + 1) / 6; 
    } 
  
    // Driver code 
    public static void main(String args[]) { 
        System.out.println (cntSquares(4)); 
    } 
} 