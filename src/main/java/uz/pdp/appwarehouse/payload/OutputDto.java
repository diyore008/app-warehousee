package uz.pdp.appwarehouse.payload;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class OutputDto {
    private Timestamp date;
    private Integer warehouseId;
    private Integer clientId;
    private String factureNumber;
    private String code;
}
