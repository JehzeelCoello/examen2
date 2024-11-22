package hn.unah.poo.examen.dtos;

import java.sql.Date;

import hn.unah.poo.examen.modelos.Condominios;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MensualidadesDto {

     private int  idMensualidad;
   
    private int numeroCondominio;

    private double monto;
    
    private char estado;

    private Date fechaPago;

   private  Condominios condominio;

@Override
public String toString() {
    return "MensualidadesDto [idMensualidad=" + idMensualidad + ", numeroCondominio=" + numeroCondominio + ", monto="
            + monto + ", estado=" + estado + ", fechaPago=" + fechaPago + ", condominio=" + condominio + "]";
}

   

}
