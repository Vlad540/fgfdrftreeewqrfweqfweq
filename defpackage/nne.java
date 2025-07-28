package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nne  reason: default package */
public final class nne {
    public static final nne a = new Object();
    public static volatile boolean b;
    public static kd8 c;
    public static Context d;
    public static i3d e;
    public static u9e f;
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final r7e h = new r7e(l8.X);
    public static final r7e i = new r7e(l8.o);
    public static volatile Map j = iw4.a;

    public static String a() {
        if (b) {
            return null;
        }
        Object obj = c().get(xie.a);
        if ((obj instanceof cu3 ? (cu3) obj : null) == null) {
            new b2b(13).s();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String A = iu7.A(context, "tracer_app_token");
        if (A == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        } else if (A.equals("0000000000000000000000000000000000000000000")) {
            return null;
        } else {
            return A;
        }
    }

    public static dp4 b() {
        return (dp4) i.getValue();
    }

    public static Map c() {
        if (g.get()) {
            return j;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    public static List d(ne6 ne6) {
        b2b b2b = new b2b(13);
        b2b.c = 2147482647;
        cu3 cu3 = new cu3(b2b);
        ov3 ov3 = new ov3(new g02(9));
        x3a x3a = new x3a(8, false);
        Boolean bool = Boolean.TRUE;
        x3a.b = bool;
        nv3 nv3 = new nv3(x3a);
        u5g u5g = new u5g(14, false);
        u5g.b = bool;
        bf6 bf6 = new bf6(u5g);
        lv1 lv1 = new lv1(14, false);
        lv1.b = bool;
        di4 di4 = new di4(lv1);
        akc akc = new akc(1);
        akc akc2 = new akc(0);
        og0 og0 = new og0(14, (byte) 0);
        og0.c = bool;
        og0.b = 1000;
        return p23.B(new qne[]{cu3, ov3, nv3, bf6, di4, akc, akc2, new tma(og0)});
    }
}
