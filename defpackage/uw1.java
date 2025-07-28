package defpackage;

/* renamed from: uw1  reason: default package */
public final /* synthetic */ class uw1 implements tn1 {
    public final /* synthetic */ ww1 a;

    public /* synthetic */ uw1(ww1 ww1) {
        this.a = ww1;
    }

    public void a() {
        ww1 ww1 = this.a;
        synchronized (ww1.a) {
            try {
                if (ww1.i == 5) {
                    ww1.k(ww1.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String z(sn1 sn1) {
        String str;
        ww1 ww1 = this.a;
        synchronized (ww1.a) {
            e07.p("Release completer expected to be null", ww1.k == null);
            ww1.k = sn1;
            str = "Release[session=" + ww1 + "]";
        }
        return str;
    }
}
