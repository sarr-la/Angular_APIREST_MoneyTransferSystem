package sn.moneyTransferSystem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.moneyTransferSystem.demo.entities.Envoie;

public interface EnvoieRepository extends JpaRepository<Envoie, Long>{

}
