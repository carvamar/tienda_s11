/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public interface ItemService {
    List<Item> listaItems = new ArrayList<>();
    public List<Item>gets();
    
    public Item get (Item item);//Vamos a obtenerlo por medio del item = iditem
    
    public void delete (Item item);// Aqui eliminamos los items por medio de su id
    
    public void save (Item item);
    
    public void actualiza (Item item);
    
    public void facturar ();
    
    
}
