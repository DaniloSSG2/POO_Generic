/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.atv1g;

/**
 *
 * @author poo
 * @param <T>
 */
import java.util.*;

public class ArrayUtil<T>{
    private T[] elementos;
    private int tamanho = 0;
    
    
    // Construtor que inicializa o array com o tamanho especificado
    public ArrayUtil(int capacidadeInicial) {
        // Usando um cast com aviso de tipo não verificado
        elementos = (T[]) new Object[capacidadeInicial];
    }
    
    
    public void add(T elemento){
        if(tamanho == elementos.length){
            elementos = Arrays.copyOf(elementos, tamanho+1);
        }
        elementos[tamanho++] = elemento;
    }
    
    public T obter(int indice){
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        return elementos[indice];
    }
    
    public int tamanho(){
        return tamanho;
    }
      
    public void imprimirTodos(){
        for(int i = 0; i<tamanho;i++){
            System.out.println(elementos[i]);
        }
    }
    
    public boolean contem(T elemento){
        for(int i = 0; i<elementos.length; i++){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
}
