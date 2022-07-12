package questao2;

public class ContaCorrente extends Conta{

	public ContaCorrente() {
		super();
	}
	
	@Override
	public double rendimento() {
		saldo = saldo * 0.03;
		return saldo;
	}
	
}
