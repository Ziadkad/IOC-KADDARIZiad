package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version webservice");
        double t=20;
        return t;
    }
}
