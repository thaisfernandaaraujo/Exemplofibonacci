import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	
	public static List<Integer> fibonacci() {
		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);
		int atual = 0;
		
		while (atual < 350) {
			atual = lista.get(lista.size() - 2) +
					lista.get(lista.size() -1);
			lista.add(atual);
		}
		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> fibonacci = fibonacci();
		for(int i = 0; i < fibonacci.size(); i++) {
			System.out.printf("i[%d] - val[%d]\n", i, fibonacci.get(i));
			if(a.equals(fibonacci.get(i))) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
}
