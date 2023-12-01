package entidades;
public class Leitor {

    // variáveis que guardam os valores
    private String nome, email, endereco;
    private int telefone;
    
    // construtor
    public Leitor(){

        this.nome = null;
        this.email = null;
        this.endereco = null;
        this.telefone = 0;
    }

    // retorna o nome do leitor
    public String getNome(){
        return nome;
    }

    // guarda ou atualiza nome do leitor
    public void setNome(String nome){
        this.nome = nome;
    }

    // retorna email do leitor
    public String getEmail(){
        return email;
    }

    // guarda ou atualiza email do leitor
    public void setEmail(String email){
        this.email = email;
    }
    
    // retorna endereço do leitor
    public String getEndereco(){
        return endereco;
    }

    // guarda ou atualiza endereço do leitor
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    // retorna telefone do leitor
    public int getTelefone(){
        return telefone;
    }

    // guarda ou atualiza telefone do leitor
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

}