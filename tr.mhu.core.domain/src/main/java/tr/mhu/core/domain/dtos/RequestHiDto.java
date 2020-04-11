package tr.mhu.core.domain.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author muludag on 5.01.2020
 */
@Data
public class RequestHiDto {
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String message;
}
