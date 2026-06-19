public class LinearSearch
{
	public static void main(String[] args) {
	    int []arr={4,5,7,9,9,10};
	    int target=9;
	System.out.println(linarSearch(arr,target));
	
	}
	private static int linarSearch(int[]arr,int target){
	    if(arr.length==0){
	        return -1;
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            return arr[i];
	        }
	    }
	    return -1;
	}
}