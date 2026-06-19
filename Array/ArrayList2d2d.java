import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2d2d
{
	public static void main(String[] args){
	// ..........   one d ArrayList
	   // ArrayList<Integer>arr=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	   // for(int i=0;i<5;i++){
	   //     arr.add(sc.nextInt());
	   // }
	   // int a=sc.nextInt();
	   // if(arr.contains(a)){
	   //     arr.set(a,0);
	   // }
// 	    arr.add(6);
// 	    arr.add(5);
// 	     arr.add(8);
	   // arr.remove(4);
// 	    arr.set(1,7);
// 		System.out.println(arr.contains(0));
// 		System.out.println(arr);
//.......two d arraylist
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());
}
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr.get(i).add(sc.nextInt());
        }
    
}
System.out.println(arr);
sc.close();
	}
}