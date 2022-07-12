package questao3;

public class Esportivo extends Automovel{
	
	public Esportivo() {
		super();
	}
	
	public final String combustivel() {
		return combustivel = "GASOLINA";
	}
	
	@Override
	public String toString() {
		return combustivel();
	}
}