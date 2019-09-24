package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.UserEntity;

/**
 * Session Bean implementation class UserEjb
 */
@Stateless
@LocalBean
public class UserEjb {
 
	@PersistenceContext
	private EntityManager em;
	
    public UserEjb() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(UserEntity ue)
    {
      
    	System.out.println("==========Adding user to the database==========");
    	em.persist(ue);
    }
    

}
