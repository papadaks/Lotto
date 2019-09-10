package domain;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoService {

	private Set<Integer> lottoNumbers;
	private static final int LOTTO_NUMBERS_SIZE = 6; 
	
	public static int generateRandomNumbers_TEST(){
		Random rand = new Random();		
		return rand.nextInt(44)+1;  // 1���� 45������ ���� 
	}
	
	// ���� �����	
	public Set<Integer> generateRandomNumbers(){		
		Set<Integer> temp = new HashSet<>();
		int currentRound =1;
		Random rand = new Random();
		
		while(currentRound <= LOTTO_NUMBERS_SIZE) {
			temp.add(rand.nextInt(44)+1);			
			if(validateRandomNumbers(temp, currentRound)) {
				currentRound++;			
			}		
		}				
		return temp;
	}
	
	public void setLottoNumbers(Set<Integer> lottoNumbers) {
		this.lottoNumbers = lottoNumbers;
	}
	
	public Set<Integer> getLottoNumbers(){
		return this.lottoNumbers;
	}
	
	// ���� �����ϱ�
	public boolean validateRandomNumbers(Set<Integer> lottoNumbers, int round) {		
		if(round == lottoNumbers.size()) return true;			
		return false;
	}			
}