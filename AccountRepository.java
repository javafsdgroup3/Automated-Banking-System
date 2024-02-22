package com.tcs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.project.resource.Accounts;

public interface AccountRepository extends JpaRepository<Accounts,Integer>{

}
