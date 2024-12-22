package ws;

import java.util.Date;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;



    @WebService(serviceName = "BanqueWS")
    public class BankServer {
        @WebMethod(operationName = "ConversionEuroToDirham")
        public double conversion(@WebParam(name = "montant") double mt) {
            return mt * 11;
        }

        @WebMethod
        public Compte getCompte(@WebParam int code) {
            return new Compte(code, Math.random() * 80000, new Date());
        }

        public List<Compte> listeComptes() {
            return List.of(
                    new Compte(1, Math.random() * 80000, new Date()),
                    new Compte(2, Math.random() * 80000, new Date()),
                    new Compte(3, Math.random() * 80000, new Date()),
                    new Compte(4, Math.random() * 80000, new Date())
            );
        }
}

