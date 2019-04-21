package br.ufjf.dcc193.trabalho1_dcc193.Modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sede {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private Long id;  

private String nomeFantasia;

private String estadoFederacao; 

private String dataEntrada;

private String bairro;

private String telefone;

private String endereco;

}
