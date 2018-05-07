/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.application.rmi;

import java.rmi.*;

/**
 *
 * @author aluno
 */
public interface InterfaceCalc extends Remote {
    public int getSoma(int a, int b) throws RemoteException;
    public int getSubtracao(int a, int b) throws RemoteException;
    public int getMultlicacao(int a, int b) throws RemoteException;
    public double getDivisao(int a, int b) throws RemoteException;
}
