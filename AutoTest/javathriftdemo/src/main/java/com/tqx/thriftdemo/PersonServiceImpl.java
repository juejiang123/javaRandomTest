package com.tqx.thriftdemo;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        return null;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {

    }
}
