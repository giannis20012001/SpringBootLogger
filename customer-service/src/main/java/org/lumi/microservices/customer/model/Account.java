package org.lumi.microservices.customer.model;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

public class Account {
    @Override
    public String toString() {
        return String.format("Account [id=%d, number='%s']", id, number);

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

    public String getNumber() {
        return number;

    }

    public void setNumber(String number) {
        this.number = number;

    }

    //=================================================================================================================
    //Class constructors
    //=================================================================================================================
    /**
     * Default constructor
     */
    public Account() {
        //Do nothing

    }

    /**
     * Parametrized constructor
     */
    public Account(Integer id, String number) {
        super();
        this.id = id;
        this.number = number;

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    private Integer id;
    private String number;

}
