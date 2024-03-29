package lk.ijse.dep11.pos.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private String id;
    private String name;
    private String address;

    @Override
    public String toString() {
        return id;
    }
}
