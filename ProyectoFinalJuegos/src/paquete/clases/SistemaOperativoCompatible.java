/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author usuario
 */
public class SistemaOperativoCompatible 
{
    private String nombreSO;
    private float versionSO;

    public SistemaOperativoCompatible(String nombreSO, float versionSO) 
    {
        this.nombreSO = nombreSO;
        this.versionSO = versionSO;
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public float getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(float versionSO) {
        this.versionSO = versionSO;
    }

    public String VerInfo() 
    {
        return "Nombre Sistema Opertivo: " + nombreSO + 
                "\nVersion: " + versionSO;
    }
    
    
    
    
    
    
}
