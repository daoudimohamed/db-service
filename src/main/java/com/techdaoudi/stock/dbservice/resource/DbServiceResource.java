package com.techdaoudi.stock.dbservice.resource;

import com.techdaoudi.stock.dbservice.repository.QuotesRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

    private QuotesRepository quotesRepository;
    @RequestMapping("/{userName}")
    public List<String> getQuotes(@PathVariable("userName") String userName ){
        quotesRepository.findByUserName(userName);
        return null;
    }
}
