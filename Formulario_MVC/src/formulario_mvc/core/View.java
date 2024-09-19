/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.core;

/**
 *
 * @author USUARIO
 */
public interface View {
    
    /**
     * Defines what to do when a model notifies it of changes.
     *
     * @param model Model that triggered the update
     * @param data Data sent by this model
     */
    void update(Model model, Object data);
    
}
