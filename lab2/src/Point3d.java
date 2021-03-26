public class Point3d {
        private double xCoord;
        private double yCoord;
        private double zCoord;
        private double distanceTo;
    public Point3d ( double x, double y, double z) {
            xCoord = x;
            yCoord = y;
            zCoord = z;
        }
        public Point3d () {
            this(0, 0, 0);
        }

        public double getX () {
            return xCoord;
        }
        public double getY () {
            return yCoord;
        }
        public double getZ () {
        return zCoord;
        }
        public void setX ( double val) {
            xCoord = val;
        }
        public void setY ( double val) {
            yCoord = val;
        }
        public void setZ ( double val) {
        zCoord = val;
        }
         public static double distanceTo(Point3d A, Point3d B) {

            double AB= Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2)+Math.pow(B.getZ()-A.getZ(),2));
            return AB;
        }

        public static boolean sravn (Point3d A, Point3d B){
        boolean otv;
        if(A.getX()==B.getX() && A.getY()==B.getY() && A.getZ()==B.getZ()){
            otv = true;
        }else {otv=false;};
        return otv;
        }
    }

