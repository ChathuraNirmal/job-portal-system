package com.icet.edu.service;

import java.util.List;

public interface SuperService<T,ID> {

    public Boolean save(T dto);
    public Boolean delete(Long id);
    public T searchByID(Long id);
    public List<T> getAll();
}
