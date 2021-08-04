import java.util.Set;

public class ThreadExemplo {	

	public static void main(String[] args) {
		BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
		BarraDeCarregamento3 barraDeCarregamento33 = new BarraDeCarregamento3();
		BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();
		BarraDeCarregamento4 barraDeCarregamento4 = new BarraDeCarregamento4();
		GerarPdf gerarPdf = new GerarPdf();
		CarregamentoCompleto carregamentoCompleto = new CarregamentoCompleto();		
		
		barraDeCarregamento2.start();
		barraDeCarregamento33.start();
		gerarPdf.run();
		barraDeCarregamento4.start();
		barraDeCarregamento.run();
		carregamentoCompleto.run();
		
		
				
	}
}

class GerarPdf implements Runnable {
	public void run() {
		System.out.println("Processando pagamento");
	}
}	

class BarraDeCarregamento implements Runnable {
		public void run( ) { 
			try {
				Thread.sleep(2000);
				System.out.println("Loading... ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}


class BarraDeCarregamento2 extends Thread {
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(3000);
			System.out.println("35% do processamento : " + this.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class BarraDeCarregamento3 extends Thread {
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(5000);
			System.out.println("75% do processamento : " + this.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BarraDeCarregamento4 extends Thread {
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(7000);
			System.out.println("100% processado : " + this.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class CarregamentoCompleto extends Thread {
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(9000);
			System.out.println("--- Pagamento Concluido --- : " + this.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
