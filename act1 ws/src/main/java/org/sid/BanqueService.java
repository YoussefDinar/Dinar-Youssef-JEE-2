package org.sid;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant){
        return montant*11.2;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "identifiant")int id){
        return new Compte(id,Math.random()*5000,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1,Math.random()*5000,new Date()));
        comptes.add(new Compte(2,Math.random()*3500,new Date()));
        comptes.add(new Compte(3,Math.random()*4280,new Date()));
        return comptes;
    }

}