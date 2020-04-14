package org.cap.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CustomerDto 
{

    private String name;


    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
}