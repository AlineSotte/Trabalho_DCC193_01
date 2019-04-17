package br.ufjf.dcc193.trabalho1_dcc193.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;

@Table(name="SEDE")
class Sede {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="MEM_ID")
private Long id;  

@Column(name="MEM_FUNCAO")
private String funcao;

@Email
@Column(name="MEM_EMAIL")
private String email; 

@Column(name="MEM_DATA_ENTIDADE")
private Date dataEntrada;

@Column(name="MEM_DATA_SAIDA")
private Date dataSaida;
