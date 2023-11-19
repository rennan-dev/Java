public class Quick_Sort {

    public static void main(String[] args) {
        
        int[] vet = new int[10];
        int i;

        for(i=0; i<vet.length; i++) {
            vet[i] = (int) Math.floor(Math.random() * vet.length);
        }

        System.out.println("Desordenado");
        for(i=0; i<vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        quicksort(vet, 0, vet.length-1);

        System.out.println("\nOrdenado");
        for(i=0; i<vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    static void quicksort(int[] vet, int esquerda, int direita) {
        if(esquerda < direita) {
            int pivo = particao(vet, esquerda, direita);
            quicksort(vet,esquerda,pivo);
            quicksort(vet,pivo+1,direita);
        }
    }
    static int particao(int[] vet, int esquerda, int direita) {
        int meio = (int) (esquerda+direita)/2;
        int pivo = vet[meio];
        int i=esquerda-1;
        int j=direita+1;

        while(true) {
            do {
                i++;
            }while(vet[i] < pivo);
            do{
                j--;
            }while(vet[j] > pivo);
            if(i>=j) {
                return j;
            }
            int aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
    }
}