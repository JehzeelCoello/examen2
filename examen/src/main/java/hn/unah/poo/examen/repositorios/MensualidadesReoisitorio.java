package hn.unah.poo.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.examen.modelos.Mensualidades;

@Repository
public interface MensualidadesReoisitorio extends JpaRepository <Mensualidades, Integer > {
    
}
