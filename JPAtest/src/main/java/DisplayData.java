import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayData {
	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager =factory.createEntityManager();
		Query query = entityManager.createQuery("From Employee");
		List<Employee> list= query.getResultList();
		for(Employee e:list) {
			System.out.println(e.getName());
		}
	}

}
