package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import model.QuanLyDiemModel;

public class QuanLyDiemView extends JFrame{
//	private QuanLyDiemModel quanLyDiemModel;

	public QuanLyDiemView() {
//		this.quanLyDiemModel = new QuanLyDiemModel();
		this.init();
	}

	private void init() {
		this.setTitle("Quản Lý Điểm Sinh Viên");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		Font font_menu = new Font("Times New Roman", Font.BOLD, 20);
		
		
		// Tạo thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		
		// Tạo menu
		JMenu jMenu_system = new JMenu("System");
//		jMenu_system.setBackground(Color.blue);
		jMenu_system.setFont(font_menu);
		
		// Tạo menu
		JMenu jMenu_report = new JMenu("Report");
		jMenu_report.setFont(font_menu);
		JMenuItem jMenuItem_report = new JMenuItem("Report");
		jMenuItem_report.setFont(font_menu);
		jMenu_report.add(jMenuItem_report);
		
		// Tạo menu
		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setFont(font_menu);
		
		// Tạo menu
		JMenu jMenu_aboutMe = new JMenu("About Me");
		jMenu_aboutMe.setFont(font_menu);
		JMenuItem jMenuItem_infor = new JMenuItem("Information");
		jMenuItem_infor.setFont(font_menu);
		jMenu_aboutMe.add(jMenuItem_infor);
		
		jMenuBar.add(jMenu_system);
		jMenuBar.add(jMenu_report);
		jMenuBar.add(jMenu_help);
		jMenuBar.add(jMenu_aboutMe);
		
		
		// Tạo Tool bar (Thanh công cụ)
		JToolBar jToolBar_thanhCongCu = new JToolBar();
		JButton jButton_nhapSinhVien = new JButton("Nhập sinh viên");
		JButton jButton_nhapGiaoVien = new JButton("Nhập giáo viên");
		JButton jButton_nhapLop = new JButton("Nhập lớp");
		JButton jButton_nhapDiem = new JButton("Nhập điểm");
		jToolBar_thanhCongCu.add(jButton_nhapSinhVien);
		jToolBar_thanhCongCu.add(jButton_nhapGiaoVien);
		jToolBar_thanhCongCu.add(jButton_nhapLop);
		jToolBar_thanhCongCu.add(jButton_nhapDiem);
		
		
		this.add(jToolBar_thanhCongCu, BorderLayout.NORTH);
		this.setJMenuBar(jMenuBar);
		this.setVisible(true);
	}
}
