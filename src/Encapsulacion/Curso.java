package Encapsulacion;

public class Curso {
	private String nombreCurso;
	private double nota1, nota2, nota3;
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
		super();
		this.nombreCurso = nombreCurso;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
        } else {
            System.out.println("Error: La Nota 1 (" + nota1 + ") está fuera de rango.");
        }
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if (nota2 >= 0 && nota2 <= 100) {
            this.nota2 = nota2;
        } else {
            System.out.println("Error: La Nota 2 (" + nota2 + ") está fuera de rango.");
        }
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		if (nota3 >= 0 && nota3 <= 100) {
            this.nota3 = nota3;
        } else {
            System.out.println("Error: La Nota 3 (" + nota3 + ") está fuera de rango.");
        }
	}
	
    // Promedio
    public double promedio() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarResultados() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Notas: [" + nota1 + ", " + nota2 + ", " + nota3 + "]");
        // Muestra el promedio sin tantos decimales
        System.out.printf("Promedio: %.2f\n", promedio()); 
        System.out.println("Estado: " + estado());
    }
	
    public static void ejercicio4() {
    	System.out.println("		EJERCICIO 4: CLASE CURSO");
        System.out.println("	CURSOS");

        Curso curso1 = new Curso("Programación", 75.5, 80.0, 65.0);
        curso1.mostrarResultados();

        Curso curso2 = new Curso("Matemáticas", 50.0, 45.0, 60.0);
        curso2.mostrarResultados();
    }
}
