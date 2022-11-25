package ezsample01;
/*
 * DrawFigure.java
 * EZ Graphicsで各種図形を描く
 * [このコードと同じフォルダにEZ.javaを置いておくこと]
 */

import java.awt.Color;

public class DrawFigure {
	public static void main(String[] args) {
		EZ.initialize(400, 400); // 画面の大きさを決める．

		//背景色を設定
		EZ.setBackgroundColor(Color.LIGHT_GRAY);

		//線を描く(始点x, 始点y, 終点x, 終点y, 色, 線幅)
		EZ.addLine(40,0, 40,50, Color.RED, 1);
		EZ.addLine(0,20, 200,20, Color.RED, 1);

		//矩形を描く(中心座標x, y, 幅, 高さ, 色, 塗りつぶし)
		EZ.addRectangle(100,300, 100,50, Color.CYAN, true);
		
		//ポリゴンを描く(座標配列x, 座標配列y, 色, 塗りつぶし)
		int[] xp = {200,300,220,250,290,200};
		int[] yp = {100,100,200,80,190,100};
		EZ.addPolygon(xp, yp, Color.MAGENTA, false);

		//イメージを描画 (ファイル名, 中心座標x, 中心座標y)
		EZ.addImage("src/ezsample01/cat.jpg", 300,300);

		//文字を描画する(文字列の中心座標x, 文字列の中心座標y, 文字列，色 [,サイズ] )
		EZ.addText(40,20, "Hello World", Color.BLACK, 12);
		EZ.addText(300,50, "012あいう漢字", Color.BLACK, 24);

		// 円を描く．(中心座標x, 中心座標y, 幅，高さ，色，塗りつぶし)
		EZCircle circle = EZ.addCircle(100, 100, 150, 150, Color.BLUE, true);
		EZ.addCircle(200, 200, 200, 200, Color.RED,  false);
	}
}
