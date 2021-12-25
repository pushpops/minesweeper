import java.util.Random;
public class Ban {
	int [][] ban;
	int [][] bomb;
	int dif;
	int count;
	Ban(int difficulty){
		dif = difficulty;
		bomb = new int[dif][dif];
		ban = new int[dif][dif];
		//爆弾の生成
		Random rand = new Random();
		for(int i=0; i < dif*2 ; i++){
   			bomb[rand.nextInt((dif))][rand.nextInt((dif))] = 1;
		}
		for(int i=0; i < dif; i++){
			for(int j=0; j < dif; j++){
				if(i==0){
					if(j==0){
						ban[i][j]=(bomb[i+1][j]+bomb[i][j+1]+bomb[i+1][j+1]);
					}else if (j==dif-1){
						ban[i][j]=(bomb[i][j-1]+bomb[i+1][j-1]+bomb[i+1][j]);
					}else{
						ban[i][j]=(bomb[i][j-1]+bomb[i+1][j-1]+bomb[i+1][j]+bomb[i+1][j+1]+bomb[i][j+1]);
					}
				}else if(j==0){
					if(i==dif-1){
						ban[i][j]=(bomb[i-1][j]+bomb[i-1][j+1]+bomb[i][j+1]);
					}else{
						ban[i][j]=(bomb[i-1][j]+bomb[i-1][j+1]+bomb[i][j+1]+bomb[i+1][j+1]+bomb[i+1][j]);
					}
				}else if (i==dif-1 && j==dif-1){
					ban[i][j]=(bomb[i-1][j-1]+bomb[i-1][j]+bomb[i][j-1]);
				}else if(i==dif-1){
					ban[i][j]=(bomb[i][j-1]+bomb[i-1][j-1]+bomb[i-1][j]+bomb[i-1][j+1]+bomb[i][j+1]);
				}else if(j==dif-1){
					ban[i][j]=(bomb[i-1][j]+bomb[i-1][j-1]+bomb[i][j-1]+bomb[i+1][j-1]+bomb[i+1][j]);
				}else{
					ban[i][j]=(bomb[i-1][j-1]+bomb[i-1][j]+bomb[i-1][j+1]+bomb[i][j-1]+bomb[i][j+1]+bomb[i+1][j-1]+bomb[i+1][j]+bomb[i+1][j+1]);
				}
			}
		}
		for(int i=0; i < dif; i++){
			for(int j=0; j < dif; j++){
				if(bomb[i][j]==1){
					ban[i][j]=9;
					count += 1;
				}
			}
		}
	}

	int numOfBomb(){
		return count;
	}

	void print(){
		for(int i=0; i < dif; i++){
			for(int j = 0; j < dif; j++){
				System.out.print(ban[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args){
		Ban ban = new Ban(5);
		ban.print();
		
	}
} 
