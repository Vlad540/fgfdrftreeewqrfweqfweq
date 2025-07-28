package defpackage;

/* renamed from: wy5  reason: default package */
public abstract class wy5 {
    public final mbe a;
    public final g15 b;
    public int c;
    public int d;
    public u2f e;

    public wy5(mbe mbe, g15 g15) {
        this.a = mbe;
        this.b = g15;
    }

    public void a(u2f u2f, int i, int i2) {
        if (!u2f.equals(this.e)) {
            this.e = u2f;
            this.c = i;
            this.d = i2;
        }
    }
}
