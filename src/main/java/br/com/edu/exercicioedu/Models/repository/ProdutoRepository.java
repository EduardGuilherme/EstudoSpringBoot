package br.com.edu.exercicioedu.Models.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.edu.exercicioedu.Models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
