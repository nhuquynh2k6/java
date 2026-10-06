package TH3;

public class Rect {
    private Point topLeft;
    private Point bottomRight;
    public Rect()
    {
        this.topLeft=new Point(0,0);
        this.bottomRight=new Point(0,0);
    }
        public Rect(Point topLeft,Point bottomRight)
        {
            this.topLeft=topLeft;
            this.bottomRight=bottomRight;
        }
        public Point getTopLeft()
        {
            return topLeft;
        }
        public Point getBottomRight()
        {
            return bottomRight;
        }
        public long getArea()
        {
            long width=bottomRight.getX()-topLeft.getX();
            long height=bottomRight.getY()-bottomRight.getY();
            return width>0&&height>0?(width*height):0;
        }
        public boolean contains(Point p)
        {
            return p.getX()>=topLeft.getX()&&p.getX()<=bottomRight.getX()&&p.getY()>=topLeft.getY()&&p.getY()<=bottomRight.getY();
        }
        // Phương thức 3: Xác định hình chữ nhật giao nhau của hai hình chữ nhật
        public Rect getIntersection(Rect other)
        {
            // Tìm điểm Top-Left của vùng giao (lấy Max của 2 tọa độ gốc trái)
            int interLeft=Math.max(this.topLeft.getX(),other.topLeft.getX());
            int interTop=Math.max(this.topLeft.getY(),other.topLeft.getY());
            // Tìm điểm Bottom-Right của vùng giao (lấy Min của 2 tọa độ gốc phải)
            int interRight=Math.min(this.bottomRight.getX(),other.bottomRight.getX());
            int interBottom=Math.min(this.bottomRight.getY(),other.bottomRight.getY());
            // Nếu tọa độ giao nhau hợp lệ (trái <= phải và trên <= dưới) thì có vùng giao
            if (interLeft<interRight&&interTop<interBottom)
            {
                return new Rect(new Point(interLeft,interTop),new Point(interRight,interBottom));
            }
            // Không giao nhau, trả về HCN có diện tích bằng 0
            return new Rect(new Point(0,0),new Point(0,0));
        }
        public String toString()
        {
                return "Rect[TopLeft="+topLeft+",BottomRight="+bottomRight+"]";
        }
    }
