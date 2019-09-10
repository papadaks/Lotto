package main;

import java.util.ArrayList;
import java.util.Set;

import domain.LottoService;

public class Client {	
	private int score;
	private int ticketCounts;
	private Set<Integer> lottoNumbers;
	private ArrayList<Set> lottoNumbersArr; 
	
	public Client(int ticketCounts) {
		this.score=0; 
		this.ticketCounts = ticketCounts;
		this.lottoNumbersArr = new ArrayList<>();
	}
	
	public Set<Integer> getLottoNumbers() {
		return lottoNumbers;
	}
	
	public void setLottoNumbers(Set<Integer> lottoNumbers) {		//
		lottoNumbersArr.add(lottoNumbers);
	}
		
	public void setLottoTickets(LottoService lottoService) {
		if(this.ticketCounts == 0) {
			System.out.println("Ƽ���� �����ϴ�.");
			return;
		}
			
		System.out.println("�ζ�Ƽ���� �����մϴ�.");
		int settingType=0;
		while(ticketCounts-- > 0) {
			System.out.println("���������� 0��, �ڵ������� 1�� �Է����ּ���");					
			this.setLottoNumbers(lottoService.generateRandomNumbers());
		}		
	}
	
	public void checkLottoNumbers(Set<Integer> lottoNumbers) {		
		for(int i=0;i < this.lottoNumbersArr.size();i++) {
			Set<Integer> tempSet = this.lottoNumbersArr.get(i);
			int score=0;
			for (int temp : tempSet) {			
				if(lottoNumbers.contains(temp)) {
					score++;
				}			
			}
			this.score = Math.max(this.score, score);
		}						
		
		System.out.println("Lotto:"+ lottoNumbers);
		
	}		
	
	public int showResult() {				
		System.out.println("Client:");		
		for(int i=0;i < this.lottoNumbersArr.size();i++) {
			System.out.println(this.lottoNumbersArr.get(i).toString());
		}		
		System.out.println("Score!! " + this.score);
		return this.score;
	}
}
