package questao2;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		super();
	}
	
	@Override
	public double rendimento() {
		saldo = saldo * 0.05;
		return saldo;
	}
}