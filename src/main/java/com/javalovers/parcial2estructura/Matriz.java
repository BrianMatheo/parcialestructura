package com.javalovers.parcial2estructura;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Matriz {
    Nodo inicio;
    
    Matriz(){
        inicio = null;
    }
    String dias[] = new String[]{"lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
    String ubicacion[] = new String[]{"gym", "teatro", "cancha", "restaurante"};
    int datos[][] = new int[ubicacion.length][dias.length];
    
public void buy(String documento, String nombre, String pelicula, int edad, String genero){
        Nodo nuevo = new Nodo();
        nuevo.setDocumento(documento);
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPelicula(pelicula);
        nuevo.setGenero(genero);
        nuevo.setSiguiente(null);
        if(inicio == null){
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "bienvenido " + nuevo.getNombre() + " eres el primero en comprar un boleta");
        }else{
            JOptionPane.showMessageDialog(null, "bienvenido " + nuevo.getNombre());
            Nodo temporal = inicio;
            while(temporal != null){
                temporal = temporal.getSiguiente();
            }
            nuevo.setSiguiente(temporal);
        }
}

public static void cantidad(ArrayList<Registro> documentos, String documento) {
        boolean documentoEncontrado = false;

        for (int i = 0; i < documentos.size(); i++) {
            Registro registro = documentos.get(i);
            
            if (registro.getDocumento().equals(documento)) {
                documentoEncontrado = true;
                JOptionPane.showMessageDialog(null,"El documento " + documento + " compró " + registro.getVentas());
                break;
            }
        }
        if (!documentoEncontrado) {
            JOptionPane.showMessageDialog(null,"No se encontró el documento: " + documento);
        }
    }
   
public void cantStudent(){
    for(int i = 0; i<ubicacion.length; i++){
        for(int j = 0; j<dias.length; j++){
            datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("cuantos estudiantes entraron a: " + ubicacion[i] + " el dia " + dias[j]));
        }
    }
}

public void consult(){
    String gym = "";
    String teatro = "";
    String cancha = "";
    String restaurante = "";
    
    for(int i = 0; i<ubicacion.length; i++){
        for(int j = 0; j<dias.length; j++){
            if(i == 0){
                gym += datos[i][j] + " ";
            }
            if(i == 1){
                teatro += datos[i][j] + " ";
            }
            if(i == 2){
                cancha += datos[i][j] + " ";
            }
            if(i == 3){
                restaurante += datos[i][j] + " ";
            }
        }
    }
    JOptionPane.showMessageDialog(null, "gym: " +gym + "\nteatro: " + teatro + "\ncancha: " +  cancha + "\nrestaurante: " + restaurante);
    }

public void estadistica(){
        int suma2 = 0;
        int suma = 0;
        int sumatotal = 0;
        int menor = 2147483647;
        String escenario = "";
        String escenariomenor = "";
    for(int i = 0; i<ubicacion.length; i++){
        for(int j = 0; j<dias.length; j++){
            suma += datos[i][j];
            sumatotal += datos[i][j];
        }
            if(suma>suma2){
                suma2 = suma;
                escenario = ubicacion[i];
            }
            if(menor>suma){
                menor = suma;
                escenariomenor = ubicacion[i];
            }
            suma = 0;
    }
    int mayor = 0;
    String dia = "";
    for(int i = 0; i<dias.length; i++){
        if(mayor<datos[3][i]){
            mayor = datos[3][i];
            dia = dias[i];
        }
    }
    
    int diamas = 0;
    int diamenos = 2147483647;
    int contdias = 0;
    String masdias = "";
    String menosdias = "";
    
    int escenariomas = 0;
    int escenariomenos = 2147483647;
    String escenariosmas = "";
    String escenariosmenos = "";
    String daymost = "";
    String dayless = "";
    
    ArrayList<String> arraydiasmas = new ArrayList<>();    
    ArrayList<String> arraydiasmenos = new ArrayList<>();
    
    for(int i = 0; i<dias.length; i++){
        for(int j = 0; j<ubicacion.length; j++){
            contdias += datos[j][i];
            
        if(escenariomas<datos[j][i]){
            escenariomas = datos[j][i];
            escenariosmas = ubicacion[j];
            daymost = dias[i];
            arraydiasmas = new ArrayList<>();
            arraydiasmas.add(daymost);
        }
        else if(escenariomas == datos[j][i]){
            if(arraydiasmas.indexOf(dias[i]) == -1){
            arraydiasmas.add(dias[i]);
            }
        }
        
        if(escenariomenos>datos[j][i]){
            escenariomenos = datos[j][i];
            escenariosmenos = ubicacion[j];
            dayless = dias[i];
            arraydiasmenos = new ArrayList<>();
            arraydiasmenos.add(dayless);
        }else if(escenariomenos == datos[j][i]){
            if(arraydiasmenos.indexOf(dias[i]) == -1){
            arraydiasmenos.add(dias[i]);
        }
        }
        
        }
        if(contdias>diamas){
            diamas = contdias;
            masdias = dias[i];
        }
        if(contdias<diamenos){
            diamenos = contdias;
            menosdias = dias[i];
        }
        contdias = 0;
    }
    double promedio = sumatotal/6;
    JOptionPane.showMessageDialog(null, "el escenario mas visitado es: " + escenario + " con: " + suma2 + " estudiantes \nel día más visitado del restaurante es: " + dia + "\nel escenario menos visitado es: " + escenariomenor + "\nel total de estudiantes de la semana es: " + sumatotal + "\nel promedio de estudiantes de la semana es: " + promedio + "\nel dia que mas estudiantes tuvo fue: " + masdias + "\nel dia que menos estudiantes tuvo fue: " + menosdias + "\nel escenario mas visitado es: " + escenariosmas + " el dia: " + arraydiasmas + "\nel escenario menos visitado es: " + escenariosmenos  + " el dia: " + arraydiasmenos);
}

    public void selection(String escenario){
        int mayor = 0;
        int menor = 2147483647;
        int sumador = 0;
        String diamay = "";
        String diamen = "";
        escenario = escenario.toLowerCase();
        
        int getIndex = Arrays.asList(ubicacion).indexOf(escenario);
        
        if(getIndex != -1){
        for(int i = 0; i<dias.length; i++){
            sumador += datos[getIndex][i];
        if(mayor<datos[getIndex][i]){
            mayor = datos[getIndex][i];
            diamay = dias[i];
        }
        if(menor>datos[getIndex][i]){
            menor = datos[getIndex][i];
            diamen = dias[i];
        }
        }
        double prom = sumador/6;
        JOptionPane.showMessageDialog(null, "escenario " + escenario + "\ndia que mas visitantes fueron: " + diamay + "\ndia que menos visitantes fueron: " + diamen + "\nen promedio de todo es: " + prom);
    }else{
            JOptionPane.showMessageDialog(null,"Ese escenario no existe");
        }
    }
}


