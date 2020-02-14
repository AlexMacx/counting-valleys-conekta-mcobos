package main.java;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Manuel A. Cobos L.
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int steps = 0;
		String tracks = null;
		//Scanner scanner = new Scanner(System.in);
		//steps = scanner.nextInt();
		//String tracks = scanner.nextLine();
		steps = Integer.parseInt(args[0]);
		
		tracks = args[1];
		int valleys = numValleys(steps, tracks);
		System.out.println(valleys);
		//scanner.close();
		
	}
	
	/**
	 * Funcion que recibira 2 parametros, steps para saber cuantos pasos
	 * esta dando Gary y tracks para saber el camino que siguió al subir o 
	 * bajar un valle o montaña.
	 * @param steps
	 * @param tracks
	 * @return
	 */
	public static int numValleys(int steps, String tracks) {
		//para hacer la cuenta de los valles recorridos
		int counting = 0;
		//incrementa o disminuye dependiendo de si sube o baja al caminar
		int ud = 0;
		//indice para recorrer la cadena tracks paso a paso
		int index = 0;
		//Verifica si dio mas de un paso y si es igual a lo que subio y bajo
		if(steps>1 && tracks.length()==steps) {
			while(index < steps) {
				//Toma el valor s[i]
				char si=tracks.charAt(index);
				//si es U incrementa en 1 y si es D disminuye en 1
				if(si=='U') 
					ud++;
				if(si=='D') 
					ud--;
				//Si llega al nivel del mar (corresponde a 0) y llego subiendo, se cuentan los valles 
				if(ud==0 && si=='U') 
					counting++;
				
				index++;
			}
		}
		
		return counting;
	}

}
