package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: sne  reason: default package */
public final class sne {
    public static final sne a = new Object();
    public static kv2 b;

    public static final void a(String str) {
        if (!nne.b) {
            try {
                kv2 kv2 = b;
                if (kv2 != null) {
                    yn7 yn7 = (yn7) kv2.o;
                    yn7.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - yn7.i;
                    byte[] bytes = str.getBytes(e22.a);
                    int i = 65506;
                    if (bytes.length > 65506) {
                        if ((bytes[65506] & 192) == 128) {
                            do {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                            } while ((bytes[i] & 192) != 128);
                        }
                        bytes = cs.T(0, bytes, i);
                    }
                    mn7 mn7 = new mn7(currentTimeMillis, bytes);
                    ConcurrentLinkedQueue concurrentLinkedQueue = yn7.h;
                    concurrentLinkedQueue.add(mn7);
                    yn7.g += mn7.c;
                    while (yn7.g > 65536) {
                        mn7 mn72 = (mn7) concurrentLinkedQueue.poll();
                        if (mn72 != null) {
                            yn7.g -= mn72.c;
                        } else {
                            yn7.g = 0;
                        }
                    }
                    koe.a(new zo5(yn7, str, mn7, 15));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (IllegalStateException unused) {
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010e  */
    public static final void b(defpackage.z9d r16, java.lang.Throwable r17, java.lang.String r18) {
        /*
            r0 = r16
            boolean r1 = defpackage.nne.b
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            kv2 r1 = b     // Catch:{ IllegalStateException -> 0x0164 }
            if (r1 == 0) goto L_0x0158
            r2 = 0
            if (r18 == 0) goto L_0x0029
            java.lang.CharSequence r3 = h0e.B0(r18)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0029
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r3 = r2
        L_0x0020:
            if (r3 == 0) goto L_0x0029
            r4 = 32
            java.lang.String r3 = h0e.y0(r4, r3)
            goto L_0x002a
        L_0x0029:
            r3 = r2
        L_0x002a:
            boolean r4 = defpackage.nne.b
            if (r4 == 0) goto L_0x0030
            goto L_0x014a
        L_0x0030:
            java.lang.Object r4 = r1.b
            i3d r4 = (defpackage.i3d) r4
            java.lang.Object r5 = r4.b
            monitor-enter(r5)
            r4.b()     // Catch:{ all -> 0x005d }
            d3d r6 = r4.k     // Catch:{ all -> 0x005d }
            if (r6 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r6
        L_0x0040:
            z9d r2 = r2.g     // Catch:{ all -> 0x005d }
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x004a
            if (r2 != 0) goto L_0x004a
            r2 = r7
            goto L_0x0056
        L_0x004a:
            if (r0 != 0) goto L_0x004e
            r2 = -1
            goto L_0x0056
        L_0x004e:
            if (r2 != 0) goto L_0x0052
            r2 = r6
            goto L_0x0056
        L_0x0052:
            int r2 = r0.compareTo(r2)     // Catch:{ all -> 0x005d }
        L_0x0056:
            r8 = 3
            if (r2 <= 0) goto L_0x0060
            defpackage.i3d.d(r4, r7, r7, r0, r8)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r0 = move-exception
            goto L_0x0156
        L_0x0060:
            monitor-exit(r5)
            v2b r2 = defpackage.xhd.a
            if (r2 == 0) goto L_0x014e
            java.lang.String r4 = "system.shutdown.until.ts"
            boolean r4 = vx3.c(r2, r4)
            if (r4 == 0) goto L_0x006f
        L_0x006d:
            r2 = r6
            goto L_0x008c
        L_0x006f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "system."
            r4.<init>(r5)
            java.lang.String r5 = "CRASH_REPORT"
            r4.append(r5)
            java.lang.String r5 = ".shutdown.until.ts"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r2 = vx3.c(r2, r4)
            if (r2 == 0) goto L_0x008b
            goto L_0x006d
        L_0x008b:
            r2 = r7
        L_0x008c:
            if (r2 == 0) goto L_0x0090
            goto L_0x014a
        L_0x0090:
            java.lang.Object r2 = r1.Z
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.incrementAndGet()
            r4 = 8
            if (r2 <= r4) goto L_0x00ab
            int r2 = r2 - r4
            if (r2 != r6) goto L_0x014a
            ds1 r0 = new ds1
            r2 = 19
            r0.<init>(r2, r1)
            defpackage.koe.a(r0)
            goto L_0x014a
        L_0x00ab:
            java.lang.Object r2 = r1.a
            r9 = r2
            mv4 r9 = (defpackage.mv4) r9
            z9d r2 = defpackage.z9d.c
            boolean r2 = hhd.f(r0, r2)
            if (r2 == 0) goto L_0x00ba
        L_0x00b8:
            r10 = r8
            goto L_0x00ee
        L_0x00ba:
            z9d r2 = defpackage.z9d.o
            boolean r2 = hhd.f(r0, r2)
            if (r2 == 0) goto L_0x00c4
            r8 = 4
            goto L_0x00b8
        L_0x00c4:
            z9d r2 = defpackage.z9d.X
            boolean r2 = hhd.f(r0, r2)
            if (r2 == 0) goto L_0x00ce
            r8 = 5
            goto L_0x00b8
        L_0x00ce:
            z9d r2 = defpackage.z9d.Y
            boolean r2 = hhd.f(r0, r2)
            if (r2 == 0) goto L_0x00d8
            r8 = 6
            goto L_0x00b8
        L_0x00d8:
            z9d r2 = defpackage.z9d.Z
            boolean r2 = hhd.f(r0, r2)
            if (r2 == 0) goto L_0x00e2
            r8 = 7
            goto L_0x00b8
        L_0x00e2:
            z9d r2 = defpackage.z9d.w0
            boolean r0 = hhd.f(r0, r2)
            if (r0 == 0) goto L_0x00ec
            r10 = r4
            goto L_0x00ee
        L_0x00ec:
            r8 = 2
            goto L_0x00b8
        L_0x00ee:
            java.lang.Object r0 = r1.b
            i3d r0 = (defpackage.i3d) r0
            c9e r0 = r0.c()
            if (r3 == 0) goto L_0x011d
            int r2 = r3.length()
            if (r2 != 0) goto L_0x00ff
            goto L_0x011d
        L_0x00ff:
            java.util.Map r2 = r0.m
            java.lang.String r4 = "issueKey"
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x010e
            java.util.Map r2 = java.util.Collections.singletonMap(r4, r3)
            goto L_0x0117
        L_0x010e:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            r5.put(r4, r3)
            r2 = r5
        L_0x0117:
            r3 = 12287(0x2fff, float:1.7218E-41)
            c9e r0 = defpackage.c9e.a(r0, r7, r2, r3)
        L_0x011d:
            r12 = r0
            java.lang.Object r0 = r1.c
            u9e r0 = (defpackage.u9e) r0
            java.util.ArrayList r2 = r0.e
            monitor-enter(r2)
            java.util.ArrayList r0 = r0.e     // Catch:{ all -> 0x014b }
            java.util.List r13 = o23.s0(r0)     // Catch:{ all -> 0x014b }
            monitor-exit(r2)
            java.lang.Object r0 = r1.o
            yn7 r0 = (defpackage.yn7) r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.h
            java.util.List r15 = o23.s0(r0)
            iw4 r14 = iw4.a
            r11 = r17
            mv3 r0 = r9.M(r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x014a
            dr1 r2 = new dr1
            r3 = 15
            r2.<init>(r1, r3, r0)
            defpackage.koe.b(r2)
        L_0x014a:
            return
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Tracer settings are not initialized."
            r0.<init>(r1)
            throw r0
        L_0x0156:
            monitor-exit(r5)
            throw r0
        L_0x0158:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0164 }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x0164 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x0164 }
            throw r1     // Catch:{ IllegalStateException -> 0x0164 }
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sne.b(z9d, java.lang.Throwable, java.lang.String):void");
    }
}
