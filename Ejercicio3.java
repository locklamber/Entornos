package depuracionejemplos1;

public class Ejercicio3 {
	
	public int iterativo(int c) {
		int total=1;
		do {
			total = total *c;
			c--;
		}while (c >= 3);
		
		return total;
	}
	
	public int recursivo(int num2) {
		
		if (num2==0) {
			return 1;
	}
		else {
			return num2*recursivo(num2-1);
		}
	}
	
	public static void main(String[] ar) {

		Ejercicio3 factorial;
		factorial=new Ejercicio3();
		System.out.println("Ingrese el numero");
		int num=Entrada.entero();
		int fit=factorial.iterativo(num);
		System.out.println(fit);
		int fact=factorial.recursivo(num);
		System.out.println(fact);
	}
}
