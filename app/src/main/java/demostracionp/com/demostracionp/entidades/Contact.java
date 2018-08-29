package demostracionp.com.demostracionp.entidades;

public class Contact {

    private String name;
    private String info;
    private int imagenId;

    public Contact() {
    }

    public Contact(String name, String info, int imagenId) {
        this.name = name;
        this.info = info;
        this.imagenId = imagenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }
}
