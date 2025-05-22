package questao3.view;

import questao3.controller.Dicionario;
import questao3.model.BarraDeChocolate;

public class Principal {
	public static void main(String[] args) throws Exception {
		BarraDeChocolate b1 = new BarraDeChocolate(5, 3, 49);   // 60 cm³ → Bombom  
		BarraDeChocolate b2 = new BarraDeChocolate(1, 2, 5);  // 110 cm³ → Pavê  
		BarraDeChocolate b3 = new BarraDeChocolate(1, 3, 5);  // 150 cm³ → Brigadeiro  
		BarraDeChocolate b4 = new BarraDeChocolate(2, 4, 6);  // 160 cm³ → Brigadeiro  
		BarraDeChocolate b5 = new BarraDeChocolate(1, 2, 24);  // 44 cm³ → Fora da faixa  
		BarraDeChocolate b6 = new BarraDeChocolate(12, 43, 4);  // 208 cm³ → Bolo  
		BarraDeChocolate b7 = new BarraDeChocolate(1, 4, 5);  // 300 cm³ → Acima da faixa  
		BarraDeChocolate b8 = new BarraDeChocolate(1, 2, 6);  // 120 cm³ → Fora da faixa  
		BarraDeChocolate b9 = new BarraDeChocolate(3, 24, 5);  // 100 cm³ → Pavê  
		BarraDeChocolate b10 = new BarraDeChocolate(14, 5, 4); // 280 cm³ → Ovo de Páscoa  

		Dicionario dic = new Dicionario();
		dic.adicionarDocinho(b1);
		dic.adicionarDocinho(b2);
		dic.adicionarDocinho(b3);
		dic.adicionarDocinho(b4);
		dic.adicionarDocinho(b5);
		dic.adicionarDocinho(b6);
		dic.adicionarDocinho(b7);
		dic.adicionarDocinho(b8);
		dic.adicionarDocinho(b9);
		dic.adicionarDocinho(b10);
		
		dic.verificarDocinhos();
	}
}
