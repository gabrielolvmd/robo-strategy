package com.dio.robostrategy;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoboStrategyApplication {

	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo(agressivo);
		robo.mover();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);

	}

}
