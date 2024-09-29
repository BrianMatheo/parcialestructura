package com.javalovers.parcial2estructura;
public class Registro {

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the ventas
     */
    public int getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public Registro(String documento) {
        this.documento = documento;
        this.ventas = 1;
    }
    
    public void cantidades(){
        this.ventas += 1;
    }
    
    private String documento;
    private int ventas;
    
}
