import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="WELCOME TO TEST YANTRA";
				char ch[]=new char[S.length()];
		char ch1[]=new char[S.length()];
		char ch2[]=new char[S.length()];
		int k=ch2.length-1;
		for(int i=0;i<ch1.length;i++)
		{
			if ((ch1[i]<='A'&&ch1[i]>='E')|| (ch1[i]<='a'&& ch1[i]>='e'))
			{
				ch1[i]=ch[i];
			}
			else
			{
				ch1[i]='o';
				ch2[k++]=ch[i];
				
			}
			
			for (int j=0;j<ch.length;j++)
			{
				if (ch[i]=='o'&& k>=0)
				{
					ch1[i]=ch2[k--];
					S=S+ch1[i--];
				}
				else
				{
					S=S+ch1[i];
				}
				
			}
		Scanner sc= new Scanner(S);
		String str=sc.nextLine();
		}
		
		

	}

}
