package kg.kim.order.handling;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
