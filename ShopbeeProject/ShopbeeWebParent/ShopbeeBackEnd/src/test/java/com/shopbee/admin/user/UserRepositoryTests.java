//package com.shopbee.admin.user;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import com.shopbee.common.entity.Role;
//import com.shopbee.common.entity.User;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UserRepositoryTests {
//
//	@Autowired
//	private UserRepository repo;
//
//	@Autowired
//	private TestEntityManager entityManager;
//
//	@Test
//	public void testCreateNewUserWithOneRole() {
//		Role roleAdmin = entityManager.find(Role.class, 1);
//		User exUser = new User("tue@gmail.com", "tue123", "Tue", "Nguyen");
//		exUser.addRole(roleAdmin);
//
//		User savedUser = repo.save(exUser);
//
//		assertThat(savedUser.getId()).isGreaterThan(0);
//	}
//	
//	@Test
//	public void testCreateNewUserWithTwoRoles() {
//		User exUser = new User("ex@gmail.com", "ex123", "Ex", "Ample");
//		Role roleEditor = new Role(3);
//		Role roleAssistant = new Role(5);
//		
//		exUser.addRole(roleEditor);
//		exUser.addRole(roleAssistant);
//		
//		User savedUser = repo.save(exUser);
//
//		assertThat(savedUser.getId()).isGreaterThan(0);
//	}
//	
//	@Test
//	public void testListAllUsers() {
//		Iterable<User> listUsers= repo.findAll();
//		
//		listUsers.forEach(user -> System.out.println(user));		
//	}
//	
//	@Test
//	public void testGetUserById() {
//		User exUser = repo.findById(1).get();
//		System.out.println(exUser);
//		assertThat(exUser).isNotNull();
//	}
//	
//	@Test
//	public void testUpdateUserDetails() {
//		User exUser = repo.findById(1).get();
//		exUser.setEnabled(true);
//		exUser.setEmail("tue@ou.edu");
//
//		repo.save(exUser);
//	}
//	
//	@Test
//	public void testUpdateUserRoles() {
//		User exUser = repo.findById(2).get();
//		Role roleEditor = new Role(3);
//		Role roleSalesman = new Role(2); 
//				
//		exUser.getRoles().remove(roleEditor);
//		exUser.addRole(roleSalesman);
//		repo.save(exUser);
//	}
//	
//	@Test
//	public void testDeleteUser() {
//		Integer exUserId = 2;
//		repo.deleteById(exUserId);
//	}
//}
