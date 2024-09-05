import javax.swing.JOptionPane;
public class LivroDeNotas{
    String nomeDisciplina = null;
    public void exibirMensagem(){
        //System.out.println("Bem Vindo ao Livro de Notas");
        JOptionPane.showMessageDialog(
            null, 
            String.format("Bem Vindo ao Livro de notas da disciplina %s", nomeDisciplina)
        );
        }
    
}