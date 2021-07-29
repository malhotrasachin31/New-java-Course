package javafullcourse;

import java.util.Scanner;

public class JavaPracticeSetForArrays {

    public static void main(String args[]) {
        /*
         task for arrays practice set
        
         task 1 : create an array of n number of floats and calculate its sum
         task 2: searching element in an array
         task 3: calculate the marks of all students in a class in physics test
         task 4: add two matrices of 2x3
         task 5: reverse an arrray
         task 6: find maximum element in an array
         task 7: find the minimum element in an array
         task 8: array is sorted or not 
        
         */

        // task 1:
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store in an array");
        
         float sum=0;
        
         int n=ref.nextInt();
         float array[]=new float[n];
         for(int i=0;i<array.length;i++){
         array[i]=ref.nextFloat();
         sum=sum+array[i];
         }
         System.out.println("The sum is "+sum);
         
        // task 2:
        
         int array2[]=new int[5];
         int temp=0;
         System.out.println("Enter the array");
         for(int i=0;i<array.length;i++){
         array[i]=ref.nextInt();
         }
         System.out.println("Enter the element you have to find ");
         int num2=ref.nextInt();
         for(int i=0;i<array.length;i++){
         if(num2==array[i]){
         temp+=1;
         }
         }
         if(temp==1){
         System.out.println("Its present in an array");
         }
         else{
         System.out.println("Its not present in an array");
         }
         
        // task 3:
        
         System.out.println("Enter the number of students in a class");
         int stno=ref.nextInt();
        
         int array2[]=new int[stno];
         int average=0;
         int sum2=0;
        
         for(int i=0;i<array2.length;i++){
         System.out.println("Enter the marks of the student");
         array2[i]=ref.nextInt();
         sum2+=array2[i];
         }
         average+=sum/stno;
         System.out.println("The average solution is "+average);
         
        

        // task 4
       int matrix1[][] = new int[2][3];
        matrix1[0][0] = 1;
        matrix1[0][1] = 1;
        matrix1[0][2] = 1;
        
        matrix1[1][0] = 1;
        matrix1[1][1] = 1;
        matrix1[1][2] = 1;
        
        matrix1[2][0] = 1;
        matrix1[2][1] = 1;
        matrix1[2][2] = 1;
        
        matrix1[3][0] = 1;
        matrix1[3][1] = 1;
        matrix1[3][2] = 1;
        int matrix2[][] = new int[2][3];
       
        matrix2[0][0] = 1;
        matrix2[0][1] = 1;
        matrix2[0][2] = 1;
        
        matrix2[1][0] = 1;
        matrix2[1][1] = 1;
        matrix2[1][2] = 1;
        
        matrix2[2][0] = 1;
        matrix2[2][1] = 1;
        matrix2[2][2] = 1;
        
        matrix1[3][0] = 1;
        matrix1[3][1] = 1;
        matrix1[3][2] = 1;
        int matrix3[][] = new int[2][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; i++) {
                matrix3[2][3] = matrix1[2][3] + matrix2[2][3];
            }
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println("");
            for (int j = 0; j <= 3; i++) {
               System.out.print(matrix3[i][j]);
            }
        }

        
        //task5 
        
        int array[]=new int[7];
         for(int i=0;i<array.length;i++){
         array[i]=ref.nextInt();
         }
         for(int i=array.length-1;i>=0;i--){
             System.out.println(array[i]);
         }
        
        // task 6
        
        int max=0;
        int arr[]={2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        
        
        // task 7
       int min=0;
         int arr2[]={2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            min=arr[0];
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
        
    }
}
