package org.lumi.microservices.customer.model;

import java.util.List;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

public class Customer {
    @Override
    public String toString() {
        return String.format("Customer [id=%d, pesel='%s', name='%s']", id, pesel, name);

    }

    //=================================================================================================================
    //Class getters & setters
    //=================================================================================================================
    public Integer getId() {
        return id;

    }

    public void setId(Integer id) {
        this.id = id;

    }

    public String getPesel() {
        return pesel;

    }

    public void setPesel(String pesel) {
        this.pesel = pesel;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public CustomerType getType() {
        return type;

    }

    public void setType(CustomerType type) {
        this.type = type;

    }

    public List<Account> getAccounts() {
        return accounts;

    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;

    }

    //=================================================================================================================
    //Class constructors
    //=================================================================================================================
    /**
     * Default constructor
     */
    public Customer() {
        //Do nothing

    }

    /**
     * Parametrized constructor
     */
    public Customer(Integer id, String pesel, String name, CustomerType type) {
        this.id = id;
        this.pesel = pesel;
        this.name = name;
        this.type = type;

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    private Integer id;
    private String pesel;
    private String name;
    private CustomerType type;
    private List<Account> accounts;

}
