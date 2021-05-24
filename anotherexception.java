public class anotherexception{
	public static void main(String args[]){
		int num1, num2;
		try{
			num1 = 9;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("Blok Bagian Akhir Try");

		}catch(ArithmeticException e){
			System.out.println("Maaf nilai num1 = 0");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Keluar dari try catch");
		}
	}
}