package kg.kim.order.kafka;



import kg.kim.order.customer.CustomerResponse;
import kg.kim.order.order.PaymentMethod;
import kg.kim.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
