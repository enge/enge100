/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author lenge
 */
public class EmailJava {

    public EmailJava() {
        
    }
        public void enviarEmail() throws EmailException{
        
Email email = new SimpleEmail();
email.setHostName("mail.enge10.com");
email.setSmtpPort(25);
//email.setAuthenticator(new DefaultAuthenticator("username", "password"));
email.setAuthentication("enge10","30303030");
email.setSSLOnConnect(true);
email.setFrom("lenge@okibrasil.com");
email.setSubject("TestMail");
email.setMsg("This is a test mail ... :-)");
email.addTo("lenge@okibrasil.com");
email.send();

    }
       
}

     
    

