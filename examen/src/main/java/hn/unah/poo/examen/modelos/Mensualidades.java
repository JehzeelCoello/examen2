package hn.unah.poo.examen.modelos;

import java.sql.Date;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="mensualidades")
public class Mensualidades {
    
    @Id
    @GeneratedValue( )
    @Column(name="idMensualidad")
    private int  idMensualidad;  //AUTO_INCREMENT PRIMARY key,

    @Column(name="numeroCondominio")
    private int numeroCondominio;

    @Column(name="monto")
    private double monto;

    @Column(name = "estado")
    private char estado;

    @Column(name="fechaPago")
    private Date fechaPago;


    @OneToOne(cascade = CascadeType.ALL)
    //refef
    
   private  Condominios condominio;


    @Override
    public String toString() {
        return "Mensualidades [idMensualidad=" + idMensualidad + ", numeroCondominio=" + numeroCondominio + ", monto="
                + monto + ", estado=" + estado + ", fechaPago=" + fechaPago + ", condominio=" + condominio + "]";
    }
   

}
