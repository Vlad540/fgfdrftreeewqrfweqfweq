package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: g99  reason: default package */
public final class g99 extends lbe {
    public final j22 X;
    public final long c;
    public final ym8 o;

    public /* synthetic */ g99() {
        this(0, (ym8) null, (j22) null);
    }

    public static final g99 c(ws8 ws8) {
        String str;
        if (!ws8.m()) {
            return new g99();
        }
        int x0 = ws8.x0();
        if (x0 == 0) {
            return new g99();
        }
        ym8 ym8 = null;
        j22 j22 = null;
        long j = 0;
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
                int hashCode = str.hashCode();
                if (hashCode != -1361631597) {
                    if (hashCode != 3052376) {
                        if (hashCode == 954925063 && str.equals("message")) {
                            ym8 = hhd.H(ws8);
                        }
                    } else if (str.equals("chat")) {
                        j22 = j22.a(ws8);
                    }
                } else if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    try {
                        j = jjd.J(ws8, 0);
                    } catch (Throwable th2) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it2 = uzc.a.iterator();
                        while (it2.hasNext()) {
                            ((ny9) it2.next()).getClass();
                            ny9.a(th2);
                        }
                        int t2 = hr1.t(m4b.a);
                        if (t2 == 0) {
                            j = 0;
                        } else if (t2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                }
                ws8.z();
            }
        }
        return new g99(j, ym8, j22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g99)) {
            return false;
        }
        g99 g99 = (g99) obj;
        return this.c == g99.c && hhd.f(this.o, g99.o) && hhd.f(this.X, g99.X);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        ym8 ym8 = this.o;
        int hashCode2 = (hashCode + (ym8 == null ? 0 : ym8.hashCode())) * 31;
        j22 j22 = this.X;
        if (j22 != null) {
            i = j22.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.o + ")";
    }

    public g99(long j, ym8 ym8, j22 j22) {
        this.c = j;
        this.o = ym8;
        this.X = j22;
    }
}
