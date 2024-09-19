/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.views;

import formulario_mvc.controllers.HomeController;
import formulario_mvc.core.Model;
import formulario_mvc.core.View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USUARIO
 */
public class HomeView extends JPanel implements View{
    
    //-----------------------------------------------------------------------
    //		Attributes
    //-----------------------------------------------------------------------
    @SuppressWarnings("unused")
    private final HomeController homeController;
    private final JFrame mainFrame;
    private final static int MAIN_FRAME_WIDTH = 800;
    private final static int MAIN_FRAME_HEIGHT = 350;
    private final static int MAIN_FRAME_X = 100;
    private final static int MAIN_FRAME_Y = 100;


    //-----------------------------------------------------------------------
    //		Constructor
    //-----------------------------------------------------------------------
    /**
     * Initializes the view responsible for program's main screen.
     *
     * @param homeController Controller responsible for this view
     * @param mainFrame Main frame / window of the application
     */
    public HomeView(HomeController homeController, JFrame mainFrame)
    {
        this.homeController = homeController;
        this.mainFrame = mainFrame;

        make_mainFrame();
        make_tabs();
    }


    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public void update(Model model, Object data)
    {
        //TODO
        //Por ejemplo si queremos cargar una lista de datos al iniciar el aplicativo y existe un error

    }

    /**
     * Configures the main frame of the application.
     */
    private void make_mainFrame()
    {
        mainFrame.setOpacity(1.0f);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(MAIN_FRAME_X, MAIN_FRAME_Y, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
        mainFrame.setMinimumSize(new Dimension(MAIN_FRAME_WIDTH, 500));


        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new BorderLayout(0, 0));
    }

    /**
     * Creates tab navigation.
     */
    private void make_tabs()
    {
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Registrar Invitado", homeController.getNewGuestView());
        //tabbedPane.addTab("Events", homeController.getEventListView());
        //tabbedPane.addTab("Remove Event", homeController.getRemoveEventView());
        //tabbedPane.addTab("Registrar invitado", new JPanel());
        //tabbedPane.addTab("Buscar evento", new JPanel());
        add(tabbedPane, BorderLayout.CENTER);
    }
    
}
