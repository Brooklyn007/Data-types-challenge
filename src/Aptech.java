public class Aptech {
    private String rotimi = "Course";
    private String lawal;
    private String jubril;
    private String jhon;


    public Aptech() {
    }

    public Aptech(String jhon, String jubril, String lawal, String rotimi) {
        this.jhon = jhon;
        this.jubril = jubril;
        this.lawal = lawal;
        this.rotimi = rotimi;
    }

    public String getRotimi() {
        return rotimi;
    }

    public void setRotimi(String rotimi) {
        this.rotimi = rotimi;
    }

    public String getLawal() {
        return lawal;
    }

    public void setLawal(String lawal) {
        this.lawal = lawal;
    }

    public String getJubril() {
        return jubril;
    }

    public void setJubril(String jubril) {
        this.jubril = jubril;
    }

    public String getJhon() {
        return jhon;
    }

    public void setJhon(String jhon) {
        this.jhon = jhon;
    }
}
