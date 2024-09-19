/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc;

import formulario_mvc.controllers.HomeController;
import formulario_mvc.core.Controller;

/**
 *
 * @author USUARIO
 */
public class Formulario_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller c = new HomeController();
        c.run();
    }
    
}
