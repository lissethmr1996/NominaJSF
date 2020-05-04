/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nomina;

import modelo.modeloNomina;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.enterprise.context.RequestScoped;
/**
 * Clase donde se definen los atributos del calculo del sueldo
 * @author Lisseth Dahianna Martinez Rodriguez
 * @version 1.0.0
 */
@ManagedBean
@RequestScoped
public class calculoNomina { 
    
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nivelEstudio;
    private double sueldoBase;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    private double valorEstudio;
    private double sueldoTotal;
    modeloNomina modelo;
    
    @ManagedProperty("#{controladorEmpleado}")
    private controladorEmpleado index;
    /**
     * Crear una nueva instancia del calculoNomina
     */
    public calculoNomina() {
        modelo = new modeloNomina();
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public controladorEmpleado getIndex() {
        return index;
    }

    public void setIndex(controladorEmpleado index) {
        this.index = index;
    }
    
    public void obtenerSueldo() {
        this.sueldoTotal = modelo.obtenerSueldo(this.getIndex().getSueldoBase(), this.getIndex().getDiasTrabajados(), this.getIndex().getValorEstudio(), this.getIndex().getIdiomasDominados());
    }
    
}
