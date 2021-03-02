package kiemtra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class MainFrame extends JFrame {

	private static final JPanel PanelView = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(10, 11, 176, 297);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);
		
		JPanel panel_SINHVIEN = new JPanel();
		panel_SINHVIEN.setBackground(new Color(255, 0, 255));
		panel_SINHVIEN.setBounds(0, 0, 176, 68);
		panel_menu.add(panel_SINHVIEN);
		panel_SINHVIEN.setLayout(null);
		
		JLabel quanlysinhvien = new JLabel(" QU\u1EA2N L\u00DD SINH VI\u00CAN");
		quanlysinhvien.setFont(new Font("Tahoma", Font.BOLD, 11));
		quanlysinhvien.setIcon(new ImageIcon("C:\\Users\\HightS\\Pictures\\Saved Pictures\\baseline_color_lens_white_18dp.png"));
		quanlysinhvien.setForeground(Color.WHITE);
		quanlysinhvien.setBounds(10, 11, 154, 46);
		panel_SINHVIEN.add(quanlysinhvien);
		
		JPanel panel_MANHINHCHINH = new JPanel();
		panel_MANHINHCHINH.addMouseMotionListener(new MouseMotionAdapter() {
			
		});
		panel_MANHINHCHINH.setBackground(new Color(255, 160, 122));
		panel_MANHINHCHINH.setBounds(10, 93, 156, 57);
		panel_menu.add(panel_MANHINHCHINH);
		panel_MANHINHCHINH.setLayout(null);
		
		JLabel lbl_manhinhchinh = new JLabel("M\u00E0n h\u00ECnh ch\u00EDnh");
		lbl_manhinhchinh.setIcon(new ImageIcon("C:\\Users\\HightS\\Pictures\\Saved Pictures\\baseline_cast_for_education_white_18dp.png"));
		lbl_manhinhchinh.setForeground(Color.WHITE);
		lbl_manhinhchinh.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_manhinhchinh.setBounds(10, 11, 146, 36);
		panel_MANHINHCHINH.add(lbl_manhinhchinh);
		
		JPanel panel_HOCVIEN = new JPanel();
		panel_HOCVIEN.setLayout(null);
		panel_HOCVIEN.setBackground(new Color(255, 160, 122));
		panel_HOCVIEN.setBounds(10, 161, 156, 57);
		panel_menu.add(panel_HOCVIEN);
		
		JLabel lbl_quanlyhocvien = new JLabel("Qu\u1EA3n l\u00FD h\u1ECDc vi\u00EAn");
		lbl_quanlyhocvien.setIcon(new ImageIcon("C:\\Users\\HightS\\Pictures\\Saved Pictures\\baseline_person_white_18dp.png"));
		lbl_quanlyhocvien.setForeground(Color.WHITE);
		lbl_quanlyhocvien.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_quanlyhocvien.setBounds(10, 11, 146, 36);
		panel_HOCVIEN.add(lbl_quanlyhocvien);
		
		JPanel panel_KHOAHOC = new JPanel();
		panel_KHOAHOC.setLayout(null);
		panel_KHOAHOC.setBackground(new Color(255, 160, 122));
		panel_KHOAHOC.setBounds(10, 229, 156, 57);
		panel_menu.add(panel_KHOAHOC);
		
		JLabel lbl_quanlykhoahoc = new JLabel("Qu\u1EA3n l\u00FD kh\u00F3a h\u1ECDc");
		lbl_quanlykhoahoc.setIcon(new ImageIcon("C:\\Users\\HightS\\Pictures\\Saved Pictures\\126357967_383586049513972_3535541898999417295_n.png"));
		lbl_quanlykhoahoc.setForeground(Color.WHITE);
		lbl_quanlykhoahoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_quanlykhoahoc.setBounds(10, 11, 146, 36);
		panel_KHOAHOC.add(lbl_quanlykhoahoc);
		
		JPanel panel_manhinh = new JPanel();
		panel_manhinh.setBounds(196, 11, 397, 297);
		contentPane.add(panel_manhinh);
		panel_manhinh.setLayout(null);
		
//		List<danhmuc> listDanhMuc = new ArrayList<>();
//        listDanhMuc.add(new danhmuc("trangchinh", panel_MANHINHCHINH, lbl_manhinhchinh));
//        listDanhMuc.add(new danhmuc("hocvien", panel_HOCVIEN, lbl_quanlyhocvien));
//        listDanhMuc.add(new danhmuc("khoahoc", panel_KHOAHOC, lbl_quanlykhoahoc));
//        
//        chuyenmanhinh controller = new chuyenmanhinh(panel_manhinh);
//        panel_manhinh.setLayout(null);
//        controller.setView(panel_MANHINHCHINH, lbl_manhinhchinh);
//        controller.setEvent(listDanhMuc);
	}
}
