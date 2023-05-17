package P3; //---------------------------------------------------------------- FIGURA 11
public class Arquiteto {
	private String nome;
	private int idade;

	// Método construtor (tem o mesmo nome da classe)
	public Arquiteto(String nome, int idade) {
	this.nome = nome;   // "this" = referência ao atual objeto  
	this.idade = idade; 
	}
	public void exibirDadosPessoais(){
		System.out.println( nome);
		System.out.println( idade+ " anos");
	}
	public void trabalhe (double r1, double r2, double r3) {
		Circulo a= new Circulo(r1); // define e instancia o objeto "a"
		double x = a.area();
		double y = a.perimetro();
		imprima(r1,x,y);
		
		Circulo b= new Circulo(r2); //define e instancia o objeto "b"
		x = b.area();
		y = b.perimetro();
		imprima(r2,x,y);
		
		b = new Circulo(r3);        // instancia novamente o objeto "b" 
		x = b.area();
		y = b.perimetro();
		imprima(r3,x,y);
	}

	private void imprima(double raio, double area, double perimetro) {
		// %.2f = imprime float com 2 casas decimais
		// \n   = salto de linha
		System.out.printf("raio: %.2f cm\n", raio);  
		System.out.printf("area: %.2f cm\n", area);
		System.out.printf("perimetro: %.2f cm\n", perimetro);
		System.out.println();
	}

	public static void main (String[] args) {
		Arquiteto a1 = new Arquiteto ("Oscar Niemeyer", 104);
		a1.trabalhe(5, 7, 10);
	}
}

// 5. Porque um atributo ou método default (identificados pela ausência de modificador) pode ser acessado por objetos de todas as classes que estiverem no mesmo pacote que a classe que possui o atributo ou o método. Nesse exemplo, arquiteto e circulo estão no mesmo pacote.

// 6.Respostas

// a. Classe arquiteto:

//                 package Especialista;

//                 import Matematica.Circulo;

// Classe circulo:

//                 package Matematica;

// b. Métodos da classe círculo, que está no package Matematica, devem todos ser públicos, para serem acessados pelo objeto de Arquiteto, que está no package Especialista.
