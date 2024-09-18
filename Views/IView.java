/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Views;

import java.util.List;

/**
 *
 * @author jprod
 */
public interface IView<T> {
    public void insert();
    
    public void update();
    
    public void delete();
    
    public void read();
    
    public void readAll();
    
    public void showMessage(String str);
    
    public void showErrorMessage(String str);
    
    public void display(T element);
    
    public void displayAll(List<T> list);
}
