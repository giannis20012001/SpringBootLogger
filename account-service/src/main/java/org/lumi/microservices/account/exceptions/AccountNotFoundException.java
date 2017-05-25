package org.lumi.microservices.account.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String accountNumber) {
        super("No such account: " + accountNumber);

    }

    private static final long serialVersionUID = 1L;

}
