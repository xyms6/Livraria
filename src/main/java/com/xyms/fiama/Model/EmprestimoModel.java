package com.xyms.fiama.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmprestimoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double emprestimo;
	private Double devolucao;
	
	
	
	public EmprestimoModel() {
		
	}

	public EmprestimoModel(Long id, Double emprestimo, Double devolucao) {
	
		this.id = id;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}
	public Double getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Double devolucao) {
		this.devolucao = devolucao;
	}
	
	
	
}
