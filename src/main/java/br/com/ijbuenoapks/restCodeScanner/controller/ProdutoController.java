package br.com.ijbuenoapks.restCodeScanner.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ijbuenoapks.restCodeScanner.model.Produto;
import br.com.ijbuenoapks.restCodeScanner.repository.ProdutoRepository;

@CrossOrigin(origins = "http://localhost:8080")//trabalhando localmente
@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos/codigoBarras/{codigoBarras}")
	ResponseEntity<Produto> getByCodigoBarras (@PathVariable("codigoBarras") String codigoDeBarras ){
		Optional<Produto> retornoProduto = produtoRepository.findByCodigoBarras(codigoDeBarras);
		if(retornoProduto.isPresent()) {
			return new ResponseEntity<>(retornoProduto.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
