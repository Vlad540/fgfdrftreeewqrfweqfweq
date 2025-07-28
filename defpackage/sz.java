package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: sz  reason: default package */
public final /* synthetic */ class sz implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ArrayList arrayList;
        gl9 gl9 = (gl9) ((szc) ((bce) this.b).i.getValue()).k.get();
        gl9.getClass();
        hl9 hl9 = (hl9) this.c;
        int i = hl9.X;
        if (i == 5) {
            udd.q("gl9", "Handle FAVORITE_STICKER_SET update");
            gl9.a(hl9);
            l95 l95 = (l95) gl9.a.get();
            long j = hl9.c;
            List list = hl9.o;
            bt btVar = hl9.Y;
            int i2 = hl9.Z;
            l95.getClass();
            udd.p("l95", "onNotifAssetsUpdate: id=%d, updateType=%s, position=%d", new Object[]{Long.valueOf(j), btVar.a, Integer.valueOf(i2)});
            int ordinal = btVar.ordinal();
            t97 t97 = l95.o;
            n83 n83 = l95.x0;
            if (ordinal == 1) {
                f73 k = new w63(l95.b(), 2, new f00(j, 14)).k((qmc) t97.getValue());
                pn1 pn1 = new pn1(new e95(l95, j, 1), 0, new f95(j, 0));
                k.i(pn1);
                n83.a(pn1);
            } else if (ordinal == 2) {
                n83 n832 = n83;
                if (ek8.J(list)) {
                    list = Collections.singletonList(Long.valueOf(j));
                }
                f73 k2 = new w63(l95.b(), 2, new d52(10, list)).k((qmc) t97.getValue());
                pn1 pn12 = new pn1(new c95(l95, list, 0), 0, new b95(0, list));
                k2.i(pn12);
                n832.a(pn12);
            } else if (ordinal == 3) {
                f73 k3 = new w63(l95.b(), 2, new y85(i2, 1, j)).k((qmc) t97.getValue());
                pn1 pn13 = new pn1(new b44(l95, j, i2, 1), 0, new k95(i2, 0, j));
                k3.i(pn13);
                n83.a(pn13);
            } else if (ordinal == 4) {
                udd.p("l95", "onNotifUpdated: id=%d", new Object[]{Long.valueOf(j)});
                yhd m = new o73(new phd(l95.b(), new i74(27), 0), new y63(3, ((lud) l95.b.getValue()).d(Collections.singletonList(Long.valueOf(j))))).m((qmc) t97.getValue());
                pn1 pn14 = new pn1(new d95(l95, 0), 2, new e95(l95, j, 0));
                m.k(pn14);
                n83.a(pn14);
            } else if (ordinal != 5) {
                udd.s("l95", "onNotifAssetsUpdate: unknown asset type", (Throwable) null);
            } else {
                udd.p("l95", "onListUpdated: ids=%s", new Object[]{list});
                f73 k4 = new w63(l95.b(), 2, new d52(11, list)).k((qmc) l95.c.getValue());
                pn1 pn15 = new pn1(new c95(l95, list, 1), 0, new b95(1, list));
                k4.i(pn15);
                n83.a(pn15);
            }
        } else if (i == 4) {
            udd.q("gl9", "Handle FAVORITE_STICKER update");
            gl9.a(hl9);
            fa5 fa5 = (fa5) gl9.b.get();
            long j2 = hl9.c;
            List list2 = hl9.o;
            bt btVar2 = hl9.Y;
            int i3 = hl9.Z;
            fa5.getClass();
            udd.p("fa5", "onNotifAssetsUpdate: id=%d, ids=%s, updateType=%s, position=%d", new Object[]{Long.valueOf(j2), list2, btVar2.a, Integer.valueOf(i3)});
            int ordinal2 = btVar2.ordinal();
            n83 n833 = fa5.h;
            nj4 nj4 = fa5.c;
            nj4 nj42 = fa5.a;
            if (ordinal2 == 1) {
                f73 k5 = new w63(((a95) nj42.get()).a(), 2, new u85(0, j2, true)).k((qmc) nj4.get());
                pn1 pn16 = new pn1(new ca5(fa5, j2, 0), 0, new f95(j2, 4));
                k5.i(pn16);
                n833.a(pn16);
            } else if (ordinal2 == 2) {
                if (ek8.J(list2)) {
                    list2 = Collections.singletonList(Long.valueOf(j2));
                }
                f73 k6 = new w63(((a95) nj42.get()).a(), 2, new d52(8, list2)).k((qmc) nj4.get());
                pn1 pn17 = new pn1(new ba5(fa5, list2, 0), 0, new b95(5, list2));
                k6.i(pn17);
                n833.a(pn17);
            } else if (ordinal2 == 3) {
                f73 k7 = new w63(((a95) nj42.get()).a(), 2, new y85(i3, 0, j2)).k((qmc) nj4.get());
                pn1 pn18 = new pn1(new b44(fa5, j2, i3, 2), 0, new k95(i3, 1, j2));
                k7.i(pn18);
                n833.a(pn18);
            } else if (ordinal2 == 4) {
                udd.p("fa5", "onNotifUpdated: id=%d", new Object[]{Long.valueOf(j2)});
                yhd m2 = new o73(new phd(((a95) nj42.get()).a(), new i74(25), 0), new y63(3, new mv9(2, new r95(fa5, j2, 1)))).m((qmc) nj4.get());
                pn1 pn19 = new pn1(new da5(fa5, 0), 2, new ca5(fa5, j2, 1));
                m2.k(pn19);
                n833.a(pn19);
            } else if (ordinal2 != 5) {
                udd.s("fa5", "onNotifAssetsUpdate: unknown asset type", (Throwable) null);
            } else {
                udd.p("fa5", "onListUpdated: ids=%s", new Object[]{list2});
                f73 k8 = new w63(((a95) nj42.get()).a(), 2, new d52(6, list2)).k((qmc) nj4.get());
                pn1 pn110 = new pn1(new ba5(fa5, list2, 1), 0, new b95(4, list2));
                k8.i(pn110);
                n833.a(pn110);
            }
        } else if (i == 3) {
            udd.q("gl9", "Handle STICKER_SET update");
            if (hl9.Y == bt.UPDATED) {
                ((pk) gl9.d.get()).c(3, Collections.singletonList(Long.valueOf(hl9.c)));
                return;
            }
            Locale locale = Locale.ENGLISH;
            udd.s("gl9", "Unhandled sticker set update type: " + hl9, (Throwable) null);
        } else if (i == 6) {
            udd.q("gl9", "Handle RECENT update");
            v2c v2c = (v2c) gl9.e.get();
            ArrayList arrayList2 = hl9.x0;
            List list3 = hl9.y0;
            bt btVar3 = hl9.Y;
            ArrayList arrayList3 = hw4.a;
            if (arrayList2 == null) {
                v2c.getClass();
                arrayList = arrayList3;
            } else {
                arrayList = fu7.p(arrayList2, (zpc) v2c.e.getValue());
            }
            if (list3 != null) {
                arrayList3 = fu7.k(list3);
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList4.addAll(arrayList3);
            if (!arrayList4.isEmpty()) {
                Collections.reverse(arrayList4);
                int ordinal3 = btVar3.ordinal();
                zef zef = v2c.f;
                t97 t972 = v2c.c;
                if (ordinal3 == 1) {
                    n2c b2 = v2c.b();
                    f73 k9 = new w63(b2.a.n(), 2, new m2c(b2, arrayList4, 2)).k((qmc) t972.getValue());
                    pn1 pn111 = new pn1(jk9.y0, 0, new d74(5));
                    k9.i(pn111);
                    zef.a(pn111);
                } else if (ordinal3 != 2) {
                    udd.t("v2c", "Unhandled notif assets update: %s", new Object[]{btVar3});
                } else {
                    f73 k10 = (arrayList.isEmpty() ? c73.a : new w63(v2c.b().c(arrayList), 0, new y63(1, new s2c(v2c, arrayList, 0)))).k((qmc) t972.getValue());
                    pn1 pn112 = new pn1(kk9.y0, 0, new d74(6));
                    k10.i(pn112);
                    zef.a(pn112);
                }
            }
        } else {
            Locale locale2 = Locale.ENGLISH;
            udd.s("gl9", "Unhandled notif assets update: " + hl9, (Throwable) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v113, types: [java.lang.Object, ln1] */
    /* JADX WARNING: type inference failed for: r0v127, types: [java.lang.Object, ln1] */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            r1 = 100
            r2 = 10
            r3 = 0
            r5 = 1
            r7 = 0
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0ba9;
                case 1: goto L_0x0b85;
                case 2: goto L_0x0b79;
                case 3: goto L_0x0b47;
                case 4: goto L_0x0b17;
                case 5: goto L_0x0aea;
                case 6: goto L_0x0ad4;
                case 7: goto L_0x0ac6;
                case 8: goto L_0x0aa5;
                case 9: goto L_0x0a90;
                case 10: goto L_0x0a82;
                case 11: goto L_0x09f9;
                case 12: goto L_0x09da;
                case 13: goto L_0x09c2;
                case 14: goto L_0x08f9;
                case 15: goto L_0x08a7;
                case 16: goto L_0x0831;
                case 17: goto L_0x0812;
                case 18: goto L_0x07bc;
                case 19: goto L_0x075c;
                case 20: goto L_0x05f6;
                case 21: goto L_0x0549;
                case 22: goto L_0x0446;
                case 23: goto L_0x03f1;
                case 24: goto L_0x03ed;
                case 25: goto L_0x02f4;
                case 26: goto L_0x012b;
                case 27: goto L_0x00fd;
                case 28: goto L_0x00e9;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.m
            java.lang.Object r1 = r1.get()
            qm9 r1 = (defpackage.qm9) r1
            t97 r3 = r1.b
            java.lang.Object r3 = r3.getValue()
            xzc r3 = (defpackage.xzc) r3
            r3.getClass()
            java.lang.Object r0 = r0.c
            pm9 r0 = (defpackage.pm9) r0
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r4 = "qm9"
            java.lang.String r6 = "reactions, onNotifReactionsChanged, %s"
            udd.p(r4, r6, r3)
            t97 r3 = r1.a
            java.lang.Object r3 = r3.getValue()
            bs8 r3 = (defpackage.bs8) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r0.Y
            int r2 = q23.H(r6, r2)
            r4.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x0054:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0079
            java.lang.Object r6 = r2.next()
            sr8 r6 = (defpackage.sr8) r6
            xr8 r8 = new xr8
            t97 r9 = r1.c
            java.lang.Object r9 = r9.getValue()
            zr8 r9 = (defpackage.zr8) r9
            rr8 r10 = r6.a
            yyb r9 = r9.d(r10)
            int r6 = r6.b
            r8.<init>(r9, r6)
            r4.add(r8)
            goto L_0x0054
        L_0x0079:
            t97 r1 = r3.b
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            aw2 r1 = (defpackage.aw2) r1
            long r8 = r0.c
            t0c r1 = r1.n(r8)
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i22 r1 = (defpackage.i22) r1
            if (r1 != 0) goto L_0x0094
            goto L_0x00e8
        L_0x0094:
            to8 r2 = r3.b()
            long r8 = r1.a
            long r10 = r0.o
            vo8 r1 = r2.j(r8, r10)
            if (r1 != 0) goto L_0x00a3
            goto L_0x00e8
        L_0x00a3:
            ls8 r2 = defpackage.ls8.DELETED
            ls8 r6 = r1.z0
            if (r6 != r2) goto L_0x00aa
            goto L_0x00e8
        L_0x00aa:
            yr8 r2 = r1.W0
            if (r2 == 0) goto L_0x00b0
            yyb r7 = r2.c
        L_0x00b0:
            yr8 r6 = new yr8
            int r0 = r0.X
            r6.<init>(r4, r0, r7)
            java.util.Set r0 = defpackage.bs8.a(r2, r6)
            boolean r2 = hhd.f(r6, r2)
            r2 = r2 ^ r5
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            java.lang.String r7 = "bs8"
            java.lang.String r12 = "reactions, NOTIF_REACTIONS_CHANGED, reactionsDiff = %s"
            udd.p(r7, r12, r4)
            to8 r4 = r3.b()
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            java.util.Map r6 = java.util.Collections.singletonMap(r7, r6)
            r4.h(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r3.d(r4, r1, r0, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r3.g(r2, r1, r0, r5)
        L_0x00e8:
            return
        L_0x00e9:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.m
            java.lang.Object r1 = r1.getValue()
            q2b r1 = (defpackage.q2b) r1
            java.lang.Object r0 = r0.c
            sm9 r0 = (defpackage.sm9) r0
            r1.j(r0)
            return
        L_0x00fd:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            g2b r2 = r1.a
            j2b r2 = (defpackage.j2b) r2
            i03 r2 = r2.a
            boolean r2 = r2.E()
            if (r2 == 0) goto L_0x010e
            goto L_0x012a
        L_0x010e:
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.c
            java.lang.Object r1 = r1.get()
            em9 r1 = (defpackage.em9) r1
            r1.getClass()
            md4 r2 = defpackage.md4.REGULAR
            java.lang.Object r0 = r0.c
            cm9 r0 = (defpackage.cm9) r0
            r1.a(r0, r2)
        L_0x012a:
            return
        L_0x012b:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.f
            java.lang.Object r1 = r1.get()
            w10 r1 = (defpackage.w10) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            il9 r0 = (defpackage.il9) r0
            long r8 = r0.c
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            java.lang.String r8 = "w10"
            if (r2 != 0) goto L_0x0162
            long r9 = r0.o
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0162
            long r9 = r0.X
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x015b
            goto L_0x0162
        L_0x015b:
            java.lang.String r0 = "onNotifAttach bad response, empty videoId/audioId skipped"
            udd.s(r8, r0, r7)
            goto L_0x02f3
        L_0x0162:
            nj4 r2 = r1.a
            java.lang.Object r9 = r2.get()
            to8 r9 = (defpackage.to8) r9
            long r10 = r0.c
            long r12 = r0.o
            long r14 = r0.X
            r9.getClass()
            s59 r16 = defpackage.bp8.b
            java.util.ArrayList r9 = r9.s()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0182:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x01df
            java.lang.Object r17 = r9.next()
            r6 = r17
            vo8 r6 = (defpackage.vo8) r6
            boolean r17 = r6.m()
            if (r17 == 0) goto L_0x01d7
            jj7 r3 = r6.D0
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x01a0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01d7
            java.lang.Object r4 = r3.next()
            o10 r4 = (defpackage.o10) r4
            l00 r7 = r4.e
            r19 = r2
            r18 = r3
            if (r7 == 0) goto L_0x01ba
            long r2 = r7.a
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x01ce
        L_0x01ba:
            n10 r2 = r4.d
            if (r2 == 0) goto L_0x01c4
            long r2 = r2.a
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x01ce
        L_0x01c4:
            v00 r2 = r4.j
            if (r2 == 0) goto L_0x01d1
            long r2 = r2.a
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x01d1
        L_0x01ce:
            r5.add(r6)
        L_0x01d1:
            r7 = 0
            r2 = r19
            r3 = r18
            goto L_0x01a0
        L_0x01d7:
            r19 = r2
            r2 = r19
            r3 = 0
            r7 = 0
            goto L_0x0182
        L_0x01df:
            r19 = r2
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x01ef
            java.lang.String r0 = "onNotifAttach: failed to find message by videoId/audioId/fileId, skipped"
            r1 = 0
            udd.s(r8, r0, r1)
            goto L_0x02f3
        L_0x01ef:
            java.lang.String r2 = r0.Y
            boolean r2 = r1g.p(r2)
            tt0 r3 = r1.b
            if (r2 != 0) goto L_0x0228
            java.lang.String r0 = "onNotifAttach: got error, mark message with ERROR status"
            udd.q(r8, r0)
            java.util.Iterator r0 = r5.iterator()
        L_0x0202:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02e8
            java.lang.Object r2 = r0.next()
            vo8 r2 = (defpackage.vo8) r2
            java.lang.Object r4 = r19.get()
            to8 r4 = (defpackage.to8) r4
            bp8 r5 = defpackage.bp8.ERROR
            r4.x(r2, r5)
            ove r4 = new ove
            r11 = 0
            long r7 = r2.x0
            long r9 = r2.b
            r6 = r4
            r6.<init>(r7, r9, r11)
            r3.c(r4)
            goto L_0x0202
        L_0x0228:
            java.lang.String r2 = "onNotifAttach: updateStatusesForMessages"
            udd.q(r8, r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x0231:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02e8
            java.lang.Object r4 = r2.next()
            vo8 r4 = (defpackage.vo8) r4
            jj7 r5 = r4.D0
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0247:
            boolean r6 = r5.hasNext()
            long r10 = r4.b
            if (r6 == 0) goto L_0x02da
            java.lang.Object r6 = r5.next()
            o10 r6 = (defpackage.o10) r6
            c10 r7 = r6.w
            c10 r8 = defpackage.c10.c
            if (r7 != r8) goto L_0x025c
            goto L_0x0247
        L_0x025c:
            long r12 = r0.c
            r14 = 0
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0276
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x0276
            l00 r7 = r6.e
            long r12 = r7.a
            long r14 = r0.c
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x0276
            r7 = 1
            goto L_0x0277
        L_0x0276:
            r7 = 0
        L_0x0277:
            long r12 = r0.o
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0291
            boolean r9 = r6.i()
            if (r9 == 0) goto L_0x0291
            n10 r9 = r6.d
            long r12 = r9.a
            long r14 = r0.o
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x0291
            r9 = 1
            goto L_0x0292
        L_0x0291:
            r9 = 0
        L_0x0292:
            long r12 = r0.X
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x02ac
            boolean r12 = r6.c()
            if (r12 == 0) goto L_0x02ac
            v00 r12 = r6.j
            long r12 = r12.a
            long r14 = r0.X
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x02ac
            r12 = 1
            goto L_0x02ad
        L_0x02ac:
            r12 = 0
        L_0x02ad:
            java.lang.String r13 = r6.q
            if (r7 != 0) goto L_0x02d5
            if (r9 != 0) goto L_0x02d5
            if (r12 == 0) goto L_0x02b6
            goto L_0x02d5
        L_0x02b6:
            c10 r7 = defpackage.c10.b
            c10 r8 = r6.w
            if (r8 != r7) goto L_0x0247
            boolean r7 = r6.i()
            if (r7 != 0) goto L_0x02ce
            boolean r7 = r6.c()
            if (r7 != 0) goto L_0x02ce
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0247
        L_0x02ce:
            c10 r6 = defpackage.c10.a
            r1.d(r10, r13, r6)
            goto L_0x0247
        L_0x02d5:
            r1.d(r10, r13, r8)
            goto L_0x0247
        L_0x02da:
            ove r5 = new ove
            r12 = 0
            long r8 = r4.x0
            r7 = r5
            r7.<init>(r8, r10, r12)
            r3.c(r5)
            goto L_0x0231
        L_0x02e8:
            nj4 r0 = r1.c
            java.lang.Object r0 = r0.get()
            luf r0 = (defpackage.luf) r0
            defpackage.o1d.y(r0)
        L_0x02f3:
            return
        L_0x02f4:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.b
            java.lang.Object r1 = r1.get()
            am9 r1 = (defpackage.am9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifMark, response = "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            zl9 r0 = (defpackage.zl9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "am9"
            udd.q(r3, r2)
            t97 r2 = r1.e
            java.lang.Object r4 = r2.getValue()
            t52 r4 = (defpackage.t52) r4
            long r5 = r0.c
            i22 r4 = r4.y(r5)
            if (r4 == 0) goto L_0x03df
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            t52 r6 = (defpackage.t52) r6
            long r9 = r0.o
            long r11 = r0.X
            int r13 = r0.Y
            r14 = 1
            long r7 = r4.a
            r6.p0(r7, r9, r11, r13, r14)
            t97 r5 = r1.b
            java.lang.Object r5 = r5.getValue()
            luf r5 = (defpackage.luf) r5
            p1d r6 = new p1d
            long r7 = r4.a
            r6.<init>(r7)
            r5.a(r6)
            long r5 = r0.o
            g2b r9 = r1.c
            j2b r9 = (defpackage.j2b) r9
            i03 r9 = r9.a
            long r9 = r9.s()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            tt0 r6 = r1.d
            if (r5 != 0) goto L_0x03d6
            java.lang.String r5 = "onNotifMark, already read from another device or WEB"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            udd.I(r3, r5, r10)
            t97 r3 = r1.f
            java.lang.Object r5 = r3.getValue()
            p7a r5 = (p7a) r5
            o62 r9 = r4.b
            long r10 = r9.a
            r5.f(r10)
            boolean r4 = r4.b0()
            if (r4 == 0) goto L_0x03a5
            java.lang.Object r2 = r2.getValue()
            t52 r2 = (defpackage.t52) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            md4 r5 = defpackage.md4.REGULAR
            r2.getClass()
            g5 r10 = new g5
            r11 = 15
            r10.<init>((java.lang.Object) r2, (java.lang.Object) r5, (java.lang.Object) r4, (int) r11)
            java.lang.String r4 = "syncMessages"
            r2.f0(r4, r10)
        L_0x03a5:
            t97 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            pk r1 = (defpackage.pk) r1
            gy9 r1 = (defpackage.gy9) r1
            long r4 = r9.a
            r1.j(r4)
            mw2 r1 = new mw2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r7 = 0
            r1.<init>(r2, r7)
            r6.c(r1)
            int r0 = r0.Y
            r1 = -1
            if (r0 == r1) goto L_0x03cc
            if (r0 != 0) goto L_0x03ec
        L_0x03cc:
            java.lang.Object r0 = r3.getValue()
            p7a r0 = (p7a) r0
            r0.a(r4)
            goto L_0x03ec
        L_0x03d6:
            t42 r0 = new t42
            r0.<init>(r7)
            r6.c(r0)
            goto L_0x03ec
        L_0x03df:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "onNotifMark chat not found"
            r2 = 0
            udd.R(r3, r2, r1, r0)
        L_0x03ec:
            return
        L_0x03ed:
            r19.a()
            return
        L_0x03f1:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.i
            java.lang.Object r1 = r1.get()
            ll9 r1 = (defpackage.ll9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifCallbackAnswer: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            kl9 r0 = (defpackage.kl9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = defpackage.ll9.d
            udd.q(r3, r2)
            k77[] r2 = defpackage.ll9.c
            r3 = 0
            r2 = r2[r3]
            nj4 r2 = r1.b
            java.lang.Object r2 = r2.get()
            t52 r2 = (defpackage.t52) r2
            long r3 = r0.o
            i22 r2 = r2.y(r3)
            if (r2 == 0) goto L_0x0437
            long r2 = r2.a
            goto L_0x0439
        L_0x0437:
            r2 = -1
        L_0x0439:
            on1 r4 = new on1
            java.lang.String r0 = r0.c
            r4.<init>(r2, r0)
            tt0 r0 = r1.a
            r0.c(r4)
            return
        L_0x0446:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.h
            java.lang.Object r1 = r1.getValue()
            in3 r1 = (defpackage.in3) r1
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onNotifContactSort: "
            r3.<init>(r4)
            java.lang.Object r0 = r0.c
            rl9 r0 = (defpackage.rl9) r0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "in3"
            udd.q(r4, r3)
            java.util.ArrayList r3 = r0.c
            java.util.ArrayList r5 = r0.X
            if (r5 == 0) goto L_0x0477
            int r5 = r5.size()
            goto L_0x0478
        L_0x0477:
            r5 = 0
        L_0x0478:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r3 == 0) goto L_0x0483
            int r6 = r3.size()
            goto L_0x0484
        L_0x0483:
            r6 = 0
        L_0x0484:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r6 = "onNotifContactSort, ids count = %d, phones count = $d"
            udd.p(r4, r6, r5)
            t97 r5 = r1.b
            t97 r6 = r1.a
            t97 r7 = r1.c
            if (r3 == 0) goto L_0x04eb
            ln1 r0 = new ln1
            r0.<init>()
            r1.e = r0
            java.lang.Object r0 = r7.getValue()
            bf5 r0 = (defpackage.bf5) r0
            mg5 r0 = (defpackage.mg5) r0
            r0.getClass()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r7 = "phonesSort"
            r3.<init>(r0, r7)
            ln1 r0 = r1.e
            boolean r0 = lp.Q(r3, r0)
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r0 = r6.getValue()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "user.phonesSortLastSync"
            r0.k(r3, r1)
            goto L_0x04dc
        L_0x04d6:
            java.lang.String r0 = "Failed to store phones sort"
            r1 = 0
            udd.s(r4, r0, r1)
        L_0x04dc:
            java.lang.Object r0 = r5.getValue()
            tt0 r0 = (tt0) r0
            wt r1 = new wt
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0548
        L_0x04eb:
            java.util.ArrayList r0 = r0.X
            if (r0 == 0) goto L_0x0542
            ln1 r0 = new ln1
            r0.<init>()
            r1.d = r0
            java.lang.Object r0 = r7.getValue()
            bf5 r0 = (defpackage.bf5) r0
            mg5 r0 = (defpackage.mg5) r0
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "contactSort"
            r2.<init>(r0, r3)
            ln1 r0 = r1.d
            boolean r0 = lp.Q(r2, r0)
            if (r0 == 0) goto L_0x052c
            java.lang.Object r0 = r6.getValue()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "user.contactSortLastSync"
            r0.k(r2, r1)
            goto L_0x0532
        L_0x052c:
            java.lang.String r0 = "Failed to store contact sort"
            r1 = 0
            udd.s(r4, r0, r1)
        L_0x0532:
            java.lang.Object r0 = r5.getValue()
            tt0 r0 = (tt0) r0
            wt r1 = new wt
            r2 = 3
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0548
        L_0x0542:
            java.lang.String r0 = "Wrong notif contact sort data"
            r1 = 0
            udd.s(r4, r0, r1)
        L_0x0548:
            return
        L_0x0549:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            java.lang.Object r0 = r0.c
            tm9 r0 = (defpackage.tm9) r0
            t97 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            iv6 r1 = (defpackage.iv6) r1
            java.lang.String r2 = "onNotif, chat.id = "
            monitor-enter(r1)
            long r3 = r0.o     // Catch:{ all -> 0x05c0 }
            nj4 r5 = r1.b     // Catch:{ all -> 0x05c0 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x05c0 }
            g2b r5 = (defpackage.g2b) r5     // Catch:{ all -> 0x05c0 }
            j2b r5 = (defpackage.j2b) r5     // Catch:{ all -> 0x05c0 }
            i03 r5 = r5.a     // Catch:{ all -> 0x05c0 }
            long r5 = r5.s()     // Catch:{ all -> 0x05c0 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0575
            monitor-exit(r1)
            goto L_0x05f3
        L_0x0575:
            nj4 r3 = r1.g     // Catch:{ all -> 0x05c0 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x05c0 }
            r59 r3 = (defpackage.r59) r3     // Catch:{ all -> 0x05c0 }
            r3.r(r0)     // Catch:{ all -> 0x05c0 }
            nj4 r3 = r1.h     // Catch:{ all -> 0x05c0 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x05c0 }
            t52 r3 = (defpackage.t52) r3     // Catch:{ all -> 0x05c0 }
            long r4 = r0.c     // Catch:{ all -> 0x05c0 }
            i22 r9 = r3.y(r4)     // Catch:{ all -> 0x05c0 }
            if (r9 == 0) goto L_0x05f2
            java.lang.String r3 = "iv6"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c0 }
            r4.<init>(r2)     // Catch:{ all -> 0x05c0 }
            long r5 = r9.a     // Catch:{ all -> 0x05c0 }
            r4.append(r5)     // Catch:{ all -> 0x05c0 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x05c0 }
            udd.q(r3, r2)     // Catch:{ all -> 0x05c0 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05c0 }
            long r4 = r9.a     // Catch:{ all -> 0x05c0 }
            java.util.Map r4 = r1.a(r4)     // Catch:{ all -> 0x05c0 }
            if (r4 != 0) goto L_0x05c2
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x05c0 }
            r4.<init>()     // Catch:{ all -> 0x05c0 }
            long r5 = r9.a     // Catch:{ all -> 0x05c0 }
            java.util.concurrent.ConcurrentHashMap r7 = r1.k     // Catch:{ all -> 0x05c0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05c0 }
            r7.put(r5, r4)     // Catch:{ all -> 0x05c0 }
            goto L_0x05c2
        L_0x05c0:
            r0 = move-exception
            goto L_0x05f4
        L_0x05c2:
            long r5 = r0.o     // Catch:{ all -> 0x05c0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05c0 }
            fl9 r6 = new fl9     // Catch:{ all -> 0x05c0 }
            e00 r7 = r0.X     // Catch:{ all -> 0x05c0 }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x05c0 }
            r4.put(r5, r6)     // Catch:{ all -> 0x05c0 }
            long r4 = r9.a     // Catch:{ all -> 0x05c0 }
            long r6 = r0.o     // Catch:{ all -> 0x05c0 }
            nj4 r0 = r1.f     // Catch:{ all -> 0x05c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05c0 }
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch:{ all -> 0x05c0 }
            ox4 r10 = new ox4     // Catch:{ all -> 0x05c0 }
            r3 = 1
            r2 = r10
            r8 = r1
            r2.<init>(r3, r4, r6, r8)     // Catch:{ all -> 0x05c0 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x05c0 }
            r3 = 6000(0x1770, double:2.9644E-320)
            r0.schedule(r10, r3, r2)     // Catch:{ all -> 0x05c0 }
            long r2 = r9.a     // Catch:{ all -> 0x05c0 }
            r1.b(r2)     // Catch:{ all -> 0x05c0 }
        L_0x05f2:
            monitor-exit(r1)
        L_0x05f3:
            return
        L_0x05f4:
            monitor-exit(r1)     // Catch:{ all -> 0x05c0 }
            throw r0
        L_0x05f6:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.e
            java.lang.Object r1 = r1.get()
            nl9 r1 = (defpackage.nl9) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            ml9 r0 = (defpackage.ml9) r0
            j22 r2 = r0.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onNotifChat, chat = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = " created  = "
            r3.append(r4)
            long r4 = r2.X
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = ez3.T(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "nl9"
            udd.q(r4, r3)
            nj4 r3 = r1.e     // Catch:{ TamErrorException -> 0x0643 }
            java.lang.Object r3 = r3.get()     // Catch:{ TamErrorException -> 0x0643 }
            r59 r3 = (defpackage.r59) r3     // Catch:{ TamErrorException -> 0x0643 }
            r3.k(r2)     // Catch:{ TamErrorException -> 0x0643 }
        L_0x0643:
            nj4 r3 = r1.a
            java.lang.Object r5 = r3.get()
            t52 r5 = (defpackage.t52) r5
            long r6 = r2.a
            i22 r5 = r5.y(r6)
            long r6 = r2.X
            if (r5 == 0) goto L_0x0679
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0679
            o62 r8 = r5.b
            long r9 = r8.f
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0679
            java.lang.String r0 = "New chat created "
            java.lang.String r1 = " < old chat created "
            java.lang.StringBuilder r0 = hr1.k(r6, r0, r1)
            long r1 = r8.f
            java.lang.String r3 = ". Ignore this notif chat"
            java.lang.String r0 = defpackage.wn6.k(r0, r1, r3)
            r1 = 0
            udd.s(r4, r0, r1)
            goto L_0x075b
        L_0x0679:
            java.lang.String r4 = "REMOVED"
            if (r5 == 0) goto L_0x0694
            j22 r8 = r0.c
            java.lang.String r8 = r8.b
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0694
            java.lang.Object r8 = r3.get()
            t52 r8 = (defpackage.t52) r8
            java.util.List r9 = java.util.Collections.singletonList(r2)
            r8.c0(r9)
        L_0x0694:
            int r8 = r2.A0
            if (r5 == 0) goto L_0x06c4
            o62 r9 = r5.b
            long r9 = r9.f
            r11 = 1
            long r9 = r9 + r11
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x06c4
            ym8 r9 = r2.x0
            if (r9 != 0) goto L_0x06c4
            if (r8 != 0) goto L_0x06c4
            j22 r9 = r0.c
            java.lang.String r9 = r9.b
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x06c4
            java.lang.Object r1 = r3.get()
            t52 r1 = (defpackage.t52) r1
            j22 r0 = r0.c
            long r2 = r0.z0
            long r4 = r5.a
            r1.o(r4, r2)
            goto L_0x075b
        L_0x06c4:
            if (r5 == 0) goto L_0x06d1
            o62 r9 = r5.b
            long r9 = r9.f
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x06d1
            r16 = 1
            goto L_0x06d3
        L_0x06d1:
            r16 = 0
        L_0x06d3:
            java.lang.Object r3 = r3.get()
            t52 r3 = (defpackage.t52) r3
            java.util.List r2 = java.util.Collections.singletonList(r2)
            zb9 r2 = r3.c0(r2)
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x06fe
            if (r16 == 0) goto L_0x06fe
            r9 = 0
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x06fe
            nj4 r3 = r1.d
            java.lang.Object r3 = r3.get()
            jz2 r3 = (defpackage.jz2) r3
            long r9 = r2.g()
            r3.a(r9, r6)
        L_0x06fe:
            if (r8 <= 0) goto L_0x0715
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x0715
            nj4 r3 = r1.b
            java.lang.Object r3 = r3.get()
            p7a r3 = (p7a) r3
            long r6 = r2.g()
            r3.d(r6)
        L_0x0715:
            nj4 r3 = r1.f
            java.lang.Object r3 = r3.get()
            v72 r3 = (defpackage.v72) r3
            j22 r6 = r0.c
            long r6 = r6.a
            b92 r3 = (defpackage.b92) r3
            qod r6 = r3.L0
            r7 = 0
            if (r6 == 0) goto L_0x072b
            r6.cancel(r7)
        L_0x072b:
            a92 r6 = new a92
            r6.<init>(r3, r7)
            hu3 r8 = r3.Y
            r9 = 2
            kotlinx.coroutines.internal.ContextScope r10 = r3.Z
            qod r6 = xs7.E(r10, r8, r7, r6, r9)
            r3.L0 = r6
            mw2 r3 = new mw2
            r3.<init>(r2)
            tt0 r1 = r1.c
            r1.c(r3)
            if (r5 == 0) goto L_0x075b
            j22 r0 = r0.c
            java.lang.String r0 = r0.b
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x075b
            w8c r0 = new w8c
            long r2 = r5.a
            r0.<init>(r2)
            r1.c(r0)
        L_0x075b:
            return
        L_0x075c:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.l
            java.lang.Object r1 = r1.get()
            vl9 r1 = (defpackage.vl9) r1
            g2b r2 = r1.a()
            j2b r2 = (defpackage.j2b) r2
            i03 r2 = r2.a
            java.lang.Object r0 = r0.c
            ul9 r0 = (defpackage.ul9) r0
            long r3 = r0.X
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "user.draftsLastSync"
            r2.k(r4, r3)
            g2b r2 = r1.a()
            j2b r2 = (defpackage.j2b) r2
            yzc r2 = r2.b
            boolean r2 = r2.s()
            if (r2 != 0) goto L_0x079d
            java.lang.String r0 = defpackage.vl9.e
            java.lang.String r1 = "onDraftDiscard: Drafts sync disabled"
            udd.q(r0, r1)
            goto L_0x07bb
        L_0x079d:
            k77[] r2 = defpackage.vl9.d
            r3 = 1
            r2 = r2[r3]
            nj4 r1 = r1.b
            java.lang.Object r1 = r1.get()
            ph4 r1 = (defpackage.ph4) r1
            long r2 = r0.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r0.X
            r1.a(r4, r2, r3)
        L_0x07bb:
            return
        L_0x07bc:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.h
            java.lang.Object r1 = r1.get()
            mm9 r1 = (defpackage.mm9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifMsgDelete: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            lm9 r0 = (defpackage.lm9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "mm9"
            udd.n(r3, r2)
            j22 r2 = r0.c
            if (r2 != 0) goto L_0x07ef
            goto L_0x0811
        L_0x07ef:
            nj4 r3 = r1.b
            java.lang.Object r4 = r3.get()
            t52 r4 = (defpackage.t52) r4
            java.util.List r5 = java.util.Collections.singletonList(r2)
            r4.c0(r5)
            java.lang.Object r3 = r3.get()
            t52 r3 = (defpackage.t52) r3
            long r4 = r2.a
            i22 r2 = r3.y(r4)
            md4 r3 = defpackage.md4.REGULAR
            java.util.Set r0 = r0.o
            r1.b(r2, r0, r3)
        L_0x0811:
            return
        L_0x0812:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            java.lang.Object r0 = r0.c
            ol9 r0 = (defpackage.ol9) r0
            ra3 r0 = r0.c
            nj4 r1 = r1.d
            java.lang.Object r1 = r1.get()
            pl9 r1 = (defpackage.pl9) r1
            r2 = 0
            r1.b(r0, r2)
            return
        L_0x0831:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            java.lang.Object r0 = r0.c
            ql9 r0 = (defpackage.ql9) r0
            r1.getClass()
            uj3 r2 = r0.c
            if (r2 == 0) goto L_0x08a6
            t97 r2 = r1.e
            java.lang.Object r2 = r2.getValue()
            di3 r2 = (defpackage.di3) r2
            r2.getClass()
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x0850
            goto L_0x086f
        L_0x0850:
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x0857
            goto L_0x086f
        L_0x0857:
            tn7 r4 = defpackage.tn7.X
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onNotifContact, response = "
            r5.<init>(r6)
            uj3 r6 = r0.c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ContactController"
            r7 = 0
            r3.d(r4, r6, r5, r7)
        L_0x086f:
            uj3 r3 = r0.c
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.u(r3)
            nj4 r2 = r2.l
            java.lang.Object r2 = r2.get()
            nae r2 = (defpackage.nae) r2
            uj3 r3 = r0.c
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.f(r3)
            t97 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            m07 r1 = (defpackage.m07) r1
            uj3 r0 = r0.c
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.a(r0)
        L_0x08a6:
            return
        L_0x08a7:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.j
            java.lang.Object r1 = r1.get()
            yl9 r1 = (defpackage.yl9) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            xl9 r0 = (defpackage.xl9) r0
            em7 r2 = r0.X
            dm7 r3 = r2.a
            int r4 = defpackage.am3.e
            tx r4 = new tx
            r4.<init>(r3)
            long r5 = r0.c
            r4.b = r5
            long r2 = r2.b
            r4.c = r2
            java.lang.String r0 = r0.o
            r4.o = r0
            java.lang.Object r0 = r4.X
            dm7 r0 = (defpackage.dm7) r0
            if (r0 != 0) goto L_0x08e3
            dm7 r0 = defpackage.dm7.Z
            r4.X = r0
        L_0x08e3:
            am3 r0 = new am3
            r0.<init>(r4)
            k77[] r0 = defpackage.yl9.b
            r2 = 0
            r0 = r0[r2]
            nj4 r0 = r1.a
            java.lang.Object r0 = r0.get()
            di7 r0 = (defpackage.di7) r0
            r0.getClass()
            return
        L_0x08f9:
            java.lang.Object r1 = r0.b
            bce r1 = (defpackage.bce) r1
            t97 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            szc r1 = (defpackage.szc) r1
            nj4 r1 = r1.m
            java.lang.Object r1 = r1.get()
            qm9 r1 = (defpackage.qm9) r1
            t97 r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            xzc r2 = (defpackage.xzc) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            rm9 r0 = (defpackage.rm9) r0
            vr8 r2 = r0.X
            if (r2 == 0) goto L_0x092d
            java.util.List r2 = r2.a
            if (r2 == 0) goto L_0x092d
            int r2 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x092e
        L_0x092d:
            r7 = 0
        L_0x092e:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r3 = "reactions, onNotifYouReacted, counters Count = %s"
            java.lang.String r4 = "qm9"
            udd.p(r4, r3, r2)
            t97 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            bs8 r1 = (defpackage.bs8) r1
            long r2 = r0.c
            long r4 = r0.o
            vr8 r0 = r0.X
            t97 r6 = r1.d
            java.lang.Object r6 = r6.getValue()
            zr8 r6 = (defpackage.zr8) r6
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.util.Map r0 = java.util.Collections.singletonMap(r7, r0)
            java.util.LinkedHashMap r0 = r6.c(r0)
            t97 r6 = r1.b
            java.lang.Object r6 = r6.getValue()
            bv2 r6 = (defpackage.bv2) r6
            aw2 r6 = (defpackage.aw2) r6
            t0c r2 = r6.n(r2)
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 != 0) goto L_0x0974
            goto L_0x09c1
        L_0x0974:
            to8 r3 = r1.b()
            long r6 = r2.a
            vo8 r2 = r3.j(r6, r4)
            if (r2 != 0) goto L_0x0981
            goto L_0x09c1
        L_0x0981:
            ls8 r3 = defpackage.ls8.DELETED
            ls8 r8 = r2.z0
            if (r8 != r3) goto L_0x0988
            goto L_0x09c1
        L_0x0988:
            to8 r3 = r1.b()
            r3.h(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r0.get(r3)
            yr8 r3 = (defpackage.yr8) r3
            yr8 r8 = r2.W0
            java.util.Set r3 = defpackage.bs8.a(r8, r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.get(r4)
            yr8 r0 = (defpackage.yr8) r0
            boolean r0 = hhd.f(r0, r8)
            r4 = 1
            r0 = r0 ^ r4
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r5 = "bs8"
            java.lang.String r8 = "reactions, NOTIF_YOU_REACTED, reactionsDiff = %s"
            udd.p(r5, r8, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r1.d(r4, r2, r3, r0)
        L_0x09c1:
            return
        L_0x09c2:
            java.lang.Object r1 = r0.b
            zsd r1 = (defpackage.zsd) r1
            nj4 r1 = r1.c
            java.lang.Object r1 = r1.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            afc r1 = r1.h
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            r1.z(r0)
            return
        L_0x09da:
            java.lang.Object r1 = r0.b
            zsd r1 = (defpackage.zsd) r1
            nj4 r2 = r1.c
            java.lang.Object r2 = r2.get()
            a04 r2 = (defpackage.a04) r2
            hz3 r2 = (defpackage.hz3) r2
            afc r2 = r2.h
            java.lang.Object r0 = r0.c
            osd r0 = (defpackage.osd) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.z(r0)
            r1.f()
            return
        L_0x09f9:
            java.lang.Object r1 = r0.b
            r0d r1 = (defpackage.r0d) r1
            jee r2 = r1.r()
            long r3 = r1.b
            r2.d(r3)
            to8 r2 = r1.n()
            long r3 = r1.c
            vo8 r2 = r2.q(r3)
            if (r2 == 0) goto L_0x0a81
            ls8 r5 = defpackage.ls8.DELETED
            ls8 r6 = r2.z0
            if (r6 != r5) goto L_0x0a19
            goto L_0x0a81
        L_0x0a19:
            j10 r5 = defpackage.j10.B0
            o10 r5 = r2.a(r5)
            if (r5 == 0) goto L_0x0a50
            to8 r3 = r1.n()
            sic r4 = new sic
            java.lang.Object r0 = r0.c
            dm7 r0 = (defpackage.dm7) r0
            r6 = 7
            r4.<init>(r6, r0)
            long r6 = r2.b
            java.lang.String r0 = r5.q
            r3.v(r6, r0, r4)
            luf r0 = r1.u()
            defpackage.o1d.y(r0)
            tt0 r0 = r1.t()
            ove r9 = new ove
            long r6 = r1.c
            r8 = 0
            long r4 = r2.x0
            r3 = r9
            r3.<init>(r4, r6, r8)
            r0.c(r9)
            goto L_0x0a81
        L_0x0a50:
            java.lang.String r0 = r1.X
            java.lang.String r5 = "onSuccess: WTF, no location attach in message"
            r6 = 0
            udd.s(r0, r5, r6)
            to8 r0 = r1.n()
            r0.getClass()
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            long r6 = r2.x0
            r0.c(r6, r5)
            tt0 r0 = r1.t()
            l89 r1 = new l89
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r3 = 0
            r1.<init>(r6, r2, r3)
            r0.c(r1)
        L_0x0a81:
            return
        L_0x0a82:
            java.lang.Object r1 = r0.b
            aec r1 = (aec) r1
            q07 r1 = r1.e
            java.lang.Object r0 = r0.c
            n07 r0 = (n07) r0
            r1.c(r0)
            return
        L_0x0a90:
            java.lang.Object r1 = r0.b
            i2c r1 = (defpackage.i2c) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            i22 r0 = (defpackage.i22) r0
            long r2 = r0.a
            t52 r0 = r1.a
            r4 = 0
            r0.i0(r2, r4)
            return
        L_0x0aa5:
            java.lang.Object r1 = r0.b
            i2c r1 = (defpackage.i2c) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            tf3 r0 = (defpackage.tf3) r0
            long r2 = r0.n()
            di3 r0 = r1.b
            r0.getClass()
            f00 r1 = new f00
            r4 = 13
            r5 = 0
            r1.<init>(r5, r4)
            r0.c(r2, r1)
            return
        L_0x0ac6:
            java.lang.Object r1 = r0.b
            sw8 r1 = (defpackage.sw8) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.g
            java.lang.Object r0 = r0.c
            mw8 r0 = (defpackage.mw8) r0
            r1.remove(r0)
            return
        L_0x0ad4:
            java.lang.Object r1 = r0.b
            kn8 r1 = (defpackage.kn8) r1
            mn8 r2 = r1.e
            lhd r2 = r2.S0
            o10 r1 = r1.c
            a10 r1 = r1.b
            long r3 = r1.w0
            java.lang.Object r0 = r0.c
            oq6 r0 = (oq6) r0
            r2.r(r0, r3)
            return
        L_0x0aea:
            java.lang.Object r1 = r0.b
            ru.ok.messages.media.crop.FrgTamCropImage r1 = (ru.ok.messages.media.crop.FrgTamCropImage) r1
            one.me.image.crop.view.ImageCropView r2 = r1.F1
            android.os.Bundle r3 = r1.Z
            java.lang.String r4 = "ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r3 = r3.getPath()
            android.os.Bundle r1 = r1.Z
            java.lang.String r4 = "ru.ok.tamtam.extra.SAVE_AS_PNG"
            boolean r1 = r1.getBoolean(r4)
            if (r1 == 0) goto L_0x0b0b
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0b0d
        L_0x0b0b:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0b0d:
            j76 r2 = r2.a
            java.lang.Object r0 = r0.c
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.i(r0, r3, r1)
            return
        L_0x0b17:
            java.lang.Object r2 = r0.b
            fa5 r2 = (defpackage.fa5) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            nj4 r0 = r2.f
            java.lang.Object r0 = r0.get()
            xzc r0 = (defpackage.xzc) r0
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f64maxfavoritestickers
            long r5 = (long) r1
            long r0 = r0.o(r2, r5)
            int r0 = (int) r0
            long r0 = (long) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b41
            return
        L_0x0b41:
            ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException r0 = new ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException
            r0.<init>()
            throw r0
        L_0x0b47:
            java.lang.Object r2 = r0.b
            l95 r2 = (defpackage.l95) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            t97 r0 = r2.X
            java.lang.Object r0 = r0.getValue()
            ece r0 = (defpackage.ece) r0
            xzc r0 = r0.b
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f63maxfavoritestickersets
            long r5 = (long) r1
            long r0 = r0.o(r2, r5)
            int r0 = (int) r0
            long r0 = (long) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b73
            return
        L_0x0b73:
            ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException r0 = new ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException
            r0.<init>()
            throw r0
        L_0x0b79:
            java.lang.Object r1 = r0.b
            ru.ok.android.externcalls.sdk.id.ExternalIdsResolver r1 = (ru.ok.android.externcalls.sdk.id.ExternalIdsResolver) r1
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            r1.lambda$resolveIds$0(r0)
            return
        L_0x0b85:
            java.lang.Object r1 = r0.b
            aa4 r1 = (defpackage.aa4) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            pib r0 = (defpackage.pib) r0
            cd3 r1 = r0.f
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "aa4"
            java.lang.String r3 = "close socket for host: %s"
            udd.p(r2, r3, r1)
            java.net.Socket r0 = r0.d
            if (r0 == 0) goto L_0x0ba8
            r0.close()     // Catch:{ Exception -> 0x0ba8 }
        L_0x0ba8:
            return
        L_0x0ba9:
            java.lang.Object r1 = r0.b
            ru.ok.messages.media.attaches.AttachPhotoView r1 = (ru.ok.messages.media.attaches.AttachPhotoView) r1
            lhd r2 = r1.X0
            o10 r1 = r1.P0
            a10 r1 = r1.b
            long r3 = r1.w0
            java.lang.Object r0 = r0.c
            oq6 r0 = (oq6) r0
            r2.r(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.run():void");
    }
}
