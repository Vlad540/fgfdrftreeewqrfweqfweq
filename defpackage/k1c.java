package defpackage;

import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: k1c  reason: default package */
public final class k1c implements lpf, npf {
    public static final List x = Collections.singletonList(vhb.HTTP_1_1);
    public final String a;
    public y0c b;
    public i1c c;
    public opf d;
    public ppf e;
    public final hee f;
    public String g;
    public b1c h;
    public final ArrayDeque i;
    public final ArrayDeque j;
    public long k;
    public boolean l;
    public int m;
    public String n;
    public boolean o;
    public int p;
    public boolean q;
    public final lac r;
    public final ple s;
    public final Random t;
    public final long u;
    public mpf v = null;
    public final long w;

    public k1c(kee kee, lac lac, ple ple, Random random, long j2, long j3) {
        this.r = lac;
        this.s = ple;
        this.t = random;
        this.u = j2;
        this.w = j3;
        this.f = kee.f();
        this.i = new ArrayDeque();
        this.j = new ArrayDeque();
        this.m = -1;
        String str = lac.c;
        if ("GET".equals(str)) {
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.a = s59.s(bArr).a();
            return;
        }
        throw new IllegalArgumentException(rf0.h("Request must be GET: ", str).toString());
    }

    public final void a(xbc xbc, pd pdVar) {
        int i2 = xbc.o;
        if (i2 == 101) {
            ye6 ye6 = xbc.Y;
            String a2 = ye6.a("Connection");
            String str = null;
            if (a2 == null) {
                a2 = null;
            }
            if ("Upgrade".equalsIgnoreCase(a2)) {
                String a3 = ye6.a("Upgrade");
                if (a3 == null) {
                    a3 = null;
                }
                if ("websocket".equalsIgnoreCase(a3)) {
                    String a4 = ye6.a("Sec-WebSocket-Accept");
                    if (a4 != null) {
                        str = a4;
                    }
                    String a5 = new uu0(MessageDigest.getInstance("SHA-1").digest(wn6.l(new StringBuilder(), this.a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(e22.a))).a();
                    if (!hhd.f(a5, str)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a5 + "' but was '" + str + '\'');
                    } else if (pdVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a3 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + a2 + '\'');
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i2);
            sb.append(' ');
            throw new ProtocolException(me4.l(sb, xbc.c, '\''));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r7)
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 0
            if (r8 < r1) goto L_0x0034
            r1 = 5000(0x1388, float:7.006E-42)
            if (r8 < r1) goto L_0x000d
            goto L_0x0034
        L_0x000d:
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r1 > r8) goto L_0x0015
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r1 >= r8) goto L_0x001e
        L_0x0015:
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r1 <= r8) goto L_0x001a
            goto L_0x0032
        L_0x001a:
            r1 = 2999(0xbb7, float:4.202E-42)
            if (r1 < r8) goto L_0x0032
        L_0x001e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Code "
            r1.<init>(r3)     // Catch:{ all -> 0x006a }
            r1.append(r8)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = " is reserved and may not be used."
            r1.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
            goto L_0x0042
        L_0x0032:
            r1 = r2
            goto L_0x0042
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Code must be in range [1000,5000): "
            r1.<init>(r3)     // Catch:{ all -> 0x006a }
            r1.append(r8)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
        L_0x0042:
            if (r1 != 0) goto L_0x008a
            if (r9 == 0) goto L_0x006c
            uu0 r2 = new uu0     // Catch:{ all -> 0x006a }
            java.nio.charset.Charset r1 = defpackage.e22.a     // Catch:{ all -> 0x006a }
            byte[] r1 = r9.getBytes(r1)     // Catch:{ all -> 0x006a }
            r2.<init>(r1)     // Catch:{ all -> 0x006a }
            r2.b = r9     // Catch:{ all -> 0x006a }
            int r1 = r1.length     // Catch:{ all -> 0x006a }
            long r3 = (long) r1     // Catch:{ all -> 0x006a }
            r5 = 123(0x7b, double:6.1E-322)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            java.lang.String r8 = r0.concat(r9)     // Catch:{ all -> 0x006a }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x006a }
            r9.<init>(r8)     // Catch:{ all -> 0x006a }
            throw r9     // Catch:{ all -> 0x006a }
        L_0x006a:
            r8 = move-exception
            goto L_0x0094
        L_0x006c:
            boolean r9 = r7.o     // Catch:{ all -> 0x006a }
            if (r9 != 0) goto L_0x0087
            boolean r9 = r7.l     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            r9 = 1
            r7.l = r9     // Catch:{ all -> 0x006a }
            java.util.ArrayDeque r0 = r7.j     // Catch:{ all -> 0x006a }
            g1c r1 = new g1c     // Catch:{ all -> 0x006a }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x006a }
            r0.add(r1)     // Catch:{ all -> 0x006a }
            r7.f()     // Catch:{ all -> 0x006a }
            monitor-exit(r7)
            goto L_0x0089
        L_0x0087:
            monitor-exit(r7)
            r9 = 0
        L_0x0089:
            return r9
        L_0x008a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x006a }
            r8.<init>(r9)     // Catch:{ all -> 0x006a }
            throw r8     // Catch:{ all -> 0x006a }
        L_0x0094:
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1c.b(int, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r5 = ((def) r5.s.a).b;
        r5.q.n("handleWebSocketFailure");
        r5.n.onFailedByException(r6);
        r5.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        defpackage.nze.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        defpackage.nze.c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r3 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        defpackage.nze.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Exception r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.o     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            r0 = 1
            r5.o = r0     // Catch:{ all -> 0x0055 }
            b1c r0 = r5.h     // Catch:{ all -> 0x0055 }
            r1 = 0
            r5.h = r1     // Catch:{ all -> 0x0055 }
            opf r2 = r5.d     // Catch:{ all -> 0x0055 }
            r5.d = r1     // Catch:{ all -> 0x0055 }
            ppf r3 = r5.e     // Catch:{ all -> 0x0055 }
            r5.e = r1     // Catch:{ all -> 0x0055 }
            hee r1 = r5.f     // Catch:{ all -> 0x0055 }
            r1.e()     // Catch:{ all -> 0x0055 }
            monitor-exit(r5)
            ple r5 = r5.s     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r5.a     // Catch:{ all -> 0x0044 }
            def r5 = (def) r5     // Catch:{ all -> 0x0044 }
            eef r5 = r5.b     // Catch:{ all -> 0x0044 }
            d4b r1 = r5.q     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "handleWebSocketFailure"
            r1.n(r4)     // Catch:{ all -> 0x0044 }
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r1 = r5.n     // Catch:{ all -> 0x0044 }
            r1.onFailedByException(r6)     // Catch:{ all -> 0x0044 }
            r5.d()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0039
            defpackage.nze.c(r0)
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            defpackage.nze.c(r2)
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            defpackage.nze.c(r3)
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            if (r0 == 0) goto L_0x004a
            defpackage.nze.c(r0)
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            defpackage.nze.c(r2)
        L_0x004f:
            if (r3 == 0) goto L_0x0054
            defpackage.nze.c(r3)
        L_0x0054:
            throw r5
        L_0x0055:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1c.c(java.lang.Exception):void");
    }

    public final void d(String str, b1c b1c) {
        mpf mpf = this.v;
        synchronized (this) {
            try {
                this.g = str;
                this.h = b1c;
                this.e = new ppf((u0c) b1c.b, this.t, mpf.a, mpf.c, this.w);
                this.c = new i1c(this);
                long j2 = this.u;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    this.f.c(new wk6(str.concat(" ping"), nanos, this), nanos);
                }
                if (!this.j.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = new opf((v0c) b1c.a, this, mpf.a, mpf.e);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void e() {
        /*
            r15 = this;
            r0 = 1
        L_0x0001:
            int r1 = r15.m
            r2 = -1
            if (r1 != r2) goto L_0x0212
            opf r1 = r15.d
            r1.n()
            boolean r2 = r1.X
            if (r2 == 0) goto L_0x0013
            r1.m()
            goto L_0x0001
        L_0x0013:
            int r2 = r1.b
            r3 = 2
            if (r2 == r0) goto L_0x002d
            if (r2 != r3) goto L_0x001b
            goto L_0x002d
        L_0x001b:
            java.net.ProtocolException r15 = new java.net.ProtocolException
            byte[] r0 = defpackage.nze.a
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            java.lang.String r1 = "Unknown opcode: "
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L_0x002d:
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x020a
            long r4 = r1.c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0040
            at0 r8 = r1.z0
            wr0 r9 = r1.w0
            r8.Q(r9, r4)
        L_0x0040:
            boolean r4 = r1.o
            if (r4 == 0) goto L_0x01e0
            boolean r4 = r1.Y
            if (r4 == 0) goto L_0x009c
            xo8 r4 = r1.x0
            if (r4 == 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            xo8 r4 = new xo8
            boolean r5 = r1.C0
            r4.<init>(r5, r0)
            r1.x0 = r4
        L_0x0056:
            wr0 r5 = r1.w0
            wr0 r8 = r4.b
            long r9 = r8.b
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0090
            boolean r9 = r4.c
            java.lang.Object r10 = r4.o
            java.util.zip.Inflater r10 = (java.util.zip.Inflater) r10
            if (r9 == 0) goto L_0x006b
            r10.reset()
        L_0x006b:
            r8.t0(r5)
            r9 = 65535(0xffff, float:9.1834E-41)
            r8.x0(r9)
            long r11 = r10.getBytesRead()
            long r8 = r8.b
            long r11 = r11 + r8
        L_0x007b:
            java.io.Closeable r8 = r4.X
            yv6 r8 = (defpackage.yv6) r8
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.a(r5, r13)
            long r8 = r10.getBytesRead()
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x007b
            goto L_0x009c
        L_0x0090:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x009c:
            if (r2 != r0) goto L_0x01ce
            npf r2 = r1.A0
            wr0 r1 = r1.w0
            java.lang.String r1 = r1.p0()
            k1c r2 = (defpackage.k1c) r2
            ple r2 = r2.s
            java.lang.Object r2 = r2.a
            def r2 = (def) r2
            eef r2 = r2.b
            d4b r4 = r2.q
            java.lang.Object r5 = r4.c
            ywb r5 = (ywb) r5
            boolean r5 = r5.shouldHideSensitiveInformation()
            if (r5 == 0) goto L_0x00d0
            java.lang.String r5 = defpackage.am7.l(r1)
            java.lang.String r8 = " <- "
            java.lang.String r5 = rf0.h(r8, r5)
            java.lang.Object r4 = r4.b
            xwb r4 = (xwb) r4
            java.lang.String r8 = "OKWSSignaling"
            r4.log(r8, r5)
            goto L_0x00df
        L_0x00d0:
            java.lang.String r5 = " <- "
            java.lang.String r5 = r5.concat(r1)
            java.lang.Object r4 = r4.b
            xwb r4 = (xwb) r4
            java.lang.String r8 = "OKWSSignaling"
            r4.log(r8, r5)
        L_0x00df:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r4 = r2.n
            r4.onMessageReceived()
            long r4 = r2.r
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0104
            android.os.Handler r4 = r2.d
            r4.removeMessages(r3)
            java.lang.Object r4 = r2.b
            monitor-enter(r4)
            lpf r5 = r2.c     // Catch:{ all -> 0x00fe }
            if (r5 == 0) goto L_0x0100
            android.os.Handler r5 = r2.d     // Catch:{ all -> 0x00fe }
            long r8 = r2.r     // Catch:{ all -> 0x00fe }
            r5.sendEmptyMessageDelayed(r3, r8)     // Catch:{ all -> 0x00fe }
            goto L_0x0100
        L_0x00fe:
            r15 = move-exception
            goto L_0x0102
        L_0x0100:
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            goto L_0x0104
        L_0x0102:
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            throw r15
        L_0x0104:
            java.lang.String r3 = "ping"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x012a
            java.lang.Object r3 = r2.b
            monitor-enter(r3)
            lpf r1 = r2.c     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0125
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0123 }
            r2.j = r4     // Catch:{ all -> 0x0123 }
            lpf r1 = r2.c     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "pong"
            k1c r1 = (defpackage.k1c) r1     // Catch:{ all -> 0x0123 }
            r1.g(r2)     // Catch:{ all -> 0x0123 }
            goto L_0x0125
        L_0x0123:
            r15 = move-exception
            goto L_0x0128
        L_0x0125:
            monitor-exit(r3)     // Catch:{ all -> 0x0123 }
            goto L_0x0001
        L_0x0128:
            monitor-exit(r3)     // Catch:{ all -> 0x0123 }
            throw r15
        L_0x012a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            java.lang.String r1 = "type"
            r4 = 0
            java.lang.String r1 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            java.lang.String r5 = "error"
            java.lang.String r5 = r3.optString(r5, r4)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            java.lang.String r8 = "error"
            boolean r8 = r8.equals(r1)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            if (r8 == 0) goto L_0x0154
            java.lang.String r8 = "conversation-ended"
            boolean r5 = r8.equals(r5)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            if (r5 == 0) goto L_0x0154
            r2.b()     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r1 = move-exception
            goto L_0x01b0
        L_0x0152:
            r1 = move-exception
            goto L_0x01bf
        L_0x0154:
            java.lang.String r5 = "stamp"
            long r8 = r3.optLong(r5, r6)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x016e
            java.lang.Object r5 = r2.b     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            monitor-enter(r5)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            long r6 = r2.l     // Catch:{ all -> 0x016b }
            long r6 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x016b }
            r2.l = r6     // Catch:{ all -> 0x016b }
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            goto L_0x016e
        L_0x016b:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            throw r1     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
        L_0x016e:
            lv1 r5 = r2.m     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r5.b     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            mfd r5 = (mfd) r5     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            r5.f(r3)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
        L_0x0179:
            java.lang.String r5 = "notification"
            java.lang.String r5 = r3.optString(r5, r4)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            java.lang.String r6 = "endpoint"
            java.lang.String r3 = r3.optString(r6, r4)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            java.lang.String r4 = "notification"
            boolean r1 = r4.equals(r1)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            if (r1 == 0) goto L_0x0001
            java.lang.String r1 = "connection"
            boolean r1 = r1.equals(r5)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            if (r1 == 0) goto L_0x0001
            if (r3 == 0) goto L_0x0001
            java.lang.Object r1 = r2.b     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            monitor-enter(r1)     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x01ad }
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ all -> 0x01ad }
            uy4 r4 = r2.p     // Catch:{ all -> 0x01ad }
            java.lang.String r3 = eef.c(r3, r4)     // Catch:{ all -> 0x01ad }
            r2.h = r3     // Catch:{ all -> 0x01ad }
            monitor-exit(r1)     // Catch:{ all -> 0x01ad }
            goto L_0x0001
        L_0x01ad:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ad }
            throw r3     // Catch:{ JSONException -> 0x0152, all -> 0x0150 }
        L_0x01b0:
            d4b r2 = r2.q
            java.lang.String r3 = "ws.signaling.unexpected_throwable"
            java.lang.Object r2 = r2.b
            xwb r2 = (xwb) r2
            java.lang.String r4 = "OKWSSignaling"
            r2.reportException(r4, r3, r1)
            goto L_0x0001
        L_0x01bf:
            d4b r2 = r2.q
            java.lang.String r3 = "ws.signaling.json"
            java.lang.Object r2 = r2.b
            xwb r2 = (xwb) r2
            java.lang.String r4 = "OKWSSignaling"
            r2.reportException(r4, r3, r1)
            goto L_0x0001
        L_0x01ce:
            npf r2 = r1.A0
            wr0 r1 = r1.w0
            long r3 = r1.b
            r1.e(r3)
            k1c r2 = (defpackage.k1c) r2
            ple r1 = r2.s
            r1.getClass()
            goto L_0x0001
        L_0x01e0:
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x01f0
            r1.n()
            boolean r4 = r1.X
            if (r4 != 0) goto L_0x01ec
            goto L_0x01f0
        L_0x01ec:
            r1.m()
            goto L_0x01e0
        L_0x01f0:
            int r4 = r1.b
            if (r4 != 0) goto L_0x01f6
            goto L_0x002d
        L_0x01f6:
            java.net.ProtocolException r15 = new java.net.ProtocolException
            int r0 = r1.b
            byte[] r1 = defpackage.nze.a
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "Expected continuation opcode. Got: "
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L_0x020a:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "closed"
            r15.<init>(r0)
            throw r15
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1c.e():void");
    }

    public final void f() {
        byte[] bArr = nze.a;
        i1c i1c = this.c;
        if (i1c != null) {
            this.f.c(i1c, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.String r10) {
        /*
            r9 = this;
            uu0 r0 = new uu0
            java.nio.charset.Charset r1 = defpackage.e22.a
            byte[] r1 = r10.getBytes(r1)
            r0.<init>(r1)
            r0.b = r10
            monitor-enter(r9)
            boolean r10 = r9.o     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r10 != 0) goto L_0x0043
            boolean r10 = r9.l     // Catch:{ all -> 0x002c }
            if (r10 == 0) goto L_0x0018
            goto L_0x0043
        L_0x0018:
            long r3 = r9.k     // Catch:{ all -> 0x002c }
            int r10 = r1.length     // Catch:{ all -> 0x002c }
            long r5 = (long) r10     // Catch:{ all -> 0x002c }
            long r5 = r5 + r3
            r7 = 16777216(0x1000000, double:8.289046E-317)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x002e
            r10 = 1001(0x3e9, float:1.403E-42)
            r0 = 0
            r9.b(r10, r0)     // Catch:{ all -> 0x002c }
            monitor-exit(r9)
            goto L_0x0044
        L_0x002c:
            r10 = move-exception
            goto L_0x0045
        L_0x002e:
            int r10 = r1.length     // Catch:{ all -> 0x002c }
            long r1 = (long) r10     // Catch:{ all -> 0x002c }
            long r3 = r3 + r1
            r9.k = r3     // Catch:{ all -> 0x002c }
            java.util.ArrayDeque r10 = r9.j     // Catch:{ all -> 0x002c }
            h1c r1 = new h1c     // Catch:{ all -> 0x002c }
            r1.<init>(r0)     // Catch:{ all -> 0x002c }
            r10.add(r1)     // Catch:{ all -> 0x002c }
            r9.f()     // Catch:{ all -> 0x002c }
            monitor-exit(r9)
            r2 = 1
            goto L_0x0044
        L_0x0043:
            monitor-exit(r9)
        L_0x0044:
            return r2
        L_0x0045:
            monitor-exit(r9)     // Catch:{ all -> 0x002c }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1c.g(java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: opf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: opf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: opf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [wr0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0155, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015b, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x015c, code lost:
        if (r1 != null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x015e, code lost:
        defpackage.nze.c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0161, code lost:
        if (r6 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0163, code lost:
        defpackage.nze.c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0166, code lost:
        if (r7 != null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0168, code lost:
        defpackage.nze.c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x016b, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r2 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.a(10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if ((r4 instanceof defpackage.h1c) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r4 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r4 = (defpackage.h1c) r4;
        r2 = r4.a;
        r0.d(r4.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r11.k -= (long) r4.b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b4, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if ((r4 instanceof defpackage.g1c) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b9, code lost:
        if (r4 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        r4 = (defpackage.g1c) r4;
        r2 = r4.a;
        r4 = r4.b;
        r0.getClass();
        r9 = defpackage.uu0.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c6, code lost:
        if (r2 != 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r2 == 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r2 < 1000) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d2, code lost:
        if (r2 < 5000) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d7, code lost:
        if (1004 > r2) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00db, code lost:
        if (1006 >= r2) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        if (1015 <= r2) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e4, code lost:
        if (2999 < r2) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e6, code lost:
        r3 = "Code " + r2 + " is reserved and may not be used.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fa, code lost:
        r3 = "Code must be in range [1000,5000): " + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0108, code lost:
        if (r3 != null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0114, code lost:
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0115, code lost:
        r3 = new java.lang.Object();
        r3.y0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011d, code lost:
        if (r4 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011f, code lost:
        r4.k(r3, r4.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0126, code lost:
        r9 = r3.e(r3.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r0.a(8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0133, code lost:
        if (r1 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0135, code lost:
        r11.s.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013a, code lost:
        if (r1 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013c, code lost:
        defpackage.nze.c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x013f, code lost:
        if (r6 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0141, code lost:
        defpackage.nze.c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0144, code lost:
        if (r7 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0146, code lost:
        defpackage.nze.c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0149, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x014a, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r0.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x014d, code lost:
        throw r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.o     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)
            return r1
        L_0x0008:
            ppf r0 = r11.e     // Catch:{ all -> 0x0038 }
            java.util.ArrayDeque r2 = r11.i     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0038 }
            uu0 r2 = (defpackage.uu0) r2     // Catch:{ all -> 0x0038 }
            r3 = 0
            if (r2 != 0) goto L_0x0079
            java.util.ArrayDeque r4 = r11.j     // Catch:{ all -> 0x0038 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0038 }
            boolean r5 = r4 instanceof defpackage.g1c     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x0071
            int r1 = r11.m     // Catch:{ all -> 0x0038 }
            java.lang.String r5 = r11.n     // Catch:{ all -> 0x0038 }
            r6 = -1
            if (r1 == r6) goto L_0x003b
            b1c r1 = r11.h     // Catch:{ all -> 0x0038 }
            r11.h = r3     // Catch:{ all -> 0x0038 }
            opf r6 = r11.d     // Catch:{ all -> 0x0038 }
            r11.d = r3     // Catch:{ all -> 0x0038 }
            ppf r7 = r11.e     // Catch:{ all -> 0x0038 }
            r11.e = r3     // Catch:{ all -> 0x0038 }
            hee r8 = r11.f     // Catch:{ all -> 0x0038 }
            r8.e()     // Catch:{ all -> 0x0038 }
            goto L_0x007d
        L_0x0038:
            r0 = move-exception
            goto L_0x016c
        L_0x003b:
            if (r4 == 0) goto L_0x0069
            r1 = r4
            g1c r1 = (defpackage.g1c) r1     // Catch:{ all -> 0x0038 }
            long r6 = r1.c     // Catch:{ all -> 0x0038 }
            hee r1 = r11.f     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r8.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r9 = r11.g     // Catch:{ all -> 0x0038 }
            r8.append(r9)     // Catch:{ all -> 0x0038 }
            java.lang.String r9 = " cancel"
            r8.append(r9)     // Catch:{ all -> 0x0038 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0038 }
            long r6 = r9.toNanos(r6)     // Catch:{ all -> 0x0038 }
            i1c r9 = new i1c     // Catch:{ all -> 0x0038 }
            r9.<init>(r8, r11)     // Catch:{ all -> 0x0038 }
            r1.c(r9, r6)     // Catch:{ all -> 0x0038 }
            r1 = r3
            r6 = r1
        L_0x0067:
            r7 = r6
            goto L_0x007d
        L_0x0069:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0071:
            if (r4 != 0) goto L_0x0075
            monitor-exit(r11)
            return r1
        L_0x0075:
            r1 = r3
            r5 = r1
        L_0x0077:
            r6 = r5
            goto L_0x0067
        L_0x0079:
            r1 = r3
            r4 = r1
            r5 = r4
            goto L_0x0077
        L_0x007d:
            monitor-exit(r11)
            r8 = 1
            if (r2 == 0) goto L_0x0088
            r11 = 10
            r0.a(r11, r2)     // Catch:{ all -> 0x00a7 }
            goto L_0x013a
        L_0x0088:
            boolean r2 = r4 instanceof defpackage.h1c     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00b5
            if (r4 == 0) goto L_0x00ad
            h1c r4 = (defpackage.h1c) r4     // Catch:{ all -> 0x00a7 }
            int r2 = r4.a     // Catch:{ all -> 0x00a7 }
            uu0 r2 = r4.b     // Catch:{ all -> 0x00a7 }
            r0.d(r2)     // Catch:{ all -> 0x00a7 }
            monitor-enter(r11)     // Catch:{ all -> 0x00a7 }
            long r2 = r11.k     // Catch:{ all -> 0x00aa }
            uu0 r0 = r4.b     // Catch:{ all -> 0x00aa }
            int r0 = r0.c()     // Catch:{ all -> 0x00aa }
            long r4 = (long) r0     // Catch:{ all -> 0x00aa }
            long r2 = r2 - r4
            r11.k = r2     // Catch:{ all -> 0x00aa }
            monitor-exit(r11)     // Catch:{ all -> 0x00a7 }
            goto L_0x013a
        L_0x00a7:
            r11 = move-exception
            goto L_0x015c
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00ad:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r11.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x00b5:
            boolean r2 = r4 instanceof defpackage.g1c     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0156
            if (r4 == 0) goto L_0x014e
            g1c r4 = (defpackage.g1c) r4     // Catch:{ all -> 0x00a7 }
            int r2 = r4.a     // Catch:{ all -> 0x00a7 }
            uu0 r4 = r4.b     // Catch:{ all -> 0x00a7 }
            r0.getClass()     // Catch:{ all -> 0x00a7 }
            uu0 r9 = defpackage.uu0.o     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x00ca
            if (r4 == 0) goto L_0x012c
        L_0x00ca:
            if (r2 == 0) goto L_0x0115
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r9) goto L_0x00fa
            r9 = 5000(0x1388, float:7.006E-42)
            if (r2 < r9) goto L_0x00d5
            goto L_0x00fa
        L_0x00d5:
            r9 = 1004(0x3ec, float:1.407E-42)
            if (r9 > r2) goto L_0x00dd
            r9 = 1006(0x3ee, float:1.41E-42)
            if (r9 >= r2) goto L_0x00e6
        L_0x00dd:
            r9 = 1015(0x3f7, float:1.422E-42)
            if (r9 <= r2) goto L_0x00e2
            goto L_0x0108
        L_0x00e2:
            r9 = 2999(0xbb7, float:4.202E-42)
            if (r9 < r2) goto L_0x0108
        L_0x00e6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = "Code "
            r3.<init>(r9)     // Catch:{ all -> 0x00a7 }
            r3.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = " is reserved and may not be used."
            r3.append(r9)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a7 }
            goto L_0x0108
        L_0x00fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = "Code must be in range [1000,5000): "
            r3.<init>(r9)     // Catch:{ all -> 0x00a7 }
            r3.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a7 }
        L_0x0108:
            if (r3 != 0) goto L_0x010b
            goto L_0x0115
        L_0x010b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00a7 }
            r11.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x0115:
            wr0 r3 = new wr0     // Catch:{ all -> 0x00a7 }
            r3.<init>()     // Catch:{ all -> 0x00a7 }
            r3.y0(r2)     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0126
            int r2 = r4.c()     // Catch:{ all -> 0x00a7 }
            r4.k(r3, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0126:
            long r9 = r3.b     // Catch:{ all -> 0x00a7 }
            uu0 r9 = r3.e(r9)     // Catch:{ all -> 0x00a7 }
        L_0x012c:
            r2 = 8
            r0.a(r2, r9)     // Catch:{ all -> 0x014a }
            r0.c = r8     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x013a
            ple r11 = r11.s     // Catch:{ all -> 0x00a7 }
            r11.a(r5)     // Catch:{ all -> 0x00a7 }
        L_0x013a:
            if (r1 == 0) goto L_0x013f
            defpackage.nze.c(r1)
        L_0x013f:
            if (r6 == 0) goto L_0x0144
            defpackage.nze.c(r6)
        L_0x0144:
            if (r7 == 0) goto L_0x0149
            defpackage.nze.c(r7)
        L_0x0149:
            return r8
        L_0x014a:
            r11 = move-exception
            r0.c = r8     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x014e:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r11.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x0156:
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch:{ all -> 0x00a7 }
            r11.<init>()     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ all -> 0x00a7 }
        L_0x015c:
            if (r1 == 0) goto L_0x0161
            defpackage.nze.c(r1)
        L_0x0161:
            if (r6 == 0) goto L_0x0166
            defpackage.nze.c(r6)
        L_0x0166:
            if (r7 == 0) goto L_0x016b
            defpackage.nze.c(r7)
        L_0x016b:
            throw r11
        L_0x016c:
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1c.h():boolean");
    }
}
