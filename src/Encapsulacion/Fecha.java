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
    
    public static void ejercicioCalculadora() {
    	 System.out.println("\n\n		EJERCICIO 7: CLASE FECHA");
         // 3 objetos: 3 fehcas
         Fecha f1 = new Fecha(01, 4, 2024); 
         Fecha f2 = new Fecha(38, 2, 2023); 
         Fecha f3 = new Fecha(10, 15, 2022);

         // Lista de pruebas
         Fecha[] fechas = {f1, f2, f3};

         for (int i = 0; i < fechas.length; i++) {
             System.out.print("Fecha " + (i + 1) + " [" + fechas[i].getFechaFormateada() + "] = ");
             if (fechas[i].esValida()) {
                 System.out.println("Es una fecha válida.");
             } else {
                 System.out.println("Error: Rango de día o mes incorrecto.");
             }
         }
    }
}
