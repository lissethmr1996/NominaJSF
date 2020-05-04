/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase para calcular el sueldo del empleado
 * @author Lisseth Dahianna Martinez Rodriguez
 * @version 1.0.0
 */
public class modeloNomina {
    
    public double obtenerSueldo(double sueldo, Integer dias, double valorEstud, String idiomas[]){
        
        String ingles = "Ingles";
        String frances = "Frances";
        String italiano = "Italiano";
        String aleman = "Aleman";
        String portugues = "Portugues";
        String mandarin = "Mandarin";
        
        double total = sueldo*dias+valorEstud;
        
        for (String idioma : idiomas) {
            if(ingles.contains(idioma)){
                total=total+10000;
            }
            if(frances.contains(idioma)){
                total=total+10000;
            }
            if(italiano.contains(idioma)){
                total=total+10000;
            }
            if(aleman.contains(idioma)){
                total=total+10000;
            }
            if(portugues.contains(idioma)){
                total=total+10000;
            }
            if(mandarin.contains(idioma)){
                total=total+10000;
            }
        }
        return total;
    }
}
