package P3; //---------------------------------------------------------------- FIGURA 10
public class Banco {
	public static void main(String[] args) {
		
		Conta cta1 = new Conta();
		Conta cta2 = new Conta();
		
		cta1.setDono("Maria");
		cta1.setSaldo(150.3f);

		cta2.setDono("Jose");
		cta2.setSaldo(128.57f);
		
		System.out.println("Cta 1 - Correntista: " + cta1.getDono());
		System.out.println("Cta 1 - Saldo: " + cta1.getSaldo() );
		
		System.out.println("Cta 2 - Correntista: " + cta2.getDono());
		System.out.println("Cta 2 - Saldo: " + cta2.getSaldo() );
		
		// Saldo mostra várias casas decimais, sendo que o exemplo está reduzido...
	}
}