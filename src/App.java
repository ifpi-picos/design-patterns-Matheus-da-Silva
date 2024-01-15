public class App {
    public static void main(String[] args) {
        RedeSocial facebook = new Facebook();
        facebook.executar();

        System.out.println("--------------------");

        RedeSocial twitter = new Twitter();
        twitter.executar();

        System.out.println("--------------------");
    }
}

/*
 * Classe que contém objetos que implementam a interface ou herdam da classe abstrata.
 */