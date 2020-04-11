package tr.mhu.core.domain.entites;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.beans.Transient;
import java.lang.annotation.Annotation;

/**
 * @author muludag on 5.01.2020
 */
@Entity
@Data
@Table(name = "hi")
public class Hi implements Transient {

    @Id
    @NotNull
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Length(max = 36)
    @Column(name = "oid", nullable = false)
    private String oid;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;

    @NotEmpty
    @Column(name = "email", nullable = false)
    private String email;

    @NotEmpty
    @Column(name = "message", nullable = false)
    private String message;

    @Override
    public boolean value() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
