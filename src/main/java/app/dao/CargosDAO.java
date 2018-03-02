package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("CargosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CargosDAO extends JpaRepository<Cargos, java.lang.String> {

  /**
   * Obtém a instância de Cargos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cargos entity WHERE entity.id = :id")
  public Cargos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cargos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cargos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cargos entity WHERE entity.cargos.id = :id")
  public Page<Cargos> findCargos(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key cargos
   * @generated
   */
  @Query("SELECT entity FROM Cargos entity WHERE entity.cargos.id = :id")
  public Page<Cargos> findCargossByCargos(@Param(value="id") java.lang.String id, Pageable pageable);

}
