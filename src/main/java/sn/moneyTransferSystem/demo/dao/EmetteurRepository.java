package sn.moneyTransferSystem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.moneyTransferSystem.demo.entities.Emetteur;

public interface EmetteurRepository extends JpaRepository<Emetteur, Long> {

}
