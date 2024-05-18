package oop.polymorphism.db_example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invoice {
    private long id;
    private LocalDate invoiceDate;
    private LocalDateTime createdAt;
    private String notes;
    private boolean status;
    private Customer customer;

    public Invoice() {
    }

    public Invoice(long id, LocalDate invoiceDate, LocalDateTime createdAt, String notes, boolean status, Customer customer) {
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.createdAt = createdAt;
        this.notes = notes;
        this.status = status;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
