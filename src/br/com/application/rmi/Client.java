/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.application.rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;
/**
 *
 * @author aluno
 */
public class Client {
    
    private static InterfaceCalc calc;
    
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
       calc = (InterfaceCalc) Naming.lookup("rmi://localhost:2335/calc");
       int a = 1;
       int b = 2;
       int res = calc.getSoma(a, b);
        System.out.println("Resp: "+res);
    }
    
    
}
