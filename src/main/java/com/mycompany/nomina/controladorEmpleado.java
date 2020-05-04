/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nomina;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 * Clase donde se definen los atributos del empleado
 * @author Lisseth Dahianna Martinez Rodriguez
 * @version 1.0.0
 */
@ManagedBean
@SessionScoped
public class controladorEmpleado {
    
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nivelEstudio;
    private double sueldoBase;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    private double valorEstudio;
    
    public controladorEmpleado() {
        
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Integer getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(Integer diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String[] getIdiomasDominados() {
        return idiomasDominados;
    }

    public void setIdiomasDominados(String[] idiomasDominados) {
        this.idiomasDominados = idiomasDominados;
    }

    public double getValorEstudio() {
        
        if (this.nivelEstudio.equals("Primaria")){
            this.valorEstudio = valorEstudio + 0;
        } else if (this.nivelEstudio.equals("Secundaria")){
            this.valorEstudio = valorEstudio + 0;
        } else if (this.nivelEstudio.equals("Tecnico")){
            this.valorEstudio = valorEstudio + 5000;
        } else if (this.nivelEstudio.equals("Tecnologo")){
            this.valorEstudio = valorEstudio + 15000;
        } else if (this.nivelEstudio.equals("Profesional")){
            this.valorEstudio = valorEstudio + 30000;
        } else {
            this.valorEstudio = valorEstudio + 40000;
        }
        return valorEstudio;
    }

    public void setValorEstudio(double valorEstudio) {
        this.valorEstudio = valorEstudio;
    } 
}
