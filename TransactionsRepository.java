package com.tcs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.project.resource.Transactions;


@Repository
public interface TransactionsRepository extends JpaRepository<Transactions,Integer> {

}
