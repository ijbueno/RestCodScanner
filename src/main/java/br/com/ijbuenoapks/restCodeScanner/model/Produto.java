package br.com.ijbuenoapks.restCodeScanner.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 90)
	private String produto;
	@Column(nullable = false, length = 255)
	private String descricao;
	@Column(nullable = false)
	private Float valor;
	@Column(nullable = false, length = 15)
	private String codigoBarras;
	
	public Produto() {}

	public Produto(String produto, String descricao, Float valor, String codigoBarras) {
		super();
		this.produto = produto;
		this.descricao = descricao;
		this.valor = valor;
		this.codigoBarras = codigoBarras;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoBarras, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoBarras, other.codigoBarras) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", produto=" + produto + ", descricao=" + descricao + ", valor="
				+ valor + ", codigoBarras=" + codigoBarras + "]";
	}
}

