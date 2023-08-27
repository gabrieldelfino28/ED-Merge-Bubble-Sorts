package Algoritmos.BubbleSort;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int[] FBubbleSort(int[] vet) {
		int tamanho = vet.length;
		int aux = 0;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}

}
