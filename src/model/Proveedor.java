package model;

import java.util.ArrayList;
import java.util.Date;

/* TODO: revisen bien las entidades, porque proveedor deberia (creo) conocer que
* facturas tiene, junto con sus documentos y ordenes de pago, no tiene sentido
* que tenga que ir a buscarlas a algun lugar afuera si son suyas.
*/
public class Proveedor {
    private String CUIT;
    private String razonSocial;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private Date inicioActividades;
//    private Rubro rubro;
    private ArrayList<CertificadoDeNoRetencion> certificados = new ArrayList<>();

    public Proveedor(String CUIT, String razonSocial, String nombre, String direccion, String telefono, String correoElectronico, Date inicioActividades, ArrayList<CertificadoDeNoRetencion> certificados) {
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.inicioActividades = inicioActividades;
        this.certificados = certificados;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getInicioActividades() {
        return inicioActividades;
    }

    public void setInicioActividades(Date inicioActividades) {
        this.inicioActividades = inicioActividades;
    }

    public ArrayList<CertificadoDeNoRetencion> getCertificados() {
        return certificados;
    }

    public void setCertificados(ArrayList<CertificadoDeNoRetencion> certificados) {
        this.certificados = certificados;
    }
}
