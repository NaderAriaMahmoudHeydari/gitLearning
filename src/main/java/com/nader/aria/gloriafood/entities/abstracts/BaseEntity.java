package com.nader.aria.gloriafood.entities.abstracts;

import com.nader.aria.gloriafood.entities.interfaces.IBaseEntity;

public class BaseEntity implements IBaseEntity {

    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return id+":";
    }

    @Override
    public boolean equals(Object o){

        return (
                 this == o
                 && ( this.getId() != null
                                   &&
                      this.getId().equals( ( (BaseEntity)o ).getId() )
                 )
               );
    }
}
