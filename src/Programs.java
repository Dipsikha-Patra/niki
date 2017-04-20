
public class Programs {
	
	public static void main(String[] args) {
		
		char a='A';
		int n=7;
		int spc=n/2;
		int str=1;
		
		for (int i=0;i<=n/2;i++)
		{
			for (int j=0;j<spc;j++)
			{
				

					System.out.print(" ");
				}
			for(int k=0;k<str;k++)
			{
			System.out.print(a);
			
			if (k<str/2)
			{
				
				a--;
			}
			else
			{
				
				a++;
			}
			
			}
				
			System.out.println();
			spc--;
			str=str+2;
				
				
				
				
				
	}

}}
