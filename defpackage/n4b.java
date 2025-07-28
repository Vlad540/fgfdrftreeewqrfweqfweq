package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: n4b  reason: default package */
public final class n4b {
    public final Context a;
    public final t97 b;
    public final tt0 c;
    public final t97 d;

    public n4b(Context context, t97 t97, tt0 tt0, t97 t972) {
        this.a = context;
        this.b = t97;
        this.c = tt0;
        this.d = t972;
    }

    public final boolean a(eq3 eq3) {
        vqc vqc = (vqc) ((xzc) this.d.getValue());
        vqc.getClass();
        return eq3.b <= ((long) ((int) vqc.o(PmsKey.f43imagesize, (long) 40000000)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: xia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: eq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: eq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: xia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: eq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: xia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: xia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: xia} */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, z00] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, z00] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object, k00] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r2v22, types: [u00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.Object, m00] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xia b(defpackage.o2 r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 1
            boolean r4 = r1 instanceof defpackage.nz
            if (r4 == 0) goto L_0x0014
            r0 = r1
            nz r0 = (defpackage.nz) r0
            o10 r0 = r0.c
            xia r2 = new xia
            r2.<init>(r1, r0)
            return r2
        L_0x0014:
            boolean r4 = r1 instanceof defpackage.r65
            r4 = r4 ^ r3
            r6 = 0
            java.lang.String r7 = "n4b"
            r8 = 7
            r9 = 11
            r10 = 3
            t97 r11 = r0.b
            if (r4 == 0) goto L_0x028a
            java.lang.String r4 = r19.a()
            boolean r12 = r1g.p(r4)
            if (r12 == 0) goto L_0x0033
            java.lang.String r12 = "uri string is empty or null"
            udd.s(r7, r12, r6)
            r12 = r6
            goto L_0x003f
        L_0x0033:
            java.lang.Object r12 = r11.getValue()
            u98 r12 = (defpackage.u98) r12
            xh0 r12 = (defpackage.xh0) r12
            eq3 r12 = r12.c(r4)
        L_0x003f:
            tt0 r13 = r0.c
            int r14 = r1.a
            if (r12 != 0) goto L_0x0055
            oxc r0 = new oxc
            java.lang.String r4 = "file.local.get.content.uri"
            r0.<init>(r4)
            r13.c(r0)
            r2 = r6
            r12 = r2
            r17 = r11
            goto L_0x018f
        L_0x0055:
            r15 = 0
            long r5 = r12.b
            int r15 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x0170
            t97 r15 = r0.d
            if (r14 != r3) goto L_0x0068
            boolean r5 = r0.a(r12)
        L_0x0065:
            r17 = r11
            goto L_0x00b0
        L_0x0068:
            if (r14 == r10) goto L_0x006c
            if (r14 != r9) goto L_0x006f
        L_0x006c:
            r17 = r11
            goto L_0x00af
        L_0x006f:
            if (r20 == 0) goto L_0x008e
            boolean r16 = r12.a()
            if (r16 != 0) goto L_0x007d
            boolean r16 = r12.b()
            if (r16 == 0) goto L_0x008e
        L_0x007d:
            boolean r5 = r12.a()
            if (r5 == 0) goto L_0x008c
            boolean r5 = r0.a(r12)
            if (r5 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r5 = 0
            goto L_0x0065
        L_0x008c:
            r5 = r3
            goto L_0x0065
        L_0x008e:
            java.lang.Object r16 = r15.getValue()
            xzc r16 = (defpackage.xzc) r16
            r2 = r16
            vqc r2 = (defpackage.vqc) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f39fileuploadmaxsize
            r17 = r11
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r9 = r2.o(r9, r10)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r5 = 0
            goto L_0x00b0
        L_0x00af:
            r5 = r3
        L_0x00b0:
            if (r5 != 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is bigger than max upload size: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            udd.s(r7, r0, r2)
            oxc r0 = new oxc
            java.lang.String r2 = "file.local.max.size.reached"
            r0.<init>(r2)
            r13.c(r0)
        L_0x00ce:
            r2 = 0
            r12 = 0
            goto L_0x018f
        L_0x00d2:
            java.lang.String r2 = r12.c
            boolean r5 = r1g.p(r2)
            if (r5 == 0) goto L_0x00dd
            if (r14 == r8) goto L_0x0120
            goto L_0x0122
        L_0x00dd:
            java.lang.Object r5 = r15.getValue()
            xzc r5 = (defpackage.xzc) r5
            vqc r5 = (defpackage.vqc) r5
            r5.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f40fileuploadunsupportedtypes
            java.lang.String r9 = "exe"
            java.util.List r9 = java.util.Collections.singletonList(r9)
            java.util.List r5 = r5.r(r6, r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x00f8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0122
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = r2.toLowerCase()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "."
            r10.<init>(r11)
            java.lang.String r6 = r6.toLowerCase()
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x00f8
        L_0x0120:
            r2 = 0
            goto L_0x0123
        L_0x0122:
            r2 = r3
        L_0x0123:
            if (r2 != 0) goto L_0x0143
            oxc r0 = new oxc
            java.lang.String r2 = "file.local.unsupported.media.type"
            r0.<init>(r2)
            r13.c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, unsupported media type: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            udd.s(r7, r0, r2)
        L_0x0141:
            r12 = r2
            goto L_0x018f
        L_0x0143:
            r2 = 0
            android.net.Uri r5 = android.net.Uri.parse(r4)
            android.content.Context r0 = r0.a
            boolean r0 = js.y(r5, r0, r2)
            if (r0 == 0) goto L_0x016e
            java.lang.String[] r0 = defpackage.bf5.a
            r2 = 0
        L_0x0153:
            r5 = 9
            if (r2 >= r5) goto L_0x0163
            r5 = r0[r2]
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x0161
            r0 = r3
            goto L_0x0164
        L_0x0161:
            int r2 = r2 + r3
            goto L_0x0153
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "try to share private file"
            r2 = 0
            udd.s(r7, r0, r2)
            goto L_0x00ce
        L_0x016e:
            r2 = 0
            goto L_0x018f
        L_0x0170:
            r17 = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is empty: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            udd.s(r7, r0, r2)
            oxc r0 = new oxc
            java.lang.String r4 = "file.local.max.zero.size"
            r0.<init>(r4)
            r13.c(r0)
            goto L_0x0141
        L_0x018f:
            if (r12 != 0) goto L_0x0192
            return r2
        L_0x0192:
            java.lang.String r0 = r12.e
            boolean r2 = r1g.p(r0)
            if (r2 != 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            java.lang.String r0 = r19.a()
        L_0x019f:
            java.lang.String r2 = r12.c
            if (r14 == r3) goto L_0x01bd
            r4 = 3
            if (r14 == r4) goto L_0x01bd
            r4 = 11
            if (r14 == r4) goto L_0x01bd
            if (r14 != r8) goto L_0x01bb
            if (r20 == 0) goto L_0x01bb
            boolean r4 = r12.a()
            if (r4 != 0) goto L_0x01bd
            boolean r4 = r12.b()
            if (r4 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r9 = 0
            goto L_0x020d
        L_0x01bd:
            java.lang.Object r4 = r17.getValue()
            u98 r4 = (defpackage.u98) r4
            xh0 r4 = (defpackage.xh0) r4
            r4.getClass()
            android.net.Uri r5 = android.net.Uri.parse(r0)
            wu4 r6 = r4.d
            android.content.Context r9 = r4.a
            java.lang.String r5 = js.t(r9, r5, r6)
            boolean r6 = lp.o(r5)
            if (r6 == 0) goto L_0x01dd
            r0 = r5
            r9 = 0
            goto L_0x0201
        L_0x01dd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "process: failed to get path from uri: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "xh0"
            r9 = 0
            udd.s(r6, r5, r9)
            java.lang.String r0 = r4.a(r0, r2)
            boolean r4 = lp.o(r0)
            if (r4 != 0) goto L_0x0201
            java.lang.String r0 = "process: failed to get path with copy"
            udd.s(r6, r0, r9)
            r0 = r9
        L_0x0201:
            if (r0 != 0) goto L_0x020d
            oxc r4 = new oxc
            java.lang.String r5 = "file.local.create.uri.copy"
            r4.<init>(r5)
            r13.c(r4)
        L_0x020d:
            if (r14 != r8) goto L_0x0231
            boolean r1 = r12.a()
            boolean r4 = r12.b()
            if (r20 == 0) goto L_0x0229
            if (r1 != 0) goto L_0x021d
            if (r4 == 0) goto L_0x0229
        L_0x021d:
            if (r1 == 0) goto L_0x0221
            r1 = r3
            goto L_0x0222
        L_0x0221:
            r1 = 3
        L_0x0222:
            ugd r2 = new ugd
            r2.<init>(r1, r0)
        L_0x0227:
            r1 = r2
            goto L_0x0288
        L_0x0229:
            me5 r1 = new me5
            long r4 = r12.b
            r1.<init>(r4, r0, r2)
            goto L_0x0288
        L_0x0231:
            java.lang.String r2 = r19.a()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0288
            if (r14 == r3) goto L_0x0283
            r2 = 2
            if (r14 == r2) goto L_0x0277
            r2 = 3
            if (r14 == r2) goto L_0x025f
            r2 = 11
            if (r14 == r2) goto L_0x0248
            goto L_0x0288
        L_0x0248:
            boolean r4 = r1 instanceof defpackage.g5f
            if (r4 == 0) goto L_0x0259
            g5f r1 = (defpackage.g5f) r1
            g5f r4 = new g5f
            f3f r5 = r1.c
            java.lang.String r1 = r1.o
            r4.<init>(r2, r0, r5, r1)
            r1 = r4
            goto L_0x0288
        L_0x0259:
            ugd r1 = new ugd
            r1.<init>(r2, r0)
            goto L_0x0288
        L_0x025f:
            boolean r2 = r1 instanceof defpackage.g5f
            if (r2 == 0) goto L_0x0270
            g5f r1 = (defpackage.g5f) r1
            g5f r2 = new g5f
            f3f r4 = r1.c
            java.lang.String r1 = r1.o
            r5 = 3
            r2.<init>(r5, r0, r4, r1)
            goto L_0x0227
        L_0x0270:
            r5 = 3
            ugd r1 = new ugd
            r1.<init>(r5, r0)
            goto L_0x0288
        L_0x0277:
            l40 r1 = (defpackage.l40) r1
            l40 r2 = new l40
            long r4 = r1.c
            byte[] r1 = r1.o
            r2.<init>(r0, r4, r1)
            goto L_0x0227
        L_0x0283:
            ugd r1 = new ugd
            r1.<init>(r3, r0)
        L_0x0288:
            r2 = r12
            goto L_0x028e
        L_0x028a:
            r9 = r6
            r17 = r11
            r2 = r9
        L_0x028e:
            int r0 = r1.a
            g10 r4 = defpackage.g10.X
            if (r0 == r3) goto L_0x03b6
            r5 = 2
            if (r0 == r5) goto L_0x038a
            r2 = 3
            if (r0 == r2) goto L_0x02e9
            if (r0 == r8) goto L_0x02bd
            r2 = 10
            if (r0 == r2) goto L_0x02b7
            r2 = 11
            if (r0 != r2) goto L_0x02a5
            goto L_0x02e9
        L_0x02a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = "Unknown media type %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x02b7:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x02bd:
            r0 = r1
            me5 r0 = (defpackage.me5) r0
            u00 r2 = new u00
            r2.<init>()
            long r5 = r0.c
            r2.b = r5
            java.lang.String r3 = r0.o
            r2.c = r3
            v00 r3 = new v00
            r3.<init>(r2)
            m00 r2 = new m00
            r2.<init>()
            java.lang.String r0 = r0.b
            r2.m = r0
            r2.r = r3
            j10 r0 = defpackage.j10.y0
            r2.a = r0
            r2.i = r4
            o10 r0 = r2.a()
            goto L_0x0487
        L_0x02e9:
            java.lang.String r0 = r1.a()
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "getVideoAttach: retrieve params started"
            udd.q(r7, r2)
            java.lang.Object r2 = r17.getValue()
            u98 r2 = (defpackage.u98) r2
            xh0 r2 = (defpackage.xh0) r2
            e7f r2 = r2.d(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "getVideoAttach: retrieve params finished "
            r6.<init>(r8)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            udd.q(r7, r6)
            boolean r6 = r1 instanceof defpackage.g5f
            long r7 = r2.d
            java.lang.String r10 = r2.a
            if (r6 == 0) goto L_0x0353
            r6 = r1
            g5f r6 = (defpackage.g5f) r6
            f3f r11 = r6.c
            if (r11 == 0) goto L_0x0353
            int r9 = defpackage.m10.e
            l10 r9 = new l10
            r12 = 0
            r9.<init>(r12)
            float r12 = r11.b
            r9.b = r12
            float r12 = r11.c
            r9.c = r12
            qjb r12 = r11.a
            r9.a = r12
            boolean r11 = r11.d
            r9.d = r11
            m10 r11 = new m10
            r11.<init>(r9)
            float r7 = (float) r7
            float r8 = r11.b
            float r9 = r11.a
            float r8 = r8 - r9
            float r8 = r8 * r7
            long r7 = (long) r8
            java.lang.String r6 = r6.o
            if (r6 == 0) goto L_0x0351
            r10 = r6
        L_0x0351:
            r6 = r11
            goto L_0x0354
        L_0x0353:
            r6 = r9
        L_0x0354:
            int r9 = r1.a
            r11 = 11
            if (r9 != r11) goto L_0x035b
            r3 = r5
        L_0x035b:
            k10 r5 = new k10
            r5.<init>()
            r5.b = r7
            r5.q = r3
            int r3 = r2.b
            r5.d = r3
            int r2 = r2.c
            r5.e = r2
            r5.c = r10
            r5.k = r6
            n10 r2 = new n10
            r2.<init>(r5)
            m00 r3 = new m00
            r3.<init>()
            r3.d = r2
            j10 r2 = defpackage.j10.o
            r3.a = r2
            r3.i = r4
            r3.m = r0
            o10 r0 = r3.a()
            goto L_0x0487
        L_0x038a:
            r0 = r1
            l40 r0 = (defpackage.l40) r0
            k00 r2 = new k00
            r2.<init>()
            long r5 = r0.c
            r2.c = r5
            byte[] r3 = r0.o
            r2.d = r3
            l00 r3 = new l00
            r3.<init>(r2)
            m00 r2 = new m00
            r2.<init>()
            r2.e = r3
            j10 r3 = defpackage.j10.X
            r2.a = r3
            r2.i = r4
            java.lang.String r0 = r0.b
            r2.m = r0
            o10 r0 = r2.a()
            goto L_0x0487
        L_0x03b6:
            r12 = 0
            boolean r0 = r1 instanceof defpackage.r65
            r0 = r0 ^ r3
            j10 r5 = defpackage.j10.c
            if (r0 == 0) goto L_0x044f
            java.lang.Object r0 = r17.getValue()
            u98 r0 = (defpackage.u98) r0
            java.lang.String r6 = r1.a()
            xh0 r0 = (defpackage.xh0) r0
            r0.getClass()
            android.graphics.Point r0 = at7.r(r6, r3)
            int r6 = r0.x
            int r0 = r0.y
            java.lang.Object r7 = r17.getValue()
            u98 r7 = (defpackage.u98) r7
            xh0 r7 = (defpackage.xh0) r7
            r7.getClass()
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>(r6, r0)
            xzc r0 = r7.c
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f44imagewidth
            r7 = 1920(0x780, float:2.69E-42)
            long r9 = (long) r7
            long r6 = r0.o(r6, r9)
            int r6 = (int) r6
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f41imageheight
            long r9 = r0.o(r7, r9)
            int r0 = (int) r9
            int r0 = at7.v(r8, r6, r0)
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = r8.x
            int r7 = r7 / r0
            int r8 = r8.y
            int r8 = r8 / r0
            r6.<init>(r7, r8)
            int r0 = r6.x
            int r6 = r6.y
            java.lang.String r7 = r2.d
            boolean r7 = r1g.p(r7)
            if (r7 != 0) goto L_0x0428
            java.lang.String r2 = r2.d
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r7 = "gif"
            boolean r2 = r2.endsWith(r7)
            if (r2 == 0) goto L_0x0428
            r2 = r3
            goto L_0x0429
        L_0x0428:
            r2 = r12
        L_0x0429:
            z00 r3 = new z00
            r3.<init>()
            r3.c = r0
            r3.d = r6
            r3.e = r2
            a10 r0 = new a10
            r0.<init>(r3)
            m00 r2 = new m00
            r2.<init>()
            r2.b = r0
            r2.a = r5
            r2.i = r4
            java.lang.String r0 = r1.a()
            r2.m = r0
            o10 r0 = r2.a()
            goto L_0x0487
        L_0x044f:
            r0 = r1
            r65 r0 = (defpackage.r65) r0
            z00 r2 = new z00
            r2.<init>()
            int r4 = r0.c
            r2.c = r4
            int r4 = r0.o
            r2.d = r4
            r2.e = r3
            java.lang.String r3 = r0.b
            r2.i = r3
            java.lang.String r3 = r0.Y
            r2.j = r3
            java.lang.String r3 = r0.Z
            r2.b = r3
            a10 r3 = new a10
            r3.<init>(r2)
            m00 r2 = new m00
            r2.<init>()
            r2.b = r3
            r2.a = r5
            g10 r3 = defpackage.g10.c
            r2.i = r3
            java.lang.String r0 = r0.X
            r2.m = r0
            o10 r0 = r2.a()
        L_0x0487:
            xia r2 = new xia
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4b.b(o2, boolean):xia");
    }
}
