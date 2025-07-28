package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: m65  reason: default package */
public final class m65 extends taf {
    public qod X;
    public final t97 b;
    public final t97 c;
    public final l05 o = new l05(0);

    public m65() {
        e65 e65 = e65.a;
        r7e d = e65.getAccessor().d(sce.class);
        r7e d2 = e65.getAccessor().d(pae.class);
        this.b = d;
        this.c = d2;
    }

    public final void p() {
        qod qod = this.X;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.X = null;
    }
}
