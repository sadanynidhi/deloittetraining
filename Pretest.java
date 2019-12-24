import java.util.*;

public class Pretest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Enter String");
		String word = new String("theyyu");
		System.out.println(word);
		
		int length = word.length();
		
		System.out.print("Reversed String :");
		for(int i = length-1; i>=0; i--)
		{
			System.out.print(word.charAt(i));
		}
		int count=0;
		
		for(int i=0; i<length; i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("Vowels :" + count);

	}

}
