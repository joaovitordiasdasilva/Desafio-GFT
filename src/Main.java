
public class Main {

	public static void main(String[] args) {
		
		Cliente Venilton = new Cliente();
		Venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(Venilton);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(Venilton);
		cc.transferir(100, poupanca);
		
		cc.imprimirInfosComuns();
		poupanca.imprimirInfosComuns();
	}

}
