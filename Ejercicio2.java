package depuracionejemplos1;

public class Ejercicio2 {
	
	private int num, cont, suma;

	public void inicializar () {

		System.out.println("Introduce un numero");
		num = Entrada.entero();
		suma = 0;
	}
	
	public void calculo() {
		
		for (cont = 1; cont < num ; cont++) {
			
			if( num % cont == 0) {
				suma = suma + cont;
			}
		}
		
		}
	
	public void calculo2() {
		
		do { 
			
			num--;
			suma = 0;
			for (cont = 1; cont < num ; cont++) {
				
				if( num % cont == 0) {
					suma = suma + cont;
				}
			}
			
			if ( suma == num) {
				
				System.out.println(num + " es un numero perfecto");
				
			}
			
		}while ( num > 1);
		
		}

	
	public void imprimir () {

		System.out.println("la suma de los divisores son : " + suma);

	}
	
	public static void main(String[] ar) {

		Ejercicio2 mayormenor;
		mayormenor=new Ejercicio2();
		mayormenor.inicializar();
		mayormenor.calculo();
		mayormenor.imprimir();
		mayormenor.calculo2();

	}
}