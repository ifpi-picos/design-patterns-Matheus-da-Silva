import javax.swing.ImageIcon;

public class RedeSocial2 extends RedeSocial {
    @Override 
    public void postagem() {
        String texto = ("Estou fazendo um comentário");
        ImageIcon imagemPost = new ImageIcon("imagem.png");
    }
}

/*
 * Esta classe fornece implementações específicas para as 
 * etapas abstratas definidas na Classe Abstrata. 
 * 
 * Que é diferente da implementação da classe concreta 1
 * 
 * Personalizam o comportamento do algoritmo 
 * sem modificar sua estrutura global.
 */