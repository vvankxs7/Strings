import java.util.Scanner;
	public class DemoCliente3{
		public static void main(String[] args){
			String nome;
			float montanteVendas;
			int n;

			Scanner sc = new Scanner(System.in);

			System.out.println("Entre com a quant de clientes: ");
			n = sc.nextInt();

			Cliente1[] c = new Cliente1[n];

			for(int i=0; i< c.length; i++){
				sc.nextLine();
			System.out.println("Dados do cliente"+(i+1));
			System.out.println("Nome :");
			nome = sc.nextLine();
			System.out.println("Montante de Vendas: ");
			montanteVendas = sc.nextFloat();

			c[i] = new Cliente1();
			c[i].setNome(nome);
			c[i].setMontanteVendas(montanteVendas);
			}

			for(int i=0; i<c.length; i++){
				System.out.println("Cliente: "+(i+1));
				System.out.println(c[i]);
			}
			sc.close();
		}
	}
