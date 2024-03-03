package view;
import controller.DistroController;

public class Principal {
	public static void main (String[] args) {
		DistroController dist = new DistroController();
		String os = dist.os();
		
		if (os.contains("Linux")) {
			String param = "cat /etc/os-release";
			dist.exibeDistro(param);
		} else {
			System.out.println("Seu sistema operacional não é compatível com a aplicação.");
		}
	}
}