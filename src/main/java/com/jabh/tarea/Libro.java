package com.jabh.tarea;

import java.io.PrintStream;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Libro
{
  private String titulo = "Learning Spring";
  
  @Autowired
  @Qualifier("autorconocido")
  private AutorInterfaz autor;
  
  private String genero = "Suspenso";
  private String editorial = "Planeta";
  private int edicion = 3;
  private int paginas = 300;
  

  public Libro() {}
  
  @PostConstruct
  public void saludar()
  {
    System.out.println("Hola");
  }
  
  @PreDestroy
  public void despedirse() {
    System.out.println("Adios");
  }
  
  public String getTitulo() { return titulo; }
  
  public void setTitulo(String titulo)
  {
    this.titulo = titulo;
  }
  
  public AutorInterfaz getAutor() {
    return autor;
  }
  
  public void setAutor(AutorInterfaz autor) {
    this.autor = autor;
  }
  
  public String getGenero() {
    return genero;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  public String getEditorial() {
    return editorial;
  }
  
  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }
  
  public int getEdicion() {
    return edicion;
  }
  
  public void setEdicion(int edicion) {
    this.edicion = edicion;
  }
  
  public int getPaginas() {
    return paginas;
  }
  
  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }
}