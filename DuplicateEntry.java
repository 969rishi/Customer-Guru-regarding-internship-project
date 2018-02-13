import java.util.*;

public class DuplicateEntry{
	public static void main(String[] args){

        
		int x=0;
		for(int i =0; i<args.length; i++)
		{
			x = x+Integer.parseInt(args[i]);
		}

		System.out.println("Value of x = "+x);
		
	}
}