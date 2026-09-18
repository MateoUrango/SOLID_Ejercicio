public class DiscountController {
    public Discount getDiscount(Order order) {
        if (order.getTipoCliente().equals("VIP")) {
            return new VipDiscount();
        } else if (order.getTipoCliente().equals("EMPLEADO")) {
            return new EmployeeDiscount();
        }
        return new RegularDiscount();
    }
}