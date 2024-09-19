/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.controllers;

import formulario_mvc.core.Controller;
import formulario_mvc.models.Guest;
import formulario_mvc.models.GuestModel;
import formulario_mvc.views.NewGuestView;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author USUARIO
 */
public class NewGuestController extends Controller{
    
    //-----------------------------------------------------------------------
    //		Attributes
    //-----------------------------------------------------------------------
    private NewGuestView newGuestView;



    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public void run()
    {
        newGuestView = new NewGuestView(this);
    }

    /**
     * Creates a new {@link SchedulerEvent} and puts it on {@link EventListView}.
     *
     * @param event Event to be added
     */
    public void addEvent(Guest guest)
    {
        /*Object[] metadata = new Object[5];
        metadata[0] = event.getDate();
        metadata[1] = event.getEventDesc();
        metadata[2] = event.getFrequency();
        metadata[3] = event.getFwdEmail();
        metadata[4] = event.getAlarm() ? "ON" : "OFF";*/

        try {
            GuestModel gModel = new GuestModel();
            gModel.saveEvent(guest); //MODEL
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        //AQUI DEBERIA LLAMAR AL METODO CARGAR TABLA DESDE TXT
        //eventListController.addNewRow(metadata);
        showMessageDialog(null, "Se registro el invitado en guest.txt!");
    }


    //-----------------------------------------------------------------------
    //		Getters
    //-----------------------------------------------------------------------
    /**
     * Gets the {@link NewEventView view associated with this controller}.
     *
     * @return View associated with this controller
     */
    public NewGuestView getView()
    {
        return newGuestView;
    }
    
}
