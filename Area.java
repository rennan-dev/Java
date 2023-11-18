//Area do trapézio
import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        float area, baseMaior, baseMenor, altura;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("\nDigite a altura do trapézio: ");
        altura = ler.nextFloat();

        System.out.print("\nDigite a base maior do trapézio: ");
        baseMaior = ler.nextFloat();

        System.out.print("\nDigite a base menor do trapézio: ");
        baseMenor = ler.nextFloat();

        area = (baseMaior + baseMenor)*altura/2;

        System.out.println("A área do trapézio é: " + area);
    }    
}
