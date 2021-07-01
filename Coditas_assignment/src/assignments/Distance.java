package assignments;

public class Distance {


	public static void main(String[] args) {
		String s1="horse";
		char str[]=s1.toCharArray();
		
		
		
		//display the original array
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]+" ");
			
		}
		
		System.out.println("before update"+"-"+str[0]);
		str[0]='r';
		System.out.println("after update"+"-"+str[0]);
		System.out.println("array after replacing 'h' with 'r'");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		
		
		char temp[]=new char[n];	
		int j=0;
		for(int i=0;i<n;i++)
		{
		
		if(str[i]!='r')
		{
			temp[j++]=str[i];			
		}
		}
		
		temp[j++]=str[n-1];
		
		
		// changing temporary array to original array
		System.out.println("array after removing r");
		for(int i=0;i<j-1;i++)
		{
		
			str[i]=temp[i];
		
		System.out.println(str[i]);
		}
//-----------------------------------------------------------------------------		

		int k=0;
		
			
		for(int i=0;i<2;i++)
		{
		
		if(str[i]!='e')
		{
			temp[k++]=str[i];			
		}
		}
		
		temp[k++]=str[1];

		// changing temporary array to original array
		System.out.println("array after removing e");
		for(int i=0;i<k-1;i++)
		{
		
			str[i]=temp[i];
		
		System.out.println(str[i]);
		}
		
		
	}
}
		
		

