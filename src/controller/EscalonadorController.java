package controller;

import br.gui.filagenerica.*;
import model.Processo;

public class EscalonadorController {
	
	public void escalonador(Fila<Processo> fila) {
		Processo a;
		while (!fila.isEmpty()) {
			try {
				a = fila.remove();
				if (a.QtdRetornos > 1 ) {
					a.QtdRetornos --;
					fila.insert(a);
				} else {
					System.out.println(a.nome + " finalizado.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
