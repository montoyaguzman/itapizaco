import java.awt.*;

public class PanelExt extends Panel
{
   int margen;

   public PanelExt( int margen )
   {
      super();
      this.margen = margen+2;
   }

   public PanelExt( LayoutManager layout, int margen )
   {
      super(layout);
      this.margen = margen+2;
   }

   public void paint( Graphics g )
   {
      Dimension d = getSize();
      int lx = d.width;
      int ly = d.height;
      g.setColor(Color.lightGray);
      g.fillRect(0,0,lx-1,ly-1);

      g.setColor(Color.white);
      g.drawLine(0,0,lx-1,0);
      g.drawLine(0,0,0,ly-1);
      g.setColor(Color.black);
      g.drawLine(0,ly-1,lx-1,ly-1);
      g.drawLine(lx-1,0,lx-1,ly-1);

      g.drawLine(2,2,lx-3,2);
      g.drawLine(2,2,2,ly-3);
      g.setColor(Color.white);
      g.drawLine(2,ly-3,lx-3,ly-3);
      g.drawLine(lx-3,2,lx-3,ly-3);
   }

   public Insets getInsets( )
   {
      return( new Insets(margen,margen,margen,margen) );
   }
}