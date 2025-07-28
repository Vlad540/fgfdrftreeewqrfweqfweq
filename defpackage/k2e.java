package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.ApiException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: k2e  reason: default package */
public final class k2e implements icf, of3, cr3 {
    public Object a;

    public k2e() {
        this.a = j06.o;
    }

    public static List c(List list, v1b v1b) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ep0 ep0 = (ep0) list.get(i);
            try {
                if (v1b.test(ep0)) {
                    String str = ep0.c;
                    arrayList.add(new e2e((ep0.a * 31) + ((long) i), 3, str, ep0.d, str, (String) null, (l2b) null, (String) null));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static p2e d(String str, int i, n62 n62) {
        int i2;
        boolean z = true;
        boolean z2 = !str.isEmpty() && str.charAt(0) == '/';
        n62 n622 = n62.a;
        p2e p2e = p2e.c;
        p2e p2e2 = p2e.o;
        if (n62 == n622) {
            if (ehe.d.matcher(str).matches()) {
                return p2e2;
            }
            if (z2) {
                return p2e;
            }
        }
        if (ehe.b.matcher(str).matches() || ehe.e.matcher(str).matches() || z2) {
            return p2e;
        }
        if (ehe.f.matcher(str).matches()) {
            return p2e2;
        }
        if (!str.isEmpty() && str.charAt(0) == '@') {
            if (r1g.p(str)) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '@') {
                        i2++;
                    }
                }
            }
            if (i2 == 1 && !str.contains(" ") && !str.endsWith("\n")) {
                return p2e.a;
            }
        }
        String h = h(i, str);
        int e = e(i, str);
        boolean p = r1g.p(h);
        p2e p2e3 = p2e.X;
        if (p) {
            return p2e3;
        }
        if (e != 0) {
            char charAt = str.charAt(e - 1);
            if (!(charAt == ' ' || charAt == 10)) {
                z = false;
            }
        }
        return (h.charAt(0) != '@' || !z || h.endsWith(" ") || h.endsWith("\n")) ? p2e3 : p2e.b;
    }

    public static int e(int i, CharSequence charSequence) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char charAt = charSequence.charAt(i2);
            if (charAt == ' ' || charAt == 10) {
                return -1;
            }
            if (charSequence.charAt(i2) == '@') {
                return i2;
            }
        }
        return 0;
    }

    public static String h(int i, String str) {
        if (r1g.p(str)) {
            return str;
        }
        int e = e(i, str);
        while (true) {
            if (i >= str.length()) {
                i = str.length();
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == ' ' || charAt == 10) {
                break;
            }
            i++;
        }
        return (e == i || e < 0 || i < 0) ? "" : str.substring(e, i);
    }

    public zg9 a(int i) {
        List list = (List) ((SparseArray) this.a).get(i);
        if (list != null && !list.isEmpty()) {
            return (zg9) list.get(0);
        }
        throw new IllegalArgumentException(wn6.h(i, "Cannot find the wrapper for global view type "));
    }

    public void accept(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        cia cia = (cia) this.a;
        double abs = Math.abs(doubleValue - cia.i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cac cac = cia.a;
        boolean z = false;
        boolean z2 = abs > cac.a;
        if (elapsedRealtime - cia.j > ((long) cac.c)) {
            z = true;
        }
        u16 u16 = cia.f;
        if (z2 || z) {
            cia.j = elapsedRealtime;
            u16.invoke("submit p2p network status");
            cia.i = doubleValue;
            cia.e.invoke(Double.valueOf(doubleValue));
            return;
        }
        u16.invoke("not valuable network status diff: " + abs + ": " + cia.i + " -> " + doubleValue);
    }

    public hcf b(zg9 zg9) {
        return new d4b(this, zg9, false, 14);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List f(java.lang.String r11, int r12, java.util.List r13, defpackage.j2e r14) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.a
            n62 r10 = (defpackage.n62) r10
            p2e r0 = d(r11, r12, r10)
            int r0 = r0.ordinal()
            r1 = 64
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00c9
            if (r0 == r3) goto L_0x00af
            r12 = 2
            if (r0 == r12) goto L_0x0096
            r14 = 3
            if (r0 == r14) goto L_0x0020
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x0020:
            java.lang.String r14 = "\\s"
            java.lang.String[] r14 = r11.split(r14)
            n62 r0 = defpackage.n62.a
            if (r10 != r0) goto L_0x0032
            int r12 = r14.length
            if (r12 < r3) goto L_0x0030
            r12 = r14[r2]
            goto L_0x003f
        L_0x0030:
            r12 = r11
            goto L_0x003f
        L_0x0032:
            int r1 = r14.length
            if (r1 < r12) goto L_0x0030
            r12 = r14[r2]
            r14 = r14[r3]
            java.lang.String r1 = " "
            java.lang.String r12 = defpackage.me4.i(r12, r1, r14)
        L_0x003f:
            q52 r14 = new q52
            r1 = 8
            r14.<init>(r12, r1)
            java.util.List r12 = c(r13, r14)
            if (r10 != r0) goto L_0x004f
            java.util.regex.Pattern r10 = defpackage.ehe.d
            goto L_0x0051
        L_0x004f:
            java.util.regex.Pattern r10 = defpackage.ehe.f
        L_0x0051:
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L_0x0091
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r11 = r12.size()
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L_0x006a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e3
            java.lang.Object r12 = r11.next()
            e2e r12 = (defpackage.e2e) r12     // Catch:{ all -> 0x008a }
            e2e r13 = new e2e     // Catch:{ all -> 0x008a }
            long r1 = r12.a     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r12.d     // Catch:{ all -> 0x008a }
            r7 = 0
            r8 = 0
            r3 = 4
            r9 = 0
            r4 = 0
            r0 = r13
            r5 = r6
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008a }
            r10.add(r13)     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x008a:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L_0x0091:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x0096:
            q52 r10 = new q52
            r12 = 7
            r10.<init>(r11, r12)
            java.util.List r10 = c(r13, r10)
            r11 = r10
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00aa
            goto L_0x00e3
        L_0x00aa:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x00af:
            java.lang.String r10 = h(r12, r11)
            int r11 = r10.length()
            if (r11 != r3) goto L_0x00c4
            char r11 = r10.charAt(r2)
            if (r11 != r1) goto L_0x00c4
            java.util.List r10 = r14.c()
            goto L_0x00e3
        L_0x00c4:
            java.util.List r10 = r14.g(r10)
            goto L_0x00e3
        L_0x00c9:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = r11.length()
            if (r12 != r3) goto L_0x00dc
            char r12 = r11.charAt(r2)
            if (r12 != r1) goto L_0x00dc
            java.util.List r11 = r14.c()
            goto L_0x00e0
        L_0x00dc:
            java.util.List r11 = r14.g(r11)
        L_0x00e0:
            r10.<init>(r11)
        L_0x00e3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2e.f(java.lang.String, int, java.util.List, j2e):java.util.List");
    }

    public Long g() {
        Long l = (Long) this.a;
        Long valueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
        return valueOf;
    }

    public void i(long j, long j2) {
        kqe kqe = (kqe) this.a;
        m55 m55 = kqe.q;
        m55.getClass();
        boolean z = true;
        oyb.d(j >= 0 || j == -9223372036854775807L);
        m55.b = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        oyb.c("Invalid file size = " + j2, z);
        m55.c = j2;
        oqe oqe = kqe.r;
        oqe.getClass();
        oqe.g();
        oqe.j.b((Object) null, 4, 0, 0).b();
    }

    public Object l(n6g n6g) {
        v2b v2b = (v2b) this.a;
        if (!n6g.h() && !((n6g) n6g).d) {
            ApiException e = n6g.e();
            if (e instanceof ApiException) {
                int i = e.a.a;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    w4g w4g = (w4g) v2b.c;
                    w4g.getClass();
                    vde vde = new vde();
                    ((ExecutorService) w4g.o).execute(new mzf(w4g, 2, vde));
                    n6g = vde.a;
                } else if (i == 43000) {
                    n6g = gwf.n(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                } else if (i == 15) {
                    return gwf.n(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return n6g;
    }

    public /* synthetic */ k2e(Object obj) {
        this.a = obj;
    }
}
