package trabRA1;

class Pilha {
    private Node topo;

    public Pilha() {
        topo = null;
    }

    public void push(Elemento elemento) {
        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    public Elemento pop() throws Exception {
        if (topo == null) {
            throw new Exception("A pilha está vazia.");
        }
        Elemento elementoRemovido = topo.elemento;
        topo = topo.proximo;
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void exibirHistorico() {
        Node atual = topo;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}