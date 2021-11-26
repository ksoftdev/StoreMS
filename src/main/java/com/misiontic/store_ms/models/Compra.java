package com.misiontic.store_ms.models;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Compra {

    @Id
    private String id;
    private Date fecha;
    private Float total;
    private String accountId;
    private List<String> items;

    public Compra(String id, Date fecha, Float total, String accountId, List<String> items) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.accountId = accountId;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}