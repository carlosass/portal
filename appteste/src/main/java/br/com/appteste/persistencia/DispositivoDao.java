package br.com.appteste.persistencia;

import javax.persistence.EntityManager;

import br.com.appteste.entidade.Dispositivo;

public class DispositivoDao extends GenericDAO<Long, Dispositivo> {
	public DispositivoDao(EntityManager entityManager) {
        super(entityManager);
    }
}
