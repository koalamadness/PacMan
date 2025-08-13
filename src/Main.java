import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame jFrame = new JFrame("Pac Man");
        jFrame.setSize(boardWidth, boardHeight);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);

        PacMan pacMan = new PacMan();
        jFrame.add(pacMan);
        jFrame.pack();
        jFrame.requestFocus();
        jFrame.setVisible(true);

    }
}