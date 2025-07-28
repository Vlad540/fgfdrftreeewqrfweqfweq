package defpackage;

/* renamed from: du  reason: default package */
public final /* synthetic */ class du implements h73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ du(vc2 vc2, long j, int i) {
        this.a = i;
        this.b = vc2;
        this.c = j;
    }

    public final void b(x63 x63) {
        switch (this.a) {
            case 0:
                jh6 jh6 = this.b.b;
                kh6 kh6 = jh6.e;
                long j = this.c;
                if (kh6 != null) {
                    String b2 = kh6.b(j);
                    kh6.c("loadPrev: " + b2);
                }
                jh6.q();
                if (!jh6.d().i().isEmpty()) {
                    rg6 l = mt0.l(jh6.f(j));
                    if (l != null) {
                        j = l.k();
                    }
                    long j2 = j;
                    jh6.j(jh6.b, j2, true, false, false);
                    jh6.k(jh6.c, j2, true, false);
                } else {
                    jh6.l(j);
                }
                if (kh6 != null) {
                    pa2.y(kh6, jh6.e());
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
            default:
                jh6 jh62 = this.b.b;
                kh6 kh62 = jh62.e;
                long j3 = this.c;
                if (kh62 != null) {
                    String b3 = kh6.b(j3);
                    kh62.c("load: " + b3);
                }
                jh62.q();
                if (!jh62.d().i().isEmpty()) {
                    jh62.j(jh62.b, j3, true, true, false);
                    jh62.k(jh62.c, j3, true, true);
                } else {
                    jh62.l(j3);
                }
                if (kh62 != null) {
                    pa2.y(kh62, jh62.e());
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
        }
    }
}
