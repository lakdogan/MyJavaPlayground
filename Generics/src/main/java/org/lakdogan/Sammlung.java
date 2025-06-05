package org.lakdogan;

import java.util.ArrayList;
import java.util.List;

public class Sammlung<T> {
    private List<T> elemente = new ArrayList<>();

    public void einfuegen(T element)
    {
        elemente.add(element);
    }

    public List<T> getAll()
    {
        return elemente;
    }
}
