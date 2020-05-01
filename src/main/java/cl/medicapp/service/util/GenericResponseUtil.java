package cl.medicapp.service.util;

import cl.medicapp.service.dto.GenericResponseDto;
import cl.medicapp.service.exception.GenericException;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public class GenericResponseUtil {

    private GenericResponseUtil() {

    }

    public static GenericResponseDto buildGenericResponse(String message, String... details) {
        return GenericResponseDto.builder()
                .message(message)
                .details(Arrays.asList(details))
                .build();
    }

    public static GenericException buildGenericException(int statusCode, String message, String... details) {
        return new GenericException(statusCode, message, Arrays.asList(details));
    }

    public static GenericException getGenericException() {
        return new GenericException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
    }

}