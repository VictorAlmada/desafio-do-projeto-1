import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//números decimais definidos com padrão americano
		Locale.setDefault(Locale.US);
		
		//instânciando um objeto da classe Scanner p/ trabalhar com inputs
		Scanner sc = new Scanner(System.in);
		
		// leitura dos dados
		System.out.print("Digite o nome do cliente: ");
		String name = sc.nextLine();
		System.out.print("Digite o número da agência: ");
		String bankBranch = sc.nextLine();
		System.out.print("Digite o número da conta: ");
		int accountNumber = sc.nextInt();
		System.out.print("Informe o saldo inicial: ");
		double balance = sc.nextDouble();
		
		//impressão
		System.out.println("Olá " + name + ", "
				+ "obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + bankBranch + ", conta " + accountNumber
				+ " e seu saldo R$" + balance + " já está disponível para saque.");
		
		//encerramento do Scanner
		sc.close();

	}

}
