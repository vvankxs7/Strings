public class DemoColega {
	public static void main(String[] args) {
	
	Colega a = new Colega();

	a.setNome("Cauê");
	a.setNota(8.5f);

	System.out.println("Valores nos atributos: ");
	System.out.println("Nome: "+a.getNome());
	System.out.println("Nota: "+a.getNota());

	System.out.println("Valores nos atributos: "+a);
	}
}
