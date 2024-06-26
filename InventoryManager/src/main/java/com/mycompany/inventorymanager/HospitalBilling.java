package com.mycompany.inventorymanager;
import java.util.ArrayList;
import java.util.Arrays;

public class HospitalBilling {
    public static void main(String[] args) {
        ArrayList<String> nombresPacientes = new ArrayList<>(Arrays.asList("Paciente1", "Paciente2"));
        ArrayList<Double> costosTratamiento = new ArrayList<>(Arrays.asList(500000.0, 750000.0));
        ArrayList<Integer> diasHospitalizacion = new ArrayList<>(Arrays.asList(3, 5));
        ArrayList<Double> costosMedicamentos = new ArrayList<>(Arrays.asList(200000.0, 300000.0));

       
        final double COSTO_HOSPITALIZACION_POR_DIA = 100000.0;

      
        for (int i = 0; i < nombresPacientes.size(); i++) {
            double costoTotal = costosTratamiento.get(i) +
                                (diasHospitalizacion.get(i) * COSTO_HOSPITALIZACION_POR_DIA) +
                                costosMedicamentos.get(i);

            System.out.println("Nombre del paciente: " + nombresPacientes.get(i));
            System.out.println("Costo total a pagar: " + costoTotal);
        }
    }
}
