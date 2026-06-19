import java.util.Arrays;
public class SearchinString
{
	public static void main(String[] args) {
		String  str="Hellou World";
		char a='u';
	System.out.println(find(str,a));
		System.out.println(Arrays.toString(str.toCharArray()));
	
	
	}
	static boolean find(String str,char target){
	    if(str.length()==0){
	        return false;
	    }
	    for(char i:str.toCharArray()){
	        if(i==target){
	            return true;
	        }
	        
	    }
	    return false;
	} 
}