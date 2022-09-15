import java.util.Random;

public class Main {
	final int lenght = 10000;
	int vector[] = new int[lenght];
	public static void main(String[] args) {
		Main m = new Main();
		m.randomizer();
		m.quickSort(m.vector, 0, m.lenght-1);
		for(int i = 0; i < m.lenght; i++) {
			System.out.print(m.vector[i]+", ");
		}
	}
	public void randomizer() {
		Random r = new Random();
		for(int cont = 0; cont < lenght; cont++) {
			vector[cont] = r.nextInt(5001);
		}
	}
	public void quickSort(int[] v, int left, int right) {
		int pivot = left, aux, j;
		for(int i = left + 1; i <= right; i++) {
			j = i;
			if(v[j] < v[pivot]) {
				aux = v[j];
				while(j>pivot) {
					v[j] = v[j-1];
					j--;
				}
				v[j] = aux;
				pivot++;
			}
		}
		if(pivot - 1 >= left) {
			quickSort(v, left, pivot - 1);
		}
		if(pivot + 1 <= right) {
			quickSort(v, pivot + 1, right);
		}
	}
}
