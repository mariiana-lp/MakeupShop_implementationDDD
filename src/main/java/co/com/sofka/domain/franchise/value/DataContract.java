package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.generic.ValueObject;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Objects;

public class DataContract implements ValueObject<DataContract.Props> {
    private final LocalDate startDate;
    private final LocalDate endDate;
    public final String acuerdos;

    public DataContract(LocalDate startDate, LocalDate endDate, String acuerdos){
        Objects.requireNonNull(this.startDate = startDate);
        Objects.requireNonNull(this.endDate = endDate);
        this.acuerdos = Objects.requireNonNull(acuerdos);
        if(this.acuerdos.length()<20){
            throw new IllegalArgumentException("Debe especificar sus acuerdos en mas de 20 caracteres");
        }
    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public LocalDate starDate() {
                return startDate;
            }

            @Override
            public LocalDate endDate() {
                return endDate;
            }

            @Override
            public String  acuerdos() {
                return acuerdos;
            }
        };
    }

    public interface Props{
        LocalDate starDate();
        LocalDate endDate();
        String acuerdos();
    }

}
