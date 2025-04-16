package com.project_Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project_Main.Model.Customer_Model;

@Repository
public interface customer_repo extends JpaRepository<Customer_Model, Integer>
{
	public Customer_Model findByEmail(String email);
}