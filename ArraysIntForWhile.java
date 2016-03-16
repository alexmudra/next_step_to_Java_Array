
public class ArraysIntForWhile 
{
	
	public static void main(String[] args) 
	{
		int[] x;
		x = new int[10];
		x[0] =10; x[1] = 23; x[2] = 45;
		
		for(int i = 0; i < x.length; i++)
		if(i == 9)System.out.print(x[i]);
		else System.out.print(x[i] + ",");
	}		
}


