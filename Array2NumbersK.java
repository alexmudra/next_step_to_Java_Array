
public class Array2NumbersK 
{
	

	public static void main(String[] args) 
	{										//2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
		int[] cool = {2,4,7,12,20};
		int k = 2;
		int summ = 0;
		int i = 0;
		for(i = 0; i < cool.length; i++)
		{
			if(cool[i] % k == 0)
			{
			summ = summ + cool[i];
			}
		}
		
		
																//		if(cool[i] % k == 0)
																//		{
																//		summ = summ + cool[i];	
																//		}
																//		
																//		i++;
																//		
																//		if(cool[i] % k == 0)
																//		{
																//		summ = summ + cool[i];	
																//		}
																//		
																//		i++;
																//		
																//		if(cool[i] % k == 0)
																//		{
																//		summ = summ + cool[i];	
																//		}
																//		
																//		i++;
																//		
																//		if(cool[i] % k == 0)
																//		{
																//		summ = summ + cool[i];	
																//		}
			System.out.print(summ);
	}

}
