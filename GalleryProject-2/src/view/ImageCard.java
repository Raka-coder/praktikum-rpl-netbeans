/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.BorderLayout;
import java.io.File;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
/**
 *
 * @author USER
 */
public class ImageCard extends JPanel{
    private final javax.swing.JPanel parentContainer;
    private String title;
    private JCheckBox checkBox;
    private String fileName;
    
    public ImageCard(ImageIcon icon, javax.swing.JPanel parent){
        this.parentContainer = parent;
        this.title = extractTitleFromFileName(fileName); // Ekstrak judul dari nama file
        initComponents(icon);
    }
    
    // Metode untuk ekstrak judul dari nama file (tanpa ekstensi)
    private String extractTitleFromFileName(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            return "Judul Poster";
        }
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0) {
            return fileName.substring(0, dotIndex);
        }
        return fileName;
    }
    
     private void initComponents(ImageIcon icon) {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.setBackground(Color.WHITE);
        this.setMinimumSize(new Dimension(150, 180));
this.setMaximumSize(new Dimension(170, 200));
this.setPreferredSize(new Dimension(160, 190));

        // Panel atas untuk checkbox dan judul
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);
        topPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        checkBox = new JCheckBox();
        checkBox.setHorizontalAlignment(SwingConstants.LEFT);
        JLabel titleLabel = new JLabel(title);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(10f)); // Ukuran font lebih kecil

        topPanel.add(checkBox, BorderLayout.WEST);
        topPanel.add(titleLabel, BorderLayout.CENTER);

        this.add(topPanel, BorderLayout.NORTH);

        // Label gambar di tengah
        JLabel labelImage = new JLabel();
        labelImage.setIcon(icon);
        labelImage.setHorizontalAlignment(SwingConstants.CENTER);
        labelImage.setVerticalAlignment(SwingConstants.CENTER);
        this.add(labelImage, BorderLayout.CENTER);

        // Tombol hapus di bawah
        JButton btnDelete = new JButton("Hapus");
        btnDelete.setBackground(Color.red);
        btnDelete.setForeground(Color.white);

        btnDelete.addActionListener(e -> {
            parentContainer.remove(this);
            parentContainer.revalidate();
            parentContainer.repaint();
        });

        this.add(btnDelete, BorderLayout.SOUTH);
    }
     
     // Getter untuk cek apakah checkbox dicentang
    public boolean isSelected() {
        return checkBox.isSelected();
    }

    // Getter untuk mendapatkan judul
    public String getTitle() {
        return title;
    }
}
