package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("Version web service");
		double data= 34;
		return data;
	}
	
	public void init() {
		System.out.println("Instanciation de Dao Impl");
	}

}
