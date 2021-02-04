package sn.moneyTransferSystem.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.moneyTransferSystem.demo.dao.EmetteurRepository;
import sn.moneyTransferSystem.demo.entities.Emetteur;

@SpringBootApplication
public class AngularApirestMoneyTransferSystemApplication implements CommandLineRunner {
	
	@Autowired
	private EmetteurRepository emetteurRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(AngularApirestMoneyTransferSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		emetteurRepository.save(new Emetteur(null, "fall","Fallou","15000 fcfa","773054587"));
//		emetteurRepository.save(new Emetteur(null, "sow","ameth","25000 fcfa","782054519"));
//		emetteurRepository.save(new Emetteur(null, "gueye","mountakha","150000 fcfa","789082587"));
//		emetteurRepository.save(new Emetteur(null, "gadiaga","mafatim","155000 fcfa","773004512"));
		
		emetteurRepository.findAll().forEach(e->{
		System.out.println(((Emetteur) e).getNom());	
		
		});
		
	}

}
