package hn.unah.poo.examen.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DueniosDto {

    private String  dni;

    private String nombre;

    private String apellido;

    private String telefono;

    @Override
    public String toString() {
        return "Duenios [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";  
}

}
