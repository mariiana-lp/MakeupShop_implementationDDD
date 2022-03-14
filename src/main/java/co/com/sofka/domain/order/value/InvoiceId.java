package co.com.sofka.domain.order.value;

import co.com.sofka.domain.generic.Identity;

//ID de la entidad Fectura
public class InvoiceId extends Identity {
    private InvoiceId(String value){
        super(value);
    }

    public InvoiceId(){}
    public static InvoiceId of(String value) {
        return new InvoiceId(value);
    }
}
