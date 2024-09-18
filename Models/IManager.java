/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author jprod
 */
public interface IManager<T> {
    public boolean add(T element);
    
    public T get(T element);
        
    public boolean set(T element);

    public boolean remove(T element);
        
    public List getAll();
}
