package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");
        minhaListaCircular.remove(4);
        System.out.println(minhaListaCircular.getCabeca());
        System.out.println(minhaListaCircular);

    }
}
