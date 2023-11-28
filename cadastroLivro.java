import java.time.LocalDateTime;

public class cadastroLivro {
    private String titulo, autor;
    private LocalDateTime dataEmprestimo;
    private double valor;
    private static int codLv=1;
    private int codigoDoLivro;

    public cadastroLivro(String titulo, String autor, double valor){
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        dataEmprestimo = null;
        this.codigoDoLivro = codLv;
        codLv++;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public  String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getCodigoDoLivro(){
        return codigoDoLivro;
    }

    public LocalDateTime getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo (LocalDateTime dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    
}
