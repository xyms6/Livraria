package com.xyms.fiama.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livros	")
public class LivrosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinTable(name = "livros_id")
	private String titulo;
	
	private String autor;
	
	private Double publicacao;
		
	public LivrosModel() {}
	
	public LivrosModel(Long id, String titulo, String autor, Double publicacao) {
		
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.publicacao = publicacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Double publicacao) {
		this.publicacao = publicacao;
	}
	
	
}
