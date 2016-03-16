import java.util.concurrent.SynchronousQueue;

public class ArraysPlusFor {

	public static void main(String[] args) {
		int[] numbers = new int[5];						//этот способ когда мы хотим создать массив с пустыми ячейками
													    //n и потом додавать в массив какие-то числа:
														
		for (int i = 0; i < numbers.length; i++){		// имя массива+length дает нам длинну масива
			numbers[i] = i*10;
		}
		for (int i=0; i <numbers.length; i++){
			System.out.println(numbers[i]);
     	}													//если мы заранее знаем какие числа будем инициализировать в 
														//n массив, то делаем инициализацию так:
		
		System.out.println();						
		int[] numbers1 = {1,2,3,4};
		for (int i = 0; i < numbers1.length; i++){
			
			System.out.println(numbers1[i]);
			
		}
	}
}

