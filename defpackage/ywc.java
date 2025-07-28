package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ywc  reason: default package */
public final class ywc {
    public final LinkedHashMap a = new LinkedHashMap();

    public ywc(wwc wwc, a27 a27, n64 n64) {
        sk9 sk9 = sk9.a;
        ju3 ju3 = a27.a;
        ju3.plus(sk9);
        uh uhVar = new uh(wwc, 23, pec.a(0, "SELECT * FROM selected_mentions"));
        pj5 z = ez3.z(ez3.J(new djc(new yu3((aec) wwc.b, new String[]{"selected_mentions"}, uhVar, (Continuation) null)), ju3));
        ju3 ju32 = n64.a;
        ez3.N(new ck5(ez3.J(z, ju32), new xwc(this, (Continuation) null), 5), n1g.a(ju32));
    }

    public final int a(long j) {
        int i;
        vwc vwc = (vwc) this.a.get(Long.valueOf(j));
        if (vwc == null || (i = vwc.b) == 0) {
            return 1;
        }
        return i;
    }
}
