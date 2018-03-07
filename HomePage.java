/*
 * HomePage.java
 * 
 * Copyright 2018 Sorin Baptiste <bsorin@pc107-042-06>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JButton;
 import javax.swing.JTextField;
 import javax.swing.JLabel;
 import java.awt.Color;
 import java.awt.event.*;
 import javax.swing.JOptionPane;
 import javax.swing.JTextArea;
 import java.awt.Toolkit;
 import java.awt.Font;
public class HomePage extends JFrame {
	public HomePage(String nom){
		
		super(nom);
		setLayout(null);
		
		
		Toolkit outil = getToolkit();
		this.setSize(outil.getScreenSize());
		 
		 
		 this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 JPanel panelTitre = new JPanel();
		 JPanel panelMiddle= new JPanel();
		 JPanel panelBottom = new JPanel();
		 
		 panelTitre.setLayout(null);
		 panelMiddle.setLayout(null);
		 panelBottom.setLayout(null);
		 
		  panelTitre.setBounds(0,0,this.getWidth(),150);
		 panelTitre.setBackground(Color.green);
		 add(panelTitre);
		 JLabel monEtiquette = new JLabel();
		 monEtiquette.setText("Ambosify");
		 Font police = new Font("Arial",Font.BOLD,60);
		 monEtiquette.setFont(police);
		 monEtiquette.setSize(1000,100);
		 monEtiquette.setLocation(620,65);
		 panelTitre.add(monEtiquette);
		
		 panelMiddle.setBounds(0,160,this.getWidth(),300);
		 panelMiddle.setBackground(Color.black);
		 add(panelMiddle);
		 
		 JTextField artiste1 = new JTextField();
		 artiste1.setBounds(400,125,200,50);
		 panelMiddle.add(artiste1);
		 
		  JTextField artiste2 = new JTextField();
		 artiste2.setBounds(620,125,200,50);
		 panelMiddle.add(artiste2);
		 
		  JButton search = new JButton("Show da way");
		 search.setBounds(840,125,150,50);
		 panelMiddle.add(search);
		
		setVisible(true);
	}
	
	public static void main (String[] args) {
		HomePage f = new HomePage("Ambosify");
		System.out.println(f.getWidth());
		System.out.println(f.getHeight());
		
	}
}

