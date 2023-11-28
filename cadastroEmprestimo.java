import java.time.LocalDateTime;

public class cadastroEmprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private LocalDateTime dataDevolucaoReal;
    
    public cadastroEmprestimo(){
    dataEmprestimo = null;
    dataDevolucaoPrevista = null;
    dataDevolucaoReal = null;

    }

    public LocalDateTime getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo (LocalDateTime dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista(){
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista){
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDateTime getDataDevolucaoReal(){
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDateTime dataDevolucaoReal){
        this.dataDevolucaoReal = dataDevolucaoReal;
    }




















}