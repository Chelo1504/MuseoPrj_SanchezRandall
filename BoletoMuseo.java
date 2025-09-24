import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class BoletoMuseo here.
 * 
 * @author (Randall Sanchez) 
 * @version (a version number or a date)
 */
public class BoletoMuseo {
    private double precio;
    private int numeroBoleto;
    private String fechaEmision;
    private static int contador =0;
    public BoletoMuseo(double precio){
        this.precio=precio;
        contador++;
        this.numeroBoleto=contador;
        this.fechaEmision= establecerFechaEmisionBoleto();
    }
    private String establecerFechaEmisionBoleto(){
        DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    public static int getContador(){
        return contador;
    }
    public int getNumeroBoleto(){
        return numeroBoleto;
    }
    public double getPrecio(){
        return precio;
    }
    public String toString(){
        String msg="Boleto museo\n";
        msg+=" Numero: " + numeroBoleto +"\n";
        msg+=" Precio: " + precio + "\n";
        msg += "  Fecha Emision: " + fechaEmision;
        return msg;
    }
}
