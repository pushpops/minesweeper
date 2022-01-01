public class Opener {
	Masu [][] masu;
	int dif;
	Opener(Masu [][] masu,int dif){
		this.masu = masu;
		this.dif = dif;
	}

	void open(int i, int j){
		// System.out.println("in open");
		if(i==0){ //上端の時
			// System.out.println("上端");
			if(j==0){ //左上の時
				// System.out.println("左上");
				if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
					masu[i+1][j].button.setIcon(null);
					masu[i+1][j].open=true;
					open(i+1,j);
				}
				if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
					masu[i][j+1].button.setIcon(null);
					masu[i][j+1].open=true;
					open(i,j+1);
				}
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0 && masu[i+1][j+1].open==false){
					masu[i+1][j+1].button.setIcon(null);
					masu[i+1][j+1].open=true;
					open(i+1,j+1);
				}
			}else if (j==dif-1){ //右上の時
				// System.out.println("右上");
				if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
					masu[i][j-1].button.setIcon(null);
					masu[i][j-1].open=true;
					open(i,j-1);
				}
				if(masu[i+1][j-1].ban.ban[i+1][j-1]==0 && masu[i+1][j-1].open==false){
					masu[i+1][j-1].button.setIcon(null);
					masu[i+1][j-1].open=true;
					open(i+1,j-1);
				}
				if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
					masu[i+1][j].button.setIcon(null);
					masu[i+1][j].open=true;
					open(i+1,j);
				}
			}else{ //その他の時
				// System.out.println("真ん中");
				if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
					masu[i][j-1].button.setIcon(null);
					masu[i][j-1].open=true;
					open(i,j-1);
				}
				if(masu[i+1][j-1].ban.ban[i+1][j-1]==0 && masu[i+1][j-1].open==false){
					masu[i+1][j-1].button.setIcon(null);
					masu[i+1][j-1].open=true;
					open(i+1,j-1);
				}
				if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
					masu[i+1][j].button.setIcon(null);
					masu[i+1][j].open=true;
					open(i+1,j);
				}
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0 && masu[i+1][j+1].open==false){
					masu[i+1][j+1].button.setIcon(null);
					masu[i+1][j+1].open=true;
					open(i+1,j+1);
				}
				if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
					masu[i][j+1].button.setIcon(null);
					masu[i][j+1].open=true;
					open(i,j+1);
				}
			}
		}else if(j==0){ //左端の時
			// System.out.println("左端");
			if(i==dif-1){ //左下の時
				// System.out.println("左下");
				if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
					masu[i-1][j].button.setIcon(null);
					masu[i-1][j].open=true;
					open(i-1,j);
				}
				if(masu[i-1][j+1].ban.ban[i-1][j+1]==0 && masu[i-1][j+1].open==false){
					masu[i-1][j+1].button.setIcon(null);
					masu[i-1][j+1].open=true;
					open(i-1,j+1);
				}
				if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
					masu[i][j+1].button.setIcon(null);
					masu[i][j+1].open=true;
					open(i,j+1);
				}
			}else{ //その他の時
				// System.out.println("真ん中");
				if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
					masu[i-1][j].button.setIcon(null);
					masu[i-1][j].open=true;
					open(i-1,j);
				}
				if(masu[i-1][j+1].ban.ban[i-1][j+1]==0 && masu[i-1][j+1].open==false){
					masu[i-1][j+1].button.setIcon(null);
					masu[i-1][j+1].open=true;
					open(i-1,j+1);
				}
				if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
					masu[i][j+1].button.setIcon(null);
					masu[i][j+1].open=true;
					open(i,j+1);
				}
				if(masu[i+1][j+1].ban.ban[i+1][j+1]==0 && masu[i+1][j+1].open==false){
					masu[i+1][j+1].button.setIcon(null);
					masu[i+1][j+1].open=true;
					open(i+1,j+1);
				}
				if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
					masu[i+1][j].button.setIcon(null);
					masu[i+1][j].open=true;
					open(i+1,j);
				}
			}
		}else if(i==dif-1 && j==dif-1){ //右下の時
			// System.out.println("右下");
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0 && masu[i-1][j-1].open==false){
				masu[i-1][j-1].button.setIcon(null);
				masu[i-1][j-1].open=true;
				open(i-1,j-1);
			}
			if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
				masu[i-1][j].button.setIcon(null);
				masu[i-1][j].open=true;
				open(i-1,j);
			}
			if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
				masu[i][j-1].button.setIcon(null);
				masu[i][j-1].open=true;
				open(i,j-1);
			}
		}else if(i==dif-1){ //下端の時
			// System.out.println("下端真ん中");
			if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
				masu[i][j-1].button.setIcon(null);
				masu[i][j-1].open=true;
				open(i,j-1);
			}
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0 && masu[i-1][j-1].open==false){
				masu[i-1][j-1].button.setIcon(null);
				masu[i-1][j-1].open=true;
				open(i-1,j-1);
			}
			if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
				masu[i-1][j].button.setIcon(null);
				masu[i-1][j].open=true;
				open(i-1,j);
			}
			if(masu[i-1][j+1].ban.ban[i-1][j+1]==0 && masu[i-1][j+1].open==false){
				masu[i-1][j+1].button.setIcon(null);
				masu[i-1][j+1].open=true;
				open(i-1,j+1);
			}
			if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
				masu[i][j+1].button.setIcon(null);
				masu[i][j+1].open=true;
				open(i,j+1);
			}
		}else if(j==dif-1){ //右端の時
			// System.out.println("右端真ん中");
			if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
				masu[i-1][j].button.setIcon(null);
				masu[i-1][j].open=true;
				open(i-1,j);
			}
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0 && masu[i-1][j-1].open==false){
				masu[i-1][j-1].button.setIcon(null);
				masu[i-1][j-1].open=true;
				open(i-1,j-1);
			}
			if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
				masu[i][j-1].button.setIcon(null);
				masu[i][j-1].open=true;
				open(i,j-1);
			}
			if(masu[i+1][j-1].ban.ban[i+1][j-1]==0 && masu[i+1][j-1].open==false){
				masu[i+1][j-1].button.setIcon(null);
				masu[i+1][j-1].open=true;
				open(i+1,j-1);
			}
			if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
				masu[i+1][j].button.setIcon(null);
				masu[i+1][j].open=true;
				open(i+1,j);
			}
		}else{ //真ん中の時
			// System.out.println("方位");
			if(masu[i-1][j-1].ban.ban[i-1][j-1]==0 && masu[i-1][j-1].open==false){
				masu[i-1][j-1].button.setIcon(null);
				masu[i-1][j-1].open=true;
				open(i-1,j-1);
			}
			if(masu[i-1][j].ban.ban[i-1][j]==0 && masu[i-1][j].open==false){
				masu[i-1][j].button.setIcon(null);
				masu[i-1][j].open=true;
				open(i-1,j);
			}
			if(masu[i-1][j+1].ban.ban[i-1][j+1]==0 && masu[i-1][j+1].open==false){
				masu[i-1][j+1].button.setIcon(null);
				masu[i-1][j+1].open=true;
				open(i-1,j+1);
			}
			if(masu[i][j-1].ban.ban[i][j-1]==0 && masu[i][j-1].open==false){
				masu[i][j-1].button.setIcon(null);
				masu[i][j-1].open=true;
				open(i,j-1);
			}
			if(masu[i][j+1].ban.ban[i][j+1]==0 && masu[i][j+1].open==false){
				masu[i][j+1].button.setIcon(null);
				masu[i][j+1].open=true;
				open(i,j+1);
			}
			if(masu[i+1][j-1].ban.ban[i+1][j-1]==0 && masu[i+1][j-1].open==false){
				masu[i+1][j-1].button.setIcon(null);
				masu[i+1][j-1].open=true;
				open(i+1,j-1);
			}
			if(masu[i+1][j].ban.ban[i+1][j]==0 && masu[i+1][j].open==false){
				masu[i+1][j].button.setIcon(null);
				masu[i+1][j].open=true;
				open(i+1,j);
			}
			if(masu[i+1][j+1].ban.ban[i+1][j+1]==0 && masu[i+1][j+1].open==false){
				masu[i+1][j+1].button.setIcon(null);
				masu[i+1][j+1].open=true;
				open(i+1,j+1);
			}
		}

	}
} 
