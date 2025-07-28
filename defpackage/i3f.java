package defpackage;

/* renamed from: i3f  reason: default package */
public final /* synthetic */ class i3f implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3f b;

    public /* synthetic */ i3f(j3f j3f, int i) {
        this.a = i;
        this.b = j3f;
    }

    public void accept(Object obj) {
        int i = this.a;
        j3f j3f = this.b;
        switch (i) {
            case 1:
                xi4 xi4 = (xi4) obj;
                synchronized (j3f) {
                    j3f.h.a(xi4);
                }
                return;
            default:
                z2f z2f = (z2f) obj;
                iu7.a0(new w63(j3f.b.a(), 2, new h3f(z2f, 2)).l(), z3d.j, new h3f(z2f, 0), new f5(22, z2f));
                return;
        }
    }

    public Object apply(Object obj) {
        mv9 mv9;
        j3f j3f = this.b;
        int i = this.a;
        z2f z2f = (z2f) obj;
        j3f.getClass();
        switch (i) {
            case 0:
                if (!z2f.b || !zl3.f(z2f.d)) {
                    udd.p("j3f", "convertVideo: start convert = %s", new Object[]{z2f});
                    if (!r1g.p(z2f.c)) {
                        mv9 = dhd.g(z2f);
                    } else {
                        eq3 c = ((xh0) j3f.a).c(z2f.a.a);
                        if (c == null) {
                            mv9 = dhd.f(new RuntimeException("failed to prepare videoConversion files"));
                        } else if (c.b == 0) {
                            mv9 = dhd.f(new RuntimeException("content is zero length"));
                        } else {
                            String str = c.e;
                            if (r1g.p(str)) {
                                mv9 = new mv9(1, new cwe(j3f, z2f, c, 1)).m(j3f.g.a).i(j3f.f);
                            } else {
                                e06 a2 = z2f.a();
                                a2.c = str;
                                mv9 = dhd.g(new z2f(a2));
                            }
                        }
                    }
                    return new mhd(new mhd(new phd(new mhd(mv9, new i3f(j3f, 2), 2), new i3f(j3f, 3), 0), new h3f(z2f, 1), 1), new i3f(j3f, 2), 2);
                }
                udd.p("j3f", "convertVideo: exists result = %s", new Object[]{z2f});
                return dhd.g(z2f);
            default:
                return new mv9(1, new joc(j3f, 21, z2f)).m(j3f.e.a).i(j3f.f);
        }
    }
}
