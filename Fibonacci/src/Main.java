import java.util.List;

public class Main {

	public static void main(String[] args) {
	System.out.println("chamou");
		List<Integer> lista = DesafioApplication.fibonacci();
		lista.forEach(i -> System.out.println(i));
		
		Integer number = 377;
		System.out.printf("O numero %d, %s fibonacci", number, Boolean.TRUE.equals(DesafioApplication.isFibonacci(number)) ? "e" : "nao e");
	}

}
