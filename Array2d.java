import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter rows and column ");
        int r= scan.nextInt();
        int c= scan.nextInt();
        int[][] arr= new int[r][c];
        System.out.println("Enter the array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 arr[i][j]= scan.nextInt();
            }
        }
        System.out.println(" array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}