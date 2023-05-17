package P3; //---------------------------------------------------------------- FIGURA 11
/*public*/ class Circulo {
	private static double PI = 3.141516;
	private double raio;
		
	public Circulo(double raio) { 
		this.raio = raio;
	}
	public double area(){ 
		return PI * raio * raio ;
	}
	public double perimetro (){ 
		return 2 * PI * raio;
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