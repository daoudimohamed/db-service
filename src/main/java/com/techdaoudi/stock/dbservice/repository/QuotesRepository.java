package com.techdaoudi.stock.dbservice.repository;

import com.techdaoudi.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote,Integer>{

    List<String>  findByUserName(String userName);
}
