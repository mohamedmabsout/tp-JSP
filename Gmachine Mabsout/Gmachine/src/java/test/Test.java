/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import util.HibernateUtil;

/**
 *
 * @author hp
 */
public class Test {
     public static void main(String[]  args){
         
             MachineService ms = new MachineService();
             ms.create(new Machine("001", "HPA",1525.6  ));
             ms.create(new Machine("002", "HPA", 152.56));
             ms.create(new Machine("003", "HPA", 15.256));
             ms.create(new Machine("004", "HPA", 1.5256));
             for(Machine m : ms.findAll())
                 System.out.println(m);
         
            }}
