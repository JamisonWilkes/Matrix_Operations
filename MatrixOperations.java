//Program 9.2 Matrix Operations
//Jamison Wilkes
import java.util.Scanner;
import javax.swing.*;

public class MatrixOperations
{
   public static void main(String[] args)
   {
      
   
   //Initialize the Matrices
      int[][] A = {{1, 1},
                   {2, 3}};
                   
      int[][] B = {{4, 5, 1},
                   {5, 6, 12}};
                   
      int[][] C = {{6, -1},
                   {7, -9},
                   {2, 0}};
                   
      int[][] D = {{9, 5, 3},
                   {-1, 0, 5},
                   {12, 0, 7},};
                   
  //Populate the Matrices    
     System.out.println("Matrix A = ");
       for (int i = 0; i < 2; i++) 
       { 
           for (int j = 0; j < 2; j++)
            { 
                System.out.print(A[i][j] + " "); 
            }
             
       System.out.println();
       }
       
       System.out.println();
       System.out.println("Matrix B = ");
       for (int i = 0; i < 2; i++) 
       { 
           for (int j = 0; j < 3; j++)
            { 
                System.out.print(B[i][j] + " "); 
            } 
       System.out.println();
       }
       
       System.out.println();
       System.out.println("Matrix C = ");
       for (int i = 0; i < 3; i++) 
       { 
           for (int j = 0; j < 2; j++)
            { 
                System.out.print(C[i][j] + " "); 
            } 
       System.out.println();
       }
       
       System.out.println();
       System.out.println("Matrix D = ");
       for (int i = 0; i < 3; i++) 
       { 
           for (int j = 0; j < 3; j++)
            { 
                System.out.print(D[i][j] + " "); 
            } 
       System.out.println();
       }
       
       
       
       Scanner xyz = new Scanner(System.in);
          
       System.out.println("Please select the first matrix(A,B,C,D)");
       char first_matrix = xyz.next().charAt(0);
       System.out.println("Please select the second matrix(A,B,C,D");
       char second_matrix = xyz.next().charAt(0);      
       System.out.println("Do you want to Add or Multiply(A,M) the matrices?");
       char operation = xyz.next().charAt(0);
       /*
       if(first_matrix != 'A' || first_matrix!= 'B' || first_matrix != 'C' || first_matrix != 'D')
       {
         System.out.println("Sorry your input is invalid");
         System.exit(0);
       }
       if(second_matrix != 'A' || second_matrix!= 'B' || second_matrix != 'C' || second_matrix != 'D')
       {
         System.out.println("Sorry your input is invalid");
         System.exit(0);
       }
       if(operation != 'A' || operation != 'M')
       {
         System.out.println("Sorry your input is invalid");
         System.exit(0);
       }*/
       
       while(operation == 'A')
       {
         if(first_matrix == 'A' && second_matrix == 'A')
         {
             int sum = 0;
             int result[][] = new int[2][2];
         
             System.out.println("Matrix A = ");
               for (int i = 0; i < 2; i++) 
               { 
                  for (int j = 0; j < 2; j++)
                  { 
                   System.out.print(A[i][j] + " "); 
                  }
             
               System.out.println();
               }
               
              System.out.println("+"); 
               
              System.out.println("Matrix A = ");
               for (int i = 0; i < 2; i++) 
               { 
                   for (int j = 0; j < 2; j++)
                     { 
                        System.out.print(A[i][j] + " "); 
                     }
             
                  System.out.println();
               }
               
                System.out.println();
         
            for(int i = 0; i < 2; i++)
            {
               for(int j = 0; j < 2; j++)
               {
                  sum = sum + A[i][j] + A[i][j];            
                  result[i][j] = sum;
                  sum = 0;
               }
            }
            
            System.out.println("A+A=");
            for(int i = 0; i < 2; i++)
            {
               for(int j = 0; j < 2; j++)
               {
                  System.out.print(result[i][j] + " ");
               }
               System.out.println();
            }
              
         }
         
         if(first_matrix == 'B' && second_matrix == 'B')
         {
            int sum = 0;
            int result[][] = new int[2][3];
            
            System.out.println();
             System.out.println("Matrix B = ");
             for (int i = 0; i < 2; i++) 
             { 
                 for (int j = 0; j < 3; j++)
                  { 
                      System.out.print(B[i][j] + " "); 
                  } 
             System.out.println();
             }
            System.out.println();
            
            System.out.println();
             System.out.println("Matrix B = ");
             for (int i = 0; i < 2; i++) 
             { 
                 for (int j = 0; j < 3; j++)
                  { 
                      System.out.print(B[i][j] + " "); 
                  } 
             System.out.println();
             }
            
            for(int i = 0; i < 2; i++)
            {
               for(int j = 0; j < 3; j++)
               {
                  sum = sum + B[i][j] + B[i][j];            
                  result[i][j] = sum;
                  sum = 0;
               }
            }
            
            System.out.println();
            System.out.println("B+B=");
            for(int i = 0; i < 2; i++)
            {
               for(int j = 0; j < 3; j++)
               {
                  System.out.print(result[i][j] + " ");
               }
               System.out.println();
            }
           
         }

          if(first_matrix == 'C' && second_matrix == 'C')
         {
            int sum = 0;
            int result[][] = new int[3][2];
            
             System.out.println();
             System.out.println("Matrix C = ");
             for (int i = 0; i < 3; i++) 
             { 
                 for (int j = 0; j < 2; j++)
                  { 
                      System.out.print(C[i][j] + " "); 
                  } 
             System.out.println();
             }
             
            System.out.println();
             System.out.println("Matrix C = ");
             for (int i = 0; i < 3; i++) 
             { 
                 for (int j = 0; j < 2; j++)
                  { 
                      System.out.print(C[i][j] + " "); 
                  } 
             System.out.println();
             }

            
            for(int i = 0; i < 3; i++)
            {
               for(int j = 0; j < 2; j++)
               {
                  sum = sum + C[i][j] + C[i][j];            
                  result[i][j] = sum;
                  sum = 0;
               }
            }
            
            System.out.println();
            System.out.println("C+C=");
            for(int i = 0; i < 3; i++)
            {
               for(int j = 0; j < 2; j++)
               {
                  System.out.print(result[i][j] + " ");
               }
               System.out.println();
            }
           
         }

         if(first_matrix == 'D' && second_matrix == 'D')
         {
            int sum = 0;
            int result[][] = new int[3][3];
            
             System.out.println();
             System.out.println("Matrix D = ");
             for (int i = 0; i < 3; i++) 
             { 
                 for (int j = 0; j < 3; j++)
                  { 
                      System.out.print(D[i][j] + " "); 
                  } 
             System.out.println();
             }
             System.out.println();
             System.out.println("Matrix D = ");
             for (int i = 0; i < 3; i++) 
             { 
                 for (int j = 0; j < 3; j++)
                  { 
                      System.out.print(D[i][j] + " "); 
                  } 
             System.out.println();
             }
            
            for(int i = 0; i < 3; i++)
            {
               for(int j = 0; j < 3; j++)
               {
                  sum = sum + D[i][j] + D[i][j];            
                  result[i][j] = sum;
                  sum = 0;
               }
            }
            System.out.println();
            System.out.println("D+D=");
            for(int i = 0; i < 3; i++)
            {
               for(int j = 0; j < 3; j++)
               {
                  System.out.print(result[i][j] + " ");
               }
               System.out.println();
            }
           
         }

         
         System.exit(0);
       }
       
       while(operation == 'M')
       {
         System.out.println(first_matrix + "*" + second_matrix);
         
         if(first_matrix == 'B' && second_matrix == 'A')
         {
            System.out.println("Sorry, you cannot multiply Matrix B by Matrix A");
         }
         if(first_matrix == 'C' && second_matrix == 'D')
         {
            System.out.println("Sorry, you cannot multiply Matrix C by Matrix D");
         }
         if(first_matrix == 'B' && second_matrix == 'B')
         {
            System.out.println("Sorry, you cannot multiply Matrix B by Matrix B");
         }
         if(first_matrix == 'C' && second_matrix == 'C')
         {
            System.out.println("Sorry, you cannot multiply Matrix C by Matrix C");
         }
         
         if(first_matrix == 'A' && second_matrix == 'A')
         {
         int sum = 0;
         int result[][] = new int[2][2];
         
         System.out.println("Matrix A = ");
          for (int i = 0; i < 2; i++) 
          { 
              for (int j = 0; j < 2; j++)
               { 
                   System.out.print(A[i][j] + " "); 
               }
                
          System.out.println();
          }
          
          System.out.println("Matrix A = ");
          for (int i = 0; i < 2; i++) 
          { 
              for (int j = 0; j < 2; j++)
               { 
                   System.out.print(A[i][j] + " "); 
               }
                
          System.out.println();
          }
         
         System.out.println();
         System.out.println("A*A=");
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               for(int k = 0; k < 2; k++)
               {
                  sum = sum + A[i][k] * A[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }
         
         if(first_matrix == 'A' && second_matrix == 'B')
         {
         int sum = 0;
         int result[][] = new int[2][2];
         
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               for(int k = 0; k < 2; k++)
               {
                  sum = sum + A[i][k] * B[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }
         
         if(first_matrix == 'B' && second_matrix == 'C')
         {
         int sum = 0;
         int result[][] = new int[2][2];
         
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               for(int k = 0; k < 3; k++)
               {
                  sum = sum + B[i][k] * C[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 2; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }
      
      //doesn' work  
        if(first_matrix == 'C' && second_matrix == 'B')
         {
         int sum = 0;
         int result[][] = new int[3][3];
         
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j <3; j++)
            {
               for(int k = 0; k < 3; k++)
               {
                  sum = sum + C[i][k] * B[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 3; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }
         
         
         if(first_matrix == 'D' && second_matrix == 'C')
         {
         int sum = 0;
         int result[][] = new int[3][2];
         
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               for(int k = 0; k < 3; k++)
               {
                  sum = sum + D[i][k] * C[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 2; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }        
         
      //Final is 3x3   
         if(first_matrix == 'D' && second_matrix == 'D')
         {
         int sum = 0;
         int result[][] = new int[3][3];
         
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 3; j++)
            {
               for(int k = 0; k < 3; k++)
               {
                  sum = sum + D[i][k] * D[k][j];
               }
               result[i][j] = sum;
               sum = 0;
            }
         }
         for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 3; j++)
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
           
         }


         
         
         
         System.exit(0);
       }
       
      
   }                  
}