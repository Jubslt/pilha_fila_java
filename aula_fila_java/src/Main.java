public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
// testando fila
        System.out.println("Adicionando:"+ fila.adicionar("Abelha"));
        System.out.println("Adicionando:"+ fila.adicionar("Bernardo"));
        System.out.println("Adicionando:"+ fila.adicionar("Casa"));
        System.out.println("Adicionando:"+ fila.adicionar("Dragrão"));
        System.out.println("Adicionando:"+ fila.adicionar("Enzo"));

        System.out.println("A fila está vazia?"+ fila.estaVazia());

        System.out.println("Primeiro elemneto da fila:"+ fila.primeiro());
        System.out.println("Tamanho da fila"+ fila.tamanho());

        while (!fila.estaVazia()){
            System.out.println("Removendo da fila:"+ fila.remover());
        }
        System.out.println("A fila está vazia?"+ fila.estaVazia());
// testando pilha
        Pilha pilha = new Pilha(4);
        System.out.println();

        System.out.println("Adicionando:"+ fila.adicionar("Fábio"));
        System.out.println("Adicionando:"+ fila.adicionar("Geraldo"));
        System.out.println("Adicionando:"+ fila.adicionar("Helicóptero"));
        System.out.println("Adicionando:"+ fila.adicionar("Iara"));

        System.out.println("A pilha está vazia?" + pilha.estaVazia());

        System.out.println("Topo:"+ pilha.topo());
        System.out.println("Tamanho da pilha"+ pilha.tamanho());

        while (!fila.estaVazia()){
            System.out.println("A pilha está vazia?"+ pilha.desempilhar());
        }
        System.out.println("A pilha está vazia?"+ pilha.estaVazia());

        System.out.println("Acabou");
    }

}