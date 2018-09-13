/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.centrodeportivo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author dy.quintero
 */
@Entity
public class MaquinaEntity extends BaseEntity implements Serializable {
    
 
    private String nombre;
    private Double calorias;
    private Integer tiempo;
    private Double velocidad;
    private Double velocidadPromedio;

    /**
     * Modela la asociacion 1...* entre las clases Maquina y (hacia) Ejercicio
     */
    @PodamExclude
    @OneToMany(mappedBy = "maquina")
    private List<EjercicioEntity> ejercicios = new ArrayList<EjercicioEntity>();
    
    @PodamExclude
    @ManyToOne
    private SeguimientoEntity seguimiento;
    /**
     * Devuelve los ejercicios de la maquina
     * @return Collection los objetivos
     */
    public List<EjercicioEntity> getEjercicios()
    {
      return this.ejercicios;  
    }
    
    public void setEjercicios(List<EjercicioEntity> pEjercicios)
    {
        this.ejercicios = pEjercicios;
    }
     
    public SeguimientoEntity getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(SeguimientoEntity seguimiento) {
        this.seguimiento = seguimiento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(Double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    
    
}
