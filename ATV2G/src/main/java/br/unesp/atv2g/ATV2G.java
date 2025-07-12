/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unesp.atv2g;

/**
 *
 * @author poo
 */
import java.util.*;

public class ATV2G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estaticas<Integer> intarray = new Estaticas(10);
        
        int opt= 0;
        do {
            System.out.println("\n1 - Adicionar elementos");
            System.out.println("2 - Listar todos os elementos");
            System.out.println("3 - Ver media");
            System.out.println("4 - Maior valor");
            System.out.println("5 - menor valor");
            System.out.println("6 - mostrar todos elementos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            switch (opt) {
                case 1:
                    System.out.print("Digite um número para adicionar: ");
                    int num = sc.nextInt();
                    intarray.add(num);
                    System.out.println("Número adicionado.");
                    break;
                case 2:
                    System.out.println("media:");
                    intarray.media();
                    break;
                case 3:
                    System.out.print("Tamanho: ");
                    intarray.contador();
                    break;
                case 4:
                    System.out.println("Maior valor: ");
                    intarray.maximo();
                    break;
                case 5:
                    System.out.println("Menor valor: ");
                    intarray.minimo();
                    break;
                case 6:
                    System.out.println("Valores: ");
                        intarray.imprimirTodos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opt != 0);
        
        
    }
}
