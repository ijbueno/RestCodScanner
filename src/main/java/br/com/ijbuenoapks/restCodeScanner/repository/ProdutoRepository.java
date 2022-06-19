package br.com.ijbuenoapks.restCodeScanner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ijbuenoapks.restCodeScanner.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Optional<Produto> findByCodigoBarras(String codigoBarras);
}
