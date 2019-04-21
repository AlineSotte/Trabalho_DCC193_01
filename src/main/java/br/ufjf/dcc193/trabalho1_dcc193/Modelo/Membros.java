package br.ufjf.dcc193.trabalho1_dcc193.Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import lombok.*;
import org.springframework.data.annotation.Id;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
class Membros {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;  

private String funcao;

@Email
private String email; 

private Date dataEntrada;

private Date dataSaida;



}