package View;

//BorderLayout: là sắp xếp theo dạng Đông-Tây-Nam-Bắc và ở Giữa

//Có rất nhiều chương trình dùng BorderLayout ( vd: Chorme, eclipse )

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ViDu_BorderLayout extends JFrame {
	
	public ViDu_BorderLayout() {
		this.setTitle("ViDu_GridLayout");
		this.setSize(600, 400);
		// Căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

		// Set Layout
		BorderLayout borderLayout = new BorderLayout();
		BorderLayout borderLayout_1 = new BorderLayout(50, 50);

		this.setLayout(borderLayout_1);

		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		

		// Add các thành phần
		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2, BorderLayout.SOUTH);
		this.add(jButton_3, BorderLayout.WEST);
		this.add(jButton_4, BorderLayout.EAST);
		this.add(jButton_5, BorderLayout.CENTER);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_BorderLayout();

	}
}
