
public class findMin
{
	public static void main(String[] args) {
	int []arr={11,2,-4,7,-3};
	System.out.println(min(arr));
	}
	
	static int min(int[]arr){
	    int mini=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(mini>arr[i]){
	            mini=arr[i];
	        }
	    }
	    return mini;
	}
}
