package daos;

import core.MeuPreparedStatement;

public class BDSQLServer {
    public static final MeuPreparedStatement COMANDO;

    static {
        MeuPreparedStatement comando = null;

        try {
            comando = new MeuPreparedStatement(
                    "com.microsoft.sqlserver.jdbc.SQLServerDriver",
                    "jdbc:sqlserver://;serverName=regulus.cotuca.unicamp.br;databaseName=BD22569",
                    "BD22569", "BD22569");
        } catch (Exception erro) {
            erro.printStackTrace();
            System.err.println("Problemas de conexao com o BD");
            System.exit(0); // aborta o programa
        }

        COMANDO = comando;
    }
}