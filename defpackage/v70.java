package defpackage;

/* renamed from: v70  reason: default package */
public final class v70 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public v70(t97 t97, t97 t972, sma sma) {
        this.a = t97;
        this.b = t972;
        this.c = ez3.O(3, new x2(sma, 3, this));
    }

    public final boolean a() {
        t97 t97 = this.a;
        boolean g = ((ed3) t97.getValue()).g();
        boolean z = ((ed3) t97.getValue()).b() == wd3.c;
        t97 t972 = this.b;
        int i = ((j2b) ((g2b) t972.getValue())).c.g.getInt("app.video.auto.play", 1);
        if (i != 0) {
            if (i == 1) {
                return z;
            }
        } else if (z || ((j2b) ((g2b) t972.getValue())).c.m() || !g) {
            return true;
        }
        return false;
    }
}
