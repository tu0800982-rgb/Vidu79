package View;

//GridLayout: sắp xếp theo dạng lưới

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	public ViDu_GridLayout() {
		this.setTitle("ViDu_GridLayout");
		this.setSize(600, 400);
		// Căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

		// Set Layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4, 5);
		GridLayout gridLayout_2 = new GridLayout(4, 4, 25, 25);

		this.setLayout(gridLayout_2);

		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		
		for(int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i+ "");
			this.add(jButton);
		}

		// Add các thành phần
//		this.add(jButton_1);
//		this.add(jButton_2);
//		this.add(jButton_3);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_GridLayout();

	}
}
