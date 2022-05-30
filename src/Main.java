
public class Main {

	public static void main(String[] args) {
		
		Cliente evenny = new Cliente();
		evenny.setNome("Evenny");
		
		
		Conta cc = new ContaCorrente(evenny);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(evenny);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
