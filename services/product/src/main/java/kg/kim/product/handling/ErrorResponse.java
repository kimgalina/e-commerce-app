package kg.kim.product.handling;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}