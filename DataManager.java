import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<PaymentRecord> paymentRecords;

    public DataManager() {
        paymentRecords = new ArrayList<>();
    }

    public void addPaymentRecord(PaymentRecord record) {
        paymentRecords.add(record);
    }

    public List<PaymentRecord> getPaymentRecords() {
        return paymentRecords;
    }

    public void removePaymentRecord(PaymentRecord record) {
        paymentRecords.remove(record);
    }
}