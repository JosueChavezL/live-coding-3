import java.util.Scanner;
//se basa en el principio de Euclides a=bc+r para calcular Maximo Comun divisor
public class MangosNaranjas {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int mangos = e.nextInt();
		int naranjas = e.nextInt();	
		int cajas = 0;
		int acum = 0;
		int a = mangos;
		int b = naranjas;
		
		if(a == 0 || b == 0) {
			System.out.println("Los números introducidos no tienen un máximo común divisor");
		}else {		
			while(b > 0) {			
				if (a%b != 0){
					acum = a%b;
					a=b;
					b=acum;				
				}else {
					cajas = b;
					break;
				}//else								
			}//while
			if(cajas != 0) {
				MangosNaranjas.imprimir(mangos, naranjas, cajas);
			}//imprime sentencia	
	   }//else
	}//main
	
	private static void imprimir(int mangos, int naranjas, int cajas) {
		System.out.print("De los "+mangos+ " mangos y "+naranjas+" naranjas, se pueden dividir en "+cajas+" cajas con "+ (mangos/cajas)+ " mangos y "+ (naranjas/cajas+ " naranjas en cada caja respectivamente"));	
	}//funcion impresion
}//class Maximo Comun divisor con base en el Algoritmo de Euclides
