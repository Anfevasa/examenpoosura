package org.example.validaciones.utilidades;

public enum Mensajes {
    NOMBRE_LONGITUD("El nombre es muy largo"),
    EDAD_NEGATIVA("La edad no puede ser negativa"),
    EDAD_MAYOR("Si eres mayor de 90 comunícate al 44444444, sino le funciona, márquelo al revés"),
    COBERTURA_INCORRECTA("Solo se aceptan montos hasta 1500 millones de pesos"),
    BENEFICIARIO_LONGITUD("Longitud máxima, 50 caracteres"),
    BENEFICIARIO_FORMATO("Solo se aceptan letras"),
    FECHA_INCORRECTA("Formato de fecha incorrecta"),
    ;
    private String Mensaje;

    Mensajes(String mensaje) {
        Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

}
