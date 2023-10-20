package com.dio.robostrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Robo {
  private Comportamento strategy;

  @Autowired
  public Robo(Comportamento strategy) {
    this.strategy = strategy;
  }

  public void mover() {
    strategy.mover();
  }

  public void setStrategy(Comportamento strategy) {
    this.strategy = strategy;
  }

}
