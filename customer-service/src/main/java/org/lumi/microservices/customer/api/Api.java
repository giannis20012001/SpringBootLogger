package org.lumi.microservices.customer.api;

import net.logstash.logback.argument.StructuredArgument;
import net.logstash.logback.argument.StructuredArguments;
import org.lumi.microservices.customer.intercomm.AccountClient;
import org.lumi.microservices.customer.model.Account;
import org.lumi.microservices.customer.model.Customer;
import org.lumi.microservices.customer.model.CustomerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@RestController
public class Api {
    @RequestMapping("/customers/pesel/{pesel}")
    public Customer findByPesel(@PathVariable("pesel") String pesel) {
        logger.info(String.format("Customer.findByPesel(%s)", pesel));
        Customer c = customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();
        logger.info(String.format("Customer.findByPesel: %s", c));

        return c;

    }

    @RequestMapping("/customers")
    public List<Customer> findAll() {
        Instant start = Instant.now();
        logger.info("Customer.findAll()");
        logger.info(String.format("Customer.findAll: %s", customers));
        Instant end = Instant.now();
        Duration time = Duration.between(start, end);
        StructuredArgument timeArgument = StructuredArguments.value("time", time);
        logger.info("Time to find all customers: '{}'", timeArgument);

        return customers;

    }

    @RequestMapping("/customers/{id}")
    public Customer findById(@PathVariable("id") Integer id) {
        logger.info(String.format("Customer.findById(%s)", id));
        Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
        List<Account> accounts =  accountClient.getAccounts(id);
        customer.setAccounts(accounts);
        logger.info(String.format("Customer.findById: %s", customer));

        return customer;

    }

    //=================================================================================================================
    //Class constructors
    //=================================================================================================================
    /**
     * Parametrized constructor
     */
    public Api() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "12345", "John Tsantilis", CustomerType.INDIVIDUAL));
        customers.add(new Customer(2, "12346", "Panagiotis Gouvas", CustomerType.INDIVIDUAL));
        customers.add(new Customer(3, "12347", "Giorgos Tsiolis", CustomerType.INDIVIDUAL));
        customers.add(new Customer(4, "12348", "Michalis Zachariadis", CustomerType.INDIVIDUAL));

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    @Autowired
    private AccountClient accountClient;
    protected static Logger logger = LoggerFactory.getLogger(Api.class.getName());
    private List<Customer> customers;

}
