package defpackage;

/* renamed from: tjd  reason: default package */
public final class tjd {
    public static final /* synthetic */ k77[] g;
    public final sjd a = new sjd(this, 0);
    public final sjd b;
    public final sjd c;
    public float d;
    public int e;
    public float f;

    static {
        Class<tjd> cls = tjd.class;
        g = new k77[]{new hc9(cls, "from", "getFrom$common_release()F"), c3d.g(m7c.a, cls, "to", "getTo$common_release()F"), new hc9(cls, "stepSize", "getStepSize$common_release()F")};
    }

    public tjd() {
        sjd sjd = new sjd(this, 1);
        this.b = sjd;
        this.c = new sjd(this, 2);
        this.e = a();
        float b2 = this.d - b();
        k77 k77 = g[1];
        this.f = gwf.i(b2 / (((Number) sjd.b).floatValue() - b()), 0.0f, 1.0f);
    }

    public final int a() {
        k77[] k77Arr = g;
        k77 k77 = k77Arr[1];
        k77 k772 = k77Arr[2];
        return a24.X((((Number) this.b.b).floatValue() - b()) / ((Number) this.c.b).floatValue()) + 1;
    }

    public final float b() {
        k77 k77 = g[0];
        return ((Number) this.a.b).floatValue();
    }

    public final void c(float f2) {
        float b2 = b();
        k77[] k77Arr = g;
        k77 k77 = k77Arr[1];
        sjd sjd = this.b;
        float i = gwf.i(f2, b2, ((Number) sjd.b).floatValue());
        this.d = i;
        float b3 = i - b();
        k77 k772 = k77Arr[1];
        this.f = gwf.i(b3 / (((Number) sjd.b).floatValue() - b()), 0.0f, 1.0f);
    }
}
