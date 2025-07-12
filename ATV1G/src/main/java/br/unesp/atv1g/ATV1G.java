/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unesp.atv1g;

/**
 *
 * @author poo
 */
import java.util.*;

public class ATV1G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayUtil<Integer> intarray = new ArrayUtil(10);
        
        int opt= 0;
        do {
            System.out.println("\n1 - Adicionar elementos");
            System.out.println("2 - Listar todos os elementos");
            System.out.println("3 - Ver elemento via índice");
            System.out.println("4 - Verificar se contém elemento");
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
                    System.out.println("Lista de elementos:");
                    intarray.imprimirTodos();
                    break;

                case 3:
                    System.out.print("Digite o índice: ");
                    int indice = sc.nextInt();
                    try {
                        Integer elemento = intarray.obter(indice);
                        System.out.println("Elemento no índice " + indice + ": " + elemento);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número para verificar: ");
                    int buscar = sc.nextInt();
                    if (intarray.contem(buscar)) {
                        System.out.println("Elemento encontrado.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
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
