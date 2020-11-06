/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author rmendes
 */
public class Produto {
    
    int ID;
    String Nome;
    float Preco;
    
    public Produto(int i, String n, float p){
        ID = i;
        Nome = n;
        Preco = p;
    }
}
