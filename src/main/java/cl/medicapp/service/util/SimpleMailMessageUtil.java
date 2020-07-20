package cl.medicapp.service.util;

import org.springframework.mail.SimpleMailMessage;

/**
 * Clase util de emails
 */
public class SimpleMailMessageUtil {

    public static SimpleMailMessage build(String from, String to, String subject, String body) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        return simpleMailMessage;
    }

    /**
     * Constructor privado para no permitir crear instancias de la clase
     */
    private SimpleMailMessageUtil() {

    }

}
