package sn.moneyTransferSystem.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.moneyTransferSystem.demo.dao.EnvoieRepository;
import sn.moneyTransferSystem.demo.entities.Envoie;



@RestController
public class AngularApirestMoneyTransferRestService {
	@Autowired
	private EnvoieRepository envoieRepository;
	
	@RequestMapping(value="/envoies",method=RequestMethod.GET)
public List<Envoie> getEnvoies(){
		
		return envoieRepository.findAll();
		
	}	
	
	@RequestMapping(value="/envoies/{id}",method=RequestMethod.GET)
public Optional<Envoie> getEnvoie(@PathVariable long id){
		
		return envoieRepository.findById(id);
		
	}	
	

}
