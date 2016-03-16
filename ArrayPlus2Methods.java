
public class ArrayPlus2Methods 
{

	public static void main(String[] args) 
	{
		int[] x;
		x = new int[10];
		initArray(x);
		printArray(x);
		
	}	
												// система поставила рандомно значения внутри массивов
		static void printArray(int [] arr)
   {
			
			for (int i = 0; i < arr.length; i++)
		{
				if(i == arr.length - 1) System.out.print(arr[i]);
				else System.out.print(arr[i]+ ",");
				
		}
					
	}
		static void initArray(int [] arr)
		{
				
			java.util.Random rand = new java.util.Random();
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = Math.abs(rand.nextInt()) % 10;
			}
		}
}


