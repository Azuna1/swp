package swp.portal.beans;

import com.vaadin.cdi.annotation.VaadinSessionScoped;

import swp.entity.impl.Geraet;
import swp.usecase.impl.GeraeteManager;

/**
 * Data provider bean scoped for each user session.
 */
@VaadinSessionScoped
public class MessageBean {

    private int counter;
    /**
     * Gets message data.
     *
     * @return a message
     */
    public String getMessage() {
        return new StringBuilder("Message requested ").append(++counter).append(" times.").toString();
    }
    
	
    
}