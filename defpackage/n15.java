package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: n15  reason: default package */
public final class n15 {
    public cc4 a;
    public ga0 b;
    public int c;
    public int d;
    public int e;
    public qgc f;
    public final d1c g;
    public final ca h;
    public final y0c i;
    public final j06 j;

    public n15(d1c d1c, ca caVar, y0c y0c) {
        j06 j06 = j06.o;
        this.g = d1c;
        this.h = caVar;
        this.i = y0c;
        this.j = j06;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v37, types: [ga0, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0341 A[SYNTHETIC] */
    public final defpackage.c1c a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r1 = r15
            r0 = 0
            r2 = 1
        L_0x0003:
            y0c r3 = r1.i
            boolean r3 = r3.B0
            if (r3 != 0) goto L_0x038f
            y0c r3 = r1.i
            c1c r3 = r3.Z
            r4 = 0
            if (r3 == 0) goto L_0x0064
            monitor-enter(r3)
            boolean r5 = r3.i     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0037
            qgc r5 = r3.q     // Catch:{ all -> 0x0061 }
            ca r5 = r5.a     // Catch:{ all -> 0x0061 }
            sm6 r5 = r5.a     // Catch:{ all -> 0x0061 }
            ca r6 = r1.h     // Catch:{ all -> 0x0061 }
            sm6 r6 = r6.a     // Catch:{ all -> 0x0061 }
            int r7 = r6.f     // Catch:{ all -> 0x0061 }
            int r8 = r5.f     // Catch:{ all -> 0x0061 }
            if (r8 != r7) goto L_0x0031
            java.lang.String r5 = r5.e     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0061 }
            boolean r5 = defpackage.hhd.f(r5, r6)     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0031
            r5 = r2
            goto L_0x0032
        L_0x0031:
            r5 = r0
        L_0x0032:
            if (r5 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = r4
            goto L_0x003d
        L_0x0037:
            y0c r5 = r1.i     // Catch:{ all -> 0x0061 }
            java.net.Socket r5 = r5.k()     // Catch:{ all -> 0x0061 }
        L_0x003d:
            monitor-exit(r3)
            y0c r6 = r1.i
            c1c r6 = r6.Z
            if (r6 == 0) goto L_0x0056
            if (r5 != 0) goto L_0x004a
        L_0x0046:
            r4 = r21
            goto L_0x033b
        L_0x004a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0056:
            if (r5 == 0) goto L_0x005b
            defpackage.nze.d(r5)
        L_0x005b:
            j06 r3 = r1.j
            r3.getClass()
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0064:
            r1.c = r0
            r1.d = r0
            r1.e = r0
            d1c r3 = r1.g
            ca r5 = r1.h
            y0c r6 = r1.i
            boolean r3 = r3.b(r5, r6, r4, r0)
            if (r3 == 0) goto L_0x0080
            y0c r3 = r1.i
            c1c r3 = r3.Z
            j06 r4 = r1.j
            r4.getClass()
            goto L_0x0046
        L_0x0080:
            qgc r3 = r1.f
            if (r3 == 0) goto L_0x0089
            r1.f = r4
        L_0x0086:
            r5 = r4
            goto L_0x02c4
        L_0x0089:
            cc4 r3 = r1.a
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x00b0
            cc4 r3 = r1.a
            boolean r5 = r3.e()
            if (r5 == 0) goto L_0x00aa
            int r5 = r3.b
            int r6 = r5 + 1
            r3.b = r6
            java.util.List r3 = r3.c
            java.lang.Object r3 = r3.get(r5)
            qgc r3 = (defpackage.qgc) r3
            goto L_0x0086
        L_0x00aa:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00b0:
            ga0 r3 = r1.b
            if (r3 != 0) goto L_0x00e9
            ga0 r3 = new ga0
            ca r5 = r1.h
            y0c r6 = r1.i
            qw9 r6 = r6.E0
            ea6 r6 = r6.R0
            j06 r7 = r1.j
            r3.<init>()
            r3.e = r5
            r3.f = r6
            r3.g = r7
            hw4 r6 = defpackage.hw4.a
            r3.a = r6
            r3.c = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.d = r6
            a1c r6 = new a1c
            java.net.Proxy r7 = r5.j
            sm6 r5 = r5.a
            r6.<init>(r3, r7, r5, r2)
            java.util.List r5 = r6.a()
            r3.a = r5
            r3.b = r0
            r1.b = r3
        L_0x00e9:
            boolean r5 = r3.c()
            if (r5 == 0) goto L_0x0389
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00f4:
            int r6 = r3.b
            java.lang.Object r7 = r3.a
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x027a
            int r6 = r3.b
            java.lang.Object r7 = r3.a
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x010e
            r6 = r2
            goto L_0x010f
        L_0x010e:
            r6 = r0
        L_0x010f:
            java.lang.Object r7 = r3.e
            ca r7 = (defpackage.ca) r7
            java.lang.String r8 = "No route to "
            if (r6 == 0) goto L_0x0258
            java.lang.Object r6 = r3.a
            java.util.List r6 = (java.util.List) r6
            int r9 = r3.b
            int r10 = r9 + 1
            r3.b = r10
            java.lang.Object r6 = r6.get(r9)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r3.c = r9
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.DIRECT
            if (r10 == r11) goto L_0x0179
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r10 != r11) goto L_0x013f
            goto L_0x0179
        L_0x013f:
            java.net.SocketAddress r10 = r6.address()
            boolean r11 = r10 instanceof java.net.InetSocketAddress
            if (r11 == 0) goto L_0x015d
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.net.InetAddress r11 = r10.getAddress()
            if (r11 == 0) goto L_0x0154
            java.lang.String r11 = r11.getHostAddress()
            goto L_0x0158
        L_0x0154:
            java.lang.String r11 = r10.getHostName()
        L_0x0158:
            int r10 = r10.getPort()
            goto L_0x017f
        L_0x015d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Proxy.address() is not an InetSocketAddress: "
            r0.<init>(r1)
            java.lang.Class r1 = r10.getClass()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0179:
            sm6 r10 = r7.a
            java.lang.String r11 = r10.e
            int r10 = r10.f
        L_0x017f:
            if (r2 > r10) goto L_0x0239
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r12 < r10) goto L_0x0239
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r8 != r12) goto L_0x0196
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r11, r10)
            r9.add(r7)
            goto L_0x01c9
        L_0x0196:
            java.lang.Object r8 = r3.g
            j06 r8 = (defpackage.j06) r8
            r8.getClass()
            lu7 r8 = r7.d
            r8.getClass()
            java.net.InetAddress[] r8 = java.net.InetAddress.getAllByName(r11)     // Catch:{ NullPointerException -> 0x0229 }
            java.util.List r8 = defpackage.cs.g0(r8)     // Catch:{ NullPointerException -> 0x0229 }
            boolean r12 = r8.isEmpty()
            if (r12 != 0) goto L_0x020d
            java.util.Iterator r7 = r8.iterator()
        L_0x01b4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01c9
            java.lang.Object r8 = r7.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r10)
            r9.add(r11)
            goto L_0x01b4
        L_0x01c9:
            java.lang.Object r7 = r3.c
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x01d1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0205
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            qgc r9 = new qgc
            java.lang.Object r10 = r3.e
            ca r10 = (defpackage.ca) r10
            r9.<init>(r10, r6, r8)
            java.lang.Object r8 = r3.f
            ea6 r8 = (defpackage.ea6) r8
            monitor-enter(r8)
            java.lang.Object r10 = r8.b     // Catch:{ all -> 0x0202 }
            java.util.LinkedHashSet r10 = (java.util.LinkedHashSet) r10     // Catch:{ all -> 0x0202 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x0202 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01fe
            java.lang.Object r8 = r3.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
            goto L_0x01d1
        L_0x01fe:
            r5.add(r9)
            goto L_0x01d1
        L_0x0202:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0202 }
            throw r0
        L_0x0205:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x00f4
            goto L_0x027a
        L_0x020d:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            lu7 r2 = r7.d
            r1.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0229:
            r0 = move-exception
            java.net.UnknownHostException r1 = new java.net.UnknownHostException
            java.lang.String r2 = "Broken system behaviour for dns lookup of "
            java.lang.String r2 = r2.concat(r11)
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        L_0x0239:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r11)
            r2 = 58
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "; port is out of range"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0258:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            sm6 r2 = r7.a
            java.lang.String r2 = r2.e
            r1.append(r2)
            java.lang.String r2 = "; exhausted proxy configurations: "
            r1.append(r2)
            java.lang.Object r2 = r3.a
            java.util.List r2 = (java.util.List) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x027a:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x028e
            java.lang.Object r6 = r3.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            defpackage.u23.K(r6, r5)
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
        L_0x028e:
            cc4 r3 = new cc4
            r3.<init>(r5)
            r1.a = r3
            y0c r6 = r1.i
            boolean r6 = r6.B0
            if (r6 != 0) goto L_0x0381
            d1c r6 = r1.g
            ca r7 = r1.h
            y0c r8 = r1.i
            boolean r6 = r6.b(r7, r8, r5, r0)
            if (r6 == 0) goto L_0x02b2
            y0c r3 = r1.i
            c1c r3 = r3.Z
            j06 r4 = r1.j
            r4.getClass()
            goto L_0x0046
        L_0x02b2:
            boolean r6 = r3.e()
            if (r6 == 0) goto L_0x037b
            int r6 = r3.b
            int r7 = r6 + 1
            r3.b = r7
            java.lang.Object r3 = r5.get(r6)
            qgc r3 = (defpackage.qgc) r3
        L_0x02c4:
            c1c r14 = new c1c
            r14.<init>(r3)
            y0c r6 = r1.i
            r6.D0 = r14
            y0c r12 = r1.i     // Catch:{ all -> 0x0375 }
            j06 r13 = r1.j     // Catch:{ all -> 0x0375 }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0375 }
            y0c r6 = r1.i
            r6.D0 = r4
            y0c r4 = r1.i
            qw9 r4 = r4.E0
            ea6 r6 = r4.R0
            monitor-enter(r6)
            java.lang.Object r4 = r6.b     // Catch:{ all -> 0x0372 }
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4     // Catch:{ all -> 0x0372 }
            r4.remove(r3)     // Catch:{ all -> 0x0372 }
            monitor-exit(r6)
            d1c r4 = r1.g
            ca r6 = r1.h
            y0c r7 = r1.i
            boolean r4 = r4.b(r6, r7, r5, r2)
            if (r4 == 0) goto L_0x0311
            y0c r4 = r1.i
            c1c r4 = r4.Z
            r1.f = r3
            java.net.Socket r3 = r14.c
            defpackage.nze.d(r3)
            j06 r3 = r1.j
            r3.getClass()
            r3 = r4
            goto L_0x0046
        L_0x0311:
            monitor-enter(r14)
            d1c r3 = r1.g     // Catch:{ all -> 0x036f }
            r3.getClass()     // Catch:{ all -> 0x036f }
            byte[] r4 = defpackage.nze.a     // Catch:{ all -> 0x036f }
            java.lang.Object r4 = r3.e     // Catch:{ all -> 0x036f }
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4     // Catch:{ all -> 0x036f }
            r4.add(r14)     // Catch:{ all -> 0x036f }
            java.lang.Object r4 = r3.c     // Catch:{ all -> 0x036f }
            hee r4 = (defpackage.hee) r4     // Catch:{ all -> 0x036f }
            java.lang.Object r3 = r3.d     // Catch:{ all -> 0x036f }
            el6 r3 = (defpackage.el6) r3     // Catch:{ all -> 0x036f }
            r5 = 0
            r4.c(r3, r5)     // Catch:{ all -> 0x036f }
            y0c r3 = r1.i     // Catch:{ all -> 0x036f }
            r3.b(r14)     // Catch:{ all -> 0x036f }
            monitor-exit(r14)
            j06 r3 = r1.j
            r3.getClass()
            r4 = r21
            r3 = r14
        L_0x033b:
            boolean r5 = r3.i(r4)
            if (r5 == 0) goto L_0x0342
            return r3
        L_0x0342:
            r3.k()
            qgc r3 = r1.f
            if (r3 == 0) goto L_0x034b
            goto L_0x0003
        L_0x034b:
            cc4 r3 = r1.a
            if (r3 == 0) goto L_0x0354
            boolean r3 = r3.e()
            goto L_0x0355
        L_0x0354:
            r3 = r2
        L_0x0355:
            if (r3 == 0) goto L_0x0359
            goto L_0x0003
        L_0x0359:
            ga0 r3 = r1.b
            if (r3 == 0) goto L_0x0362
            boolean r3 = r3.c()
            goto L_0x0363
        L_0x0362:
            r3 = r2
        L_0x0363:
            if (r3 == 0) goto L_0x0367
            goto L_0x0003
        L_0x0367:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "exhausted all routes"
            r0.<init>(r1)
            throw r0
        L_0x036f:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0372:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0372 }
            throw r0
        L_0x0375:
            r0 = move-exception
            y0c r1 = r1.i
            r1.D0 = r4
            throw r0
        L_0x037b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0381:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0389:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x038f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.a(int, int, int, int, boolean, boolean):c1c");
    }

    public final void b(IOException iOException) {
        this.f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == 8) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
