package es.ilopezma.nreinas;


/**
 * Solución al Reto de Programacion de "El problema de N-Reinas" utilizando Vuelta atrás
 * 
 * @author ilopezma
 *
 */
public class NReinas {

	public NReinas() {
		super();	
	}
	
	int[][] colocaReinas (int N) {
		
		int[][] tablero = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tablero[i][j] = 0;
			}
		}
		
		return tablero;
		
	}

}
