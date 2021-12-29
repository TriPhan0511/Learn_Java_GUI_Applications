package stopwatch;

import javax.swing.JFrame;

/**
 * @version 1.0 2021-12-29
 * @author Tri Phan
 */
public class StopWatch extends JFrame
{
  public static void main(String[] args)
  {
    var frame = new StopWatch();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  public StopWatch()
  {
    setTitle("Stopwatch Application");
    setSize(300, 100);
  }
}


