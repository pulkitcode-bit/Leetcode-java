import java.util.Arrays;
public class Array2dsearch
{
	public static void main(String[] args) {
		int[][] arr={
		    {23,18,43},{25,67,87},{59,89}
		};
		int[] ans=find(arr,1);

	System.out.println(Arrays.toString(ans));
			System.out.println(max(arr));
	}
	static int[] find(int[][]arr,int target){
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr[i].length;j++){
	            if(arr[i][j]==target){
	                return new int[]{i,j};
	            } 
	        }
	    }
	    return new int[]{-1,-1};
	}
	static int max(int[][]arr){
	    int max=arr[0][0];
	    for(int[] i:arr){
	        for(int j:i){
	            if(j>max){
	                max=j;
	                return max;
	            } 
	        }
	    }
	    return -1;
	}
}
