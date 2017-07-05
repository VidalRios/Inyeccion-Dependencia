package com.jabh.tarea;

import java.io.PrintStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  
  public static void main(String[] args) {
	try{  
		
	ApplicationContext factory = new ClassPathXmlApplicationContext("app-context.xml");
	
    Libro libro = (Libro)factory.getBean("Libro");
    
    System.out.println("- " + libro.getTitulo());
    System.out.println("- " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
    System.out.println("- " + libro.getEditorial());
    System.out.println("- " + libro.getGenero());
    System.out.println("- " + libro.getEdicion());
    System.out.println("- " + libro.getPaginas());
	}catch (Exception e){
		e.printStackTrace();
	}
  }
}