package com.restraunt.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * This is the RestrauntTable entity, used to represent the tables inside of the database.
 */
@Entity
public class RestaurantTable {
  @Id
  private Integer id;
  private Integer capacity;

  public RestaurantTable(Integer id, Integer capacity) {
    this.id = id;
    this.capacity = capacity;
  }

  public RestaurantTable() {

  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }
}
