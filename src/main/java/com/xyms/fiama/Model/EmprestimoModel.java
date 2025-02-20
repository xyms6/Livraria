package com.xyms.fiama.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmprestimoModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
		@ManyToOne
	    private LivrosModel livro;
	    @ManyToOne
	    private UserModel usuario;
	    private Date dataEmprestimo;
	    private Date dataDevolucaoPrevista;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public LivrosModel getLivro() {
			return livro;
		}
		public void setLivro(LivrosModel livro) {
			this.livro = livro;
		}
		public UserModel getUsuario() {
			return usuario;
		}
		public void setUsuario(UserModel usuario) {
			this.usuario = usuario;
		}
		public Date getDataEmprestimo() {
			return dataEmprestimo;
		}
		public void setDataEmprestimo(Date dataEmprestimo) {
			this.dataEmprestimo = dataEmprestimo;
		}
		public Date getDataDevolucaoPrevista() {
			return dataDevolucaoPrevista;
		}
		public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
			this.dataDevolucaoPrevista = dataDevolucaoPrevista;
		}
	    
	    
	    
}
