/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import org.apache.commons.mail.EmailException;

/**
 *
 * @author lenge
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws org.apache.commons.mail.EmailException
     */
    public static void main(String[] args) throws EmailException {
        // TODO code application logic here
        EmailJava email = new EmailJava();
        email.enviarEmail();
    
}
}
