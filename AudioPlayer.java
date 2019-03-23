import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AudioPlayer extends Applet implements ActionListener {
    Button b1, b2;
    AudioClip au;
    Graphics g;

    public void init() {
        Label l = new Label("Song Ready to play");
        l.setBounds(100, 40, 70, 10);
        setBackground(Color.CYAN);
        setForeground(Color.RED);

        au = getAudioClip(getDocumentBase(), "donu.wav"); //change this "donu.wav" to your music.wav
        b1 = new Button("Play");
        b2 = new Button("Stop");
        // g.drawString("Click the buttons", 100, 50);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        // setBackground(Color.WHITE);
        // setLayout(null);
        // setVisible(true);
    }

    public void paint(Graphics g) {
        setForeground(Color.BLACK);
        g.drawString("Developed by Srikanth9142", 90, 300);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            au.play();
        if (e.getSource() == b2)
            au.stop();
    }

}
/*
 * <applet code="AudioPlayer.class" height=300 width=300> </applet>
 */
