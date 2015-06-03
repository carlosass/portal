package br.com.appteste.controle;

import javax.faces.bean.ManagedBean;

import br.com.appteste.entidade.Usuario;
import br.com.appteste.persistencia.SimpleEntityManager;
import br.com.appteste.persistencia.UsuarioDao;

@ManagedBean(name = "UsuarioBean")
public class UsuarioControl {
	private UsuarioDao dao;
	private Usuario usuario;
    
    private SimpleEntityManager simpleEntityManager;
    
    public UsuarioControl(){
        this.simpleEntityManager = new SimpleEntityManager("appteste");
        this.usuario = new Usuario();
        dao = new UsuarioDao(simpleEntityManager.getEntityManager());
    }
    
    public void salvar(){
        try{
            simpleEntityManager.beginTransaction();
            dao.salvar(this.usuario);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void login(){
        try{
            
        }catch(Exception e){
            
        }
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
