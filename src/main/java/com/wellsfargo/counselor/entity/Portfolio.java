package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private long clientID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int riskFactor;

    @Column(nullable = false)
    private int total;

    public Portfolio(String name, int riskFactor, int total){
        this.name = name;
        this.riskFactor = riskFactor;
        this.total = total;

    }

    public long getPortfolioId(){
        return portfolioId;
    }

    public long getClientId(){
        return clientID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRiskFactor(){
        return riskFactor;
    }

    public void setRiskFactor(int riskFactor){
        this.riskFactor = riskFactor;
    }

    public int getTotal(){
        return total;
    }


    
}
