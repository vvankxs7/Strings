public class Cliente1 {
	private String nome;
	private float montanteVendas;

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setMontanteVendas(float montanteVendas){
		this.montanteVendas = montanteVendas;
	}
	
	public float getMontanteVendas(){
		return this.montanteVendas;
	}

	public String toString(){
		String r;
		r="nome: "+this.nome+"montanteVendas: "+this.montanteVendas;
		return r;
	}
}
