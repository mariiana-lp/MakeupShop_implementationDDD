package co.com.sofka.domain.order;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.order.value.Date;
import co.com.sofka.domain.order.value.InvoiceId;
import co.com.sofka.domain.order.value.Price;




//Entidad factura del agregado Pedido
public class Invoice extends Entity<InvoiceId> {
    private Date fecha;
    private Price precioTotal;

    public Invoice(InvoiceId entityId, Date fecha, Price precioTotal) {
        super(entityId);
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }

    public Date Fecha() {
        return fecha;
    }

    public Price PrecioTotal() {
        return precioTotal;
    }
}
