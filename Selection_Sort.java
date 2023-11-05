public class Selection_Sort {

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

        selectionSort(vet);

        System.out.println("\nOrdenado");
        for(i=0; i<vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    private static void selectionSort(int[] vet) {
        int i, j;

        for(i=0; i<vet.length-1; i++) {
            int menor = i;

            for(j=i; j<vet.length; j++) {
                if(vet[j] < vet[menor]) {
                    menor = j;
                }
            }
            int temp = vet[menor];
            vet[menor] = vet[i];
            vet[i] = temp;
        }
    }
    
}
