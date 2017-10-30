package com.tb.model;

import java.util.Date;

/**
 * Created by okancetin on 29/10/17.
 */


public class Sales {

    private long id;
    private String provider;
    private Integer piece;
    private String saleDate;

    public Sales(){
        id=0;
    }

    public Sales(long id, String provider, Integer piece, String saleDate){
        this.id = id;
        this.provider = provider;
        this.piece = piece;
        this.saleDate = saleDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Sales [id=" + id + ", provider=" + provider + ", piece=" + piece
                + ", saleDate=" + saleDate + "]";
    }
}
