/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.atv2g;

import java.util.Arrays;
import java.util.*;
/**
 *
 * @author poo
 * @param <T>
 */
public class Estaticas<T extends Number> {
    private T[] elementos;
    private int contador = 0;
  
    
public Estaticas(int capacidadeInicial) {
        elementos = (T[]) new Object[capacidadeInicial];
    }  

public void add(T elemento){
        if(contador == elementos.length){
            elementos = Arrays.copyOf(elementos, contador+1);
        }
        elementos[contador++] = elemento;
    }
    
public int contador(){
        return contador;
    }

public T maximo() {
        if (contador == 0) {
            return null;
        }
        T max = elementos[0];
        for (int i = 1; i < contador; i++) {
            if (((Comparable<T>) elementos[i]).compareTo(max) > 0) {
                max = elementos[i];
            }
        }
        return max;
    }

public T minimo() {
        if (contador == 0) {
            return null;
        }
        T min = elementos[0];
        for (int i = 1; i < contador; i++) {
            if (((Comparable<T>) elementos[i]).compareTo(min) < 0) {
                min = elementos[i];
            }
        }
        return min;
    }

public void imprimirTodos(){
        for(int i = 0; i<contador;i++){
            System.out.println(elementos[i]);
        }
    }

public double media() {
    double soma = 0; // Inicializa a variável soma
    for (int i = 0; i < contador; i++) {
        soma += elementos[i].doubleValue();
    }
    return soma / contador; // Retorna a média
}
    
}
