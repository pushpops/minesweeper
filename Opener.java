public class Opener {
	Masu [][] masu;
	int i;
	int j;
	Opener(Masu [][] masu,int i,int j,int dif){
		this.masu = masu;
		this.i=i;
		this.j=j;

		if(i==0){ //上端の時
			if(j==0){ //左上の時
				System.out.println("左上");
				if(masu[i+1][j].ban.ban[i+1][j]==0)
					masu[i+1][j].button.setIcon(null);
				if(masu[i][j+1].ban.ban[i][j+1]==0)
					masu[i][j+1].button.setIcon(null);
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0)
					masu[i+1][j+1].button.setIcon(null);
			}else if (j==dif-1){ //右上の時
				System.out.println("右上");
				if(masu[i][j-1].ban.ban[i][j-1]==0)
					masu[i][j-1].button.setIcon(null);
				if(masu[i+1][j-1].ban.ban[i+1][j-1]==0)
					masu[i+1][j-1].button.setIcon(null);
				if(masu[i+1][j].ban.ban[i+1][j]==0)
					masu[i+1][j].button.setIcon(null);
			}else{ //その他の時
				System.out.println("上端その他");
				if(masu[i][j-1].ban.ban[i][j-1]==0)
					masu[i][j-1].button.setIcon(null);
				if(masu[i+1][j-1].ban.ban[i+1][j-1]==0)
					masu[i+1][j-1].button.setIcon(null);
				if(masu[i+1][j].ban.ban[i+1][j]==0)
					masu[i+1][j].button.setIcon(null);
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0)
					masu[i+1][j+1].button.setIcon(null);
				if(masu[i][j+1].ban.ban[i][j+1]==0)
					masu[i][j+1].button.setIcon(null);
			}
		}else if(j==0){ //左端の時
			if(i==dif-1){ //左下の時
				System.out.println("左下");
				if(masu[i-1][j].ban.ban[i-1][j]==0)
					masu[i-1][j].button.setIcon(null);
				if(masu[i-1][j+1].ban.ban[i-1][j+1]==0)
					masu[i-1][j+1].button.setIcon(null);
				if(masu[i][j+1].ban.ban[i][j+1]==0)
					masu[i][j+1].button.setIcon(null);
			}else{ //その他の時
				System.out.println("左端その他");
				if(masu[i-1][j].ban.ban[i-1][j]==0)
					masu[i-1][j].button.setIcon(null);
				if(masu[i-1][j+1].ban.ban[i-1][j+1]==0)
					masu[i-1][j+1].button.setIcon(null);
				if(masu[i][j+1].ban.ban[i][j+1]==0)
					masu[i][j+1].button.setIcon(null);
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0)
					masu[i+1][j+1].button.setIcon(null);
				if(masu[i+1][j].ban.ban[i+1][j]==0)
					masu[i+1][j].button.setIcon(null);
			}
		}else if(i==dif-1 && j==dif-1){ //右下の時
			System.out.println("右下");
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0)
				masu[i-1][j-1].button.setIcon(null);
			if(masu[i-1][j].ban.ban[i-1][j]==0)
				masu[i-1][j].button.setIcon(null);
			if(masu[i][j-1].ban.ban[i][j-1]==0)
				masu[i][j-1].button.setIcon(null);
		}else if(i==dif-1){ //下端の時
			System.out.println("下端");
			if(masu[i][j-1].ban.ban[i][j-1]==0)
				masu[i][j-1].button.setIcon(null);
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0)
				masu[i-1][j-1].button.setIcon(null);
			if(masu[i-1][j].ban.ban[i-1][j]==0)
				masu[i-1][j].button.setIcon(null);
			if(masu[i-1][j+1].ban.ban[i-1][j+1]==0)
				masu[i-1][j+1].button.setIcon(null);
			if(masu[i][j+1].ban.ban[i][j+1]==0)
				masu[i][j+1].button.setIcon(null);
		}else if(j==dif-1){ //右端の時
			System.out.println("右端");
			if(masu[i-1][j].ban.ban[i-1][j]==0)
				masu[i-1][j].button.setIcon(null);
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0)
				masu[i-1][j-1].button.setIcon(null);
			if(masu[i][j-1].ban.ban[i][j-1]==0)
				masu[i][j-1].button.setIcon(null);
			if(masu[i+1][j-1].ban.ban[i+1][j-1]==0)
				masu[i+1][j-1].button.setIcon(null);
			if(masu[i+1][j].ban.ban[i+1][j]==0)
				masu[i+1][j].button.setIcon(null);
		}else{ //真ん中の時
			System.out.println("真ん中");
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0);
				masu[i-1][j-1].button.setIcon(null);
			if(masu[i-1][j].ban.ban[i-1][j]==0)
				masu[i-1][j].button.setIcon(null);
			if(masu[i-1][j+1].ban.ban[i-1][j+1]==0)
				masu[i-1][j+1].button.setIcon(null);
			if(masu[i][j-1].ban.ban[i][j-1]==0)
				masu[i][j-1].button.setIcon(null);
			if(masu[i][j+1].ban.ban[i][j+1]==0)
				masu[i][j+1].button.setIcon(null);
			if(masu[i+1][j-1].ban.ban[i+1][j-1]==0)
				masu[i+1][j-1].button.setIcon(null);
			if(masu[i+1][j].ban.ban[i+1][j]==0)
				masu[i+1][j].button.setIcon(null);
			if(masu[i+1][j+1].ban.ban[i+1][j+1]==0)
				masu[i+1][j+1].button.setIcon(null);
		}
	}
} 
