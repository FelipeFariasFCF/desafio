package questao3;

public class Automovel {

	protected String combustivel;
	
	public Automovel() {	
	}

	public Automovel(String combustivel) {
		super();
		this.combustivel = combustivel;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
}
