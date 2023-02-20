package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("**** TEST 1: department findById ****");
//		Department department = departmentDao.findById(1);
//		System.out.println(department);
//		
//		System.out.println("\n**** TEST 2: department findAll ****");
//		List<Department>list = departmentDao.findAll();
//		for (Department obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n**** TEST 3: department insert ****");
//		Department newDepartment = new Department("Games");
//		departmentDao.insert(newDepartment);
//		System.out.println("New Department " + newDepartment.getName() + " Inserted with ID = " + newDepartment.getId());
//		
//		System.out.println("\n**** TEST 4: department update ****");
//		department = departmentDao.findById(3);
//		department.setName("Tools");
//		departmentDao.update(department);
//		System.out.println("Update successful");
		
		System.out.println("\n**** TEST 5: department deleteById ****");
		System.out.print("Enter ID to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department with ID " + id + " deleted successfuly");
		
		sc.close();
	}
}
