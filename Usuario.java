package classes;

public class Usuario {
    
    //Atributos
    private String nombre; 
    private int cedula;
    private String contrasenia;
    private int edad;
    private int cantHijos;
    private int saldo;
    
    //Get´s y Set´s
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCedula(int unaCedula){
        cedula = unaCedula;
    }
    public int getCedula(){
        return cedula;
    }
    public void setContrasenia(String unaContrasenia){
        contrasenia = unaContrasenia;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    public int getEdad(){
        return edad;
    }
    public void setCantHijos(int unaCantHijos){
        cantHijos = unaCantHijos;
    }
    public int getCantHijos(){
        return cantHijos;
    }
    public void setSaldo(int unSaldo){
        saldo = unSaldo;
    }
    public int getSaldo(){
        return saldo;
    }
    
    //Constructores
    public Usuario(){
        this.setSaldo(0);
    }
    public Usuario (String unNombre, int unaCedula, String unaContrasenia, int unaEdad, int unaCantHijos, int unSaldo){
       this.setNombre(unNombre);
       this.setCedula(unaCedula);
       this.setContrasenia(unaContrasenia);
       this.setEdad(unaEdad);
       this.setCantHijos(unaCantHijos);
       this.setSaldo(unSaldo);
    }
}
