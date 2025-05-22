package questao2.view;

import java.util.Scanner;

import questao2.controller.Dicionario;
import questao2.model.Morador;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		Morador m1 = new Morador(101, "Ana", "Honda Civic", "CIV123", "ABC-1234");
		Morador m2 = new Morador(102, "Bruno", "Toyota Corolla", "COR456", "DEF-5678");
		Morador m3 = new Morador(201, "Carla", "Ford Ka", "KA789", "GHI-9101");
		Morador m4 = new Morador(202, "Daniel", "Chevrolet Onix", "ONX321", "JKL-1121");
		Morador m5 = new Morador(301, "Eduarda", "Hyundai HB20", "HB20456", "MNO-3141");
		Morador m6 = new Morador(302, "Fábio", "Volkswagen Gol", "GOL147", "PQR-5161");
		Morador m7 = new Morador(401, "Gabriela", "Fiat Argo", "ARG852", "STU-7181");
		Morador m8 = new Morador(402, "Henrique", "Renault Kwid", "KWD369", "VWX-9201");
		Morador m9 = new Morador(501, "Isabela", "Nissan March", "MRC741", "YZA-1222");
		Morador m10 = new Morador(502, "João", "Peugeot 208", "PGT963", "BCD-3242");

		Dicionario dic = new Dicionario();
		dic.cadastrarMorador(m1);
		dic.cadastrarMorador(m2);
		dic.cadastrarMorador(m3);
		dic.cadastrarMorador(m4);
		dic.cadastrarMorador(m5);
		dic.cadastrarMorador(m6);
		dic.cadastrarMorador(m7);
		dic.cadastrarMorador(m8);
		dic.cadastrarMorador(m9);
		dic.cadastrarMorador(m10);
		
		while(true) {
			System.out.println("Nome");
			String nome = sc.nextLine();
			System.out.println("Aprtameento");
			int apart = sc.nextInt();
			sc.nextLine();
			Morador mP = new Morador(apart,nome);
			Morador encontrado = dic.consultarMorador(mP);
			System.out.println(encontrado.getModeloDoCarro());
			System.out.println();
			System.out.println("Apagar?");
			boolean apag = sc.nextBoolean();
		    sc.nextLine();
			if(apag) {
				dic.excluirMorador(encontrado);
			}else {
				System.out.println("Não removido");
			}
		}
	}
}
