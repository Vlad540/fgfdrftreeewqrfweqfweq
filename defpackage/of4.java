package defpackage;

import android.os.Bundle;

/* renamed from: of4  reason: default package */
public final class of4 implements pf4 {
    public final long a;
    public final long b;
    public final t0c c;

    public of4() {
        long nanoTime = System.nanoTime();
        this.a = nanoTime;
        long nanoTime2 = System.nanoTime();
        this.b = nanoTime2;
        hge hge = new hge(mtb.oneme_settings_old_dev_menu);
        int i = phc.T;
        x14 x14 = x14.f;
        this.c = new t0c(hrd.a(p23.B(new z14(nanoTime, hge, i, (mge) null, x14, 8), new z14(nanoTime2, new hge(mtb.oneme_settings_old_logs_menu), phc.e, (mge) null, x14, 8))));
    }

    public final zqd c() {
        return this.c;
    }

    public final void d(z14 z14) {
        long j = z14.a;
        if (j == this.b) {
            hf4.c.P1().b(":settings/dev/logsviewer", (Bundle) null);
        } else if (j == this.a) {
            hf4.c.P1().b(":settings/dev/showroom", (Bundle) null);
        }
    }
}
