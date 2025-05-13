public class PaymentDTO {
    
    private String paymentId;
    private String paymentMethodCode;
    
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }
    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    @Override
    public String toString() {
        return "PaymentDTO [paymentId=" + paymentId + ", paymentMethodCode=" + paymentMethodCode + "]";
    }
    
}
