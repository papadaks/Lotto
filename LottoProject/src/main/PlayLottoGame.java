package main;
import java.util.Scanner;

import domain.LottoService;

public class PlayLottoGame {
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ�Ƽ�� �� ���� �����Ͻðھ��?");
		int ticketCounts = sc.nextInt();
		Client client = new Client(ticketCounts);			
		LottoService lottoService = new LottoService();				
		client.setLottoTickets(lottoService);
		
		lottoService.setLottoNumbers(lottoService.generateRandomNumbers());
		
		client.checkLottoNumbers(lottoService.getLottoNumbers());
		client.showResult();
	}
}
