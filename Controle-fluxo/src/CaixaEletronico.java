import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double saldo = 25.0;

        System.out.print("Qual o valor do saque: ");
        double valorSolicitado = input.nextDouble();

        if(valorSolicitado < saldo){

            saldo -= valorSolicitado;
            System.out.println("Novo saldo " + saldo);

        }else
            System.out.println("Saldo insuficiente");
        
    }
}
