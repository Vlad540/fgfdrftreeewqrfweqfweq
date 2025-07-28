package defpackage;

import java.io.File;

/* renamed from: zl6  reason: default package */
public final class zl6 extends ms9 {
    public static final /* synthetic */ int o = 0;
    public final t97 a;
    public final File b;
    public final qmc c;

    public zl6(r7e r7e, File file, qmc qmc) {
        this.a = r7e;
        this.b = file;
        this.c = qmc;
    }

    public final void q(bw9 bw9) {
        omc a2 = this.c.a();
        yl6 yl6 = new yl6(bw9, this.a, this.b, a2);
        bw9.d(yl6);
        if (!yl6.Y.get()) {
            ((em6) yl6.a.getValue()).b(yl6.b, yl6.c, yl6, (String) null);
        }
    }
}
