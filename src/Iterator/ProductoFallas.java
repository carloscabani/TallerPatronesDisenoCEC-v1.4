/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wayar
 */
public class ProductoFallas implements IteradorProducto{
    
    String nombreProducto;
    String tipodeFalla;
    private int currentPosition = 0;
    List<Producto> productos = new ArrayList<>();
    
    public ProductoFallas(String nombreProducto, String tipodeFalla){
        this.nombreProducto = nombreProducto;
        this.tipodeFalla = tipodeFalla;
    }
    
    public void metodo(){
       //Metodo
    }
    
    public void setAlgo(){
        System.out.println("Producto con falla");
    }

    @Override
    public boolean hasNext() {
        metodo();
        return currentPosition < productos.size();
    }

    @Override
    public Producto getNext() {
        if(!hasNext()){
            return null;
        }
        Producto productosDisp = productos.get(currentPosition);
        if(productosDisp == null){
            setAlgo();
            productos.set(currentPosition, null);
            
        }
        currentPosition++;
        return productosDisp;
        
    }
    
}
