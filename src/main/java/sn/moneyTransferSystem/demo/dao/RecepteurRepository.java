package sn.moneyTransferSystem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.moneyTransferSystem.demo.entities.Recepteur;

public interface RecepteurRepository extends JpaRepository<Recepteur, Long>{

}
