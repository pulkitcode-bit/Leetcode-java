
public class rotated
{
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findpivot(arr));
    }
   static int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        //if you do not find pivot then it means the array is not rotated 
        if(pivot ==-1){
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
            
        }
        //if pivot is found you have to found 2 asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
         return binarysearch(nums,target,0,pivot-1);
        }
     
         return binarysearch(nums,target,pivot+1,nums.length-1);
        
    }
    static int binarysearch(int[]arr,int target,int start,int end){
	    while(start<=end){
	       // int mid=(start+end)/2;//might give us error because the value can exceed  beyond
	        int mid=start+(end-start)/2;
	        if(target< arr[mid]){
	            end=mid-1;
              
	        }
	        else if(target>arr[mid]){
	            start=mid+1;
	        }
	        else{
	            return mid;
	        }
	    }
	    return -1;
	}

    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid;
            }
           if(mid>start && arr[mid]<arr[mid-1]){
               return  mid-1;
           }
           if(arr[start]>=arr[mid]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
           
           
        }
	  return -1;  
	}
	
}