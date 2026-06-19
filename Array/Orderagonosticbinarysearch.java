
public class Orderagonosticbinarysearch
{
	public static void main(String[] args) {
	int[]arr={90,89,78,67,56,45,33};
	System.out.println(orderAgonostic(arr,67));
	}
	static int orderAgonostic(int[]arr,int target){
	    int s=0;
	    int end=arr.length-1;
	    //find wheter arr is sorted or not
	    boolean isAsc=arr[s]<arr[end];
	    
	    
	     while(s<=end){
	       // int mid=(start+end)/2;//might give us error because the value can exceed  beyond
	        int mid=s+(end-s)/2;
	        if(arr[mid]==target){
	            return mid;
	        }
	        if(isAsc==true){
	             if(target< arr[mid]){
	            end=mid-1;
	      
	        }
	        else {
	            s=mid+1;
	        }  }
	        else{
	          if(target> arr[mid]){
	            end=mid-1;
	        }
	        else {
	            s=mid+1;
	        }  }}
	    return -1;
	}
	
}