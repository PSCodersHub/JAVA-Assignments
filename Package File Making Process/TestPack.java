import pack.Arithmetic;

class TestPack {
	public static void main(String args[]) {
		Arithmetic calc = new Arithmetic();
		
		System.out.println("Addition: "+ calc.add(10, 5));
		System.out.println("Subtraction: "+ calc.sub(10, 5));
		System.out.println("Multiplication: "+ calc.mul(10, 5));
		System.out.println("Division: "+ calc.div(10, 5));
	}
}