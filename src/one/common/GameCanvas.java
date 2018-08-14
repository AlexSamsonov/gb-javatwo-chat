package one.common;

import one.circles.MainWindow;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private CanvasListener mainWindow;
    private long lastFrameTime;

    public GameCanvas(CanvasListener mainWindow) {
        this.mainWindow = mainWindow;
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;

        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainWindow.onDrawFrame(this, g, deltaTime);

        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
