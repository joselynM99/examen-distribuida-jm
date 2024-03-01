package com.distribuida;

import jakarta.persistence.Persistence;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Principal {

    public static void main(String[] args) throws NamingException {

        Context ctx = new InitialContext();
        ctx.createSubcontext("java:jboss"); // Si es necesario, crea el subcontexto necesario
        ctx.createSubcontext("java:jboss/datasources"); // Si es necesario, crea el subcontexto necesario

        var p = Persistence.createEntityManagerFactory("pu1");
        var em = p.createEntityManager();

        ctx.close();

    }
}
