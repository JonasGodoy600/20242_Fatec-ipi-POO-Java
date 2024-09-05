import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String...args){
        //construir um livro de notas
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        var meuLivro = new LivroDeNotas();
        meuLivro.nomeDisciplina = disciplina1;
        meuLivro.exibirMensagem();

        var disciplina2 = JOptionPane.showInputDialog("Digite o nome de Disciplina 2");
        var meuLivro2 = new LivroDeNotas();
        meuLivro2.nomeDisciplina = disciplina2;
        meuLivro2.exibirMensagem();

    }
}
