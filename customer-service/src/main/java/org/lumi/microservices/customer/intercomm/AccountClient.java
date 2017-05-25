package org.lumi.microservices.customer.intercomm;

import org.lumi.microservices.customer.model.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@FeignClient("account-service")
public interface AccountClient {
    @RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
    List<Account> getAccounts(@PathVariable("customerId") Integer customerId);

}
