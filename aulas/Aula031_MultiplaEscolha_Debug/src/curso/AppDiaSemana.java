package curso;

public class AppDiaSemana {

	public static void main(String[] args) {

		int dia = 5;
		String diaString;

		switch (dia) {
		case 1: {
			diaString = "Segunda-feira";
			break;
		}
		case 2:
			diaString = "Terça-feira";
			break;
		case 3:
			diaString = "Quarta-feira";
			break;
		case 4:
			diaString = "Quinta-feira";
			break;
		case 5:
			diaString = "Sexta-feira";
			break;
		case 6:
			diaString = "Sábado";
			break;
		case 7:
			diaString = "Domingo";
			break;
		default:
			diaString = "Dia inválido";
		} //fim switch

		System.out.println(diaString);

	}

}
