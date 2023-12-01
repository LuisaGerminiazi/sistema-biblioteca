import java.util.Scanner;

//import DAO.LivroDAO;
import entidades.Emprestimo;
import entidades.Leitor;
import entidades.Livro;

public class Menu
{
   public static void main (String[] args)
   {
      // objetos das classes
      Livro livro = new Livro();
      Leitor leitor = new Leitor();
      Emprestimo emprestimo = new Emprestimo();
      

      // objeto de scanner
      Scanner scanner = new Scanner(System.in);

      while (true) 
      {
         exibirMenu(); //chamando função que exibe menu

         int opcao = scanner.nextInt();
         scanner.nextLine(); // Consumir a nova linha pendente após a leitura do número

         switch (opcao) // declarando as ações de acordo com as opções
         {
             case 1:
               cadastroLivro(scanner, livro); // chamando função de cadastro do livro

                 break;
             case 2:
               cadastroLeitor(scanner, leitor); // chamando função de cadastro do livro
                 break;
             case 3:
               cadastroEmprestimo(scanner, emprestimo); // chamando função de cadastro de emprestimo
                 break;
             case 4:
               //consultaEmprestimo(scanner, emprestimo); // chamando funçaõ de mostrar dados cadastrados de emprestimo
                 break;
             case 5:

                 System.out.println("Saindo do programa.");
                 System.exit(0);

                 break;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
          
         }
      }
   } 

   public static void exibirMenu() // menu de opões
   {
      System.out.println("1. Cadastrar Livro");
      System.out.println("2. Cadastrar Leitor");
      System.out.println("3. Cadastrar Empréstimo");
      System.out.println("4. Consultar Empréstimos");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");
   }

   public static void cadastroLivro(Scanner scanner, Livro livro)
   {
      while(true)
      {
             System.out.println("Digite o Título do Livro: ");
             String titulo = scanner.nextLine();
             livro.setTitulo(titulo);

             System.out.println("Digite o Autor do Livro: ");
             String autor = scanner.nextLine();
             livro.setAutor(autor);

             System.out.println("Digite o Código do Livro: ");
             int cod = scanner.nextInt();
             livro.setCodigoDoLivro(cod);

             // executando o cadastro no banco de dados
             //new LivroDAO().cadastroLivro(livro); 

             // Consumir a nova linha pendente após a leitura do número
             scanner.nextLine();

             System.out.print("Deseja cadastrar outro livro? (S/N): ");
             String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("S"))
                {
                  continue;
                }
                else
                {
                  break;
                }
      }
   }

   public static void cadastroLeitor(Scanner scanner, Leitor leitor)
   {
      while(true)
      {
         System.out.println("Digite o nome completo do leitor:  ");
         String nome = scanner.nextLine();
         leitor.setNome(nome);

         System.out.println("Digite o telefone do leitor: ");
         int telefone = scanner.nextInt();
         leitor.setTelefone(telefone);

         System.out.println("Digite o email do leitor: ");
         String email = scanner.nextLine();
         leitor.setEmail(email);

         scanner.nextLine();

         System.out.println("Digite o endereço do leitor");
         String endereco = scanner.nextLine();
         leitor.setEndereco(endereco);

         // executando o cadastro no banco de dados
         //new LeitorDAO().cadastroLeitor(leitor); 

          System.out.print("Deseja cadastrar outro leitor? (S/N): ");
            String resposta = scanner.nextLine();

              if (resposta.equalsIgnoreCase("S"))
              {
                continue;
              }
              else
              {
                break;
              }
      }
   }
   
   public static void cadastroEmprestimo(Scanner scanner, Emprestimo emprestimo)
   {
       while(true)
       {
          System.out.println("Digite o ID do Livro: ");
          int idLivro = scanner.nextInt();
          emprestimo.setIdLivro(idLivro);

          System.out.println("Digite o ID do Leitor: ");
          int idLeitor = scanner.nextInt();
          emprestimo.setIdLeitor(idLeitor);

          System.out.println("Digite a data do empréstimo (formato dd/MM/yyyy): ");
      
       }
   }
 
}

