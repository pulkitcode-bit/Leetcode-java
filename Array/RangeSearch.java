public class RangeSearch
{
	public static void main(String[] args) {
	    int []arr={4,5,7,9,9,10};
	    int target=9;
	System.out.println(linarSearch(arr,target,1,2));
	
	}
	private static int linarSearch(int[]arr,int target,int start,int end){
	    if(arr.length==0){
	        return -1;
	    }
	    for(int i=start;i<end;i++){
	        if(arr[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}
}