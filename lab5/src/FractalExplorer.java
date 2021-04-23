import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.*;
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.*;
import javax.imageio.ImageIO.*;
import java.awt.image.*;

public class FractalExplorer implements ItemListener
{
    private int displaySize;
    private JImageDisplay display;
    private FractalGenerator fractal;
    private Rectangle2D.Double range;
    public FractalExplorer(int size)
    {
        displaySize = size;
        fractal = new Mandelbrot();
        range = new Rectangle2D.Double();
        fractal.getInitialRange(range);
        display = new JImageDisplay(displaySize, displaySize);
    }
    public void createAndShowGUI()
    {
        display.setLayout(new BorderLayout());
        JFrame myframe = new JFrame("Fractal Explorer");

        JLabel header = new JLabel("Fractal:");
        myframe.add(display, BorderLayout.CENTER);
        // Создание кнопок и панели выбора.
        Choice Button1 = new Choice();
        Button1.add("Mandelbrot");
        Button1.add("Tricorn");
        Button1.add("Burning Ship");
        JPanel panel = new JPanel();
        myframe.add(panel, BorderLayout.NORTH);
        panel.add(header);
        panel.add(Button1);
        JButton resetButton = new JButton("Reset");
        ResetHandler handler = new ResetHandler();
        resetButton.addActionListener(handler);
        JButton saveImage = new JButton("Save Image");
        SaveHandler save = new SaveHandler();
        saveImage.addActionListener(save);
        JPanel down  = new JPanel();
        myframe.add(down, BorderLayout.SOUTH);
        down.add(resetButton);
        down.add(saveImage);
        Button1.addItemListener(this);
        MouseHandler click = new MouseHandler();
        display.addMouseListener(click);
        // Установка операции закрытия фрейма по умолчанию на «выход».
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Размещение содержимого фрейма, чтобы оно было видимым и запрещение изменения размера окна.
        myframe.pack();
        myframe.setVisible(true);
        myframe.setResizable(false);
    }


    private void drawFractal()
    {
        for (int x = 0; x < displaySize; x++)
            for (int y = 0; y < displaySize; y++)
            {
                double xCoord = fractal.getCoord(range.x,range.x + range.width, displaySize, x);
                double yCoord = fractal.getCoord(range.y,range.y + range.height, displaySize, y);
                int iteration = fractal.numIterations(xCoord, yCoord);
                if (iteration == -1) // Если количество итераций равно -1, устанавливаем пиксель черным.
                    display.drawPixel(x, y, 0);
                else
                {
                    float hue = 0.7f + (float) iteration / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    display.drawPixel(x, y, rgbColor); // Обновление дисплея для каждого пикселя.
                }
            }
        display.repaint();
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getItem() == "Mandelbrot") fractal = new Mandelbrot();
        if (e.getItem() == "Tricorn") fractal = new Tricorn();
        if (e.getItem() == "Burning Ship") fractal = new BurningShip();
        drawFractal();
    }
    private class SaveHandler implements ActionListener // Класс для сохранения
    {
        public void actionPerformed(ActionEvent e)
        {
            // скопировано из задания
            JFileChooser myFileChooser = new JFileChooser();// добовляет контейнер для работы с файлами
            FileFilter extensionFilter = new FileNameExtensionFilter("PNG Images", "png");
            myFileChooser.setFileFilter(extensionFilter);
            myFileChooser.setAcceptAllFileFilterUsed(false);//запритит выбирать другие форматы файлов

            int userSelection = myFileChooser.showSaveDialog(display);
            if (userSelection == JFileChooser.APPROVE_OPTION)// может продолжить сохранения файлов
            {
                java.io.File file = myFileChooser.getSelectedFile();// узнать дирикторий пользовотеля

                String file_name = file.toString();
                System.out.println(file_name.lastIndexOf(".png"));
                if (file_name.lastIndexOf(".png") == -1)
                {
                    file_name += ".png";
                    file = new java.io.File(file_name);
                }
                try // при успешном выборе файла
                {
                    BufferedImage displayImage = display.getImage();//класс, который предостовляет изоброжение, которые хранятся в памяти
                    javax.imageio.ImageIO.write(displayImage, "png", file);// сохроняет файл(изоброжение,расширение,путь)
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog// вызывает диалоговое окно(взято из задания)
                            (
                            display, exception.getMessage(),
                            "Cannot Save Image", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    private class ResetHandler implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            fractal.getInitialRange(range);
            drawFractal();
        }
    }
    private class MouseHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            // получение координаты x области щелчка мыши.
            int x = e.getX();
            double xCoord = fractal.getCoord(range.x,range.x + range.width, displaySize, x);
            // получение координаты y области щелчка мыши.
            int y = e.getY();
            double yCoord = fractal.getCoord(range.y,range.y + range.height, displaySize, y);
            fractal.recenterAndZoomRange(range, xCoord, yCoord, 0.5);
            drawFractal(); // перерисовка фрактала после изменения отображаемой области.
        }
    }

    public static void main(String[] args)
    {
        FractalExplorer displayExplorer = new FractalExplorer(600);
        displayExplorer.createAndShowGUI();
        displayExplorer.drawFractal();
    }
}