 package fi.malm.Pelikanta.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.malm.Pelikanta.domain.Peli;
import fi.malm.Pelikanta.domain.PeliRepository;

@Controller
public class PeliController {
    @Autowired
    private PeliRepository repository;

    @RequestMapping(value={"/", "/login"})
	public String login() {
		return "login";
	}  
    
    @RequestMapping(value={"/listaa"})
    public String Listaa(Model model){
        model.addAttribute("pelit", repository.findAll());
        return "listaa";
    }
    
    @RequestMapping(value={"/loginlista"})
    public String loginLista(Model model){
        model.addAttribute("pelit", repository.findAll());
        return "loginlista";
    }
 
    @RequestMapping(value = "/lisaa")
    public String addPeli(Model model){
    	model.addAttribute("peli", new Peli());
        return "lisaa";
    }     
    
    @PostMapping("/save")
    public String Tallenna(Peli peli){
        repository.save(peli);
        return "redirect:loginlista";
    }
    
    @GetMapping("/delete/{id}")
    public String Poista(@PathVariable("id") Long peliId, Model model) {
        repository.deleteById(peliId);
        return "redirect:../loginlista";
    }
    @RequestMapping(value = "/muokkaa/{id}")
    public String lisaaPeli(@PathVariable("id") Long peliId, Model model){
        model.addAttribute("peli", repository.findById(peliId));
        return "muokkaa";
    }
    
}
