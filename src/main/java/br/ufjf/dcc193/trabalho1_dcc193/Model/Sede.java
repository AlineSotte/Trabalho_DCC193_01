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


@Data
@AllArgsConstructor
@NoArgsConstructor
class Sede {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;  

private String nomeFantasia;

private String estadoFederacao; 

private String dataEntrada;

private String bairro;

private String telefone;

private String endereco;

}
