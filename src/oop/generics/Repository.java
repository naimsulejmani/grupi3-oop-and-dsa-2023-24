package oop.generics;


import java.util.List;

public interface Repository<T, Tid> {
    public void add(T model);

    public void remove(Tid id);

    public void modify(Tid id, T model);


    public T findById(Tid id); //SELECT * FROM tabela WHERE id=?

    public List<T> findAll();
}
