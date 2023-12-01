package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoBD; // importando classe que faz conexão com o BD
import entidades.Livro; // importando classe para realizar o cadastro de livros no banco de dados

public class LivroDAO { // classe que faz cadastro dos livros no banco de dados

    public void cadastroLivro(Livro livro)
    {
        // ação de inserir os dados no banco de dados
        String sql = "Insert into Livros (tituloLivro, autorLivro, codigoLivro) values (?, ?, ?)";
        PreparedStatement ps = null; // definindo o prepared statement

        try
        {
            // chamando comando de conexão
            ps = ConexaoBD.getConexao().prepareStatement(sql);

            // definindo os campos em ?
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());
            ps.setInt(3, livro.getCodigoDoLivro());

            ps.execute(); // executa a conexão
            ps.close(); // fechamento 

        } catch (SQLException e){

            e.printStackTrace(); // em caso de erro
        }
        
    }
    
}
