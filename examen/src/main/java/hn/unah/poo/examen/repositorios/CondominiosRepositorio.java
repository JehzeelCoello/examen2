package hn.unah.poo.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import hn.unah.poo.examen.modelos.Condominios;
@Repository
public interface CondominiosRepositorio extends JpaRepository<Condominios,Integer>{
    
}
