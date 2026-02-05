public class Object {
    private String shoe = "lucky-word" ;
    private String color;
    private Integer size;
    private Integer length;

    public Object(String shoe, String color, Integer size, Integer length){
        this.shoe = shoe;
        this.color = color;
        this.size = size;
        this.length = length;

    }
    public Object(){

    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getGetShoe() {
        return shoe;
    }

    public void setGetShoe(String shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "Object{" +
                "shoe='" + shoe + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", length=" + length +
                '}';
    }



}
