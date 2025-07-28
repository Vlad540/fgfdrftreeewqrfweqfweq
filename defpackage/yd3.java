package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yd3  reason: default package */
public final class yd3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yd3(t97 t97, xzc xzc) {
        this.a = xzc;
        this.b = t97;
        this.c = new AtomicInteger(0);
        this.d = new AtomicReference(wd3.b);
        this.e = new r7e(new xd3(0));
        this.f = new r7e(new nl1(18, this));
    }

    public static se8 d(kya kya, ws6 ws6, se8 se8, qje qje) {
        vje x0 = kya.x0();
        int B = kya.B();
        Object m = x0.q() ? null : x0.m(B);
        int b2 = (kya.n() || x0.q()) ? -1 : x0.f(B, qje).b(oze.S(kya.k()) - qje.g());
        for (int i = 0; i < ws6.size(); i++) {
            se8 se82 = (se8) ws6.get(i);
            if (e(se82, m, kya.n(), kya.o0(), kya.O(), b2)) {
                return se82;
            }
        }
        if (ws6.isEmpty() && se8 != null) {
            if (e(se8, m, kya.n(), kya.o0(), kya.O(), b2)) {
                return se8;
            }
        }
        return null;
    }

    public static boolean e(se8 se8, Object obj, boolean z, int i, int i2, int i3) {
        if (!se8.a.equals(obj)) {
            return false;
        }
        int i4 = se8.b;
        return (z && i4 == i && se8.c == i2) || (!z && i4 == -1 && se8.e == i3);
    }

    public void a(String str, String str2) {
        Map map = (Map) this.f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void b(jn jnVar, se8 se8, vje vje) {
        if (se8 != null) {
            if (vje.b(se8.a) != -1) {
                jnVar.I(se8, vje);
                return;
            }
            vje vje2 = (vje) ((zs6) this.c).get(se8);
            if (vje2 != null) {
                jnVar.I(se8, vje2);
            }
        }
    }

    public i90 c() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((cx4) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = hr1.g(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = hr1.g(str, " uptimeMillis");
        }
        if (((Map) this.f) == null) {
            str = hr1.g(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i90((String) this.a, (Integer) this.b, (cx4) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (Map) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void f(vje vje) {
        jn a2 = zs6.a();
        if (((ws6) this.b).isEmpty()) {
            b(a2, (se8) this.e, vje);
            if (!am7.j((se8) this.f, (se8) this.e)) {
                b(a2, (se8) this.f, vje);
            }
            if (!am7.j((se8) this.d, (se8) this.e) && !am7.j((se8) this.d, (se8) this.f)) {
                b(a2, (se8) this.d, vje);
            }
        } else {
            for (int i = 0; i < ((ws6) this.b).size(); i++) {
                b(a2, (se8) ((ws6) this.b).get(i), vje);
            }
            if (!((ws6) this.b).contains((se8) this.d)) {
                b(a2, (se8) this.d, vje);
            }
        }
        this.c = a2.k();
    }

    public yd3(fza fza, w1d w1d, eya eya, ws6 ws6, Bundle bundle, f2d f2d) {
        this.a = fza;
        this.b = w1d;
        this.c = eya;
        this.d = ws6;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = f2d;
    }
}
