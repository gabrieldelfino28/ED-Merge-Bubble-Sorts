package Algoritmos.MergeSort;

public class MergeSort {

	public MergeSort() {
		super();
	}

	public int[] FMergeSort(int[] vet, int inicio, int fim) {
		// Quebrando os vetores em pequenos vetores
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			FMergeSort(vet, inicio, meio); // Esquerda
			FMergeSort(vet, meio + 1, fim);// Direita
			IntercalaSort(vet, inicio, meio, fim); // Método de intercalação
		}
		
		return vet;
	}

	private void IntercalaSort(int[] vet, int inicio, int meio, int fim) {
		//Criando um vetor auxiliar do mesmo tamanho que o original.
		int[] aux = new int[vet.length];
		
		//Preechendo o vetor aux.
		for (int i = inicio; i <= fim; i++) {
			aux[i] = vet[i];
		}
		
		//Declarando os ponteiros da esquerda e da direita
		int esquerda = inicio;
		int direita = meio + 1;

		//Início da intercalação.
		
		/*
		 * Primeiramente, é análisado os ponteiros, esquerda e direita, em relação
		 * a suas posições no vetor auxiliar. E em seguida é análisado o valor do vetor
		 * da esquerda com o da direita.
		 */
		for (int cont = inicio; cont <= fim; cont++) {
			
			if (esquerda > meio) { 
				/*
				 * Se o ponteiro da esquerda passar do meio (for maior), então 
				 * o vetor original recebe o valor do auxiliar na posição do ponteiro
				 * da direita. E então incrementa o ponteiro da direito (dir++) e incrementa
				 * o contador do for.
				 */
				vet[cont] = aux[direita];
				direita += 1;

			} else if (direita > fim) { 
				/*
				 * Se não, se o ponteiro da direita passar do limite do vetor (for maior que o fim), então
				 * o vetor original receber o valor do aux na posição do ponteiro da esquerda. E então
				 * incrementa o ponteiro da direita e o contador.
				 */
				vet[cont] = aux[esquerda];
				esquerda += 1;

			} else if (aux[esquerda] < aux[direita]) {
				/*
				 * Se não, se o valor do aux no ponteiro da esquerda, for MENOR que o valor do aux no ponteiro
				 * da direita. o vetor ORIGINAL recebe o valor do vetor aux na posição do ponteiro da esquerda.
				 * E então incrementa o ponteiro da esquerda e o contador.
				 */
				vet[cont] = aux[esquerda];
				esquerda += 1;
				
			} else {
				/*
				 * Por fim, senão atender nenhuma das 3 condições acimas, o vetor original recebe o valor
				 * do vetor aux. na posição do ponteiro da direita. E então incrementa o ponteiro da direita
				 * e o contador.
				 */
				vet[cont] = aux[direita];
				direita += 1;
				
			}
		}

	}

}
