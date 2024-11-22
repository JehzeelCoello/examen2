package hn.unah.poo.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="condominios")
public class Condominios {

@Id
@Column(name=" numeroCondominio")
private int numeroCondominio;

@Column(name="nivel")
private int nivel;


@Column(name="area")
private double area = 14.2; 

@Column(name="color")
private String color;

@Column(name="parqueos")
private int parqueos;

@Column(name="dni")
private String dni;

@Override
public String toString() {
    return "Condominios [numeroCondominio=" + numeroCondominio + ", nivel=" + nivel + ", area=" + area + ", color="
            + color + ", parqueos=" + parqueos + ", dni=" + dni + "]";
}

}
