package controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import models.Persona;
import repository.personaRepository;


@RestController
@RequestMapping("persona")
public class personaController {
	
	@Autowired
	private personaRepository PersonaRpository;
	
    
	@PostMapping("/")
	public String guardar(@RequestBody Persona unaPersona) 
	{
		return "ok";
	}
	
	@GetMapping("/")	
	public String listar ()
	{   
		
		return "lista";
	} 
	
	@GetMapping("/{id}")
	public String listarUno(@PathVariable Integer id)
	{
		
		return "ok";
	}
	
	@DeleteMapping("/{id}")
	public String Borrar(@PathVariable Integer id)
	{
		return "ok";
	}
	
	@PutMapping ("/{id}")
	public String modoficar(@PathVariable Integer id,@RequestBody Persona unaPersona) 
	{
		return "ok";
	}
}
