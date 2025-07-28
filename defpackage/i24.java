package defpackage;

import java.util.concurrent.Executor;

/* renamed from: i24  reason: default package */
public final class i24 implements y4b {
    public final w66 a;
    public final Executor b;
    public final iq6 c;
    public final nfc d;
    public final vl4 e;
    public final boolean f;
    public final boolean g;
    public final y4b h;
    public final int i;
    public final lv1 j;

    public i24(w66 w66, Executor executor, iq6 iq6, nfc nfc, vl4 vl4, boolean z, boolean z2, y4b y4b, int i2, lv1 lv1) {
        this.a = w66;
        this.b = executor;
        this.c = iq6;
        this.d = nfc;
        this.e = vl4;
        this.f = z;
        this.g = z2;
        this.h = y4b;
        this.i = i2;
        this.j = lv1;
    }

    public final void a(ah0 ah0, z4b z4b) {
        h24 h24;
        h24 h242;
        boolean w = n06.w();
        y4b y4b = this.h;
        w66 w66 = this.a;
        if (!w) {
            tr6 tr6 = ((ji0) z4b).a;
            if (fye.e(tr6.b) || ur6.c(tr6.b)) {
                ah0 ah02 = ah0;
                z4b z4b2 = z4b;
                h242 = new f24(this, ah02, z4b2, new ngb(w66), this.d, this.g, this.i);
            } else {
                h242 = new h24(this, ah0, z4b, this.g, this.i);
            }
            y4b.a(h242, z4b);
            return;
        }
        n06.g("DecodeProducer#produceResults");
        try {
            tr6 tr62 = ((ji0) z4b).a;
            if (fye.e(tr62.b) || ur6.c(tr62.b)) {
                h24 = new f24(this, ah0, z4b, new ngb(w66), this.d, this.g, this.i);
            } else {
                h24 = new h24(this, ah0, z4b, this.g, this.i);
            }
            y4b.a(h24, z4b);
            n06.m();
        } catch (Throwable th) {
            n06.m();
            throw th;
        }
    }
}
