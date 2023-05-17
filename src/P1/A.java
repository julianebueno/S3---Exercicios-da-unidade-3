package P1; //---------------------------------------------------------------- FIGURA 07

class A {
	static int k; //default = 0
	static void g() {
		System.out.println("Método A.g (sem modificador)");
		System.out.println("Valor de A.k = " + k);
	}
}
/*
- Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).
- O método A.g () não pode ter modificador private porque ele é utilizado nos objetos da classe B . O método B.f () poderia ter modificador private porque apenas é utilizado dentro da própria classe B.
- Poderíamos utilizar o modificador protected em ambos os métodos A.g () e B.f (), pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.
*/