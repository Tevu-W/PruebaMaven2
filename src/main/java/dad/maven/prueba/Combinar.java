package dad.maven.prueba;

public class Combinar {
	
	public static String combinar(Object [] array) {
		StringBuffer result = new StringBuffer();
		String result1 = null;
		for(int i=0;i<array.length;i++) {
			result1 = result.append(array[i]).toString();
			result1 = result.append(" ").toString();
		}
		result1 = result.deleteCharAt(result1.length()-1).toString();
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] array = { "hola", 3.14126, "adios", 4, true };
		String resultado = combinar(array); // "hola 3.1416 adios 4 true
		System.out.println(resultado);
	}

}
