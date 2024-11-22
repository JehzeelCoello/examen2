package hn.unah.poo.examen.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CondominiosDto {

    private int numeroCondominio;

    private int nivel;

    private double area = 14.2; 

    private String color;

    private int parqueos;

    private String dni;

@Override
public String toString() {
    return "Condominios [numeroCondominio=" + numeroCondominio + ", nivel=" + nivel + ", area=" + area + ", color="
            + color + ", parqueos=" + parqueos + ", dni=" + dni + "]";
}

    
}
