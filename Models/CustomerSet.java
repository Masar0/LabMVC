/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Student
 */
public class CustomerSet implements IManager<Customer> {

    private HashSet<Customer> set;

    public CustomerSet() {
        set = new HashSet<>();
    }

    @Override
    public boolean add(Customer element) {
        return set.add(element);
    }

    @Override
    public Customer get(Customer element) {
        for (Customer customer : set) {
            if (customer.getId() == element.getId()) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public boolean set(Customer element) {
        for (Customer customer : set) {
            if (customer.getId() == element.getId()) {
                set.remove(customer);
                set.add(element);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Customer element) {
        for (Customer customer : set) {
            if (customer.getId() == element.getId()) {
                return set.remove(customer);
            }
        }
        return false;
    }

    @Override
    public List getAll() {
        return new ArrayList<>(set);
    }

}
