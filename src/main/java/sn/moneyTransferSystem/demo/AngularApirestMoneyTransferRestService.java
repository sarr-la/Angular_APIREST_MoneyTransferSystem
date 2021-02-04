package sn.moneyTransferSystem.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.moneyTransferSystem.demo.dao.EmetteurRepository;
import sn.moneyTransferSystem.demo.dao.EnvoieRepository;
import sn.moneyTransferSystem.demo.dao.RecepteurRepository;
import sn.moneyTransferSystem.demo.entities.Emetteur;
import sn.moneyTransferSystem.demo.entities.Envoie;
import sn.moneyTransferSystem.demo.entities.Recepteur;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AngularApirestMoneyTransferRestService {
	@Autowired
	private EnvoieRepository envoieRepository;
	
	@Autowired
	private EmetteurRepository emetteurRepository;
	
	@Autowired
	private RecepteurRepository recepteurRepository;
	
	@RequestMapping(value="/envoies",method=RequestMethod.GET)
public List<Envoie> getEnvoies(){
		
		return envoieRepository.findAll();
		
	}	
	
	@RequestMapping(value="/envoies/{id}",method=RequestMethod.GET)
public Optional<Envoie> getEnvoie(@PathVariable long id){
		
		return envoieRepository.findById(id);
		
	}	
	
	@RequestMapping(value = "/envoies/add", method = RequestMethod.POST)
	private Envoie addTransfert(@RequestBody Envoie envoie){
		
	
		emetteurRepository.save(envoie.getEmetteur());
		recepteurRepository.save(envoie.getRecepteur());		
		
		return this.envoieRepository.save(envoie);
	}
	
	

}
