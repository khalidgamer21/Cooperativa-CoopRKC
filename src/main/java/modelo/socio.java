package modelo;

import java.util.ArrayList;

public abstract class socio {

    private String nombre, cedula;
    private ArrayList<>list_Cuentas  = new ArrayList<>();

    public socio(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public ArrayList<> getList_Cuentas() {
        return list_Cuentas;
    }
}
