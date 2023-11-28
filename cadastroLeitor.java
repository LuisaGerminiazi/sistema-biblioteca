public class cadastroLeitor {
    private String nome, email, endereco;
    private int telefone;
    
    public cadastroLeitor( String nome, String email, String enedereco, int telefone){
        super();
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void SetEmail(){
        this.email = email;
    }
    
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(){
        this.endereco = endereco;
    }

    public int getTelefone(){
        return telefone;
    }



}