package cl.medicapp.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Dto generico para respuestas, incluye mensaje y detalles
 */
@Builder
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponseDto {

    /**
     * Mensaje
     */
    private String message;

    /**
     * Detalles
     */
    private List<String> details;
}