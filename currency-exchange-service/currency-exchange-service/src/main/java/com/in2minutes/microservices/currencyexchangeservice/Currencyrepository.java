package com.in2minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Currencyrepository extends JpaRepository<ExchangeValue,Long> {

	ExchangeValue findByFromAndTo(String from,String to);
	
}
