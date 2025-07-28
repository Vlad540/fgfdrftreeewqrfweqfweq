package defpackage;

/* renamed from: c  reason: default package */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            r1 = 1012(0x3f4, float:1.418E-42)
            r2 = 3
            r3 = 2
            r6 = 0
            r7 = 5
            r8 = 0
            r9 = 0
            r11 = 1
            int r12 = r0.a
            switch(r12) {
                case 0: goto L_0x0943;
                case 1: goto L_0x092b;
                case 2: goto L_0x091c;
                case 3: goto L_0x0903;
                case 4: goto L_0x08de;
                case 5: goto L_0x0880;
                case 6: goto L_0x085c;
                case 7: goto L_0x083a;
                case 8: goto L_0x0823;
                case 9: goto L_0x07fd;
                case 10: goto L_0x07c3;
                case 11: goto L_0x07b2;
                case 12: goto L_0x07a0;
                case 13: goto L_0x0737;
                case 14: goto L_0x0718;
                case 15: goto L_0x06a8;
                case 16: goto L_0x0677;
                case 17: goto L_0x066b;
                case 18: goto L_0x065f;
                case 19: goto L_0x05f0;
                case 20: goto L_0x05ae;
                case 21: goto L_0x0364;
                case 22: goto L_0x02c2;
                case 23: goto L_0x025b;
                case 24: goto L_0x0145;
                case 25: goto L_0x011c;
                case 26: goto L_0x007b;
                case 27: goto L_0x0062;
                case 28: goto L_0x0049;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r1 = r0.b
            xq1 r1 = (xq1) r1
            r1.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.Object r1 = r1.b
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.util.Iterator r3 = r1.iterator()
        L_0x0025:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r3.next()
            yq1 r4 = (yq1) r4
            java.lang.Object r5 = r0.c
            android.hardware.camera2.TotalCaptureResult r5 = (android.hardware.camera2.TotalCaptureResult) r5
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L_0x0025
            r2.add(r4)
            goto L_0x0025
        L_0x003f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0048
            r1.removeAll(r2)
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object r1 = r0.b
            zq1 r1 = (zq1) r1
            long r2 = r1.A()
            sq1 r4 = new sq1
            r4.<init>(r1, r2, r8)
            vn1 r1 = hwf.f(r4)
            java.lang.Object r0 = r0.c
            sn1 r0 = (sn1) r0
            defpackage.ct0.C(r1, r0)
            return
        L_0x0062:
            java.lang.Object r1 = r0.b
            zq1 r1 = (zq1) r1
            wq1 r1 = r1.z
            java.lang.Object r2 = r1.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Object r0 = r0.c
            ps1 r0 = (ps1) r0
            r2.remove(r0)
            java.lang.Object r1 = r1.c
            android.util.ArrayMap r1 = (android.util.ArrayMap) r1
            r1.remove(r0)
            return
        L_0x007b:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            l89 r0 = (defpackage.l89) r0
            long r2 = r0.b
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x008e
            goto L_0x011b
        L_0x008e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList r5 = r1.o
            java.util.List r6 = r0.X
            if (r6 == 0) goto L_0x00c1
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x00c1
            java.util.Iterator r7 = r5.iterator()
        L_0x00a3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c1
            java.lang.Object r8 = r7.next()
            xm8 r8 = (defpackage.xm8) r8
            vo8 r11 = r8.a
            long r11 = r11.b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r11 = r6.contains(r11)
            if (r11 == 0) goto L_0x00a3
            r4.add(r8)
            goto L_0x00a3
        L_0x00c1:
            long r6 = r0.c
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            long r11 = r0.o
            if (r8 > 0) goto L_0x00cd
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
        L_0x00cd:
            java.util.Iterator r0 = r5.iterator()
        L_0x00d1:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00f3
            java.lang.Object r8 = r0.next()
            xm8 r8 = (defpackage.xm8) r8
            vo8 r9 = r8.a
            long r13 = r9.x0
            int r10 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x00d1
            long r9 = r9.o
            int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00d1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x00d1
            r4.add(r8)
            goto L_0x00d1
        L_0x00f3:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x011b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "MsgDeleteEvent: remove "
            r0.<init>(r2)
            int r2 = r4.size()
            r0.append(r2)
            java.lang.String r2 = " messages"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "rp1"
            udd.q(r2, r0)
            r5.removeAll(r4)
            r1.f()
        L_0x011b:
            return
        L_0x011c:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            mw2 r0 = (defpackage.mw2) r0
            qp1 r2 = r1.c
            if (r2 == 0) goto L_0x0144
            boolean r2 = r1.a
            if (r2 == 0) goto L_0x0144
            qp1 r2 = r1.c
            s77 r2 = r2.Y
            java.lang.Object r2 = r2.a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Set r2 = r2.keySet()
            java.util.Set r0 = r0.w0
            boolean r0 = java.util.Collections.disjoint(r2, r0)
            if (r0 == 0) goto L_0x0141
            goto L_0x0144
        L_0x0141:
            r1.c()
        L_0x0144:
            return
        L_0x0145:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            u89 r0 = (defpackage.u89) r0
            long r2 = r1.x0
            long r4 = r0.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x025a
            long r2 = r0.b
            java.util.List r4 = r0.o
            java.util.List r0 = r0.X
            r1.x0 = r9
            t52 r5 = r1.C0
            i22 r5 = r5.y(r2)
            if (r5 == 0) goto L_0x0245
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onMsgGet: insert "
            r6.<init>(r7)
            int r4 = r4.size()
            r6.append(r4)
            java.lang.String r4 = " messages"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "rp1"
            udd.q(r6, r4)
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r6 = r4.a
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r8 = r4.b
            rp8 r4 = r1.H0
            to8 r10 = r1.B0
            long r12 = r5.a
            java.util.ArrayList r5 = r10.k(r12, r0)
            java.util.ArrayList r4 = r4.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x019f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e9
            java.lang.Object r5 = r4.next()
            xm8 r5 = (defpackage.xm8) r5
            java.util.concurrent.CopyOnWriteArrayList r10 = r1.o
            yz r12 = new yz
            r13 = 6
            r12.<init>(r13)
            int r10 = java.util.Collections.binarySearch(r10, r5, r12)
            if (r10 >= 0) goto L_0x01be
            int r10 = java.lang.Math.abs(r10)
            int r10 = r10 - r11
        L_0x01be:
            long r12 = r5.k()
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x01ca
            long r6 = r5.k()
        L_0x01ca:
            long r12 = r5.k()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x01d6
            long r8 = r5.k()
        L_0x01d6:
            java.util.concurrent.CopyOnWriteArrayList r12 = r1.o
            r12.add(r10, r5)
            java.util.HashSet r10 = r1.X
            vo8 r5 = r5.a
            long r12 = r5.b
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r10.add(r5)
            goto L_0x019f
        L_0x01e9:
            qp1 r4 = r1.c
            h62 r5 = new h62
            r5.<init>(r6, r8)
            r4.a = r5
            java.util.Iterator r0 = r0.iterator()
        L_0x01f6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0241
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            qp1 r5 = r1.c
            s77 r5 = r5.Y
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r5.a
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0219
            r5.remove(r4)
        L_0x0219:
            qp1 r4 = r1.c
            s77 r4 = r4.Y
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01f6
            qp1 r4 = r1.c
            s77 r4 = r4.Y
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            r4.remove(r5)
            goto L_0x01f6
        L_0x0241:
            r1.f()
            goto L_0x0254
        L_0x0245:
            qp1 r0 = r1.c
            s77 r0 = r0.Y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.remove(r2)
        L_0x0254:
            r1.h()
            r1.c()
        L_0x025a:
            return
        L_0x025b:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            to7 r0 = (defpackage.to7) r0
            r1.getClass()
            boolean r0 = r0.o
            r1.e()
            g2b r2 = r1.G0
            j2b r2 = (defpackage.j2b) r2
            i03 r2 = r2.a
            x97 r2 = r2.g
            java.lang.String r3 = "user.callsLastSync"
            long r2 = r2.getLong(r3, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onLogin: hasNewCalls: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = " callsLastSync: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "rp1"
            udd.q(r5, r4)
            if (r0 == 0) goto L_0x02a3
            qp1 r0 = r1.c
            r0.X = r11
            pp1 r0 = new pp1
            r0.<init>(r1, r11)
            r1.g(r0)
            goto L_0x02be
        L_0x02a3:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x02b3
            qp1 r0 = r1.c
            r0.X = r8
            qp1 r0 = r1.c
            r0.o = r8
            r1.i()
            goto L_0x02be
        L_0x02b3:
            pp1 r0 = new pp1
            r0.<init>(r1, r7)
            r1.g(r0)
            r1.c()
        L_0x02be:
            r1.h()
            return
        L_0x02c2:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            gv6 r0 = (defpackage.gv6) r0
            r1.getClass()
            long r2 = r0.c
            r1.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onNewMessage hasPrev="
            r0.<init>(r4)
            qp1 r4 = r1.c
            boolean r4 = r4.X
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "rp1"
            udd.q(r4, r0)
            qp1 r0 = r1.c
            boolean r0 = r0.X
            if (r0 != 0) goto L_0x0363
            sk7 r0 = r1.z0
            r0.getClass()
            r5 = 26
            mv9 r0 = defpackage.sk7.b(r0, r2, r11, r5)
            java.lang.Object r0 = r0.e()
            xm8 r0 = (defpackage.xm8) r0
            vo8 r2 = r0.a
            boolean r2 = r2.t()
            if (r2 == 0) goto L_0x0363
            h62 r2 = new h62
            qp1 r3 = r1.c
            h62 r3 = r3.a
            long r5 = r3.a
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0319
            vo8 r3 = r0.a
            long r5 = r3.o
            goto L_0x031f
        L_0x0319:
            qp1 r3 = r1.c
            h62 r3 = r3.a
            long r5 = r3.a
        L_0x031f:
            vo8 r3 = r0.a
            long r9 = r3.o
            r2.<init>(r5, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "inIncomingMessage: chunk change \nfrom: "
            r3.<init>(r5)
            qp1 r5 = r1.c
            h62 r5 = r5.a
            java.lang.String r5 = oyb.N(r5)
            r3.append(r5)
            java.lang.String r5 = "\n  to: "
            r3.append(r5)
            java.lang.String r5 = oyb.N(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            udd.q(r4, r3)
            qp1 r3 = r1.c
            r3.a = r2
            r1.h()
            boolean r2 = r1.a
            if (r2 == 0) goto L_0x0360
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.b(r8, r0)
            r1.f()
        L_0x0360:
            r1.i()
        L_0x0363:
            return
        L_0x0364:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            l2f r0 = (defpackage.l2f) r0
            long r2 = r1.Z
            long r12 = r0.a
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            java.lang.String r3 = "rp1"
            if (r2 == 0) goto L_0x037c
            long r14 = r1.w0
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x03d9
        L_0x037c:
            s77 r2 = r0.Z
            int r2 = r2.b()
            if (r2 <= 0) goto L_0x03d9
            s77 r2 = r0.Z
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "onMissedMessages size: "
            r6.<init>(r12)
            int r12 = r2.b()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            udd.q(r3, r6)
            qp1 r6 = r1.c
            s77 r6 = r6.Y
            r6.getClass()
            java.lang.Object r2 = r2.a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x03ae:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x03d6
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x03c4:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x03ae
            java.lang.Object r14 = r13.next()
            java.lang.Object r15 = r12.getKey()
            r6.a(r15, r14)
            goto L_0x03c4
        L_0x03d6:
            r1.h()
        L_0x03d9:
            long r12 = r1.Z
            long r14 = r0.a
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            java.lang.String r6 = " to: "
            java.lang.String r12 = "\n  to: "
            if (r2 != 0) goto L_0x0516
            long r13 = r0.b
            long r4 = r0.c
            long r7 = r0.o
            r19 = r12
            long r11 = r0.X
            boolean r0 = r0.Y
            r1.Z = r9
            h62 r2 = new h62
            qp1 r15 = r1.c
            h62 r15 = r15.a
            r17 = r13
            long r13 = r15.a
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0404
            r13 = r17
            goto L_0x040a
        L_0x0404:
            qp1 r13 = r1.c
            h62 r13 = r13.a
            long r13 = r13.a
        L_0x040a:
            qp1 r15 = r1.c
            h62 r15 = r15.a
            long r9 = r15.b
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0415
            goto L_0x041b
        L_0x0415:
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r4 = r4.b
        L_0x041b:
            r2.<init>(r13, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onSync: chunk change \nfrom: "
            r4.<init>(r5)
            qp1 r5 = r1.c
            h62 r5 = r5.a
            java.lang.String r5 = oyb.N(r5)
            r4.append(r5)
            r5 = r19
            r4.append(r5)
            java.lang.String r5 = oyb.N(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            udd.q(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onSync: hasPrev change from: "
            r4.<init>(r5)
            qp1 r5 = r1.c
            boolean r5 = r5.X
            r4.append(r5)
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            udd.q(r3, r4)
            qp1 r4 = r1.c
            r4.a = r2
            qp1 r2 = r1.c
            r2.X = r0
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0470
            qp1 r0 = r1.c
            r0.b = r7
        L_0x0470:
            qp1 r0 = r1.c
            long r4 = r0.c
            r7 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x048f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onSync: set backwardMarker to: "
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            udd.q(r3, r0)
            qp1 r0 = r1.c
            r0.c = r11
        L_0x048f:
            r1.h()
            boolean r0 = r1.a
            if (r0 != 0) goto L_0x04a0
            pp1 r0 = new pp1
            r2 = 5
            r0.<init>(r1, r2)
            r1.g(r0)
            goto L_0x04f8
        L_0x04a0:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.o
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x04a8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04be
            java.lang.Object r2 = r0.next()
            xm8 r2 = (defpackage.xm8) r2
            vo8 r2 = r2.a
            long r4 = r2.o
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x04a8
            r9 = r4
            goto L_0x04a8
        L_0x04be:
            r4 = 1
            long r9 = r9 + r4
            qp1 r0 = r1.c
            h62 r0 = r0.a
            long r4 = r0.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onSync: load from db"
            r0.<init>(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.String r2 = ez3.T(r2)
            r0.append(r2)
            r0.append(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = ez3.T(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            udd.q(r3, r0)
            to8 r0 = r1.B0
            java.util.ArrayList r0 = r0.m(r9, r4)
            r2 = 0
            r1.b(r2, r0)
        L_0x04f8:
            r1.f()
            qp1 r0 = r1.c
            boolean r0 = r0.X
            if (r0 == 0) goto L_0x0511
            java.lang.String r0 = "onSync: hasPrev == true, load one more page"
            udd.q(r3, r0)
            pp1 r0 = new pp1
            r2 = 1
            r0.<init>(r1, r2)
            r1.g(r0)
            goto L_0x05ad
        L_0x0511:
            r1.i()
            goto L_0x05ad
        L_0x0516:
            r5 = r12
            long r7 = r1.w0
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x05ad
            long r7 = r0.b
            long r9 = r0.c
            long r11 = r0.X
            boolean r0 = r0.Y
            r13 = 0
            r1.w0 = r13
            h62 r2 = new h62
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x053a
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r13 = r4.a
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x053a
            goto L_0x0540
        L_0x053a:
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r7 = r4.a
        L_0x0540:
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r13 = r4.b
            r15 = 0
            int r4 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x054d
            goto L_0x0553
        L_0x054d:
            qp1 r4 = r1.c
            h62 r4 = r4.a
            long r9 = r4.b
        L_0x0553:
            r2.<init>(r7, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "onLoadNext: chunk change \nfrom: "
            r4.<init>(r7)
            qp1 r7 = r1.c
            h62 r7 = r7.a
            java.lang.String r7 = oyb.N(r7)
            r4.append(r7)
            r4.append(r5)
            java.lang.String r5 = oyb.N(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            udd.q(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onLoadNext: hasNext change from: "
            r4.<init>(r5)
            qp1 r5 = r1.c
            boolean r5 = r5.o
            r4.append(r5)
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            udd.q(r3, r4)
            qp1 r3 = r1.c
            r3.a = r2
            qp1 r2 = r1.c
            r2.o = r0
            qp1 r0 = r1.c
            r0.c = r11
            r1.h()
            t50 r0 = new t50
            r2 = 0
            r3 = 5
            r0.<init>(r1, r2, r3)
            r1.g(r0)
        L_0x05ad:
            return
        L_0x05ae:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            jh0 r0 = (defpackage.jh0) r0
            long r2 = r0.a
            long r4 = r1.Z
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x05d8
            r4 = 0
            r1.Z = r4
            java.util.HashSet r0 = r1.Y
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x05ef
            pp1 r0 = new pp1
            r0.<init>(r1, r2)
            r1.g(r0)
            goto L_0x05ef
        L_0x05d8:
            long r4 = r1.w0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x05ef
            r2 = 0
            r1.w0 = r2
            java.util.HashSet r0 = r1.Y
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x05ef
            r1.d()
        L_0x05ef:
            return
        L_0x05f0:
            java.lang.Object r1 = r0.b
            rp1 r1 = (defpackage.rp1) r1
            java.lang.Object r0 = r0.c
            t89 r0 = (defpackage.t89) r0
            r1.getClass()
            long r2 = r0.a
            long r4 = r1.x0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x065e
            r2 = 0
            r1.x0 = r2
            uae r2 = r0.b
            java.lang.String r2 = r2.b
            boolean r2 = iu7.F(r2)
            if (r2 != 0) goto L_0x065e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onEvent: MsgGetErrorEvent, remove "
            r2.<init>(r3)
            java.util.List r3 = r0.o
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " messagesIds from state"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "rp1"
            udd.q(r3, r2)
            java.util.List r2 = r0.o
            java.util.Iterator r2 = r2.iterator()
        L_0x0635:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x065b
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            qp1 r4 = r1.c
            s77 r4 = r4.Y
            long r5 = r0.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0635
            r4.remove(r3)
            goto L_0x0635
        L_0x065b:
            r1.h()
        L_0x065e:
            return
        L_0x065f:
            java.lang.Object r1 = r0.b
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl r1 = (ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl) r1
            java.lang.Object r0 = r0.c
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r0
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.b(r1, r0)
            return
        L_0x066b:
            java.lang.Object r1 = r0.b
            ik1 r1 = (ik1) r1
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            ik1.A(r1, r0)
            return
        L_0x0677:
            java.lang.Object r1 = r0.b
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.c
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startForegroundService(r0)     // Catch:{ all -> 0x0683 }
            goto L_0x06a7
        L_0x0683:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cant start foreground service... handle exception: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CallServiceTag"
            udd.s(r1, r0, r6)
            z11 r0 = z11.a
            so1 r0 = r0.c()
            ep1 r0 = (ep1) r0
            r0.v()
        L_0x06a7:
            return
        L_0x06a8:
            java.lang.Object r1 = r0.c
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
            java.lang.String r2 = "Released, notify awaiting..."
            java.lang.Object r0 = r0.b
            r3 = r0
            rc1 r3 = (defpackage.rc1) r3
            java.lang.String r4 = r3.j
            xwb r5 = r3.a
            java.lang.String r0 = "Starting release process"
            r5.log(r4, r0)     // Catch:{ all -> 0x0709 }
            android.opengl.EGLContext r7 = r3.d     // Catch:{ all -> 0x0709 }
            if (r7 != 0) goto L_0x06c7
            r5.log(r4, r2)
            r1.countDown()
            goto L_0x0708
        L_0x06c7:
            java.lang.String r0 = "Not yet released, continue"
            r5.log(r4, r0)     // Catch:{ all -> 0x0709 }
            android.opengl.EGLDisplay r8 = r3.e     // Catch:{ all -> 0x0709 }
            if (r8 == 0) goto L_0x070b
            r9 = 0
            android.opengl.GLES20.glUseProgram(r9)     // Catch:{ all -> 0x0709 }
            u16 r0 = r3.b     // Catch:{ all -> 0x06da }
            r0.invoke(r3)     // Catch:{ all -> 0x06da }
            goto L_0x06e0
        L_0x06da:
            r0 = move-exception
            java.lang.String r9 = "Error on call dependent release callback"
            r5.reportException(r4, r9, r0)     // Catch:{ all -> 0x0709 }
        L_0x06e0:
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0709 }
            r3.g = r0     // Catch:{ all -> 0x0709 }
            android.opengl.EGLContext r9 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x0709 }
            android.opengl.EGL14.eglMakeCurrent(r8, r0, r0, r9)     // Catch:{ all -> 0x0709 }
            android.opengl.EGL14.eglDestroyContext(r8, r7)     // Catch:{ all -> 0x0709 }
            android.opengl.EGL14.eglReleaseThread()     // Catch:{ all -> 0x0709 }
            android.opengl.EGL14.eglTerminate(r8)     // Catch:{ all -> 0x0709 }
            r3.d = r6     // Catch:{ all -> 0x0709 }
            r3.e = r6     // Catch:{ all -> 0x0709 }
            r3.f = r6     // Catch:{ all -> 0x0709 }
            java.lang.String r0 = "Quitting handler thread"
            r5.log(r4, r0)     // Catch:{ all -> 0x0709 }
            android.os.HandlerThread r0 = r3.c     // Catch:{ all -> 0x0709 }
            r0.quit()     // Catch:{ all -> 0x0709 }
            r5.log(r4, r2)
            r1.countDown()
        L_0x0708:
            return
        L_0x0709:
            r0 = move-exception
            goto L_0x0711
        L_0x070b:
            ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized r0 = new ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized     // Catch:{ all -> 0x0709 }
            r0.<init>()     // Catch:{ all -> 0x0709 }
            throw r0     // Catch:{ all -> 0x0709 }
        L_0x0711:
            r5.log(r4, r2)
            r1.countDown()
            throw r0
        L_0x0718:
            java.lang.Object r1 = r0.b
            e11 r1 = (e11) r1
            java.lang.Object r0 = r0.c
            ch7 r0 = (ch7) r0
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0729 }
            e4b r0 = (e4b) r0     // Catch:{ all -> 0x0729 }
            r1.b = r0     // Catch:{ all -> 0x0729 }
            goto L_0x0736
        L_0x0729:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "CameraPreviewHelper"
            udd.u(r3, r0, r1, r2)
        L_0x0736:
            return
        L_0x0737:
            java.lang.String r1 = "OKRTCCall"
            java.lang.Object r2 = r0.b
            gx0 r2 = (defpackage.gx0) r2
            v4b r2 = r2.Q1
            java.lang.Object r4 = r2.b
            xwb r4 = (defpackage.xwb) r4
            java.lang.Object r2 = r2.c     // Catch:{ JSONException -> 0x0774 }
            ywb r2 = (defpackage.ywb) r2     // Catch:{ JSONException -> 0x0774 }
            boolean r2 = r2.shouldHideSensitiveInformation()     // Catch:{ JSONException -> 0x0774 }
            java.lang.Object r0 = r0.c
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r5 = "handleSignalingNotification, "
            if (r2 == 0) goto L_0x0776
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0774 }
            java.lang.String r0 = am7.l(r0)     // Catch:{ JSONException -> 0x0774 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0774 }
            r2.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x0774 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0774 }
            r0.<init>(r5)     // Catch:{ JSONException -> 0x0774 }
            java.lang.String r2 = r2.toString(r3)     // Catch:{ JSONException -> 0x0774 }
            r0.append(r2)     // Catch:{ JSONException -> 0x0774 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0774 }
            r4.log(r1, r0)     // Catch:{ JSONException -> 0x0774 }
            goto L_0x079f
        L_0x0774:
            r0 = move-exception
            goto L_0x078a
        L_0x0776:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0774 }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x0774 }
            java.lang.String r0 = r0.toString(r3)     // Catch:{ JSONException -> 0x0774 }
            r2.append(r0)     // Catch:{ JSONException -> 0x0774 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0774 }
            r4.log(r1, r0)     // Catch:{ JSONException -> 0x0774 }
            goto L_0x079f
        L_0x078a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error during notification logging: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.log(r1, r0)
        L_0x079f:
            return
        L_0x07a0:
            java.lang.Object r1 = r0.b
            lh0 r1 = (lh0) r1
            l96 r1 = r1.d
            java.lang.Object r0 = r0.c
            java.lang.Exception r0 = (java.lang.Exception) r0
            androidx.media3.common.VideoFrameProcessingException r0 = androidx.media3.common.VideoFrameProcessingException.a(r0)
            r1.c(r0)
            return
        L_0x07b2:
            java.lang.Object r1 = r0.b
            d60 r1 = (d60) r1
            double r1 = r1.t
            java.lang.Object r0 = r0.c
            f2b r0 = (defpackage.f2b) r0
            java.lang.Object r0 = r0.c
            y5c r0 = (y5c) r0
            r0.c0 = r1
            return
        L_0x07c3:
            java.lang.Object r1 = r0.c
            sn1 r1 = (sn1) r1
            java.lang.Object r0 = r0.b
            d60 r0 = (d60) r0
            r0.getClass()
            ls0 r3 = r0.d
            int r4 = r0.g     // Catch:{ all -> 0x07f8 }
            int r4 = hr1.t(r4)     // Catch:{ all -> 0x07f8 }
            if (r4 == 0) goto L_0x07dc
            r5 = 1
            if (r4 == r5) goto L_0x07dc
            goto L_0x07f4
        L_0x07dc:
            r0.b(r6)     // Catch:{ all -> 0x07f8 }
            hgd r4 = r0.e     // Catch:{ all -> 0x07f8 }
            r4.release()     // Catch:{ all -> 0x07f8 }
            r3.release()     // Catch:{ all -> 0x07f8 }
            boolean r4 = r0.i     // Catch:{ all -> 0x07f8 }
            if (r4 != 0) goto L_0x07ec
            goto L_0x07f2
        L_0x07ec:
            r4 = 0
            r0.i = r4     // Catch:{ all -> 0x07f8 }
            r3.stop()     // Catch:{ all -> 0x07f8 }
        L_0x07f2:
            r0.g = r2     // Catch:{ all -> 0x07f8 }
        L_0x07f4:
            r1.b(r6)     // Catch:{ all -> 0x07f8 }
            goto L_0x07fc
        L_0x07f8:
            r0 = move-exception
            r1.d(r0)
        L_0x07fc:
            return
        L_0x07fd:
            java.lang.Object r1 = r0.b
            d60 r1 = (d60) r1
            int r2 = r1.g
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x0817
            r4 = 1
            if (r2 == r4) goto L_0x0817
            if (r2 == r3) goto L_0x080f
            goto L_0x0822
        L_0x080f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "AudioSource is released"
            r0.<init>(r1)
            throw r0
        L_0x0817:
            tx4 r2 = r1.l
            java.lang.Object r0 = r0.c
            tx4 r0 = (tx4) r0
            if (r2 == r0) goto L_0x0822
            r1.b(r0)
        L_0x0822:
            return
        L_0x0823:
            java.lang.Object r1 = r0.b
            f2b r1 = (defpackage.f2b) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r2 = r0 instanceof androidx.camera.video.internal.audio.AudioSourceAccessException
            if (r2 == 0) goto L_0x0839
            java.lang.Object r1 = r1.b
            rf3 r1 = (rf3) r1
            r1.accept(r0)
        L_0x0839:
            return
        L_0x083a:
            java.lang.Object r3 = r0.b
            qe4 r3 = (qe4) r3
            r3.getClass()
            int r4 = oze.a
            java.lang.Object r3 = r3.c
            h45 r3 = (h45) r3
            n45 r3 = r3.a
            g44 r3 = r3.H0
            gd r4 = r3.I()
            o34 r5 = new o34
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r5.<init>(r4, r0, r2)
            r3.J(r4, r1, r5)
            return
        L_0x085c:
            java.lang.Object r2 = r0.b
            otf r2 = (otf) r2
            r2.getClass()
            int r3 = mze.a
            java.lang.Object r2 = r2.b
            g45 r2 = (g45) r2
            m45 r2 = r2.a
            f44 r2 = r2.G0
            fd r3 = r2.P()
            t34 r4 = new t34
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r5 = 12
            r4.<init>(r3, r5, r0)
            r2.Q(r3, r1, r4)
            return
        L_0x0880:
            java.lang.Object r1 = r0.b
            kx r1 = (kx) r1
            java.lang.Object r0 = r0.c
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            boolean r3 = r1.l     // Catch:{ all -> 0x0891 }
            if (r3 == 0) goto L_0x0893
            monitor-exit(r2)     // Catch:{ all -> 0x0891 }
            goto L_0x08db
        L_0x0891:
            r0 = move-exception
            goto L_0x08dc
        L_0x0893:
            long r3 = r1.k     // Catch:{ all -> 0x0891 }
            r5 = 1
            long r3 = r3 - r5
            r1.k = r3     // Catch:{ all -> 0x0891 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x08a2
            monitor-exit(r2)     // Catch:{ all -> 0x0891 }
            goto L_0x08db
        L_0x08a2:
            if (r3 >= 0) goto L_0x08b4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0891 }
            r0.<init>()     // Catch:{ all -> 0x0891 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0891 }
            monitor-enter(r3)     // Catch:{ all -> 0x0891 }
            r1.m = r0     // Catch:{ all -> 0x08b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x08b1 }
            monitor-exit(r2)     // Catch:{ all -> 0x0891 }
            goto L_0x08db
        L_0x08b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08b1 }
            throw r0     // Catch:{ all -> 0x0891 }
        L_0x08b4:
            r1.b()     // Catch:{ all -> 0x0891 }
            if (r0 == 0) goto L_0x08da
            r0.start()     // Catch:{ IllegalStateException -> 0x08ce, Exception -> 0x08bd }
            goto L_0x08da
        L_0x08bd:
            r0 = move-exception
            r3 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0891 }
            r0.<init>(r3)     // Catch:{ all -> 0x0891 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0891 }
            monitor-enter(r3)     // Catch:{ all -> 0x0891 }
            r1.m = r0     // Catch:{ all -> 0x08cb }
            monitor-exit(r3)     // Catch:{ all -> 0x08cb }
            goto L_0x08da
        L_0x08cb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08cb }
            throw r0     // Catch:{ all -> 0x0891 }
        L_0x08ce:
            r0 = move-exception
            r3 = r0
            java.lang.Object r4 = r1.a     // Catch:{ all -> 0x0891 }
            monitor-enter(r4)     // Catch:{ all -> 0x0891 }
            r1.m = r3     // Catch:{ all -> 0x08d7 }
            monitor-exit(r4)     // Catch:{ all -> 0x08d7 }
            goto L_0x08da
        L_0x08d7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x08d7 }
            throw r0     // Catch:{ all -> 0x0891 }
        L_0x08da:
            monitor-exit(r2)     // Catch:{ all -> 0x0891 }
        L_0x08db:
            return
        L_0x08dc:
            monitor-exit(r2)     // Catch:{ all -> 0x0891 }
            throw r0
        L_0x08de:
            java.lang.Object r1 = r0.c
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r0.b
            r2 = r0
            vc2 r2 = (defpackage.vc2) r2
            r2.getClass()
            jh6 r0 = r2.b     // Catch:{ Exception -> 0x08f0 }
            r0.c(r1)     // Catch:{ Exception -> 0x08f0 }
            goto L_0x0902
        L_0x08f0:
            r0 = move-exception
            java.lang.String r1 = r2.a
            java.lang.String r3 = "deleteHistoryItem: exception"
            udd.s(r1, r3, r0)
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            r1.<init>(r0)
            g15 r0 = r2.Y
            r0.a(r1)
        L_0x0902:
            return
        L_0x0903:
            java.lang.Object r1 = r0.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r0.b
            r2 = r0
            qm r2 = (qm) r2
            r2.getClass()
            r1.run()     // Catch:{ all -> 0x0916 }
            r2.a()
            return
        L_0x0916:
            r0 = move-exception
            r1 = r0
            r2.a()
            throw r1
        L_0x091c:
            java.lang.Object r1 = r0.b
            ud r1 = (ud) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            mr6 r0 = (mr6) r0
            r0.f(r1)
            return
        L_0x092b:
            java.lang.Object r1 = r0.b
            d r1 = (defpackage.d) r1
            xp0 r1 = r1.a()
            boolean r2 = r1.a
            if (r2 != 0) goto L_0x0942
            java.lang.Object r1 = r1.b
            jl7 r1 = (defpackage.jl7) r1
            java.lang.Object r0 = r0.c
            cc9 r0 = (defpackage.cc9) r0
            r1.d(r0)
        L_0x0942:
            return
        L_0x0943:
            java.lang.Object r1 = r0.b
            d r1 = (defpackage.d) r1
            java.lang.Object r0 = r0.c
            qu1 r0 = (defpackage.qu1) r0
            jl7 r2 = r1.D0
            if (r2 == 0) goto L_0x0955
            jl7 r1 = r1.D0
            r1.l(r0)
            goto L_0x0957
        L_0x0955:
            r1.K0 = r0
        L_0x0957:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.run():void");
    }
}
