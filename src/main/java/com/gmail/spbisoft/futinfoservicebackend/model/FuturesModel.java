package com.gmail.spbisoft.futinfoservicebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FuturesModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "futures_group")
    private String futuresGroup;
    @Column(name = "futures_margin")
    private int futuresMargin;
    @Column(name = "futures_name")
    private String futuresName;
    @Column(name = "futures_symbol")
    private String futuresSymbol;

    public FuturesModel() {
    }

    public FuturesModel(String futuresGroup, int futuresMargin, String futuresName, String futuresSymbol) {
        this.futuresGroup = futuresGroup;
        this.futuresMargin = futuresMargin;
        this.futuresName = futuresName;
        this.futuresSymbol = futuresSymbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuturesGroup() {
        return futuresGroup;
    }

    public void setFuturesGroup(String futuresGroup) {
        this.futuresGroup = futuresGroup;
    }

    public int getFuturesMargin() {
        return futuresMargin;
    }

    public void setFuturesMargin(int futuresMargin) {
        this.futuresMargin = futuresMargin;
    }

    public String getFuturesName() {
        return futuresName;
    }

    public void setFuturesName(String futuresName) {
        this.futuresName = futuresName;
    }

    public String getFuturesSymbol() {
        return futuresSymbol;
    }

    public void setFuturesSymbol(String futuresSymbol) {
        this.futuresSymbol = futuresSymbol;
    }
}
