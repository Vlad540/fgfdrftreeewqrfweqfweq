package defpackage;

import java.util.List;

/* renamed from: am4  reason: default package */
public abstract class am4 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[Catch:{ Exception -> 0x0023 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.j4a a(byte[] r12, defpackage.g15 r13) {
        /*
            int r0 = r12.length
            r1 = 0
            if (r0 != 0) goto L_0x0005
            return r1
        L_0x0005:
            gib r0 = new gib     // Catch:{ Exception -> 0x0023 }
            r0.<init>()     // Catch:{ Exception -> 0x0023 }
            gr8 r12 = gr8.mergeFrom(r0, r12)     // Catch:{ Exception -> 0x0023 }
            gib r12 = (defpackage.gib) r12     // Catch:{ Exception -> 0x0023 }
            java.lang.String r0 = r12.b     // Catch:{ Exception -> 0x0023 }
            ru.ok.tamtam.nano.Protos$MessageElements r2 = r12.i     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0025
            ru.ok.tamtam.nano.Protos$MessageElement[] r3 = r2.elements     // Catch:{ Exception -> 0x0023 }
            if (r3 == 0) goto L_0x0025
            int r3 = r3.length     // Catch:{ Exception -> 0x0023 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0025
        L_0x001e:
            java.util.ArrayList r2 = defpackage.gp8.a(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r12 = move-exception
            goto L_0x0064
        L_0x0025:
            r2 = r1
        L_0x0026:
            h97 r6 = new h97     // Catch:{ Exception -> 0x0023 }
            r6.<init>(r0, r2)     // Catch:{ Exception -> 0x0023 }
            j4a r0 = new j4a     // Catch:{ Exception -> 0x0023 }
            long r4 = r12.k     // Catch:{ Exception -> 0x0023 }
            long r2 = r12.d     // Catch:{ Exception -> 0x0023 }
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0039
            r2 = r1
            goto L_0x003d
        L_0x0039:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0023 }
        L_0x003d:
            long r9 = r12.c     // Catch:{ Exception -> 0x0023 }
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0045
            r9 = r1
            goto L_0x004a
        L_0x0045:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0023 }
            r9 = r3
        L_0x004a:
            long r10 = r12.h     // Catch:{ Exception -> 0x0023 }
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0052
            r10 = r1
            goto L_0x0057
        L_0x0052:
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0023 }
            r10 = r3
        L_0x0057:
            boolean r12 = r12.j     // Catch:{ Exception -> 0x0023 }
            r11 = 64
            r3 = r0
            r7 = r2
            r8 = r9
            r9 = r10
            r10 = r12
            r3.<init>((long) r4, (defpackage.h97) r6, (java.lang.Long) r7, (java.lang.Long) r8, (java.lang.Long) r9, (boolean) r10, (int) r11)     // Catch:{ Exception -> 0x0023 }
            return r0
        L_0x0064:
            java.lang.Class<am4> r0 = defpackage.am4.class
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "Can't parse draft"
            udd.s(r0, r2, r12)
            if (r13 == 0) goto L_0x007c
            ru.ok.tamtam.util.HandledException r12 = new ru.ok.tamtam.util.HandledException
            r12.<init>(r2)
            r0 = 1
            r4a r13 = (r4a) r13
            r13.c(r12, r0)
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am4.a(byte[], g15):j4a");
    }

    public static byte[] b(j4a j4a) {
        boolean z = j4a instanceof j4a;
        byte[] bArr = iu7.o;
        if (!z || j4a.d()) {
            return bArr;
        }
        gib gib = new gib();
        gib.k = j4a.a;
        h97 h97 = j4a.b;
        if (!swb.B(h97)) {
            gib.b = h97.a;
            List list = h97.b;
            if (list != null && !list.isEmpty()) {
                gib.i = gp8.c(list);
            }
        }
        Long l = j4a.d;
        long j = 0;
        gib.c = l != null ? l.longValue() : 0;
        Long l2 = j4a.c;
        gib.d = l2 != null ? l2.longValue() : 0;
        Long l3 = j4a.e;
        if (l3 != null) {
            j = l3.longValue();
        }
        gib.h = j;
        gib.j = j4a.f;
        return gr8.toByteArray(gib);
    }
}
