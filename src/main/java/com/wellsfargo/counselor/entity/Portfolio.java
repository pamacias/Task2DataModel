package com.wellsfargo.counselor.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne(optional = false)
    @Column(nullable = false)
    private Client client;  //There is a one to many relationship from Client to Portfolios (mandatory one)

    protected Portfolio(){

    }

    public Portfolio(Date creationDate, Client client){
        this.creationDate = creationDate;
        this.client = client;
    }

    //Getters and Setters for Portfolio
    public long getPortfolioId() { return portfolioId; }

    public Date getCreationDate() { return creationDate; }
    public void setCreationDate(Date date) { this.creationDate = date; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }



}
