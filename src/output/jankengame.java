package output;

import java.util.Random;
import java.util.Scanner;

public class jankengame {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
//		変数定義ーーーーーーーーーーーーーーーーーーー
		String[] gcp= {"グー","チョキ","パー"};	//String型"配列"グー、チョキ、パーの変数
		Random ran=new Random();	
		int x = ran.nextInt(3)+1;	//1,2,3の数字を"ランダム"に出す変数
		Scanner namescan=new Scanner(System.in);
		Scanner jankenscan=new Scanner(System.in);
//		ーーーーーーーーーーーーーーーーーーーーーーー
		
//		実行後出力ーーーーーーーーーーーーーーーーーー
		System.out.println("★ ジャンケンゲーム ★");
		System .out .println("名前を入力してね！");
		String name=namescan.next();
		System.out.println(name+"さんですね！");
		System.out.println("ジャンケンを始めるよー！！！");
		System.out.println("【グーは→　"+1+"　チョキは→　"+2+"　パーは→　"+3+"　を入力してねっ】");
		System.out.println("いくよ！ジャンケンっぽん！");
		int janken=jankenscan.nextInt();
//		ーーーーーーーーーーーーーーーーーーーーーーー
		
//		(ランダム)ジャンケン出力ーーーーーーーー
		if(x==1) {			//グー
			System.out.println(gcp[0]);
		}else if(x==2) {	//チョキ
			System.out.println(gcp[1]);
		}else if(x==3) {	//パー
			System.out.println(gcp[2]);
		}	
//		ーーーーーーーーーーーーーーーーーーーー
		
//		ジャンケン勝敗出力ーーーーーーーーーーーーーーーーーーーー		
		if(x==1&&janken==3) {
			System.out.println("Win！あなたの勝ち！");
		}else if(x==1&&janken==2) {
			System.out.println("Lose！あなたの負け！");
		}else if(x==2&&janken==1) {
			System.out.println("Win！あなたの勝ち！");
		}else if(x==2&&janken==3) {
			System.out.println("Lose！あなたの負け！");
		}else if(x==3&&janken==2) {
			System.out.println("Win！あなたの勝ち！");
		}else if(x==3&&janken==1) {
			System.out.println("Lose！あなたの負け！");
		}
//		ーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
		
//		ジャンケンあいこ出力ーーーーーーーーーーーーーーーーーーー
		if(x==1&janken==1) {
			System.out.println("！あいこ！");
		}else if(x==2&&janken==2){
			System.out.println("！あいこ！");
		}else if(x==3&&janken==3){
			System.out.println("！あいこ！");
		}
//		ーーーーーーーーーーーーーーーーーーーーーーーーーーーーー		
	}

}
