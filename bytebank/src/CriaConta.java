
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 450;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 350;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 800;
		
		System.out.println("Primeira conta tem "+ segundaConta.saldo);
		System.out.println("Segunda conta tem "+ segundaConta.saldo);
		primeiraConta.agencia = 153;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		segundaConta.agencia = 153;
		
		System.out.println("Agora a segunda conta esta na agencia "+segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
