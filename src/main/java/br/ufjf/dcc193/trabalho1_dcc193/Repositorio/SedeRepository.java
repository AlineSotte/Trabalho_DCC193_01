
package br.ufjf.dcc193.trabalho1_dcc193.Repositorio;

import br.ufjf.dcc193.trabalho1_dcc193.Modelo.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Long>{} 
 