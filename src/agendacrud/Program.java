package agendacrud;

import agendaInterfaceGrafica.Principal;
import java.util.Scanner;

public class Program {
    public boolean VerificaEscolha(int num)
    {
        if(num != 1 && num != 2) return false;
        else if(num == 1)
        {
             agendaConsole console = new agendaConsole();
             console.rodarConsole();
        }
        else
        {
            Principal form = new Principal();
            form.show();
        }
        return true;
    }
    
    public static void main(String[] args) {
        Program a = new Program();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o modo de continuacao da aplicacao: ");
        System.out.println("1- Continuar console");
        System.out.println("2- Interface grafica");
        int decisao = scanner.nextInt();
        while(!a.VerificaEscolha(decisao))
        {
            System.out.println("Escolha o modo de continuacao da aplicacao: ");
            System.out.println("1- Continuar console");
            System.out.println("2- Interface grafica");
            decisao = scanner.nextInt();
            scanner.nextLine();
        }
        
        
        
        
        
    }
    
}
