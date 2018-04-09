package com.camelinaction;

import javax.inject.Singleton;

import org.apache.camel.util.InetAddressUtil;

// A comment that Rick added.

/**
 * A bean that returns the hostname
 */
@Singleton
public class HelloBean {

    public String sayHello() throws Exception {
        return "Candace and Luke say hello from "
                + InetAddressUtil.getLocalHostName();
    }
}
