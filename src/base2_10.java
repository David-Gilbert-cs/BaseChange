
import java.security.DigestInputStream;

public class base2_10 
{

		
	private static void compute(String args) 
	{
		Boolean decimal=false;
		int ans = 0;
		String x=args;
		int b= x.length();
		int decimalpoint=0;
		
		
		for(int i=0;i<b;i++)
		{
		
			if(Character.getNumericValue(x.charAt(i)) == 1 && !decimal)
			{
				if(!decimal)ans += Math.pow(2,b-i-1);
				else ans += Math.pow(2,-i-decimalpoint);
			}
			else if(x.charAt(i) == '.')
			{
				decimalpoint=i;
				if(decimal=true)
				{
					System.out.println("the input was not a binary");
					return;
				}
				else decimal=true;
			}
			else if(Character.getNumericValue(x.charAt(i)) != 0)
			{
				System.out.println("the input was not a binary");
				return;
			}
		}
		
		System.out.print(" "+x+" = "+ans+" ");
		return;
	}


	
	
	
	
	
	// take x in base 2 and the number of bits b put it in base 10
		public static void main(String args[]) 
		{
			
			compute("110110");
			/*for(int i =0;i<10;i++)
			{
				
					
					compute(String.valueOf((int)Math.pow(10, i)));
				
			}*/
			
			
		}
		
}

