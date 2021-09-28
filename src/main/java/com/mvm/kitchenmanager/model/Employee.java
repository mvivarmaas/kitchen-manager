package com.mvm.kitchenmanager.model;

public class Employee {
    private Role role;
    private Double hourlyRate;
    String name;

    public Employee(Role role, Double hourlyRate, String name) {
        this.role = role;
        this.hourlyRate = hourlyRate;
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
