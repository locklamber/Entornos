package depuracionejemplos1;

public class EjemploConMetodos {

	public static void main(String[] args) {
		int a, b, suma, resta, prod, divEntera, resto, potEntera ;
		double  divReal,potencia ;
		System.out.println("introduce a y b");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		suma=a+b;
		resta=a-b;
		prod=a*b;
		divEntera=a/b;
		resto=a%b;
		double f=factorial(a); //llamamos a un m�todo est�tico que calcula el factorial de a
		divReal=(double)a/b;
		potencia=Math.pow(a, b);
		potEntera=power(a, b);
		System.out.println("suma="+suma);
		System.out.println("resta="+resta);
		System.out.println("producto="+prod);
		System.out.println("cociente division entera="+divEntera+" y resto="+resto);
		System.out.println("cociente division real="+divReal);
		System.out.println("Potencia de a elevado a b mediate metodo="+potEntera);
		System.out.println("Potencia de a elevado a b="+potencia);
		System.out.println("Factorial de a="+f);	
	}
	
	static double factorial (int num){

		double fact=1;
		for (int i=1; i<=num; i++)
			fact*=i;
		return fact;	
	}
	static int power (int a, int b){

		int pow=1;
		for (int i=1; i==b; i++)
			pow=pow*a;
		return pow;	
	}
}
