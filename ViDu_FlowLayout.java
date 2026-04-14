package View;

//FlowLayout: là sắp xếp thoe dòng chảy

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame{
public ViDu_FlowLayout() {
	this.setTitle("ViDu_FlowLayout");
	this.setSize(600, 400);
	//Căn giữa cửa sổ chương trình
	this.setLocationRelativeTo(null);
	
	//Set Layout
	FlowLayout flowLayout = new FlowLayout();
	FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT); // Căn lề phải
	FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50, 50); // Căn lề trung tâm mỗi nút cách nhau 50

	this.setLayout(flowLayout_2);
	
	JButton jButton_1 = new JButton("1");
	JButton jButton_2 = new JButton("2");
	JButton jButton_3 = new JButton("3");
	
	//Add các thành phần
	this.add(jButton_1);
	this.add(jButton_2);
	this.add(jButton_3);
	
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
public static void main(String[] args) {
	new ViDu_FlowLayout();
}
}
/*🔥 Tóm gọn cực ngắn:
BorderLayout → chia 5 vùng (trên, dưới, trái, phải, giữa)
👉 dùng cho giao diện lớn (app, trình duyệt như Google Chrome)

GridLayout → chia ô vuông đều nhau
👉 dùng cho bàn phím, máy tính

FlowLayout → xếp từ trái sang phải, tự xuống dòng
👉 dùng cho form, nút nhỏ (giống gõ chữ trong Microsoft Word)
*/
