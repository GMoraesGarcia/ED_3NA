/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03_desempenho;

import Aula01_Vetores.EX_04_Inverter;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;
import Aula02_Lista.EX_02_Maior;
import static Aula02_Lista.EX_02_Maior.maior;
import static Aula02_Lista.EX_02_Maior.menor;

/**
 *
 * @author Gabriel
 * 
 * 
 */
public class EX_03_TrocarMaiorMenor {
    
   public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        trocaMaiorMenor(v);
        exibeVetor(v);
    }

    public static void trocaMaiorMenor(int[] v) {
        int posMaior = 0;
        int posMenor = 0;
        
        for (int i=1; i < v.length; i++){
            if (v[i] > v[posMaior]){  
                posMaior = i;
            } else {
                if (v[i] < v[posMenor]){  
                    posMenor = i;
                }
            }        
        }
        //troca posição do Maior e do Menor
        troca(v, posMaior, posMenor);
    } 

    public static void troca(int[] v, int posMaior, int posMenor) {
        int aux = v[posMaior];
        v[posMaior] = v[posMenor];
        v[posMenor] = aux;
    }
}
