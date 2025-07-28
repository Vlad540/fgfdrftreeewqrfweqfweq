package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ewe  reason: default package */
public final class ewe {
    public final zxe a;
    public final nce b;
    public final lce c;
    public final f03 d;
    public final pk e;
    public final qmc f;
    public final zpe g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final zef i = new zef();

    public ewe(zxe zxe, lce lce, nce nce, zpe zpe, f03 f03, pk pkVar, qmc qmc) {
        this.a = zxe;
        this.c = lce;
        this.b = nce;
        this.g = zpe;
        this.d = f03;
        this.e = pkVar;
        this.f = qmc;
    }

    public final synchronized ms9 a(fwe fwe) {
        for (Map.Entry entry : this.h.entrySet()) {
            if (((fwe) entry.getKey()).equals(fwe)) {
                return (ms9) entry.getValue();
            }
        }
        return null;
    }

    public final void b(wve wve) {
        udd.p("ewe", "putUploadInRepository: started, upload=%s", new Object[]{wve});
        iu7.a0(this.a.a(wve).l(), z3d.j, new bwe(wve, 0), new f5(20, wve));
    }

    public final synchronized void c(fwe fwe) {
        udd.q("ewe", "removeFromUploadObsCache: data=" + fwe);
        this.h.remove(fwe);
    }

    public final void d(fwe fwe) {
        udd.p("ewe", "removeUploadFromRepository: started, data=%s", new Object[]{fwe});
        iu7.a0(this.a.c(fwe).l(), z3d.j, new dwe(fwe, 0), new zve(fwe, 1));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized ms9 e(defpackage.fwe r8) {
        /*
            r7 = this;
            r0 = 6
            r1 = 2
            r2 = 1
            java.lang.String r3 = "upload: has upload for "
            monitor-enter(r7)
            ms9 r4 = r7.a(r8)     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = "ewe"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r1.<init>(r3)     // Catch:{ all -> 0x001f }
            r1.append(r8)     // Catch:{ all -> 0x001f }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x001f }
            udd.q(r0, r8)     // Catch:{ all -> 0x001f }
            monitor-exit(r7)
            return r4
        L_0x001f:
            r8 = move-exception
            goto L_0x00c7
        L_0x0022:
            java.lang.String r3 = "ewe"
            java.lang.String r4 = "upload: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x001f }
            udd.p(r3, r4, r5)     // Catch:{ all -> 0x001f }
            dwe r3 = new dwe     // Catch:{ all -> 0x001f }
            r3.<init>(r8, r2)     // Catch:{ all -> 0x001f }
            mv9 r4 = new mv9     // Catch:{ all -> 0x001f }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x001f }
            yve r3 = new yve     // Catch:{ all -> 0x001f }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x001f }
            jx7 r5 = new jx7     // Catch:{ all -> 0x001f }
            r5.<init>(r4, r1, r3)     // Catch:{ all -> 0x001f }
            m5 r3 = new m5     // Catch:{ all -> 0x001f }
            r4 = 17
            r3.<init>(r4, r8)     // Catch:{ all -> 0x001f }
            mv9 r4 = new mv9     // Catch:{ all -> 0x001f }
            r4.<init>(r1, r3)     // Catch:{ all -> 0x001f }
            o73 r3 = new o73     // Catch:{ all -> 0x001f }
            r3.<init>(r5, r2, r4)     // Catch:{ all -> 0x001f }
            yve r4 = new yve     // Catch:{ all -> 0x001f }
            r5 = 7
            r4.<init>(r7, r5)     // Catch:{ all -> 0x001f }
            lx7 r5 = new lx7     // Catch:{ all -> 0x001f }
            r6 = 3
            r5.<init>(r3, r4, r6)     // Catch:{ all -> 0x001f }
            nce r3 = r7.b     // Catch:{ all -> 0x001f }
            r3.getClass()     // Catch:{ all -> 0x001f }
            kce r3 = new kce     // Catch:{ all -> 0x001f }
            r4 = 4
            r3.<init>(r4)     // Catch:{ all -> 0x001f }
            au9 r4 = new au9     // Catch:{ all -> 0x001f }
            r4.<init>(r5, r3, r0)     // Catch:{ all -> 0x001f }
            joc r0 = new joc     // Catch:{ all -> 0x001f }
            r3 = 11
            r0.<init>(r7, r3, r8)     // Catch:{ all -> 0x001f }
            gf6 r3 = z3d.j     // Catch:{ all -> 0x001f }
            z26 r5 = z3d.i     // Catch:{ all -> 0x001f }
            kt9 r6 = new kt9     // Catch:{ all -> 0x001f }
            r6.<init>(r4, r3, r0, r5)     // Catch:{ all -> 0x001f }
            ace r0 = new ace     // Catch:{ all -> 0x001f }
            r4 = 5
            r0.<init>(r7, r4, r8)     // Catch:{ all -> 0x001f }
            ts9 r4 = new ts9     // Catch:{ all -> 0x001f }
            r4.<init>(r6, r3, r0, r1)     // Catch:{ all -> 0x001f }
            yve r0 = new yve     // Catch:{ all -> 0x001f }
            r3 = 8
            r0.<init>(r7, r3)     // Catch:{ all -> 0x001f }
            ts9 r3 = new ts9     // Catch:{ all -> 0x001f }
            r3.<init>(r4, r0, r5, r1)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "bufferSize"
            fja.D(r2, r0)     // Catch:{ all -> 0x001f }
            gf6 r0 = new gf6     // Catch:{ all -> 0x001f }
            r1 = 14
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x001f }
            r1.<init>()     // Catch:{ all -> 0x001f }
            av9 r2 = new av9     // Catch:{ all -> 0x001f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x001f }
            dv9 r4 = new dv9     // Catch:{ all -> 0x001f }
            r4.<init>(r2, r3, r1, r0)     // Catch:{ all -> 0x001f }
            uu9 r0 = new uu9     // Catch:{ all -> 0x001f }
            r0.<init>(r4)     // Catch:{ all -> 0x001f }
            qmc r1 = r7.f     // Catch:{ all -> 0x001f }
            ov9 r0 = r0.r(r1)     // Catch:{ all -> 0x001f }
            monitor-enter(r7)     // Catch:{ all -> 0x001f }
            java.util.concurrent.ConcurrentHashMap r1 = r7.h     // Catch:{ all -> 0x00c4 }
            r1.put(r8, r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r7)     // Catch:{ all -> 0x001f }
            monitor-exit(r7)
            return r0
        L_0x00c4:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
            throw r8     // Catch:{ all -> 0x001f }
        L_0x00c7:
            monitor-exit(r7)     // Catch:{ all -> 0x001f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewe.e(fwe):ms9");
    }
}
