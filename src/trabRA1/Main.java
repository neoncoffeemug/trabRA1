// Lucas Rigon
// Gabriel Souza



package trabRA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Pilha pilhaHistorico = new Pilha();
        Fila filaAtendimento = new Fila();
        Scanner scanner = new Scanner(System.in);

        try {
            // Adicionando clientes à fila
            filaAtendimento.adicionar(new Elemento("001", "Erico Verissimo", "Cliente A - Solicitação 1", "2024-09-11 10:00"));
            filaAtendimento.adicionar(new Elemento("002", "Jorge Amado", "Cliente B - Solicitação 2", "2024-09-11 10:30"));
            filaAtendimento.adicionar(new Elemento("003", "Manuel Bandeira", "Cliente C - Solicitação C", "2024-09-13 14:00"));

            
            // Atendendo o primeiro cliente e adicionando ao histórico
            Elemento atendido = filaAtendimento.atender();
            System.out.println("Atendendo: " + atendido);
            pilhaHistorico.push(atendido);

            
            // Exibir o histórico e a fila
            System.out.println("\nHistórico de Solicitações:");
            pilhaHistorico.exibirHistorico();

            
            System.out.println("\nFila de Atendimento:");
            filaAtendimento.exibirFila();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            
            
            
        }
    }
}