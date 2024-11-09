package agendacrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agendaConsole {
    Scanner scanner = new Scanner(System.in);
    
    public void verificaEscolha(int num)
    {
        if(num == 1)
        {
            adicionarContato();
        }
        else if(num == 2)
        {
            listarContato();
        }else if(num == 3)
        {
            editarContato();
        }else if(num == 4)
        {
            deletarContato();
        }
        else if(num == 0)
        {
            System.out.println("Bye bye");
        }
    }
    
    public void rodarConsole()
    {
        
        System.out.println("===AGENDA===");
        System.out.println("1-Adicionar novo contato");
        System.out.println("2-Listar todos os contatos");
        System.out.println("3-Editar contato");
        System.out.println("4-Excluir contato");
        System.out.println("0-Encerrar programa");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        verificaEscolha(escolha);
    }
    
    public void adicionarContato()
    {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o grupo do contato: ");
        String grupo = scanner.nextLine();
        System.out.print("Digite o numero do contato: ");
        String numero = scanner.nextLine();
        Contato contato = new Contato(numero,nome,grupo);
        AgendaDAO dao = new AgendaDAO();
        dao.inserir(contato);
        System.out.println("Contato " + contato.getNome() + " inserido!");
        rodarConsole();
    }
    
    public void listarContato()
    {
        AgendaDAO dao = new AgendaDAO();
        List<Contato> lista = new ArrayList<>();
        lista = dao.listar();
        for(Contato ct : lista )
        {
            System.out.println(ct);
        }
        System.out.println("");
        rodarConsole();
    }
    
    public void listarContatoSemMenu()
    {
        AgendaDAO dao = new AgendaDAO();
        List<Contato> lista = new ArrayList<>();
        lista = dao.listar();
        for(Contato ct : lista )
        {
            System.out.println(ct);
        }
        System.out.println("");
    }
    
   public void editarContato()
   {
       listarContatoSemMenu();
       System.out.println("Digite o id do contato que deseja editar: ");
       int id = scanner.nextInt();
       scanner.nextLine();
       System.out.print("Digite o novo nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o novo grupo do contato: ");
        String grupo = scanner.nextLine();
        System.out.print("Digite o novo numero do contato: ");
        String numero = scanner.nextLine();
        Contato contato = new Contato(numero,nome,grupo);
        contato.setId(id);
        AgendaDAO dao = new AgendaDAO();
        dao.atualizar(contato);
        System.out.println("Contato " + contato.getNome() + " atualizado!");
        listarContato();
   }
   
   public void deletarContato()
   {
       listarContatoSemMenu();
       System.out.println("Digite o id do contato que deseja excluir: ");
       int id = scanner.nextInt();
       scanner.nextLine();
       AgendaDAO dao = new AgendaDAO();
       if(dao.deletar(id) != -1)
       {
           System.out.println("Contato deletado com sucesso!");
       }
       listarContato();
       rodarConsole();
   }
    
}
