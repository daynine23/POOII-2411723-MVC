/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.controllers;

import formulario_mvc.core.Controller;
import formulario_mvc.views.HomeView;
import formulario_mvc.views.NewGuestView;

/**
 *
 * @author USUARIO
 */
public class HomeController extends Controller{
    
    private final NewGuestController newGuestController = new NewGuestController();


    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public void run()
    {
        // Initializes others controllers
        newGuestController.run();

        // Initializes HomeView
        //-----------------------------------------------------------------------
        //		Attributes
        //-----------------------------------------------------------------------
        HomeView homeView = new HomeView(this, mainFrame);
        addView("HomeView", homeView);

        // Displays the program window
        mainFrame.setVisible(true);
    }


    //-----------------------------------------------------------------------
    //		Getters
    //-----------------------------------------------------------------------
    

    public NewGuestView getNewGuestView()
    {
        return newGuestController.getView();
    }

}
