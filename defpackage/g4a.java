package defpackage;

/* renamed from: g4a  reason: default package */
public final class g4a implements kl4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ d5b b;

    public g4a(String str, d5b d5b) {
        this.a = str;
        this.b = d5b;
    }

    public final void e(zj4 zj4, Exception exc) {
        if (hhd.f(zj4.a.a, this.a)) {
            String str = zj4.a.a;
            int i = zj4.b;
            float f = zj4.h.b;
            udd.p("OneMeDownloadController", "onDownloadChanged, " + str + ", " + i + ", " + f + "%", new Object[0]);
            if (exc != null) {
                ((a5b) this.b).i(exc);
                return;
            }
            a5b a5b = (a5b) this.b;
            a5b.getClass();
            a5b.n(zj4);
            int i2 = zj4.b;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5) {
                a5b a5b2 = (a5b) this.b;
                a5b2.getClass();
                if (!a5b2.a.p()) {
                    a5b a5b3 = (a5b) this.b;
                    a5b3.getClass();
                    a5b3.i((Throwable) null);
                }
            }
        }
    }

    public final void f(ml4 ml4, zj4 zj4) {
        if (hhd.f(zj4.a.a, this.a)) {
            ml4.e.remove(this);
            a5b a5b = (a5b) this.b;
            a5b.getClass();
            if (!a5b.a.p()) {
                a5b.getClass();
                a5b.i((Throwable) null);
            }
        }
    }
}
