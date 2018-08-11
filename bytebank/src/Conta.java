public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(Conta conta,double valor) {
		if(this.saldo>=valor) {
			this.saca(valor);
			conta.deposita(valor);
			return true;
		}
		return false;
	}

}
