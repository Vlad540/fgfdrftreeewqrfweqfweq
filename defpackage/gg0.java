package defpackage;

/* renamed from: gg0  reason: default package */
public final class gg0 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final sb9 d = new sb9(6);
    public final sb9 e = new sb9(6);
    public final sb9 f = new sb9(6);

    public gg0(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        int i = bz6.a;
    }

    public final void a(int i, int i2, int i3) {
        Integer d2 = ((xg9) this.c.getValue()).d();
        if (d2 != null) {
            b("clicked", ((i03) ((f03) this.a.getValue())).D(), i, d2.intValue(), i2, i3);
        }
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [a07, java.lang.Object] */
    public final void b(String str, long j, int i, int i2, int i3, int i4) {
        String str2;
        String str3;
        String str4;
        bd bdVar = (bd) this.b.getValue();
        ht7 ht7 = new ht7();
        if (i == 1) {
            str2 = "push";
        } else if (i == 2) {
            str2 = "contacts";
        } else if (i == 3) {
            str2 = "mic";
        } else {
            throw null;
        }
        ht7.put("bannerType", str2);
        ht7.put("screen", Integer.valueOf(i2));
        if (i3 == 1) {
            str3 = "small";
        } else if (i3 == 2) {
            str3 = "medium";
        } else if (i3 == 3) {
            str3 = "large";
        } else {
            throw null;
        }
        ht7.put("bannerSize", str3);
        if (i4 == 1) {
            str4 = "carousel";
        } else if (i4 == 2) {
            str4 = "banner";
        } else {
            throw null;
        }
        ht7.put("bannerShowType", str4);
        ht7 b2 = ht7.b();
        ? obj = new Object();
        obj.c = "BANNER";
        obj.b = ((lqc) ((f03) this.a.getValue())).s();
        obj.X = j;
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.c(b2);
        bdVar.j(obj.d());
    }
}
