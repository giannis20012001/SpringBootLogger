package org.lumi.microservices.account.model;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

public class Account {
    @Override
    public String toString() {
        return String.format("Account [id=%d, number='%s', customerId=%d]", id, number, customerId);

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

    public Integer getCustomerId() {
        return customerId;

    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;

    }

    public String getNumber() {
        return number;

    }

    public void setNumber(String number) {
        this.number = number;

    }

    //=================================================================================================================
    //Class getters & setters
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
    public Account(Integer id, Integer customerId, String number) {
        this.id = id;
        this.customerId = customerId;
        this.number = number;

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    private Integer id;
    private Integer customerId;
    private String number;

}
