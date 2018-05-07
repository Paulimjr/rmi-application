/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.application.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

/**
 *
 * @author aluno
 */
public class Server extends UnicastRemoteObject implements InterfaceCalc {
    
    public Server() throws RemoteException {
       super();
    }    
    
    @Override
    public int getSoma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int getSubtracao(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int getMultlicacao(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double getDivisao(int a, int b) throws RemoteException {
        return a / b;
    }
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(2335);
        Server s = new Server();
        Naming.rebind("//localhost:2335/calc", s);
        System.out.println("Server already....");
    }
}
