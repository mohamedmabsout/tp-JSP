  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */

  package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IDao<T>  {

    
    boolean create(T o)  ;

    boolean update(T o) ;

    boolean delete(T o);

    T findById(int id) ;

    List<T> findAll() ;

}
