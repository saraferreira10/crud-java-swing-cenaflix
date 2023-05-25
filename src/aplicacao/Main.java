
package aplicacao;

public class Main {
    public static void main(String[] args){
        Conexao conexao = new Conexao();
        conexao.conectar();
        TelaCadastro tela = new TelaCadastro();
        tela.setResizable(false);
        tela.setTitle("Cadastro de Filme");
        tela.setLocation(300, 100);
        tela.setVisible(true);
    }
}
