package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t79  reason: default package */
public final class t79 {
    public final long a;
    public final long b;
    public final xu5 c;
    public final xu5 d;

    public t79(long j, long j2, xu5 xu5, xu5 xu52) {
        this.a = j;
        this.b = j2;
        this.c = xu5;
        this.d = xu52;
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, le4] */
    public static t79 a(Context context, long j, String str) {
        xu5 xu5;
        long j2;
        xu5 xu52;
        String str2;
        long j3 = j;
        q79 q79 = new q79(16, s1e.W);
        s79 s79 = new s79();
        h64 h64 = new h64(context);
        Map emptyMap = Collections.emptyMap();
        Uri parse = Uri.parse(str);
        oyb.m(parse, "The uri must be set.");
        try {
            long G = h64.G(new yz3(parse, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null));
            oyb.k(G != 0);
            String str3 = "The uri must be set.";
            r74 r74 = r5;
            r74 r742 = new r74(h64, 0, G);
            oyb.j("The MP4 file is invalid", q79.n(r74));
            q79.S(s79);
            ? obj = new Object();
            r74 r743 = r74;
            while (!s79.c) {
                int g = q79.g(r743, obj);
                if (g == 1) {
                    h64.close();
                    Map emptyMap2 = Collections.emptyMap();
                    Uri parse2 = Uri.parse(str);
                    long j4 = obj.a;
                    str2 = str3;
                    oyb.m(parse2, str2);
                    long G2 = h64.G(new yz3(parse2, 0, 1, (byte[]) null, emptyMap2, j4, -1, (String) null, 0, (Object) null));
                    if (G2 != -1) {
                        G2 += obj.a;
                    }
                    r743 = new r74(h64, obj.a, G2);
                } else {
                    str2 = str3;
                    if (g != -1) {
                        continue;
                    } else if (!s79.c) {
                        throw new IllegalStateException("The MP4 file is invalid");
                    }
                }
                str3 = str2;
            }
            long j5 = q79.N0;
            int i = s79.a;
            HashMap hashMap = (HashMap) s79.o;
            if (i != -1) {
                r79 r79 = (r79) hashMap.get(2);
                r79.getClass();
                xu5 xu53 = r79.a;
                xu53.getClass();
                oyb.k(j5 != -9223372036854775807L);
                long j6 = q79.i(s79.a, j5).a.a;
                if (j3 != -9223372036854775807L) {
                    ttc i2 = q79.i(s79.a, j3);
                    long j7 = i2.a.a;
                    if (j3 != j7) {
                        j7 = i2.b.a;
                        if (j3 > j7) {
                            j2 = Long.MIN_VALUE;
                            xu5 = xu53;
                        }
                    }
                    xu5 = xu53;
                    j2 = j7;
                } else {
                    xu5 = xu53;
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
                xu5 = null;
            }
            if (s79.b != -1) {
                r79 r792 = (r79) hashMap.get(1);
                r792.getClass();
                xu5 xu54 = r792.a;
                xu54.getClass();
                xu52 = xu54;
            } else {
                xu52 = null;
            }
            t79 t79 = new t79(j5, j2, xu5, xu52);
            vx3.i(h64);
            return t79;
        } catch (Throwable th) {
            vx3.i(h64);
            throw th;
        }
    }
}
