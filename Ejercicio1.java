package depuracionejemplos1;

public class Ejercicio1 {
	
	private int num, mayor, menor, suma = 0, cont = 0, media;

	public void inicializar () {

		System.out.println("Introduce un numero");
		num = Entrada.entero();
		mayor = num;
		menor = num;
	}
	
	public void calculo() {
		
		do {
			
		if(mayor< num) {
			
			mayor = num;
			
		}else if (menor > num){
			
			menor = num ;
		
		}
		suma = suma + num;
		cont++;
		num = Entrada.entero();
		
		}while ( num != 0);
		media = suma / cont;
		}
	
	public void imprimir () {

		System.out.println(menor + "es el numero menor");
		System.out.println(mayor + "es el numero mayor");
		System.out.println(media + "es la media");
		
	}
	
	public static void main(String[] ar) {

		Ejercicio1 mayormenor;
		mayormenor=new Ejercicio1();
		mayormenor.inicializar();
		mayormenor.calculo();
		mayormenor.imprimir();

	}
}
