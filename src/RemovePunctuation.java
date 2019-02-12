
import java.util.*;

public class RemovePunctuation {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Let's try, Mike!");
		str = removePunctuation(str);
		System.out.println(str.toString());
	}
	
	public static StringBuilder removePunctuation(StringBuilder s) {
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == '\'' || s.charAt(i) == ';'  || s.charAt(i) == ':') {
				s.deleteCharAt(i);
			}
		}
		return s;
	}

}
