package main;

public class Application {
	public static void main(String[] args) {

		/*
		 * 1. Client가 희망하면 여러 개의 로또번호를 받을 수 있도록 수정 
		 * 2. Score를 알 수 있는 함수를 따로 만들기 
		 */
		
		PlayLottoGame pl = new PlayLottoGame();
		pl.start();		
	}
}
