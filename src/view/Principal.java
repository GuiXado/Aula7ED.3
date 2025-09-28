package view;

import br.gui.filagenerica.Fila;
import model.Processo;
import controller.EscalonadorController;

public class Principal {

	public static void main(String[] args) {
		Fila<Processo> p = new Fila<>();
		EscalonadorController ec = new EscalonadorController();
		
		p.insert(new Processo("notepad.exe", 14));
		p.insert(new Processo("write.exe", 35));
		p.insert(new Processo("chrome.exe", 27));
		p.insert(new Processo("acrobat.exe", 52));
		p.insert(new Processo("firefox.exe", 18));
		p.insert(new Processo("word.exe", 25));

		ec.escalonador(p);
		
	}

}
