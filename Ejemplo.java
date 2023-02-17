package depuracionejemplos1;


public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		divReal=(double)a/b;
		potencia=Math.pow(a, b);
		potEntera=(int)Math.pow(a, b);
		
		System.out.println("suma="+suma);
		System.out.println("resta="+resta);
		System.out.println("producto="+prod);
		System.out.println("cociente division entera="+divEntera+" y resto="+resto);
		System.out.println("cociente division real="+divReal);
		System.out.println("Potencia de a elevado a b="+potEntera);
		System.out.println("Potencia de a elevado a b="+potencia);
	
	}
}
