
public class SomeAboutArrays 
{

	public static void main(String[] args) 
	{
		int number = 56;
//		char character = 'a';
//		String s = "Wow";
//		String s1 = new String("Wow2"); 		// когда мы создаем объекты класса мы используем слово "new"
//		System.out.println(character + " "+ s);
		int[] numbers = new int[10];
//		numbers [0] = 1;
//		numbers [1] = 2;
//		numbers [2] = 3;
//		numbers [3] = 4;
		for(int i = 0; i < numbers.length; i++ )		//цикл 'for' очень хорошо подходит для инициализации массива значениями
		{
			numbers[i] = i *10; 						// это мы проинициализировали каждый элемент массива 
		}
		for(int i = 0; i < numbers.length; i++)			
		System.out.println(numbers[i]);
	}
	  {
	 	System.out.println();
	 	
		int[] numbers1 = {1,2,3,4};
		for(int i = 0; i < numbers1.length; i++);
		{
		System.out.println(numbers1[2]);	
		}
			
		
	  }
}
