package ulbra.br.bonus;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorNumeros {
    private final ArrayList<Integer> numeros;

    public GerenciadorNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void listarNumeros() {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < numeros.size(); i++) {
                System.out.println(i + ": " + numeros.get(i));
            }
        }
    }

    public void listarPares() {
        boolean encontrouPar = false;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                encontrouPar = true;
            }
        }
        if (!encontrouPar) {
            System.out.println("Nenhum número par encontrado.");
        }
    }

    public void listarImpares() {
        boolean encontrouImpar = false;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                encontrouImpar = true;
            }
        }
        if (!encontrouImpar) {
            System.out.println("Nenhum número ímpar encontrado.");
        }
    }

    public void atualizarNumero(int indice, int novoNumero) {
        if (indice >= 0 && indice < numeros.size()) {
            numeros.set(indice, novoNumero);
            System.out.println("Número atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerNumero(int indice) {
        if (indice >= 0 && indice < numeros.size()) {
            numeros.remove(indice);
            System.out.println("Número removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public boolean buscarNumero(int numero) {
        return numeros.contains(numero);
    }

    public void exibirMedia() {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = (double) soma / numeros.size();
        System.out.println("Média dos números: " + media);
    }

    public void exibirMaximoMinimo() {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        int max = Collections.max(numeros);
        int min = Collections.min(numeros);
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }

    public void ordenarLista(boolean crescente) {
        if (crescente) {
            Collections.sort(numeros);
            System.out.println("Lista ordenada em ordem crescente.");
        } else {
            Collections.sort(numeros, Collections.reverseOrder());
            System.out.println("Lista ordenada em ordem decrescente.");
        }
    }
}
    