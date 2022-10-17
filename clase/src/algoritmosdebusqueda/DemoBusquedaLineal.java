package algoritmosdebusqueda;

import java.util.Scanner;

public class DemoBusquedaLineal {
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
		int resultado = busquedaLineal(A,A.length,buscado);
		if (resultado != -1) {
			System.out.println("El elemento " + buscado + " esta en la posicion " + resultado);
		}else {
			System.out.println("EL elemento " + buscado+ " no se encontro");
		}
	}

	public static int busquedaLineal(int A[] , int n, int buscado) {
		int indice = 0;
		while (indice < A.length) {
			if(A[indice] == buscado) {
				return indice;
			}
			indice++;
		}
		return -1;

	}
	
}
