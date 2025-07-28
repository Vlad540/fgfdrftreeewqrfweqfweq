package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: f29  reason: default package */
public final class f29 {
    public final RecyclerView a;
    public final f19 b;
    public final epc c;
    public final uw8 d;
    public final nx8 e;
    public final String f = f29.class.getName();

    public f29(EndlessRecyclerView2 endlessRecyclerView2, f19 f19, epc epc, uw8 uw8, nx8 nx8) {
        this.a = endlessRecyclerView2;
        this.b = f19;
        this.c = epc;
        this.d = uw8;
        this.e = nx8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = r3.K(r0.X0());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.a
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.gp0.q(r0)
            if (r0 == 0) goto L_0x002d
            int r1 = r0.T0()
            uw8 r3 = r3.d
            one.me.messages.list.loader.MessageModel r1 = r3.K(r1)
            r2 = 0
            if (r1 == 0) goto L_0x002c
            int r0 = r0.X0()
            one.me.messages.list.loader.MessageModel r3 = r3.K(r0)
            if (r3 == 0) goto L_0x002c
            long r0 = r1.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            long r0 = r3.c
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            return r2
        L_0x002d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Only linear layout is supported"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f29.a(long):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r16 = this;
            r0 = r16
            epc r1 = r0.c
            mc9 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            bpc r1 = (defpackage.bpc) r1
            if (r1 == 0) goto L_0x0011
            long r4 = r1.a
            goto L_0x0013
        L_0x0011:
            r4 = 0
        L_0x0013:
            epc r1 = r0.c
            boolean r6 = r1.b
            mc9 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            bpc r1 = (defpackage.bpc) r1
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x0029
            boolean r1 = r1.e
            if (r1 != r8) goto L_0x0029
            r1 = r8
            goto L_0x002a
        L_0x0029:
            r1 = r7
        L_0x002a:
            epc r9 = r0.c
            mc9 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            bpc r9 = (defpackage.bpc) r9
            if (r9 == 0) goto L_0x0041
            boolean r9 = r9.c
            if (r9 != r8) goto L_0x0041
            uw8 r9 = r0.d
            int r9 = r9.f(r4)
            goto L_0x0047
        L_0x0041:
            uw8 r9 = r0.d
            int r9 = r9.J(r4)
        L_0x0047:
            r10 = 0
            if (r1 == 0) goto L_0x009e
            uw8 r11 = r0.d
            int r12 = r9 + 1
            one.me.messages.list.loader.MessageModel r11 = r11.K(r12)
            if (r11 == 0) goto L_0x009e
            long r13 = r11.c
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x009e
            uw8 r9 = r0.d
            int r9 = r9.j()
            fz6 r9 = gwf.S(r12, r9)
            java.util.Iterator r9 = r9.iterator()
            r11 = r7
            r12 = r10
        L_0x006a:
            r13 = r9
            ez6 r13 = (ez6) r13
            boolean r14 = r13.c
            if (r14 == 0) goto L_0x008d
            java.lang.Object r13 = r13.next()
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            uw8 r15 = r0.d
            one.me.messages.list.loader.MessageModel r14 = r15.K(r14)
            if (r14 == 0) goto L_0x006a
            long r14 = r14.c
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x006a
            r11 = r8
            r12 = r13
            goto L_0x006a
        L_0x008d:
            if (r11 == 0) goto L_0x0096
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r12.intValue()
            goto L_0x009e
        L_0x0096:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x009e:
            if (r9 >= 0) goto L_0x00db
            java.lang.String r1 = r0.f
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x00a7
            goto L_0x00da
        L_0x00a7:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00da
            tn7 r3 = defpackage.tn7.Z
            epc r0 = r0.c
            mc9 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            bpc r0 = (defpackage.bpc) r0
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.c
            if (r0 != r8) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r8 = r7
        L_0x00c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Scroll: Got non-existing pos="
            r0.<init>(r4)
            r0.append(r9)
            java.lang.String r4 = " wasExact="
            r0.append(r4)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2.d(r3, r1, r0, r10)
        L_0x00da:
            return r7
        L_0x00db:
            epc r11 = r0.c
            mc9 r12 = r11.a
            java.lang.Object r13 = r12.getValue()
            bpc r13 = (defpackage.bpc) r13
            if (r13 == 0) goto L_0x00ed
            r11.b = r7
            r12.setValue(r10)
            goto L_0x00ee
        L_0x00ed:
            r13 = r10
        L_0x00ee:
            java.lang.String r7 = r0.f
            fn6 r11 = udd.e
            if (r11 != 0) goto L_0x00f5
            goto L_0x0124
        L_0x00f5:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x0124
            tn7 r12 = defpackage.tn7.X
            androidx.recyclerview.widget.RecyclerView r14 = r0.a
            b7c r14 = r14.M(r9)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "Scroll: vh for pos #"
            r15.<init>(r2)
            r15.append(r9)
            java.lang.String r2 = "="
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = ", event="
            r15.append(r2)
            r15.append(r13)
            java.lang.String r2 = r15.toString()
            r11.d(r12, r7, r2, r10)
        L_0x0124:
            if (r13 != 0) goto L_0x012e
            java.lang.String r0 = r0.f
            java.lang.String r1 = "Scroll: No events for scrolling, skip event"
            udd.U(r0, r1)
            return r8
        L_0x012e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.a
            androidx.recyclerview.widget.LinearLayoutManager r2 = defpackage.gp0.q(r2)
            boolean r3 = r2 instanceof one.me.messages.list.ui.recycler.MessagesLayoutManager
            if (r3 == 0) goto L_0x013b
            one.me.messages.list.ui.recycler.MessagesLayoutManager r2 = (one.me.messages.list.ui.recycler.MessagesLayoutManager) r2
            goto L_0x013c
        L_0x013b:
            r2 = r10
        L_0x013c:
            if (r2 == 0) goto L_0x0140
            r2.F = r1
        L_0x0140:
            if (r6 == 0) goto L_0x01a9
            f19 r1 = r0.b
            long r2 = r1.c
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01a9
            java.util.List r2 = r1.d
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r8
            if (r2 != 0) goto L_0x0159
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x01a9
        L_0x0159:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            boolean r2 = r1.isLaidOut()
            if (r2 == 0) goto L_0x01a0
            boolean r2 = r1.isLayoutRequested()
            if (r2 != 0) goto L_0x01a0
            java.lang.String r1 = r0.f
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x016e
            goto L_0x0183
        L_0x016e:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0183
            tn7 r3 = defpackage.tn7.X
            f19 r6 = r0.b
            long r6 = r6.c
            java.lang.String r11 = "Scroll: Highlighted from args message with id="
            java.lang.String r6 = defpackage.us8.i(r6, r11)
            r2.d(r3, r1, r6, r10)
        L_0x0183:
            nx8 r1 = r0.e
            f19 r2 = r0.b
            long r6 = r2.c
            java.util.List r2 = r2.d
            grd r3 = r1.o
        L_0x018d:
            java.lang.Object r1 = r3.getValue()
            r11 = r1
            fg6 r11 = (defpackage.fg6) r11
            fg6 r11 = new fg6
            r11.<init>(r6, r2)
            boolean r1 = r3.b(r1, r11)
            if (r1 == 0) goto L_0x018d
            goto L_0x01a9
        L_0x01a0:
            mp0 r2 = new mp0
            r3 = 6
            r2.<init>(r3, r0)
            r1.addOnLayoutChangeListener(r2)
        L_0x01a9:
            boolean r1 = r0.a(r4)
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = r0.f
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x01b6
            goto L_0x01c3
        L_0x01b6:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01c3
            tn7 r2 = defpackage.tn7.X
            java.lang.String r3 = "Scroll: vh is already visible on screen, skip event"
            r1.d(r2, r0, r3, r10)
        L_0x01c3:
            return r8
        L_0x01c4:
            boolean r1 = r13.d
            if (r1 == 0) goto L_0x01ce
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.B0(r9)
            goto L_0x01d3
        L_0x01ce:
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            r1.x0(r9)
        L_0x01d3:
            java.lang.String r1 = r0.f
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x01da
            goto L_0x01f9
        L_0x01da:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01f9
            tn7 r3 = defpackage.tn7.X
            uw8 r0 = r0.d
            one.me.messages.list.loader.MessageModel r0 = r0.K(r9)
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = r0.m()
            goto L_0x01f0
        L_0x01ef:
            r0 = r10
        L_0x01f0:
            java.lang.String r4 = "Scroll: Scrolled to message="
            java.lang.String r0 = defpackage.rf0.h(r4, r0)
            r2.d(r3, r1, r0, r10)
        L_0x01f9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f29.b():boolean");
    }
}
