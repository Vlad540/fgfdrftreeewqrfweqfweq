package defpackage;

import android.content.Context;

/* renamed from: zv6  reason: default package */
public final class zv6 implements pf4 {
    public final t97 a;
    public final grd b;

    public zv6(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        long nanoTime = System.nanoTime();
        long nanoTime2 = System.nanoTime();
        long nanoTime3 = System.nanoTime();
        ((q0a) t974.getValue()).getClass();
        ((q0a) t974.getValue()).getClass();
        z14 z14 = new z14(nanoTime2, new lge("25.7.2(6386)"), 0, new hge(mtb.oneme_settings_app_version), (n06) null, 20);
        z14 z142 = new z14(nanoTime, new lge(String.valueOf(((f03) t972.getValue()).s())), 0, new hge(mtb.oneme_settings_user_id), (n06) null, 20);
        String str = (String) ((rf4) t973.getValue()).l.get();
        this.b = hrd.a(p23.B(z14, z142, new z14(nanoTime3, new lge(str == null ? "NULL" : str), 0, new hge(mtb.oneme_settings_mytracker_id), (n06) null, 20)));
    }

    public final zqd c() {
        return this.b;
    }

    public final void d(z14 z14) {
        t97 t97 = this.a;
        Context context = (Context) t97.getValue();
        CharSequence a2 = z14.b.a((Context) t97.getValue());
        hhd.q(context, a2 != null ? a2.toString() : null);
    }
}
