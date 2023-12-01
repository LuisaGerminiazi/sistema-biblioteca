package entidades;
import java.time.LocalDateTime; // o pacote é usada para representar um objeto data-hora que representa uma hora e uma data

public class Emprestimo {

    // variáveis que recebem os valores inseridos
    private int idLivro;
    private int idLeitor; 
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private LocalDateTime dataDevolucaoReal;
    
    // construtor que inicializa as variáveis 
    public Emprestimo(){

    idLivro = 0;
    idLeitor = 0; 
    dataEmprestimo = null;
    dataDevolucaoPrevista = null;
    dataDevolucaoReal = null;

    }

    // retorna id do livro inserido
    public int getIdLivro(){
      return idLivro;
    }

    // guarda ou atualiza id do livro
    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }

    // retorna id do leitor inserido
    public int getIdLeitor(){
      return idLeitor;
    }

    // guarda ou atualiza id do leitor
    public void setIdLeitor(int idLeitor){
        this.idLeitor = idLeitor;
    }

    // retorna data que foi feito empréstimo
    public LocalDateTime getDataEmprestimo(){
        return dataEmprestimo;
    }

    // guarda ou atualiza data de empréstimo
    public void setDataEmprestimo (LocalDateTime dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    // retorna data de devolução prevista
    public LocalDateTime getDataDevolucaoPrevista(){
        return dataDevolucaoPrevista;
    }

    // guarda ou atualiza data de devolução prevista
    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista){
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    // retorna data de devolução real
    public LocalDateTime getDataDevolucaoReal(){
        return dataDevolucaoReal;
    }

    // guarda ou atualiza data de devolução real
    public void setDataDevolucaoReal(LocalDateTime dataDevolucaoReal){
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public String toString()
    {
       return "ID do Livro: "   +
                getIdLivro()    +
               "ID do Leitor: " +
               getIdLeitor()    +
               "Data de devolução prevista: " +
               getDataDevolucaoPrevista()     +
               "Data de devolução real: "     +
               getDataDevolucaoReal();
    }

}