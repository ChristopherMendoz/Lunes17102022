package algoritmosdebusqueda;
import static java.lang.Math.*;

import java.util.Scanner;
public class DemoBusquedaBinariaIterativa {

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("De que tamaño sera el arreglo");
	int n = sc.nextInt();
	
	int A[]= new int[n];
	
	System.out.println("Ingrese los elementos del arreglo: ");
	for(int i = 0; i < n; i++) {
		System.out.print("Elemento [" + i  + "] = ");
		A[i] = sc.nextInt(); 
	}
	System.out.print("Elemento a buscar en el arreglo: ");
	int buscado = sc.nextInt();
	int resultado = busquedaBinariaIterativa(A,A.length,buscado);
	if (resultado != -1) {
		System.out.println("El elemento " + buscado + " esta en la posicion " + resultado);
	}else {
		System.out.println("EL elemento " + buscado+ " no se encontro");
	}
	sc.close();
}


	public static int busquedaBinariaIterativa(int A[], int n, int buscado) {
		int indiceIzq = 0;
		int indiceDer = n - 1;
		while (indiceIzq <= indiceDer) {
		int indiceMedio = Math.round((indiceIzq + indiceDer)/2);
		if(A[indiceMedio] == buscado) {
			return indiceMedio;
		}else if(A[indiceMedio] > buscado) {
			indiceDer = indiceMedio - 1;
		}else if(A[indiceMedio] < buscado) {
			indiceIzq = indiceMedio + 1 ;
		}
	}
		return -1;
	}
}
	