package ponyExpress;

public class Jinete {

	public static int jinetes(int[] estaciones) {

		int cambios = 1;
		int millas = estaciones[0];
		for (int j : estaciones) {
			if (millas + j <= 100)
				millas += j;
			else {
				cambios++;
				millas = j;
			}
		}

		return cambios;
	}
}
