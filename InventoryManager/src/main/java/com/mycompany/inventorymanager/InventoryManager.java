package com.mycompany.inventorymanager;
import java.util.ArrayList;
import java.util.Arrays;

public class InventoryManager {

    public static void main(String[] args) {
      
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Articulo1", "Articulo2", "Articulo3", "Articulo4"));
        ArrayList<Double> precios = new ArrayList<>(Arrays.asList(5000.0, 15000.0, 25000.0, 35000.0));
        
        
        int count0 = 0, count5 = 0, count8 = 0, count10 = 0;
        double totalSales = 0.0;
        
       
        for (int i = 0; i < precios.size(); i++) {
            double precio = precios.get(i);
            double descuento = 0.0;
            
            if (precio <= 10000) {
                descuento = 0.0;
                count0++;
            } else if (precio <= 20000) {
                descuento = 0.05;
                count5++;
            } else if (precio <= 30000) {
                descuento = 0.08;
                count8++;
            } else {
                descuento = 0.10;
                count10++;
            }
            
            double precioFinal = precio - (precio * descuento);
            totalSales += precioFinal;
        }
        System.out.println("Total de artículos procesados: " + precios.size());
        System.out.println("Artículos con descuento del 0%: " + count0);
        System.out.println("Artículos con descuento del 5%: " + count5);
        System.out.println("Artículos con descuento del 8%: " + count8);
        System.out.println("Artículos con descuento del 10%: " + count10);
        System.out.println("Valor total en ventas: " + totalSales);
    }
}


