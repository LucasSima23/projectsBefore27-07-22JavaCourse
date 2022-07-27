package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		
		list.add("Lucas S");
		list.add("Gustavo L");
		list.add("Fulano de Tal");
		list.add("Igor");
		list.add("Gigi");
		list.add("Tassia");
		
		
		list.add(2,"Test");
		
		for(String x : list)
		{
			System.out.println(x);
		}
		
		list.removeIf(x -> x.charAt(0) == 'G');
		
		System.out.println("------------------------");
		
		for(String x : list)
		{
			System.out.println(x);
		}
		System.out.println("------------------------");
		
		
		/* retorna uma list só com os nomes que começam com T */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		for(String x : result)
		{
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		
		/* retorna o primeiro elemento que começa com T, se nao existir retorna Null */
		String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println("------------------------");
		
		
	}

}
