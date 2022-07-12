package questao3;

public class Caminhao extends Automovel{

	public Caminhao() {
		super();
	}
	
	public final String combustivel() {
		return combustivel = "DIESEL";
	}
	
	@Override
	public String toString() {
		return combustivel();
	}
}