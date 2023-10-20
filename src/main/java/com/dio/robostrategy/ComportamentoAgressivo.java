package com.dio.robostrategy;

import org.springframework.stereotype.Component;

@Component
public class ComportamentoAgressivo implements Comportamento {
  @Override
  public void mover() {
    System.out.println("Movendo-se agressivamente...");
  }
}
