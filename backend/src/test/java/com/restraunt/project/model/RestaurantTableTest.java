package com.restraunt.project.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTableTest {

  /**
   * Test 1 Test for constructor RestaurantTableClass.
   */
  @Test
  public void testConstructor() {
    RestaurantTable restaurantTable = new RestaurantTable(1,2);
    assertEquals(1, restaurantTable.getId());
    assertEquals(2, restaurantTable.getCapacity());
  }

  /**
   * Test 2 Test for getters,setters and blank constructor in RestaurantTableClass.
   */
  @Test
  public void testGettersAndSetters() {
    RestaurantTable restaurantTable = new RestaurantTable();
    restaurantTable.setId(1);
    restaurantTable.setCapacity(2);
    assertEquals(1, restaurantTable.getId());
    assertEquals(2,restaurantTable.getCapacity());
  }
}
