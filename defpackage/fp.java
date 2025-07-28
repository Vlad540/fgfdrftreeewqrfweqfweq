package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fp  reason: default package */
public final class fp extends pbe {
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp(Context context, t97 t97, t97 t972, mtf mtf, o54 o54, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979) {
        super(context, o54, t972, t974, t975, t976, t977);
        Context context2 = context;
        o54 o542 = o54;
        this.k = t978;
        this.l = t97;
        this.m = ez3.O(2, new cp(context, this, o54, mtf, t979));
        this.n = ez3.O(2, new dp(context, this, o542, 0));
        ez3.O(2, new dp(context, this, o542, 1));
        this.o = ez3.O(2, new dp(o542, this, context));
        ez3.O(2, new dp(context, this, o542, 3));
    }

    public final boolean b() {
        if (cp9.a(a().j(false).b)) {
            return false;
        }
        t97 t97 = this.l;
        yzc yzc = ((j2b) t97.getValue()).b;
        yzc.getClass();
        int o2 = (int) yzc.o(PmsKey.f94pushalerttimeout, (long) 604800);
        if (o2 <= 0) {
            return false;
        }
        return System.currentTimeMillis() - ((j2b) t97.getValue()).a.g.getLong("app.last.push.alert.time", 0) > ((long) (o2 * 1000));
    }
}
