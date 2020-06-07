
package com.github.brunosil.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CartorioDao {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dao_generico");
      public static EntityManager getEntityManager(){
          return factory.createEntityManager();
      }
    }
    
    
    

