
class Exc2 {
	public static void main(String args[]) {
		// początek testowanego bloku
		try {
			int d = 0;
//			int a = 42 / d; // tu powinien być błąd
			double a = Math.sqrt(-1);
			System.out.println("Tego nie zobaczymy ||"+ (a*5)  
					+ "|| " + Double.isNaN(a));
			System.out.println("aqq");
		}
		// obsługa błędu arytmetycznego (tu dzielenie przez zero)

		catch (ArithmeticException e) {
			System.out.println("Dzielenie przez zero: " + e);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dzielenie przez zero: " + e);
		}
		catch (Exception e) {
			System.out.println("Wyjatek: " + e);
		}
		System.out.println("Poza try/catch");
	}
}

// Skompiluj i uruchom.
// Jaki będzie efekt obsługi błędu?
