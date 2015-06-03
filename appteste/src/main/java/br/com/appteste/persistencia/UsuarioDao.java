package br.com.appteste.persistencia;

import javax.persistence.EntityManager;

import br.com.appteste.entidade.Usuario;

public class UsuarioDao extends GenericDAO<Long, Usuario> {
	public UsuarioDao(EntityManager entityManager) {
        super(entityManager);
    }
}
