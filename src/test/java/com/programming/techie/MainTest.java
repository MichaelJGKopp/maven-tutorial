package com.programming.techie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void main() {
    assertTrue(Main.alwaysTrue());
  }

  @Test
  void alwaysTrue() {
    assertTrue(Main.alwaysTrue());
  }
}