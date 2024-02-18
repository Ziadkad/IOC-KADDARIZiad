package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
//      metier.setDao(dao);
        System.out.println("RES = "+metier.calcul());
    }
}
