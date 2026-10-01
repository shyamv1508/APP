import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {

    JTextArea textArea;

    TextEditor() {

        setTitle("Simple Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();

        JScrollPane scrollPane =
            new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        fileMenu.add(newItem);
        fileMenu.add(clearItem);
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        newItem.addActionListener(e -> {
            textArea.setText("");
        });

        clearItem.addActionListener(e -> {
            textArea.setText("");
        });

        exitItem.addActionListener(e -> {
            System.exit(0);
        });

        cutItem.addActionListener(e -> {
            textArea.cut();
        });

        copyItem.addActionListener(e -> {
            textArea.copy();
        });

        pasteItem.addActionListener(e -> {
            textArea.paste();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
