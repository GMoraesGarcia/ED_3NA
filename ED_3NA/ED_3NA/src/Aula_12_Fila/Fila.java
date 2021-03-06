/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Fila;

import Aula_10_Pilha.No;

/**
 *
 * @author Gabriel
 */
public class Fila {
    private No first;
    private No last;
    
    //Criar uma fila vazia
    public Fila(){
        this.first =null;
        this.last = null;
    }
    
    //Verificar se a fila está vazia
    public boolean isEmpty(){
        return this.first == null && this.last == null;
    }
    //Enfileirar um elemento
    public void enqueue(Object item){
        No novo = new No(item, null);
        if(isEmpty()){
           
            first = novo;
            last = novo;
            return;
        }
        last.setProx(novo);
        last = novo;
    }

    //Desenfileirar um elemento
    public Object dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Erro: Fila Vazia");
            
        }
        Object item = first.getElemento();
        first = first.getProx();
        
        return item;
        
        
    }
    
    public int size(){
        No temp = first;
            int count =0;
            while(temp != null){
                temp = temp.getProx();
                count++;
            }
            return count;
        }

    public No getFirst() {
        return first;
    }

    public void setFirst(No first) {
        this.first = first;
    }

    public No getLast() {
        return last;
    }

    public void setLast(No last) {
        this.last = last;
    }
   
    
    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }
    
    
}
