package defpackage;

/* renamed from: dxf  reason: default package */
public abstract class dxf extends ywf {
    private String fragmentSource;
    private int height;
    public final int id;
    private int width;

    public dxf(String str, int i) {
        super(str);
        this.fragmentSource = str;
        this.id = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public String getSource() {
        return this.fragmentSource;
    }

    public int getTarget() {
        return 3553;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setSize(int i, int i2) {
        if (i != this.width || i2 != this.height) {
            this.height = i2;
            this.width = i;
            updateLocations(i, i2);
        }
    }

    public void updateLocations(int i, int i2) {
    }
}
