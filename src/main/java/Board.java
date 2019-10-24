import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private Image testimage;

    public Board() {
        initBoard();
    }

    private  void initBoard(){
        loadImage();
// готовим окно по размеру изображения
        int w = testimage.getWidth(this);
        int h = testimage.getHeight(this);
        setPreferredSize(new Dimension(w,h));
    }

    private void loadImage() {
        // создаем айкон для изображения
        ImageIcon ii = new ImageIcon("src/main/resources/1.png");
        testimage = ii.getImage(); // забираем изображения
    }
    @Override
    // метод орисовки изображения
    public void paintComponent(Graphics g) {
        g.drawImage(testimage, 0, 0, null); // рисуем изображение
    }
}
