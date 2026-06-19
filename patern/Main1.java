//public class Main1
//{
	//public static void main(String[] args) {
	// int a[]={5,11,1,5,1};
	// int k=a[1]-a[0]+1;
	// int l=a[3]-a[2]+1;
	// int m=a[4];
	// int b[]=new int[k];
	// int c[]=new int [l];
	// int x=0;
	// int y=0;
	// for(int i=a[0];i<=a[1];i++){
	//     b[x++]=i;
	// }
	// for(int j=a[2];j<=a[3];j++){
	//     c[y++]=j;
	// }
	// int cunt =0;
	// for(int i=0;i<b.length;i++){
	//     for(int j=0;j<c.length;j++){
	//         if(b[i]==c[j]){
	//             cunt ++;
	//         }
	        
	//     }
	// }
	// if(cunt ==m){
	//   System.out.println("True");
	// }
	// else{
	//     System.out.println("False");
	// }
	
//	}
//}
public class Main1
{
	public static void main(String[] args) {
	    int arr[]={5,11,1,5,2};
	    int max=Math.max(arr[0],arr[2]);
	    int min=Math.min(arr[1],arr[3]);
	    int s=min-max+1;
	    if(s>=arr[4]){
	        System.out.println("True");
	        
	    }
	    else{
	          System.out.println("False");
	    }

}}