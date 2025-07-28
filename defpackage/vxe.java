package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: vxe  reason: default package */
public final class vxe {
    public final Context a;
    public final b39 b;
    public final a15 c;
    public final i37 d;
    public final Executor e;
    public final m7e f;
    public final eye g;
    public final eye h;
    public final a03 i;

    public vxe(Context context, b39 b39, a15 a15, i37 i37, Executor executor, m7e m7e, eye eye, eye eye2, a03 a03) {
        this.a = context;
        this.b = b39;
        this.c = a15;
        this.d = i37;
        this.e = executor;
        this.f = m7e;
        this.g = eye;
        this.h = eye2;
        this.i = a03;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r4v80, types: [l83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v30, types: [l83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [yd3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        defpackage.n1g.v("CctTransportBackend");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r0 = new defpackage.tu1(400, (java.net.URL) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        defpackage.n1g.v("CctTransportBackend");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0553, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r0 = new defpackage.tu1(500, (java.net.URL) null, 0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:227:0x0535 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:234:0x054e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x041e A[SYNTHETIC, Splitter:B:126:0x041e] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0434 A[Catch:{ all -> 0x04a9, all -> 0x04b1, all -> 0x04a0, all -> 0x04bd, IOException -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x045b A[Catch:{ all -> 0x04a9, all -> 0x04b1, all -> 0x04a0, all -> 0x04bd, IOException -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x045d A[Catch:{ all -> 0x04a9, all -> 0x04b1, all -> 0x04a0, all -> 0x04bd, IOException -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0521 A[SYNTHETIC, Splitter:B:218:0x0521] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0561 A[Catch:{ IOException -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0577 A[Catch:{ IOException -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x057a A[Catch:{ IOException -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0592 A[Catch:{ IOException -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x052a A[EDGE_INSN: B:313:0x052a->B:224:0x052a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x058b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0385 A[Catch:{ IOException -> 0x05cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03c9 A[Catch:{ IOException -> 0x05cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.hb0 r49, int r50) {
        /*
            r48 = this;
            r7 = r48
            r8 = r49
            r2 = 3
            r9 = 1
            r3 = 0
            b39 r0 = r7.b
            java.lang.String r4 = r8.a
            qre r4 = r0.a(r4)
            r10 = 0
        L_0x0011:
            uxe r0 = new uxe
            r0.<init>(r7, r8, r3)
            m7e r12 = r7.f
            xic r12 = (defpackage.xic) r12
            java.lang.Object r0 = r12.e0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x068e
            uxe r0 = new uxe
            r0.<init>(r7, r8, r9)
            java.lang.Object r0 = r12.e0(r0)
            r13 = r0
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x003d
            return
        L_0x003d:
            r5 = -1
            byte[] r15 = r8.b
            if (r4 != 0) goto L_0x005f
            java.lang.String r0 = "Uploader"
            java.lang.String r9 = "Unknown backend for %s, deleting event batch for it..."
            defpackage.n1g.h(r0, r9, r8)
            q80 r0 = new q80
            r0.<init>(r2, r5)
            r3 = r2
            r30 = r4
            r32 = r10
            r34 = r12
            r35 = r13
            r31 = r15
            r1 = 0
        L_0x005c:
            r4 = 2
            goto L_0x05e0
        L_0x005f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r13.iterator()
        L_0x0068:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x007c
            java.lang.Object r16 = r9.next()
            r14 = r16
            fa0 r14 = (defpackage.fa0) r14
            i90 r14 = r14.c
            r0.add(r14)
            goto L_0x0068
        L_0x007c:
            if (r15 == 0) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = r3
        L_0x0081:
            java.lang.String r14 = "proto"
            if (r9 == 0) goto L_0x00eb
            a03 r9 = r7.i
            java.util.Objects.requireNonNull(r9)
            xle r5 = new xle
            r5.<init>(r2, r9)
            java.lang.Object r5 = r12.e0(r5)
            e03 r5 = (defpackage.e03) r5
            yd3 r6 = new yd3
            r6.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f = r9
            eye r9 = r7.g
            long r17 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r6.d = r9
            eye r9 = r7.h
            long r17 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r6.e = r9
            java.lang.String r9 = "GDT_CLIENT_METRICS"
            r6.a = r9
            cx4 r9 = new cx4
            cy4 r2 = new cy4
            r2.<init>(r14)
            r5.getClass()
            jj7 r1 = defpackage.ohb.a
            r1.getClass()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1.t(r5, r3)     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            byte[] r1 = r3.toByteArray()
            r9.<init>(r2, r1)
            r6.c = r9
            i90 r1 = r6.c()
            r2 = r4
            lx1 r2 = (defpackage.lx1) r2
            i90 r1 = r2.a(r1)
            r0.add(r1)
        L_0x00eb:
            r1 = r4
            lx1 r1 = (defpackage.lx1) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00f7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0121
            java.lang.Object r3 = r0.next()
            i90 r3 = (defpackage.i90) r3
            java.lang.String r5 = r3.a
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0117
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r3)
            r2.put(r5, r6)
            goto L_0x00f7
        L_0x0117:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L_0x00f7
        L_0x0121:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x012e:
            boolean r3 = r2.hasNext()
            java.lang.String r5 = "TRuntime."
            java.lang.String r6 = "CctTransportBackend"
            if (r3 == 0) goto L_0x033c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r19 = r3.getValue()
            r9 = r19
            java.util.List r9 = (java.util.List) r9
            r19 = r2
            r2 = 0
            java.lang.Object r9 = r9.get(r2)
            i90 r9 = (defpackage.i90) r9
            ljb r2 = defpackage.ljb.a
            eye r2 = r1.f
            long r22 = r2.a()
            eye r2 = r1.e
            long r24 = r2.a()
            java.lang.String r2 = "sdk-version"
            int r2 = r9.b(r2)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "model"
            java.lang.String r28 = r9.a(r2)
            java.lang.String r2 = "hardware"
            java.lang.String r29 = r9.a(r2)
            java.lang.String r2 = "device"
            java.lang.String r30 = r9.a(r2)
            java.lang.String r2 = "product"
            java.lang.String r31 = r9.a(r2)
            java.lang.String r2 = "os-uild"
            java.lang.String r32 = r9.a(r2)
            java.lang.String r2 = "manufacturer"
            java.lang.String r33 = r9.a(r2)
            java.lang.String r2 = "fingerprint"
            java.lang.String r34 = r9.a(r2)
            java.lang.String r2 = "country"
            java.lang.String r36 = r9.a(r2)
            java.lang.String r2 = "locale"
            java.lang.String r35 = r9.a(r2)
            java.lang.String r2 = "mcc_mnc"
            java.lang.String r37 = r9.a(r2)
            java.lang.String r2 = "application_build"
            java.lang.String r38 = r9.a(r2)
            j80 r2 = new j80
            r26 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            y80 r9 = new y80
            r9.<init>(r2)
            java.lang.Object r2 = r3.getKey()     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x01c8 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01c8 }
            r27 = r2
            r28 = 0
            goto L_0x01d2
        L_0x01c8:
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r28 = r2
            r27 = 0
        L_0x01d2:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x01e1:
            boolean r20 = r3.hasNext()
            if (r20 == 0) goto L_0x031a
            java.lang.Object r20 = r3.next()
            r21 = r3
            r3 = r20
            i90 r3 = (defpackage.i90) r3
            r30 = r4
            cx4 r4 = r3.c
            cy4 r8 = r4.a
            cy4 r7 = new cy4
            r7.<init>(r14)
            boolean r7 = r8.equals(r7)
            byte[] r4 = r4.b
            if (r7 == 0) goto L_0x0210
            l83 r7 = new l83
            r7.<init>()
            r7.d = r4
            r32 = r10
            r31 = r14
            goto L_0x0234
        L_0x0210:
            cy4 r7 = new cy4
            r31 = r14
            java.lang.String r14 = "json"
            r7.<init>(r14)
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0309
            java.lang.String r7 = new java.lang.String
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r7.<init>(r4, r8)
            l83 r4 = new l83
            r4.<init>()
            r4.e = r7
            r7 = r4
            r32 = r10
        L_0x0234:
            long r10 = r3.d
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7.a = r4
            long r10 = r3.e
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7.c = r4
            java.util.Map r4 = r3.f
            java.lang.String r8 = "tz-offset"
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0253
            r10 = 0
            goto L_0x025b
        L_0x0253:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r10 = r4.longValue()
        L_0x025b:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7.f = r4
            java.lang.String r4 = "net-type"
            int r4 = r3.b(r4)
            android.util.SparseArray r8 = defpackage.oh9.a
            java.lang.Object r4 = r8.get(r4)
            oh9 r4 = (defpackage.oh9) r4
            java.lang.String r8 = "mobile-subtype"
            int r8 = r3.b(r8)
            android.util.SparseArray r10 = defpackage.nh9.a
            java.lang.Object r8 = r10.get(r8)
            nh9 r8 = (defpackage.nh9) r8
            aa0 r10 = new aa0
            r10.<init>(r4, r8)
            r7.g = r10
            java.lang.Integer r3 = r3.b
            if (r3 == 0) goto L_0x028a
            r7.b = r3
        L_0x028a:
            java.lang.Object r3 = r7.a
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L_0x0293
            java.lang.String r3 = " eventTimeMs"
            goto L_0x0295
        L_0x0293:
            java.lang.String r3 = ""
        L_0x0295:
            java.lang.Object r4 = r7.c
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02a1
            java.lang.String r4 = " eventUptimeMs"
            java.lang.String r3 = r3.concat(r4)
        L_0x02a1:
            java.lang.Object r4 = r7.f
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02ad
            java.lang.String r4 = " timezoneOffsetSeconds"
            java.lang.String r3 = defpackage.hr1.g(r3, r4)
        L_0x02ad:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02fd
            w90 r3 = new w90
            java.lang.Object r4 = r7.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r35 = r4.longValue()
            java.lang.Object r4 = r7.b
            r37 = r4
            java.lang.Integer r37 = (java.lang.Integer) r37
            java.lang.Object r4 = r7.c
            java.lang.Long r4 = (java.lang.Long) r4
            long r38 = r4.longValue()
            java.lang.Object r4 = r7.d
            r40 = r4
            byte[] r40 = (byte[]) r40
            java.lang.Object r4 = r7.e
            r41 = r4
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r4 = r7.f
            java.lang.Long r4 = (java.lang.Long) r4
            long r42 = r4.longValue()
            java.lang.Object r4 = r7.g
            ph9 r4 = (defpackage.ph9) r4
            r44 = r4
            aa0 r44 = (defpackage.aa0) r44
            r34 = r3
            r34.<init>(r35, r37, r38, r40, r41, r42, r44)
            r2.add(r3)
        L_0x02ef:
            r7 = r48
            r8 = r49
            r3 = r21
            r4 = r30
            r14 = r31
            r10 = r32
            goto L_0x01e1
        L_0x02fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x0309:
            r32 = r10
            java.lang.String r3 = r5.concat(r6)
            r4 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x02ef
            r8.toString()
            goto L_0x02ef
        L_0x031a:
            r30 = r4
            r32 = r10
            r31 = r14
            x90 r3 = new x90
            r21 = r3
            r26 = r9
            r29 = r2
            r21.<init>(r22, r24, r26, r27, r28, r29)
            r0.add(r3)
            r7 = r48
            r8 = r49
            r2 = r19
            r4 = r30
            r14 = r31
            r10 = r32
            goto L_0x012e
        L_0x033c:
            r30 = r4
            r32 = r10
            r80 r2 = new r80
            r2.<init>(r0)
            java.net.URL r0 = r1.d
            if (r15 == 0) goto L_0x036f
            zu0 r3 = defpackage.zu0.a(r15)     // Catch:{ IllegalArgumentException -> 0x035c }
            java.lang.String r4 = r3.b     // Catch:{ IllegalArgumentException -> 0x035c }
            if (r4 == 0) goto L_0x0352
            goto L_0x0353
        L_0x0352:
            r4 = 0
        L_0x0353:
            java.lang.String r3 = r3.a     // Catch:{ IllegalArgumentException -> 0x035c }
            if (r3 == 0) goto L_0x0370
            java.net.URL r0 = defpackage.lx1.b(r3)     // Catch:{ IllegalArgumentException -> 0x035c }
            goto L_0x0370
        L_0x035c:
            q80 r0 = new q80
            r1 = -1
            r3 = 3
            r0.<init>(r3, r1)
            r34 = r12
            r35 = r13
            r31 = r15
            r1 = 0
        L_0x036c:
            r3 = 3
            goto L_0x005c
        L_0x036f:
            r4 = 0
        L_0x0370:
            duf r3 = new duf     // Catch:{ IOException -> 0x05cc }
            r3.<init>((java.lang.Object) r0, (java.lang.Object) r2, (java.lang.Object) r4)     // Catch:{ IOException -> 0x05cc }
            r4 = 5
        L_0x0376:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05cc }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05cc }
            java.lang.String r2 = r5.concat(r6)     // Catch:{ IOException -> 0x05cc }
            r7 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r7)     // Catch:{ IOException -> 0x05cc }
            if (r2 == 0) goto L_0x0388
            java.util.Objects.toString(r0)     // Catch:{ IOException -> 0x05cc }
        L_0x0388:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05cc }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05cc }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x05cc }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x05cc }
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)     // Catch:{ IOException -> 0x05cc }
            int r2 = r1.g     // Catch:{ IOException -> 0x05cc }
            r0.setReadTimeout(r2)     // Catch:{ IOException -> 0x05cc }
            r2 = 1
            r0.setDoOutput(r2)     // Catch:{ IOException -> 0x05cc }
            r2 = 0
            r0.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x05cc }
            java.lang.String r7 = "POST"
            r0.setRequestMethod(r7)     // Catch:{ IOException -> 0x05cc }
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "datatransport/3.1.9 android/"
            r0.setRequestProperty(r7, r8)     // Catch:{ IOException -> 0x05cc }
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r0.setRequestProperty(r7, r8)     // Catch:{ IOException -> 0x05cc }
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "application/json"
            r0.setRequestProperty(r9, r10)     // Catch:{ IOException -> 0x05cc }
            java.lang.String r10 = "Accept-Encoding"
            r0.setRequestProperty(r10, r8)     // Catch:{ IOException -> 0x05cc }
            java.lang.Object r10 = r3.c     // Catch:{ IOException -> 0x05cc }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x05cc }
            if (r10 == 0) goto L_0x03ce
            java.lang.String r11 = "X-Goog-Api-Key"
            r0.setRequestProperty(r11, r10)     // Catch:{ IOException -> 0x05cc }
        L_0x03ce:
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch:{ ConnectException | UnknownHostException -> 0x0544, EncodingException | IOException -> 0x052b }
            java.util.zip.GZIPOutputStream r10 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0513 }
            r10.<init>(r2)     // Catch:{ all -> 0x0513 }
            mod r11 = r1.a     // Catch:{ all -> 0x0505 }
            java.lang.Object r14 = r3.b     // Catch:{ all -> 0x0501 }
            bk0 r14 = (defpackage.bk0) r14     // Catch:{ all -> 0x0501 }
            r29 = r1
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x04f7 }
            r31 = r15
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x04ef }
            r15.<init>(r10)     // Catch:{ all -> 0x04ef }
            r1.<init>(r15)     // Catch:{ all -> 0x04ef }
            r67 r15 = new r67     // Catch:{ all -> 0x04e7 }
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x04e7 }
            x57 r11 = (defpackage.x57) r11     // Catch:{ all -> 0x04e7 }
            r34 = r12
            java.util.HashMap r12 = r11.a     // Catch:{ all -> 0x04e3 }
            r35 = r13
            java.util.HashMap r13 = r11.b     // Catch:{ all -> 0x04df }
            r36 = r4
            u57 r4 = r11.c     // Catch:{ all -> 0x04dd }
            boolean r11 = r11.d     // Catch:{ all -> 0x04dd }
            r23 = r15
            r24 = r1
            r25 = r12
            r26 = r13
            r27 = r4
            r28 = r11
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04dd }
            r15.f(r14)     // Catch:{ all -> 0x04dd }
            r15.h()     // Catch:{ all -> 0x04dd }
            android.util.JsonWriter r1 = r15.b     // Catch:{ all -> 0x04dd }
            r1.flush()     // Catch:{ all -> 0x04dd }
            r10.close()     // Catch:{ all -> 0x04da }
            if (r2 == 0) goto L_0x0421
            r2.close()     // Catch:{ ConnectException | UnknownHostException -> 0x054e, EncodingException | IOException -> 0x0535 }
        L_0x0421:
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x05d2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x05d2 }
            java.lang.String r4 = r5.concat(r6)     // Catch:{ IOException -> 0x05d2 }
            r10 = 4
            boolean r4 = android.util.Log.isLoggable(r4, r10)     // Catch:{ IOException -> 0x05d2 }
            if (r4 == 0) goto L_0x043d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x05d2 }
            java.lang.String r4 = "Status Code: %d"
            java.lang.String.format(r4, r2)     // Catch:{ IOException -> 0x05d2 }
        L_0x043d:
            java.lang.String r2 = "Content-Type: %s"
            java.lang.String r4 = r0.getHeaderField(r9)     // Catch:{ IOException -> 0x05d2 }
            defpackage.n1g.h(r6, r2, r4)     // Catch:{ IOException -> 0x05d2 }
            java.lang.String r2 = "Content-Encoding: %s"
            java.lang.String r4 = r0.getHeaderField(r7)     // Catch:{ IOException -> 0x05d2 }
            defpackage.n1g.h(r6, r2, r4)     // Catch:{ IOException -> 0x05d2 }
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 == r2) goto L_0x04c3
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 == r2) goto L_0x04c3
            r2 = 307(0x133, float:4.3E-43)
            if (r1 != r2) goto L_0x045d
            goto L_0x04c3
        L_0x045d:
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x046e
            tu1 r0 = new tu1     // Catch:{ IOException -> 0x05d2 }
            r2 = 0
            r7 = 0
            r0.<init>(r1, r2, r7)     // Catch:{ IOException -> 0x04d7 }
        L_0x0469:
            r1 = 0
            r4 = 0
            goto L_0x055b
        L_0x046e:
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x05d2 }
            java.lang.String r0 = r0.getHeaderField(r7)     // Catch:{ all -> 0x04a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0483
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x04a0 }
            r0.<init>(r2)     // Catch:{ all -> 0x04a0 }
            r4 = r0
            goto L_0x0484
        L_0x0483:
            r4 = r2
        L_0x0484:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x04a9 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x04a9 }
            r7.<init>(r4)     // Catch:{ all -> 0x04a9 }
            r0.<init>(r7)     // Catch:{ all -> 0x04a9 }
            y90 r0 = defpackage.y90.a(r0)     // Catch:{ all -> 0x04a9 }
            long r7 = r0.a     // Catch:{ all -> 0x04a9 }
            tu1 r0 = new tu1     // Catch:{ all -> 0x04a9 }
            r9 = 0
            r0.<init>(r1, r9, r7)     // Catch:{ all -> 0x04a9 }
            if (r4 == 0) goto L_0x04a3
            r4.close()     // Catch:{ all -> 0x04a0 }
            goto L_0x04a3
        L_0x04a0:
            r0 = move-exception
            r1 = r0
            goto L_0x04b7
        L_0x04a3:
            if (r2 == 0) goto L_0x0469
            r2.close()     // Catch:{ IOException -> 0x05d2 }
            goto L_0x0469
        L_0x04a9:
            r0 = move-exception
            r1 = r0
            if (r4 == 0) goto L_0x04b6
            r4.close()     // Catch:{ all -> 0x04b1 }
            goto L_0x04b6
        L_0x04b1:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ all -> 0x04a0 }
        L_0x04b6:
            throw r1     // Catch:{ all -> 0x04a0 }
        L_0x04b7:
            if (r2 == 0) goto L_0x04c2
            r2.close()     // Catch:{ all -> 0x04bd }
            goto L_0x04c2
        L_0x04bd:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x05d2 }
        L_0x04c2:
            throw r1     // Catch:{ IOException -> 0x05d2 }
        L_0x04c3:
            java.lang.String r2 = "Location"
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ IOException -> 0x05d2 }
            tu1 r2 = new tu1     // Catch:{ IOException -> 0x05d2 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x05d2 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x05d2 }
            r7 = 0
            r2.<init>(r1, r4, r7)     // Catch:{ IOException -> 0x04d7 }
            r0 = r2
            goto L_0x0469
        L_0x04d7:
            r1 = r7
            goto L_0x059b
        L_0x04da:
            r0 = move-exception
        L_0x04db:
            r1 = r0
            goto L_0x051f
        L_0x04dd:
            r0 = move-exception
            goto L_0x04ed
        L_0x04df:
            r0 = move-exception
            r36 = r4
            goto L_0x04ed
        L_0x04e3:
            r0 = move-exception
            r36 = r4
            goto L_0x04f4
        L_0x04e7:
            r0 = move-exception
            r36 = r4
            r34 = r12
            goto L_0x04f4
        L_0x04ed:
            r1 = r0
            goto L_0x0509
        L_0x04ef:
            r0 = move-exception
            r36 = r4
            r34 = r12
        L_0x04f4:
            r35 = r13
            goto L_0x04ed
        L_0x04f7:
            r0 = move-exception
        L_0x04f8:
            r36 = r4
            r34 = r12
            r35 = r13
            r31 = r15
            goto L_0x04ed
        L_0x0501:
            r0 = move-exception
            r29 = r1
            goto L_0x04f8
        L_0x0505:
            r0 = move-exception
            r29 = r1
            goto L_0x04f8
        L_0x0509:
            r10.close()     // Catch:{ all -> 0x050d }
            goto L_0x0512
        L_0x050d:
            r0 = move-exception
            r4 = r0
            r1.addSuppressed(r4)     // Catch:{ all -> 0x04da }
        L_0x0512:
            throw r1     // Catch:{ all -> 0x04da }
        L_0x0513:
            r0 = move-exception
            r29 = r1
            r36 = r4
            r34 = r12
            r35 = r13
            r31 = r15
            goto L_0x04db
        L_0x051f:
            if (r2 == 0) goto L_0x052a
            r2.close()     // Catch:{ all -> 0x0525 }
            goto L_0x052a
        L_0x0525:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x054e, EncodingException | IOException -> 0x0535 }
        L_0x052a:
            throw r1     // Catch:{ ConnectException | UnknownHostException -> 0x054e, EncodingException | IOException -> 0x0535 }
        L_0x052b:
            r29 = r1
            r36 = r4
            r34 = r12
            r35 = r13
            r31 = r15
        L_0x0535:
            defpackage.n1g.v(r6)     // Catch:{ IOException -> 0x05d2 }
            tu1 r0 = new tu1     // Catch:{ IOException -> 0x05d2 }
            r1 = 0
            r4 = 0
            r7 = 400(0x190, float:5.6E-43)
            r0.<init>(r7, r4, r1)     // Catch:{ IOException -> 0x059b }
            goto L_0x0469
        L_0x0544:
            r29 = r1
            r36 = r4
            r34 = r12
            r35 = r13
            r31 = r15
        L_0x054e:
            defpackage.n1g.v(r6)     // Catch:{ IOException -> 0x05d2 }
            tu1 r0 = new tu1     // Catch:{ IOException -> 0x05d2 }
            r1 = 0
            r4 = 0
            r7 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r7, r4, r1)     // Catch:{ IOException -> 0x059b }
        L_0x055b:
            java.lang.Object r7 = r0.c     // Catch:{ IOException -> 0x059b }
            java.net.URL r7 = (java.net.URL) r7     // Catch:{ IOException -> 0x059b }
            if (r7 == 0) goto L_0x0577
            java.lang.String r8 = "Following redirect to: %s"
            defpackage.n1g.h(r6, r8, r7)     // Catch:{ IOException -> 0x059b }
            duf r8 = new duf     // Catch:{ IOException -> 0x059b }
            java.lang.Object r9 = r3.b     // Catch:{ IOException -> 0x059b }
            bk0 r9 = (defpackage.bk0) r9     // Catch:{ IOException -> 0x059b }
            java.lang.Object r3 = r3.c     // Catch:{ IOException -> 0x059b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x059b }
            r80 r9 = (defpackage.r80) r9     // Catch:{ IOException -> 0x059b }
            r8.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.Object) r3)     // Catch:{ IOException -> 0x059b }
            r3 = r8
            goto L_0x0578
        L_0x0577:
            r3 = r4
        L_0x0578:
            if (r3 == 0) goto L_0x058b
            int r7 = r36 + -1
            r8 = 1
            if (r7 >= r8) goto L_0x0580
            goto L_0x058c
        L_0x0580:
            r4 = r7
            r1 = r29
            r15 = r31
            r12 = r34
            r13 = r35
            goto L_0x0376
        L_0x058b:
            r8 = 1
        L_0x058c:
            int r3 = r0.a     // Catch:{ IOException -> 0x059b }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x059d
            long r3 = r0.b     // Catch:{ IOException -> 0x059b }
            q80 r0 = new q80     // Catch:{ IOException -> 0x059b }
            r0.<init>(r8, r3)     // Catch:{ IOException -> 0x059b }
            goto L_0x036c
        L_0x059b:
            r3 = 3
            goto L_0x05d5
        L_0x059d:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r4) goto L_0x05a5
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x05a9
        L_0x05a5:
            r3 = 3
            r4 = -1
            goto L_0x05c4
        L_0x05a9:
            r4 = 400(0x190, float:5.6E-43)
            if (r3 != r4) goto L_0x05ba
            q80 r0 = new q80     // Catch:{ IOException -> 0x05b7 }
            r3 = 4
            r4 = -1
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x059b }
            goto L_0x036c
        L_0x05b7:
            r4 = -1
            goto L_0x059b
        L_0x05ba:
            r4 = -1
            q80 r0 = new q80     // Catch:{ IOException -> 0x059b }
            r3 = 3
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x05d5 }
            goto L_0x005c
        L_0x05c4:
            q80 r0 = new q80     // Catch:{ IOException -> 0x05d5 }
            r7 = 2
            r0.<init>(r7, r4)     // Catch:{ IOException -> 0x05d5 }
            goto L_0x005c
        L_0x05cc:
            r34 = r12
            r35 = r13
            r31 = r15
        L_0x05d2:
            r1 = 0
            goto L_0x059b
        L_0x05d5:
            defpackage.n1g.v(r6)
            q80 r0 = new q80
            r4 = 2
            r5 = -1
            r0.<init>(r4, r5)
        L_0x05e0:
            int r5 = r0.a
            if (r5 != r4) goto L_0x0604
            vd4 r0 = new vd4
            r1 = r0
            r2 = r48
            r3 = r35
            r4 = r49
            r5 = r32
            r1.<init>((defpackage.vxe) r2, (java.lang.Iterable) r3, (defpackage.hb0) r4, (long) r5)
            r12 = r34
            r12.e0(r0)
            r4 = 1
            int r0 = r50 + 1
            r6 = r48
            i37 r1 = r6.d
            r7 = r49
            r1.a(r7, r0, r4)
            return
        L_0x0604:
            r6 = r48
            r7 = r49
            r12 = r34
            r4 = 1
            joc r8 = new joc
            r9 = 13
            r10 = r35
            r8.<init>(r6, r9, r10)
            r12.e0(r8)
            if (r5 != r4) goto L_0x0631
            long r4 = r0.b
            r8 = r32
            long r10 = java.lang.Math.max(r8, r4)
            if (r31 == 0) goto L_0x062d
            xle r0 = new xle
            r4 = 5
            r0.<init>(r4, r6)
            r12.e0(r0)
            goto L_0x062e
        L_0x062d:
            r4 = 5
        L_0x062e:
            r8 = r10
        L_0x062f:
            r11 = 1
            goto L_0x067e
        L_0x0631:
            r8 = r32
            r4 = 5
            r11 = 4
            if (r5 != r11) goto L_0x062f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r5 = r10.iterator()
        L_0x0640:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0673
            java.lang.Object r10 = r5.next()
            fa0 r10 = (defpackage.fa0) r10
            i90 r10 = r10.c
            java.lang.String r10 = r10.a
            boolean r11 = r0.containsKey(r10)
            if (r11 != 0) goto L_0x065f
            r11 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.put(r10, r13)
            goto L_0x0640
        L_0x065f:
            r11 = 1
            java.lang.Object r13 = r0.get(r10)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r13 = r13 + r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.put(r10, r13)
            goto L_0x0640
        L_0x0673:
            r11 = 1
            joc r5 = new joc
            r10 = 14
            r5.<init>(r6, r10, r0)
            r12.e0(r5)
        L_0x067e:
            r2 = r3
            r4 = r30
            r3 = 0
            r45 = r7
            r7 = r6
            r46 = r8
            r8 = r45
            r9 = r11
            r10 = r46
            goto L_0x0011
        L_0x068e:
            r6 = r7
            r7 = r8
            r8 = r10
            b52 r0 = new b52
            r10 = 11
            r1 = r0
            r2 = r48
            r3 = r49
            r4 = r8
            r6 = r10
            r1.<init>(r2, r3, r4, r6)
            r12.e0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxe.a(hb0, int):void");
    }
}
