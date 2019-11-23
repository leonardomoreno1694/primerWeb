package models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Tarea {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	
   Integer id;
   String descripcion;
   Integer persona_id;
   
   
   
   
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Integer getPersona_id() {
	return persona_id;
}
public void setPersona_id(Integer persona_id) {
	this.persona_id = persona_id;
}
   
}
