public class Merge_Sort {

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

        int[] aux = new int[vet.length];

        mergesort(vet,aux,0,vet.length-1);

        System.out.println("\nOrdenado");
        for(i=0; i<vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        //System.out.println(Arrays.toString(vet));
    }

    private static void mergesort(int[] vet, int[] aux, int ini, int fim) {
        if(ini<fim) {
            int meio = (ini+fim)/2;
            mergesort(vet,aux,ini,meio);
            mergesort(vet, aux, meio+1, fim);
            intercalar(vet,aux,ini,meio,fim);
        }
    }

    private static void intercalar(int[] vet, int[] aux, int ini, int meio, int fim) {
        int k;
        for(k=ini; k<=fim; k++) {
            aux[k] = vet[k];
        }
        
        int i=ini;
        int j=meio+1;

        for(k=ini; k<=fim; k++) {
            if(i>meio) vet[k]=aux[j++];
            else if(j>fim) vet[k]=aux[i++];
            else if(aux[i]<aux[j]) vet[k] = aux[i++];
            else vet[k] = aux[j++];
        }
    }
}
