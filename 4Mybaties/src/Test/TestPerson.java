package Test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.PersonDao;
import entity.Person;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		//得到sqlsession 
		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory factory = builder.build(reader);
		//System.out.println(factory);
		SqlSession session = factory.openSession();
		//获得sqlsession实体类
		PersonDao pd=session.getMapper(PersonDao.class);
		//调用insert方法完成插入动作
		/*Person p =new Person(2,"fll","fanlanlan","fll0403");
		pd.insertPerson(p);
		session.commit();*/
		
		Person p=pd.selectPersonById(1);
		System.out.println("查询出来内容："+p);
		
		p.setUsername("范兰兰");
		pd.updatePerson(p);
	
		
		pd.deletePerson(1);
		session.commit();
		
		session.close();
	}
}
