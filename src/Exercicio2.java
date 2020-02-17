import java.text.Normalizer;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio2 {
	
	public static String removerAcentos(String str) {
	    str = Normalizer.normalize(str, Normalizer.Form.NFD);
	    str = str.replaceAll("[^\\p{ASCII}]", "");
	    return str;
	}

	public static Map<String, Integer> contarOcorrecias(String[] nomes) {
		Map<String, Integer> response = new TreeMap<String, Integer>();
		for (String nome : nomes) {
			nome = nome.toUpperCase();
			nome = removerAcentos(nome);
			if (response.containsKey(nome)) {
				Integer total = response.get(nome);
				response.replace(nome, total, total + 1);
			} else {
				response.put(nome, 1);
			}
		}
		return response;
	}
}
