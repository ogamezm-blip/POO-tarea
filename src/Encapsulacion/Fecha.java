package Encapsulacion;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean esValida() {
        boolean diaCorrecto = (dia >= 1 && dia <= 31);
        boolean mesCorrecto = (mes >= 1 && mes <= 12);
        
        return diaCorrecto && mesCorrecto;
    }

    // Getter para mostrar la fecha
    public String getFechaFormateada() {
        return dia + "/" + mes + "/" + año;
    }
}
