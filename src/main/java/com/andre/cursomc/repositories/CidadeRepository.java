package com.andre.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andre.cursomc.domain.Cidade;
import com.andre.cursomc.domain.Produto;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
