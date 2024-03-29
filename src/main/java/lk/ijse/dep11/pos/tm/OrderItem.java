package lk.ijse.dep11.pos.tm;


import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;
    private JFXButton btnDelete;

    public BigDecimal getTotal() {
        return unitPrice.multiply(new BigDecimal(qty)).setScale(2);
    }
}
