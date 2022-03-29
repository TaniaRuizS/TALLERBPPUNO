package co.com.choucair.refdos.model;

import co.com.choucair.refdos.model.Compras;
import co.com.choucair.refdos.model.Persona;

import java.util.List;

public class Cliente {
    private List<Compras> comprasList;
    private String estadoCivil;
    private Integer cantHijos;
    private Integer cantHermanos;
    private String nombrePadre;
    private String nombreMadre;

    public List<Compras> getComprasList() {
        return comprasList;
    }

    public void setComprasList(List<Compras> comprasList) {
        this.comprasList = comprasList;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(Integer cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Integer getCantHermanos() {
        return cantHermanos;
    }

    public void setCantHermanos(Integer cantHermanos) {
        this.cantHermanos = cantHermanos;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }
}
