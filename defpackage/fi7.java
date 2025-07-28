package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: fi7  reason: default package */
public final class fi7 implements hi7 {
    public final Context b;
    public final o7a c;
    public final h7a d;
    public final o54 e;
    public final bbe f;

    public fi7(Context context, o7a o7a, h7a h7a, o54 o54, bbe bbe) {
        this.b = context;
        this.c = o7a;
        this.d = h7a;
        this.e = o54;
        this.f = bbe;
    }

    public final Notification a(long j, PendingIntent pendingIntent) {
        String str;
        this.c.c();
        o7a o7a = this.c;
        this.e.getClass();
        un9 h = o7a.h("ru.oneme.app.liveLocation", true, true);
        h.e = un9.c(this.b.getString(avb.tt_live_location));
        bbe bbe = this.f;
        t52 t52 = (t52) bbe.b.getValue();
        if (t52 == null) {
            str = "";
        } else {
            i22 B = t52.B(j);
            if (B.J()) {
                Context context = bbe.a;
                int i = whc.q;
                B.h0();
                str = context.getString(i, new Object[]{B.y0});
            } else {
                Context context2 = bbe.a;
                int i2 = whc.p;
                B.h0();
                str = context2.getString(i2, new Object[]{B.y0});
            }
        }
        h.f = un9.c(str);
        h.k = 0;
        this.d.getClass();
        h.F.icon = zhc.l0;
        h.g(0);
        h.p((Uri) null);
        h.i(16, false);
        h.b.add(new gn9(0, this.b.getString(avb.tt_worker_cancel), pendingIntent));
        this.c.getClass();
        h.g = d8.p(this.b, 10, (Intent) null);
        h.v = "service";
        return h.b();
    }
}
