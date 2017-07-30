package test;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


class Student{
	private String name;
	private int age;
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class JacksonTester {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        ObjectMapper mapper = new ObjectMapper();
//        String json = "{\"name\":\"Sanuj\", \"age\":21}";
//        
//        //json to student mapper
//        
//        try {
//        	Student student = mapper.readValue(json, Student.class);
//        	
//        	System.out.println(student);
//        	
//        String	jsonString = mapper.writeValueAsString(student);
//        
//            System.out.println(jsonString);
//        	
//        }
//        catch (Exception e) {
//			// TODO: handle exception
//        	e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		 
		 ObjectMapper mapper = new ObjectMapper();
		 
		 ArrayList<Student> studList = new ArrayList<>();
		 
		   studList.add(new Student("qwqdqwd",12));
		   studList.add(new Student("abdcf",15));
		   studList.add(new Student("xyzvsdhjs",62));
		   studList.add(new Student("Hotesh",95));
		   
		   try {
			String json = mapper.writeValueAsString(studList);
			System.out.println("ArrayList to Json\n");
			System.out.println(json);
			
			TypeReference<ArrayList<Student>> newList = new TypeReference<ArrayList<Student>>(){};
			
			ArrayList<Student> newArrayList = new ArrayList<>();
			
			newArrayList = mapper.readValue(json, newList);
			
			System.out.println("\nJson to Arraylist\n");
			
			newArrayList.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}                                              

}
