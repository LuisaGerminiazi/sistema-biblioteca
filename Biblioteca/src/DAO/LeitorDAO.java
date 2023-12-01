package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoBD; // importando classe que faz conexão com o BD
import entidades.Leitor; // importando classe para realizar o cadastro de livros no banco de dados

public class LeitorDAO {

    public void cadastroLeitor(Leitor leitor)
    {
        // ação de inserir os dados no banco de dados
        String sql = "Insert into Leitor (nomeLeitor, telefone, emailLeitor, enderecoLeitor) values (?, ?, ?, ?)";
        PreparedStatement ps = null; // definindo o prepared statement

        try
        {
            // chamando comando de conexão
            ps = ConexaoBD.getConexao().prepareStatement(sql);

            // definindo os campos em ?
            ps.setString(1, leitor.getNome());
            ps.setInt(2, leitor.getTelefone());
            ps.setString(3, leitor.getEmail());
            ps.setString(4, leitor.getEndereco());

            ps.execute(); // executa a conexão
            ps.close(); // fechamento 

        } catch (SQLException e){

            e.printStackTrace(); // em caso de erro
        }
        
    }
    
}
