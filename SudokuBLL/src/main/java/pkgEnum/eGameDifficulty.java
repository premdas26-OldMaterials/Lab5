package pkgEnum;

import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficulty;
	private static Map<Integer,eGameDifficulty> lookup;
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int num) {
		eGameDifficulty eGDval = null;
		for(eGameDifficulty eGD: eGameDifficulty.values()) {
			if(eGD.iDifficulty <= num) {
				eGDval = eGD;
			}
		}
		return eGDval;
	}
	
}
