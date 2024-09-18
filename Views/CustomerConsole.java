/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Controllers.CustomerController;
import Models.Customer;
import Models.CustomerList;
import Utils.UtilConsole;
import Utils.UtilDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jprod
 */
public class CustomerConsole implements IView<Customer> {
    CustomerController controller;

    public void setController(CustomerController controller) {
        this.controller = controller;
    }
    
    public void show(){
        int op=0;
        do{
            op=menu();
            switch(op){
                case 1->{
                    insert();
                }
                case 2->{
                    update();
                }
                case 3->{
                    delete();
                }
                case 4->{
                    read();
                }
                case 5->{
                    readAll();
                }
            }
        }while(op!=0);
    }
    
    private int menu(){
        UtilConsole.print("1 - Agregar");
        UtilConsole.print("2 - Modificar");
        UtilConsole.print("3 - Eliminar");
        UtilConsole.print("4 - Buscar");
        UtilConsole.print("5 - Mostrar Todo");
        UtilConsole.print("0 - Salir");
        return UtilConsole.getInputInt("Seleccione una opcion");
    }
    
    @Override
    public void insert(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        String name=UtilConsole.getInputString("Ingrese el Nombre");
        String date=UtilConsole.getInputString("Ingrese la Fecha de Nacimiento");
        LocalDate birthDate = UtilDate.stringToLocalDate(date);        
        String phone=UtilConsole.getInputString("Ingrese el Telefono");
        String email=UtilConsole.getInputString("Ingrese el correo electronico");
        controller.insert(id, name, birthDate, phone, email);
    }
    
    @Override
    public void update(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        String phone=UtilConsole.getInputString("Ingrese el Telefono");
        controller.update(id, phone);
    }
    
    @Override
    public void delete(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        controller.delete(id);
    }
    
    @Override
    public void read(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        controller.read(id);
    }
    
    @Override
    public void readAll(){
        controller.readAll();
    }
    
    @Override
    public void showMessage(String str){
        UtilConsole.print(str);
        //UtilConsole.getInputString("Presione enter para continuar");
    }
    
    @Override
    public void showErrorMessage(String str){
        UtilConsole.print(str,UtilConsole.COLOR_RED);
        UtilConsole.getInputString("Presione enter para continuar");
    }
    
    @Override
    public void display(Customer customer){
        UtilConsole.print(customer.toString(), UtilConsole.COLOR_BLUE);
        UtilConsole.getInputString("Presione enter para continuar");
    }
    
    @Override
    public void displayAll(List<Customer> customers){
        for(Customer customer:customers){
            UtilConsole.print(customer.toString(), UtilConsole.COLOR_GREEN);
        }
        UtilConsole.getInputString("Presione enter para continuar");
    }

}
