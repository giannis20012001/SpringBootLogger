package org.lumi.microservices.customer.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String pesel) {
        super("No such customer: " + pesel);

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    private static final long serialVersionUID = 1L;

}
