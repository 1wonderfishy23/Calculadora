
import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {
    
     double n1,n2;
     int esc;
        
     System.out.println("Digite o 1º numero: ");
        Scanner reader = new Scanner(System.in);
        n1 = reader.nextDouble();

    System.out.println("Digite o 2º numero: ");
    reader = new Scanner(System.in);
    n2 = reader.nextDouble();

    System.out.println("Digite a operação desejada: \n[1] SOMA\n[2] SUBTRAÇÃO\n[3] DIVISÃO\n[4] MULTIPLICAÇÃO");
    reader = new Scanner(System.in);
    esc = reader.nextInt();

    double som = n1 + n2; 
    double sub = n1 - n2; 
    double div = n1 / n2; 
    double mul = n1 * n2; 

    if (esc == 1) {
        System.out.println("A soma de "+ n1 + " + " + n2 + " = "+ som);
    }

     if (esc == 2) {
        System.out.println("A subtração de "+ n1 + " - " + n2 + " = "+ sub);
    }

     if (esc == 3) {
        System.out.println("A divisão de "+ n1 + " / " + n2 + " = "+ div);
    }

     if (esc == 4) {
        System.out.println("A multiplicação de "+ n1 + " x " + n2 + " = "+ mul);
    }





    }


    
}
