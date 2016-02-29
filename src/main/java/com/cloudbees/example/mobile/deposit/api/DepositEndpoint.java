package com.cloudbees.example.mobile.deposit.api;

/**
 * Created by kmadel on 6/12/15.
 */

import com.cloudbees.example.mobile.deposit.api.model.Deposit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.*;

@Component
@Path("/account/deposit")
public class DepositEndpoint {

    @Value("${version}")
    private String version;

    @GET
    @ResponseBody
//  It is possible to override the accept headers to respond on plain text  
//    @Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    @Produces({ MediaType.APPLICATION_JSON })
    public Deposit getDepositAccount() {

        Deposit depositAccount = new Deposit();
        depositAccount.setAccountNumber("1234567890129876");
        depositAccount.setBalance(new BigDecimal(57760.85));
        depositAccount.setVersion(version);
        depositAccount.setName("Free Checking");

        return depositAccount;
    }

}
