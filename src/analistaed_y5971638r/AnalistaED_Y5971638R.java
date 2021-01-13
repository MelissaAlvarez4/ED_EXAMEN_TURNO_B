
package analistaed_y5971638r;

/**
 * Ejercicio practico EVAL 1 ED
 * @author ANGIE MELISSA CANDELA DNI Y5971638R
 * @version 1.0
 */
public class AnalistaED_Y5971638R {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**Contructor con 3 parametros
     * 
     * @param nombreCompleto nombre completo en mayúsculas
     * @param dni documento nacional de indentidad con letras y sin espacios.
     */
    public AnalistaED_Y5971638R(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
    /**Calcula el salario bruto mensual en función del salario base por hora y
    las horas extras. El precio por hora de la hora extra se determina con la
    constante FACTOR_HORA_EXTRA
    * 
    * @param horasExtra número de horas extra dedicadas redondeado a la baja (entero).
    * @return devuelve el salario bruto mensual en euros con dos decimales

    */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {      
        AnalistaED_Y5971638R emp = new AnalistaED_Y5971638R("Melissa Candela", "Y5971638R");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto 
		+ " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}

