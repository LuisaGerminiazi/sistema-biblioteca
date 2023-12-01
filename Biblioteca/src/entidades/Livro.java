package entidades;
public class Livro {
    
    // variáveis que guardam os valores inseridos
    private String titulo, autor;
    private int codigoDoLivro;

    // construtor
    public Livro(){
       
        this.titulo = null;
        this.autor = null;
        this.codigoDoLivro = 0;
       
    }

    // retorna o título do livro
    public String getTitulo(){
        return titulo;
    }

    // guarda ou atualiza o título do livro
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    // retorna o autor do livro
    public  String getAutor(){
        return autor;
    }

    // guarda ou atualiza o autor do livro
    public void setAutor(String autor){
        this.autor = autor;
    }

    // retorna o código do livro
    public int getCodigoDoLivro(){
        return codigoDoLivro;
    }

    // guarda ou atualiza o código do livro
    public void setCodigoDoLivro(int codigoDoLivro){
       this.codigoDoLivro = codigoDoLivro; 
    }
    
}
