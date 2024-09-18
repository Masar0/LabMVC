/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Customer;
import Models.IManager;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jprod
 */
public class CustomerController {
    private IManager<Customer> model;
    private IView<Customer> view;

    public CustomerController(IManager model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void insert(int id,String name,LocalDate birthdate,String phone,String email){
        Customer customer;
        if(phone!=null){
            customer=new Customer(id,name,birthdate,phone,email);
        }else{
            customer=new Customer(id,name,birthdate,email);
        }
        if (model.add(customer)){
           view.showMessage("Agregado.");
        }else{
           view.showErrorMessage("El id ya se encuentra registrado.");
        }
    }

    public void update(int id, String phone){
        Customer customer = new Customer(id);
        customer=model.get(customer);
        if (customer!=null){
            customer.setPhone(phone);
            if (model.set(customer))
                view.showMessage("Cliente actualizado.");
            else
               view.showErrorMessage("Error al actualizar.");
        }else{
            view.showErrorMessage("Error cliente no encontrado");
        }
    }
    
    public void delete(int id){        
        Customer customer = new Customer(id);
        customer=model.get(customer);
        if (customer!=null){
            model.remove(customer);
            view.showMessage("Cliente eliminado.");
        }else{
            view.showErrorMessage("Error cliente no encontrado");
        }
    }
    
    
    public void read(int id){
        Customer customer = new Customer(id);
        customer=model.get(customer);
        if (customer!=null){
            view.display(customer);
        }else{
            view.showErrorMessage("Error cliente no encontrado");
        }
    }
    
    public void readAll(){
        List<Customer> customers=model.getAll();
        if(customers!=null){
            view.displayAll(customers);
        }else{
            view.showErrorMessage("No hay datos");
        }
    }

}
