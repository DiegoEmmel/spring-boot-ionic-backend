package com.diegoemmel.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoemmel.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Serializable> {

}
