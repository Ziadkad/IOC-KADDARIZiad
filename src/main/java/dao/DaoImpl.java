package dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;


@Repository("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version database");
        double t=13;
        return t;
    }
}
