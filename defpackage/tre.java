package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tre  reason: default package */
public final class tre {
    public static volatile ay3 e;
    public final eye a;
    public final eye b;
    public final pmc c;
    public final vxe d;

    public tre(eye eye, eye eye2, pmc pmc, vxe vxe, etf etf) {
        this.a = eye;
        this.b = eye2;
        this.c = pmc;
        this.d = vxe;
        etf.getClass();
        etf.a.execute(new pfe(17, etf));
    }

    public static tre a() {
        ay3 ay3 = e;
        if (ay3 != null) {
            return (tre) ay3.Z.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (tre.class) {
                try {
                    if (e == null) {
                        lhd lhd = new lhd(11, (byte) 0);
                        context.getClass();
                        lhd.b = context;
                        e = lhd.m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final sre c(zw4 zw4) {
        Set set;
        byte[] bArr;
        if (zw4 instanceof zw4) {
            ((zu0) zw4).getClass();
            set = Collections.unmodifiableSet(zu0.d);
        } else {
            set = Collections.singleton(new cy4("proto"));
        }
        ydc a2 = hb0.a();
        zw4.getClass();
        a2.b = "cct";
        zu0 zu0 = (zu0) zw4;
        String str = zu0.a;
        String str2 = zu0.b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            bArr = me4.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bArr;
        return new sre(set, a2.r(), this);
    }
}
