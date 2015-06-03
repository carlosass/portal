package br.com.appteste.controle;

import javax.faces.bean.ManagedBean;

import br.com.appteste.entidade.Dispositivo;
import br.com.appteste.persistencia.DispositivoDao;
import br.com.appteste.persistencia.SimpleEntityManager;

@ManagedBean(name = "DispositivoBean")
public class DispositivoControl {
	private DispositivoDao dao;
	private Dispositivo dispositivo;
    
    private SimpleEntityManager simpleEntityManager;
     
    public DispositivoControl(){
        this.simpleEntityManager = new SimpleEntityManager("appteste");
        this.dispositivo = new Dispositivo();
        dao = new DispositivoDao(simpleEntityManager.getEntityManager());
    }
    
    public void salvar(){
        try{
            simpleEntityManager.beginTransaction();
            dao.salvar(this.dispositivo);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
}
