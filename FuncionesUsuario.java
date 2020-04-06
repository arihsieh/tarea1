package classes;

public class FuncionesUsuario {
    int calculoDeImpuestos(Usuario usu){
        int edad = usu.getEdad();
        int hijos = usu.getCantHijos();
        int pago = 0;
        if (edad == 0)return 0;
        else if (edad >= 18 && edad >= 30) pago = 2000;
        else if (edad > 30 && edad >= 65) pago = 7000;
        else pago = 2000;
        if ((int)0.03*hijos*100 < 50){
            pago = pago - (int)0.03*pago*hijos;
        }
        else pago = pago/2;
        return pago;
    }
    
    Usuario nuevoBalance (Usuario usu, int pago){
        usu.setSaldo(usu.getSaldo() - pago);
        return usu;
    }
}
