
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to testyantra";
String str1="";
char[]ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
	
{
	str1=str1+ch[i];
	if (ch[i]=='t')
		{
				
				str1=str1+'@';
		}
	else if (ch[i]=='e')
	{
		
		str1=str1+'#';
		
	}
	


}

		
	System.out.println(str1);	
		
	}

}
