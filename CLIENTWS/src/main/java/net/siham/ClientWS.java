package net.siham;

import proxy.BankServer;
import proxy.BanqueWS;
import proxy.Compte;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BankServer proxy= new BanqueWS().getBankServerPort();
        System.out.println("Conversion=" +proxy.conversionEuroToDirham(400));
        Compte cp = proxy.getCompte(4);
        System.out.println("Code= " +cp.getCode());
        System.out.println("Solde= " +cp.getSolde());
        System.out.println("Date de création= " +cp.getDateCreation());
        List<Compte> compteList = proxy.listeComptes();
        for(Compte c : compteList) {
            System.out.println("------------------");
            System.out.println("Code= " +c.getCode());
            System.out.println("Solde= " +c.getSolde());
            System.out.println("Date de création= " +c.getDateCreation());
        }
    }
}
