import java.util.Arrays;
import java.util.Scanner;
public class Arraay2d
{
	public static void main(String[] args) {
// 	 int arr[][] = { { 1, 2, 3 },
//         { 2, 3, 4 },
//              {1,2}
//     };
//     for (int row=0;row<arr.length;row++) {
      
//         System.out.println("arr is "+ Arrays.toString(arr[row]));
      
//      }
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
for (int i = 0; i < arr.length;i++){
  for (int j = 0; j < arr[i].length;j++){
        arr[i][j]=sc.nextInt();
    }
}
for(int[] i:arr){
       System.out.println(" "+Arrays.toString(i));
    
}
    
  }
}
