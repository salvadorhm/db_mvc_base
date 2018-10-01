/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelAgenda;
import views.ViewAgenda;

/**
 *
 * @author Zeo
 */
public class ControllerAgenda {
    ModelAgenda modelAgenda;
    ViewAgenda viewAgenda;

    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
    }
    
    public void initComponents(){
        viewAgenda.setLocationRelativeTo(null);
        viewAgenda.setTitle("Agenda MVC");
        viewAgenda.setVisible(true);
    }
}
