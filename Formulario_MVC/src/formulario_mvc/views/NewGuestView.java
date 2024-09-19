/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.views;

import formulario_mvc.controllers.NewGuestController;
import formulario_mvc.core.Model;
import formulario_mvc.core.View;
import formulario_mvc.models.Genre;
import formulario_mvc.models.Guest;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class NewGuestView extends JPanel implements View{
    
    //-----------------------------------------------------------------------
// Attributes
//-----------------------------------------------------------------------
private final NewGuestController newGuestController;

//private final NivelCursoController scholar;
private JTextField tf_name;
private JTextField tf_phoneNumber;
private JTextField tf_address;
private JComboBox cb_day;
private JComboBox cb_month;
private JComboBox cb_year;
private JCheckBox cbx_termsAndCond;
private JRadioButton rbtn_male;
private JRadioButton rbtn_female;



public NewGuestView(NewGuestController newGuestController)
{
    this.newGuestController = newGuestController;

    make_frame();
    make_field_name();
    make_field_phoneNumber();
    make_field_address();
    make_field_genre();
    make_field_termsAndCond();
    make_field_Date();
    make_btn_save();
    make_btn_clean();
    }


    //-----------------------------------------------------------------------
    // Methods
    //-----------------------------------------------------------------------
    @Override
    public void update(Model model, Object data)
    {
    if (data != null) {
    String notice = (String) data;
    JOptionPane.showMessageDialog(null, notice);
    }
    }

    /**
    * Reset all fields.
    */
    private void cleanFields()
    {
    tf_name.setText(""); // Erases date field
    tf_phoneNumber.setText(""); // Erases event description field
    tf_address.setText(""); // Erases event description field
    cbx_termsAndCond.setSelected(false); // Unchecks check box
    cb_day.setSelectedIndex(0);
    cb_month.setSelectedIndex(0);
    cb_year.setSelectedIndex(0);
    rbtn_male.setSelected(true); // Select radio button default
    }

    /**
    * Creates view's frame.
    */
    private void make_frame() { setLayout(null); }

    /**
    * Creates event description field.
    */
    private void make_field_name()
    {
    // Makes label
    JLabel lbl_name = new JLabel("Ingrese Nombre:");
    lbl_name.setFont(new Font("Tahoma", Font.BOLD, 11));
    lbl_name.setBounds(29, 29, 134, 14);
    add(lbl_name);

    // Makes text field
    tf_name = new JTextField();
    tf_name.setBounds(190, 26, 196, 20);
    add(tf_name);
    tf_name.setColumns(10);
    }

    /**
    * Creates forward email field.
    */
    private void make_field_phoneNumber()
    {
    // Makes label
    JLabel lbl_phone = new JLabel("Ingrese Numero de Telefono:");
    lbl_phone.setFont(new Font("Tahoma", Font.BOLD, 11));
    lbl_phone.setBounds(29, 71, 200, 14);
    add(lbl_phone);

    // Makes text field
    tf_phoneNumber = new JTextField();
    tf_phoneNumber.setBounds(200, 68, 196, 20);
    add(tf_phoneNumber);
    tf_phoneNumber.setColumns(10);
    }

    private void make_field_address()
    {
    // Makes label
    JLabel lbl_address = new JLabel("Direccion:");
    lbl_address.setFont(new Font("Tahoma", Font.BOLD, 11));
    lbl_address.setBounds(29, 200, 78, 14);
    add(lbl_address);

    // Makes text field
    tf_address = new JTextField();
    tf_address.setBounds(169, 200, 150, 23);
    add(tf_address);
    tf_address.setColumns(10);
    }

    /**
    * Creates date field.
    */
    private void make_field_Date()
    {
    // Makes label
    JLabel lbl_date = new JLabel("Fecha de nacimiento:");
    lbl_date.setFont(new Font("Tahoma", Font.BOLD, 11));
    lbl_date.setBounds(29, 160, 250, 14);
    add(lbl_date);

    // Makes text field
    cb_day = new JComboBox();
    DefaultComboBoxModel dayModel = new DefaultComboBoxModel();
    cb_day.setBounds(169, 160, 60, 23);
        for (int i = 1; i < 31; i++) {
            dayModel.addElement(i);
        }
    cb_day.setModel(dayModel);
    
    cb_month=new JComboBox();
    DefaultComboBoxModel monthModel = new DefaultComboBoxModel();
    cb_month.setBounds(250, 160, 60, 23);
    monthModel.addElement("Jan");
    monthModel.addElement("Feb");
    monthModel.addElement("Mar");
    monthModel.addElement("Apr");
    monthModel.addElement("May");
    monthModel.addElement("Jun");
    monthModel.addElement("Jul");
    monthModel.addElement("Aug");
    monthModel.addElement("Sep");
    monthModel.addElement("Oct");
    monthModel.addElement("Nov");
    monthModel.addElement("Dec");
    cb_month.setModel(monthModel);
    
    cb_year=new JComboBox();
    DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
    yearModel.addElement("1991");
    yearModel.addElement("1992");
    yearModel.addElement("1993");
    yearModel.addElement("1994");
    yearModel.addElement("1995");
    yearModel.addElement("1996");
    yearModel.addElement("1997");
    yearModel.addElement("1998");
    yearModel.addElement("1999");
    yearModel.addElement("2000");
    yearModel.addElement("2001");
    yearModel.addElement("2002");
    yearModel.addElement("2003");
    yearModel.addElement("2004");
    yearModel.addElement("2005");
    yearModel.addElement("2006");
    yearModel.addElement("2007");
    yearModel.addElement("2008");
    cb_year.setBounds(350, 160, 60, 23);
    cb_year.setModel(yearModel);
    add(cb_day);
    add(cb_month);
    add(cb_year);
    }

    /**
    * Creates frequency field.
    */
    private void make_field_genre()
    {
    final ButtonGroup btng_genre = new ButtonGroup();

    // Frequency label
    JLabel lbl_genre = new JLabel("Género:");
    lbl_genre.setFont(new Font("Tahoma", Font.BOLD, 11));
    lbl_genre.setBounds(29, 119, 78, 14);
    add(lbl_genre);

    // masculino
    rbtn_male = new JRadioButton("masculino");
    btng_genre.add(rbtn_male);
    rbtn_male.setSelected(true);
    rbtn_male.setBounds(169, 116, 96, 20);
    add(rbtn_male);

    // femenino
    rbtn_female = new JRadioButton("femenino");
    btng_genre.add(rbtn_female);
    rbtn_female.setBounds(300, 116, 96, 20);
    add(rbtn_female);



    }

    /**
    * Creates alarm check box.
    */
    private void make_field_termsAndCond()
    {
    // Makes check box
    cbx_termsAndCond = new JCheckBox("Aceptar Terminos y Condiciones");
    cbx_termsAndCond.setBounds(29, 250, 300, 23);
    add(cbx_termsAndCond);
    }

    /**
    * Creates save button.
    */
    private void make_btn_save()
    {
    // Makes button
    JButton btn_save = new JButton("Registrar");
    btn_save.setBounds(127, 300, 89, 23);
    add(btn_save);

    // Add action listener
    btn_save.addActionListener(arg0 -> {
    Guest g = new Guest();

    g.setDay(cb_day.getSelectedItem().toString());
    g.setMonth(cb_month.getSelectedItem().toString());
    g.setYear(cb_year.getSelectedItem().toString());
    g.setName(tf_name.getText());
    g.setPhoneNumber(tf_phoneNumber.getText());
    g.setAddress(tf_address.getText());
    g.setAtc(cbx_termsAndCond.isSelected());

    if (rbtn_male.isSelected()) {
    g.setGenre(Genre.MASCULINO);
    } else {
    g.setGenre(Genre.FEMENINO);
    }
    newGuestController.addEvent(g);
    cleanFields();
    });
    }

    /**
    * Creates clear button.
    */
    private void make_btn_clean()
    {
    // Makes button
    JButton btn_clean = new JButton("Clean");
    btn_clean.setBounds(253, 300, 89, 23);
    add(btn_clean);

    // Add action listener
    btn_clean.addActionListener(arg0 -> cleanFields());
    }
    
}
