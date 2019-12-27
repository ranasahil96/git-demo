
public class Definition 
{ 
	
	
	int[] a=null;

public Definition(int n)
{
	 a=new int[n];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("i=" +a[i]);
	
		
	}
	
}

public void insertArray(int x , int y)
{
	try
	{
	//for( x=0;x<a.length;x++)
	
		a[x]= y;
	
		System.out.println("i=" +a[x]);
		
	
}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array is out of bound" );
		
		//e.printStackTrace();
		
	}
   }


	

}
