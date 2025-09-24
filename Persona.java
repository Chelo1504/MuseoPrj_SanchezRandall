
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona{
    private String nombre;
    private String identificacion;
    private BoletoMuseo miBoleto;
    public Persona(String nombre, String ident){
        this(nombre);
        identificacion =ident;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public void setidentificacion(String pIdentificacion){
        identificacion=pIdentificacion;
    }
    public void asignarBoleto(BoletoMuseo pMiBoleto){
        miBoleto=pMiBoleto;
    }
    public int consultarMiNumeroBoleto(){
        return miBoleto.getNumeroBoleto();
    }
    public String toString(){
        String msg = "Persona\n";
        msg+= " Nombre: "+ nombre + "\n";
        msg+= "Idenficación: "+ identificacion +"\n";
        if(miBoleto!=null){
            msg+= " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        }else{
            msg += "Boleto asignado:(ninguno)\n";
        }
        return msg;
    }
}