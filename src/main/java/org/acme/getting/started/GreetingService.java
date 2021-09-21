package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigInteger;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }

    public BigInteger addition(BigInteger x, BigInteger y) {
        return x.add(y);
    }

}
