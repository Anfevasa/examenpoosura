package org.example.validaciones;

import org.example.modelos.Seguro;
import org.example.validaciones.utilidades.Mensajes;
import org.example.validaciones.utilidades.Utilidad;

public class ValidacionSeguro {
    Utilidad utilidad=new Utilidad();

    public ValidacionSeguro() {
    }

    public Boolean validarNombreAsegurado(String nombreAsegurado) throws Exception{
        if(nombreAsegurado.length()>20){
            throw new Exception(Mensajes.NOMBRE_LONGITUD.getMensaje());
        }
        return true;
    }
    public Boolean validarEdad(Integer edadAsegurado) throws Exception {
        if(edadAsegurado<0 ){
            throw new Exception(Mensajes.EDAD_NEGATIVA.getMensaje());
        }
        if(edadAsegurado>90){
            throw new Exception(Mensajes.EDAD_MAYOR.getMensaje());
        }
        return true;
    }
    public Boolean validarMonto(double montoCobertura) throws Exception {
        if(montoCobertura<0.00 || montoCobertura>1500.00){
            throw new Exception(Mensajes.COBERTURA_INCORRECTA.getMensaje());
        }
        return true;
    }
    public Boolean validarBeneficiario(String beneficiario) throws Exception{
        if(beneficiario.length()>50){
            throw new Exception(Mensajes.BENEFICIARIO_LONGITUD.getMensaje());
        }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,beneficiario)){
            throw new Exception(Mensajes.BENEFICIARIO_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarFecha(String fecha) throws Exception{

        String expresionRegular="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,fecha)){
            throw new Exception(Mensajes.FECHA_INCORRECTA.getMensaje());
        }
        return true;
    }

}
