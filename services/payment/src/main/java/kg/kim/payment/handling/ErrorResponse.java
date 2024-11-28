package kg.kim.payment.handling;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}