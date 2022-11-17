import java.util.ArrayList;
import java.util.List;

public class Hammeren92 {
    private int rage;
    private int height;
    private List<String> jokes;

    public Hammeren92(int rage, int height) {
        this.rage = rage;
        this.height = height;
        jokes = new ArrayList<>();

    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
}