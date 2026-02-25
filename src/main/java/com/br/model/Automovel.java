package com.br.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="automovel")
public class Automovel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="datafabricacao")
	private Date dataFabricacao;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="precovenda")
	private double precoVenda;
	
	@Column(name="trioeletrico")
	private boolean trioEletrico;

}
