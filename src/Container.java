//Don't change the class name
public class Container {
    private Point data;//Don't delete or change this field;
    private Container nextX;
    private Container prevX;
    private Container nextY;
    private Container prevY;

    public Container(Point point) {
        data = point;
        nextX = null;
        nextY = null;
        prevX = null;
        prevY = null;
    }

    public Container(Point point, Container next, Container prev, boolean axis) {
        data = point;
        if (axis) {
            nextX = next;
            nextY = null;
            prevX = prev;
            prevY = null;
        } else {
            nextX = null;
            nextY = next;
            prevX = null;
            prevY = prev;
        }
    }

    //Don't delete or change this function
    public Point getData() {
        return data;
    }

    public int getPointValue(boolean axis) {
        if (axis)
            return data.getX();
        else
            return data.getY();
    }

    public void setNext(Container next, boolean axis) {
        if (axis)
            nextX = next;
        else
            nextY = next;
    }
    /* Function to set link to previous node */

    public void setPrev(Container prev, boolean axis) {
        if (axis)
            prevX = prev;
        else
            prevY = prev;
    }

    public Container getNext(boolean axis) {
        if (axis)
            return nextX;
        else
            return nextY;
    }
    /* Function to set link to previous node */

    public Container getPrev(boolean axis) {
        if (axis)
            return prevX;
        else
            return prevY;
    }

    public void removeSelf() {
        if (prevX != null)
            prevX.setNext(nextX, true);
        if (prevY != null)
            prevY.setNext(nextY, false);

        if (nextX != null)
            nextX.setNext(prevX, true);
        if (nextY != null)
            nextY.setNext(prevY, false);
    }

    public String toString() {
        return data.toString();
    }
}
