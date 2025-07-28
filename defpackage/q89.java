package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: q89  reason: default package */
public final class q89 extends lbe {
    public final ym8 c;

    public q89(ym8 ym8) {
        this.c = ym8;
    }

    public static final q89 c(ws8 ws8) {
        String str;
        if (!ws8.m()) {
            return null;
        }
        int x0 = ws8.x0();
        ym8 ym8 = null;
        for (int i = 0; i < x0; i++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = uzc.a.iterator();
                while (it.hasNext()) {
                    ((ny9) it.next()).getClass();
                    ny9.a(th);
                }
                int t = hr1.t(m4b.a);
                if (t == 0) {
                    str = null;
                } else if (t != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th;
                }
            }
            if (str != null) {
                if (str.equals("message")) {
                    ym8 = hhd.H(ws8);
                } else {
                    ws8.z();
                }
            }
        }
        return new q89(ym8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q89) && hhd.f(this.c, ((q89) obj).c);
    }

    public final int hashCode() {
        ym8 ym8 = this.c;
        if (ym8 == null) {
            return 0;
        }
        return ym8.hashCode();
    }

    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
