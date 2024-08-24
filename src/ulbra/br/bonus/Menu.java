package ulbra.br.bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorNumeros gerenciador = new GerenciadorNumeros();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Número");
            System.out.println("2. Listar Números");
            System.out.println("3. Listar Números Pares");
            System.out.println("4. Listar Números Ímpares");
            System.out.println("5. Atualizar Número");
            System.out.println("6. Deletar Número");
            System.out.println("7. Buscar Número");
            System.out.println("8. Exibir Média dos Números");
            System.out.println("9. Exibir Número Máximo e Mínimo");
            System.out.println("10. Ordenar Lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarNumero();
                    break;
                case 2:
                    gerenciador.listarNumeros();
                    break;
                case 3:
                    gerenciador.listarPares();
                    break;
                case 4:
                    gerenciador.listarImpares();
                    break;
                case 5:
                    atualizarNumero();
                    break;
                case 6:
                    removerNumero();
                    break;
                case 7:
                    buscarNumero();
                    break;
                case 8:
                    gerenciador.exibirMedia();
                    break;
                case 9:
                    gerenciador.exibirMaximoMinimo();
                    break;
                case 10:
                    ordenarLista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void adicionarNumero() {
        System.out.print("Digite o número a ser adicionado: ");
        int numero = scanner.nextInt();
        gerenciador.adicionarNumero(numero);
        System.out.println("Número adicionado com sucesso.");
    }

    private static void atualizarNumero() {
        try {
            System.out.print("Digite o índice do número a ser atualizado: ");
            int indice = scanner.nextInt();
            System.out.print("Digite o novo número: ");
            int novoNumero = scanner.nextInt();
            gerenciador.atualizarNumero(indice, novoNumero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            scanner.next(); // Limpar o buffer
        }
    }

    private static void removerNumero() {
        try {
            System.out.print("Digite o índice do número a ser removido: ");
            int indice = scanner.nextInt();
            gerenciador.removerNumero(indice);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            scanner.next(); // Limpar o buffer
        }
    }

    private static void buscarNumero() {
        System.out.print("Digite o número a ser buscado: ");
        int numero = scanner.nextInt();
        boolean encontrado = gerenciador.buscarNumero(numero);
        if (encontrado) {
            System.out.println("Número encontrado na lista.");
        } else {
            System.out.println("Número não encontrado na lista.");
        }
    }

    private static void ordenarLista() {
        System.out.print("Ordenar em ordem crescente (1) ou decrescente (2)? ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            gerenciador.ordenarLista(true);
        } else if (opcao == 2) {
            gerenciador.ordenarLista(false);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
