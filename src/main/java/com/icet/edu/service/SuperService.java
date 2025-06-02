package com.icet.edu.service;

public interface SuperService<T,ID> {

    public Boolean add(T dto);
    public Boolean remove(Long id);
    public T searchByID(Long id);

}
