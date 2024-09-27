package com.javalovers.parcial2estructura;
public class Nodo {

    /**
     * @return the enlace
     */
    public Nodo getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lunes
     */
    public int getLunes() {
        return lunes;
    }

    /**
     * @param lunes the lunes to set
     */
    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    /**
     * @return the martes
     */
    public int getMartes() {
        return martes;
    }

    /**
     * @param martes the martes to set
     */
    public void setMartes(int martes) {
        this.martes = martes;
    }

    /**
     * @return the miercoles
     */
    public int getMiercoles() {
        return miercoles;
    }

    /**
     * @param miercoles the miercoles to set
     */
    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    /**
     * @return the jueves
     */
    public int getJueves() {
        return jueves;
    }

    /**
     * @param jueves the jueves to set
     */
    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    /**
     * @return the viernes
     */
    public int getViernes() {
        return viernes;
    }

    /**
     * @param viernes the viernes to set
     */
    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    /**
     * @return the sabado
     */
    public int getSabado() {
        return sabado;
    }

    /**
     * @param sabado the sabado to set
     */
    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public Nodo(String nombre, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado) {
        this.nombre = nombre;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
    }
    
    private String nombre;
    private int lunes;
    private int martes;
    private int miercoles;
    private int jueves;
    private int viernes;
    private int sabado;
    private Nodo enlace;
    
}
