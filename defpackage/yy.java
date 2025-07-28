package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yy  reason: default package */
public final class yy {
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final s39 n;
    public final b0d o;
    public final t97 p;

    public yy(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, t97 t9713, t97 t9714, t97 t9715, t97 t9716, t97 t9717, Context context) {
        t97 t9718 = t972;
        Context context2 = context;
        this.a = context2;
        this.b = t97;
        this.c = t975;
        this.d = t976;
        this.e = t977;
        this.f = t974;
        this.g = t978;
        this.h = t979;
        this.i = t9710;
        this.j = t9711;
        this.k = t9714;
        this.l = t9715;
        jg8 jg8 = new jg8(context2, t972);
        this.m = t9716;
        this.n = new s39(t973, t9713, t97, t972, t9712, jg8);
        this.o = new b0d(context2, t972, t9712, jg8);
        this.p = t9717;
    }

    public final boolean a(wt7 wt7) {
        kb5 kb5 = (kb5) ((jb5) this.p.getValue());
        kb5.getClass();
        long n2 = kb5.n(PmsKey.f72mediaorder);
        if (n2 == 3) {
            if ((wt7.a().T0 & 2) != 0) {
                return false;
            }
        } else if (n2 == 2) {
            if (wt7.a().Z0 != 4) {
                vo8 vo8 = wt7.a().G0;
                if ((vo8 != null ? vo8.Z0 : 0) != 4) {
                    return false;
                }
            }
        } else if (n2 != 1) {
            return false;
        }
        return true;
    }
}
