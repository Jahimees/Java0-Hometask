public class Interesting {

	public static void main(String[] args){

		System.out.println("Берем 1 и сдвигаем влево на 31 бит: ");		
		int y = 1<<31;
		System.out.println(y);

		System.out.println("Просто берем минимальный int: ");		
		int x = -2147483648;
		System.out.println(x);

		System.out.println("");
		System.out.println("Вроде ответы одинковые");		
		System.out.println("");

		System.out.println("Но если при операции сдвига (прямо во время выполнения),\n добавить единицу");
		System.out.println("То мы получим весьма интересный результат: ");

		y = 1<<31+1;
		System.out.println("y = 1<<31+1 = "+y);
		System.out.println("Если же мы просто добавим единицу, то всё в порядке:");

		x = -2147483648+1;
		System.out.println("-2147483648+1 = "+x);
	}



}