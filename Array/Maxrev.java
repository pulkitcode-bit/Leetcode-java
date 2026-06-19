import java.util.Arrays;
public class Maxrev
{
	public static void main(String[] args) {
	 int []arr={5,69,3,2,7,8,9};
	 System.out.println(max(arr));
	 reverse(arr);
	 
	}
	 static int max(int[]arr){
	    int maxi=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]>maxi){
	            maxi=arr[i];
	        }
	    }
	    
	   return maxi; 
	}
	 static void reverse(int []arr){
	    int start=0;
	    int end=arr.length-1;
	    int temp;
	    while(start<end){
	        temp=arr[start];
	       arr[start]=arr[end];
	       arr[end]=temp;
	        start++;
	        end--;
	    }
	    
	        System.out.println(Arrays.toString(arr));
	    
	}
	
}
