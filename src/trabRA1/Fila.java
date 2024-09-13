package trabRA1;

class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        frente = null;
        tras = null;
    }

    public void adicionar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (tras == null) {
            frente = novoNode;
            tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }

    public Elemento atender() throws Exception {
        if (frente == null) {
            throw new Exception("A fila está vazia.");
        }
        Elemento clienteAtendido = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return clienteAtendido;
    }

    public boolean estaVazia() {
        return frente == null;
    }

    public void exibirFila() {
        Node atual = frente;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}