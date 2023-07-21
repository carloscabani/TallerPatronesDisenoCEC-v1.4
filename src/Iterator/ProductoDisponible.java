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
public class ProductoDisponible implements IteradorProducto{
    String nombreProducto;
    int cantDisponible;
    private int currentPosition = 0;
    List<Producto> productos = new ArrayList<>();
    
    public ProductoDisponible(String nombreProducto, int cantDisponible){
        this.cantDisponible= cantDisponible;
        this.nombreProducto = nombreProducto;
    }
    
    public void metodo(){
        //metodo
    }
    
    public void setAlgo(){
        System.out.println("Producto Disponible");
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
