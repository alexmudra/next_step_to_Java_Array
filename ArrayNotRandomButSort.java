
public class ArrayNotRandomButSort 
{

	public static void main(String[] args) 
	{
		int[] x;
		x = new int[20];
		initArray(x);
		printArray(x);
													// так делается сортировка в массивах, это пример кода
		for (int index = 0; index < x.length; index++)
		{
		
		{
			for (int i = 0; i < x.length - 1; i++)
			if (x[i] > x[i + 1])
			{
				int hold = x[i + 1];
				x [i + 1] = x[i];
				x [i] = hold;
													//	тут заказчивается код сортировки
						}
		}
		}
		printArray(x);	
	}	
												
		static void printArray(int [] arr)
   {
			
			for (int i = 0; i < arr.length; i++)
		{
				if(i == arr.length - 1) System.out.print(arr[i]);
				else System.out.print(arr[i]+ ",");
				
		}
		System.out.println();	
		System.out.println("_" + arr.length); // как сделать так, что-бы появился разделитель между строчками?
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


