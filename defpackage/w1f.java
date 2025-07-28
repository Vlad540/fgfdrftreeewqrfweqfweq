package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;

/* renamed from: w1f  reason: default package */
public final class w1f extends r6c {
    public final uw8 a;
    public final u16 b;
    public final i26 c;
    public final String d = w1f.class.getName();
    public RecyclerView e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final Rect i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public boolean n;
    public final ja2 o;

    public w1f(t97 t97, t97 t972, v70 v70, t97 t973, uw8 uw8, b09 b09, zv zvVar) {
        this.a = uw8;
        this.b = b09;
        this.c = zvVar;
        this.f = t97;
        this.g = t972;
        this.h = t973;
        this.i = new Rect();
        this.j = v70.a();
        boolean z = true;
        this.k = ((j2b) ((g2b) v70.b.getValue())).c.g.getBoolean("app.media.autoplay.gif", true);
        t97 t974 = v70.c;
        z = ((Number) t974.getValue()).intValue() != 1 ? false : z;
        this.l = z;
        this.m = z ? 1.0f : 0.6f;
        this.o = new ja2(((Number) t974.getValue()).intValue(), 2, this);
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            e(recyclerView, false);
        }
    }

    public final void c() {
        String str = this.d;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "Player autoplay. onMediaProcessingStarted.", (Throwable) null);
        }
        this.n = true;
        if (!((gza) this.h.getValue()).a) {
            this.o.i(-1);
        }
    }

    public final void d(h9f h9f, v1f v1f, rz rzVar, MessageModel messageModel, k7f k7f, v2f v2f) {
        h9f.o(v1f, rzVar, messageModel.a, (messageModel.A0 == null && messageModel.B0 == null && (messageModel.I0 == null || (messageModel.L0 & -2080374787) == 0)) ? false : true, true);
        h9f.setVideoClickListener(new t1f(v1f, k7f, v2f, this));
        h9f.setVideoLongClickListener(new bk(21, this));
        k7f.K0(true);
        k7f.g(0.0f);
        k7f.H0(v2f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.recyclerview.widget.RecyclerView r42, boolean r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r42
            r7.e = r8
            boolean r0 = r7.n
            r9 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0012
            goto L_0x001f
        L_0x0012:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x001f
            tn7 r2 = defpackage.tn7.X
            java.lang.String r3 = "Player autoplay. Can't start autoplay because media transform is ongoing."
            r1.d(r2, r0, r3, r9)
        L_0x001f:
            return
        L_0x0020:
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.gp0.q(r42)
            r1 = -1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.W0()
            r10 = r2
            goto L_0x002e
        L_0x002d:
            r10 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            int r0 = r0.Y0()
            r11 = r0
            goto L_0x0037
        L_0x0036:
            r11 = r1
        L_0x0037:
            if (r10 == r1) goto L_0x003b
            if (r11 != r1) goto L_0x0041
        L_0x003b:
            r0 = r7
            r16 = r10
            r1 = r11
            goto L_0x0535
        L_0x0041:
            if (r10 > r11) goto L_0x0534
            r12 = r10
        L_0x0044:
            b7c r0 = r8.M(r12)
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0051
            goto L_0x006d
        L_0x0051:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x006d
            tn7 r2 = defpackage.tn7.X
            java.lang.String r3 = "Player autoplay. Can't find viewHolder, pos:"
            java.lang.String r4 = ", firstPos:"
            java.lang.String r5 = "|lastPos:"
            java.lang.StringBuilder r3 = defpackage.rf0.i(r3, r12, r4, r10, r5)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r9)
        L_0x006d:
            r0 = r7
            r16 = r10
            r1 = r11
            r10 = r12
            goto L_0x0527
        L_0x0074:
            boolean r1 = r0 instanceof defpackage.ao8
            if (r1 == 0) goto L_0x0080
            ao8 r0 = (defpackage.ao8) r0
            android.view.View r1 = r0.M0
            boolean r2 = r1 instanceof defpackage.h9f
            if (r2 != 0) goto L_0x0088
        L_0x0080:
            r0 = r7
            r16 = r10
            r17 = r11
            r10 = r12
            goto L_0x0525
        L_0x0088:
            if (r43 != 0) goto L_0x00b1
            h9f r1 = (defpackage.h9f) r1
            android.view.View r1 = r1.getPreviewView()
            if (r1 != 0) goto L_0x0094
            android.view.View r1 = r0.M0
        L_0x0094:
            android.graphics.Rect r2 = r7.i
            boolean r3 = r1.getLocalVisibleRect(r2)
            if (r3 == 0) goto L_0x00ae
            int r2 = r2.height()
            float r2 = (float) r2
            int r1 = r1.getMeasuredHeight()
            float r1 = (float) r1
            float r3 = r7.m
            float r1 = r1 * r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r1 = 0
        L_0x00af:
            r13 = r1
            goto L_0x00b3
        L_0x00b1:
            r1 = 1
            goto L_0x00af
        L_0x00b3:
            android.view.View r1 = r0.M0
            h9f r1 = (defpackage.h9f) r1
            boolean r1 = r1.j()
            java.lang.String r2 = "\n                                |playing:"
            java.lang.String r3 = "\n                                |isVisible:"
            java.lang.String r4 = "\n                                |hasPreview:"
            java.lang.String r5 = "Player autoplay. State already exist, \n                                |msgId:"
            java.lang.String r6 = "\n                                |states count:"
            java.lang.String r14 = "Player autoplay. State doesn't exist, \n                                |msgId:"
            java.lang.String r15 = ", \n                                |attachId:"
            java.lang.String r9 = "\n                                |previewUrl:"
            java.lang.String r8 = "\n                                |attachId:"
            r16 = r10
            java.lang.String r10 = ",\n                                |previewUrl:"
            r17 = r11
            java.lang.String r11 = "Player autoplay. Can't find video content, \n                                |msgId:"
            if (r13 == 0) goto L_0x0320
            r18 = r12
            boolean r12 = r7.j
            if (r12 == 0) goto L_0x031c
            if (r1 != 0) goto L_0x031c
            android.view.View r1 = r0.M0
            h9f r1 = (defpackage.h9f) r1
            uw8 r12 = r7.a
            r19 = r2
            r20 = r3
            long r2 = r0.N0
            one.me.messages.list.loader.MessageModel r12 = r12.e(r2)
            if (r12 == 0) goto L_0x00f8
            wy r2 = r12.y0
            if (r2 == 0) goto L_0x00f8
            rz r2 = r2.d
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            boolean r3 = r2 instanceof defpackage.s1f
            if (r3 == 0) goto L_0x0101
            s1f r2 = (defpackage.s1f) r2
            r3 = r2
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            if (r3 != 0) goto L_0x0133
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x010b
            goto L_0x012f
        L_0x010b:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            tn7 r2 = defpackage.tn7.X
            if (r12 == 0) goto L_0x011c
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x011d
        L_0x011c:
            r3 = 0
        L_0x011d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find videoAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x012f:
            r31 = r13
            goto L_0x0314
        L_0x0133:
            boolean r2 = r3.a()
            if (r2 != 0) goto L_0x016a
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0140
            goto L_0x012f
        L_0x0140:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            tn7 r2 = defpackage.tn7.X
            if (r12 == 0) goto L_0x0151
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Don't play videoAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " because it's not ready to autoplay"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x012f
        L_0x016a:
            t97 r2 = r7.g
            java.lang.Object r2 = r2.getValue()
            c4f r2 = (defpackage.c4f) r2
            java.lang.String r21 = r3.h()
            x2f r2 = r2.f
            r2.getClass()
            v2f r21 = defpackage.x2f.a(r21)
            if (r21 != 0) goto L_0x01c0
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0188
            goto L_0x012f
        L_0x0188:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            tn7 r2 = defpackage.tn7.X
            long r4 = r3.j()
            q1f r6 = r3.b()
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.h()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r11)
            r9.append(r4)
            r9.append(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            java.lang.String r3 = i0e.E(r3)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x012f
        L_0x01c0:
            ja2 r2 = r7.o
            java.lang.String r8 = r3.h()
            java.lang.Object r2 = r2.c(r8)
            v1f r2 = (defpackage.v1f) r2
            java.lang.String r8 = "\n                                |videoPos:"
            if (r2 != 0) goto L_0x027a
            java.lang.String r2 = r7.d
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x01e1
        L_0x01d6:
            r22 = r0
            r33 = r1
            r34 = r3
            r32 = r12
            r31 = r13
            goto L_0x022d
        L_0x01e1:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x01d6
            tn7 r5 = defpackage.tn7.X
            long r10 = r3.j()
            r31 = r13
            java.lang.String r13 = r3.h()
            r32 = r12
            q1f r12 = r3.b()
            android.net.Uri r12 = r12.b
            r22 = r0
            r33 = r1
            long r0 = r21.d()
            r34 = r3
            ja2 r3 = r7.o
            int r3 = r3.g()
            java.lang.StringBuilder r10 = defpackage.m4b.j(r14, r10, r15, r13)
            r10.append(r9)
            r10.append(r12)
            r10.append(r8)
            r10.append(r0)
            r10.append(r6)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = i0e.E(r0)
            r1 = 0
            r4.d(r5, r2, r0, r1)
        L_0x022d:
            t97 r0 = r7.f
            java.lang.Object r0 = r0.getValue()
            yya r0 = (defpackage.yya) r0
            k7f r5 = r0.get()
            v1f r2 = new v1f
            java.lang.String r23 = r34.h()
            r0 = r22
            long r0 = r0.N0
            t97 r3 = r7.f
            java.lang.Object r3 = r3.getValue()
            r27 = r3
            yya r27 = (defpackage.yya) r27
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r6 = r33
            r3.<init>(r6)
            ja2 r4 = r7.o
            r22 = r2
            r24 = r0
            r26 = r5
            r28 = r21
            r29 = r3
            r30 = r4
            r22.<init>(r23, r24, r26, r27, r28, r29, r30)
            java.lang.String r0 = r34.h()
            r4.d(r0, r2)
            r0 = r41
            r1 = r6
            r3 = r34
            r4 = r32
            r6 = r21
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x027a:
            r6 = r1
            r34 = r3
            r32 = r12
            r31 = r13
            k7f r10 = r2.c
            java.lang.String r0 = r7.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x028e
        L_0x0289:
            r24 = r2
            r33 = r6
            goto L_0x02ee
        L_0x028e:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0289
            tn7 r3 = defpackage.tn7.X
            long r11 = r2.b
            java.lang.String r13 = r2.a
            q1f r14 = r34.b()
            android.net.Uri r14 = r14.b
            r22 = r0
            r23 = r1
            long r0 = r21.d()
            boolean r7 = r6.r()
            r24 = r2
            boolean r2 = r6.m()
            r33 = r6
            boolean r6 = r10.a()
            java.lang.StringBuilder r5 = defpackage.m4b.j(r5, r11, r15, r13)
            r5.append(r9)
            r5.append(r14)
            r5.append(r8)
            r5.append(r0)
            r5.append(r4)
            r5.append(r7)
            r7 = r20
            r5.append(r7)
            r5.append(r2)
            r2 = r19
            r5.append(r2)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = i0e.E(r0)
            r2 = r22
            r4 = r23
            r1 = 0
            r4.d(r3, r2, r0, r1)
        L_0x02ee:
            boolean r0 = r10.a()
            r2 = r24
            if (r0 == 0) goto L_0x0306
            java.lang.ref.WeakReference r0 = r2.Y
            java.lang.Object r0 = r0.get()
            h9f r0 = (defpackage.h9f) r0
            if (r0 == 0) goto L_0x0314
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0314
        L_0x0306:
            r0 = r41
            r1 = r33
            r3 = r34
            r4 = r32
            r5 = r10
            r6 = r21
            r0.d(r1, r2, r3, r4, r5, r6)
        L_0x0314:
            r0 = r41
        L_0x0316:
            r10 = r18
            r5 = r31
            goto L_0x0514
        L_0x031c:
            r7 = r3
        L_0x031d:
            r31 = r13
            goto L_0x0324
        L_0x0320:
            r7 = r3
            r18 = r12
            goto L_0x031d
        L_0x0324:
            if (r31 == 0) goto L_0x04e4
            r12 = r41
            boolean r3 = r12.k
            if (r3 == 0) goto L_0x04e4
            if (r1 == 0) goto L_0x04e4
            android.view.View r1 = r0.M0
            h9f r1 = (defpackage.h9f) r1
            uw8 r3 = r12.a
            r19 = r4
            r13 = r5
            long r4 = r0.N0
            one.me.messages.list.loader.MessageModel r4 = r3.e(r4)
            if (r4 == 0) goto L_0x0346
            wy r3 = r4.y0
            if (r3 == 0) goto L_0x0346
            rz r3 = r3.d
            goto L_0x0347
        L_0x0346:
            r3 = 0
        L_0x0347:
            boolean r5 = r3 instanceof defpackage.qhd
            if (r5 == 0) goto L_0x034e
            qhd r3 = (defpackage.qhd) r3
            goto L_0x034f
        L_0x034e:
            r3 = 0
        L_0x034f:
            if (r3 != 0) goto L_0x037d
            java.lang.String r0 = r12.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0358
            goto L_0x0314
        L_0x0358:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0314
            tn7 r2 = defpackage.tn7.X
            if (r4 == 0) goto L_0x0369
            long r3 = r4.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x036a
        L_0x0369:
            r3 = 0
        L_0x036a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find imageAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x0314
        L_0x037d:
            tp6 r5 = r3.c
            r20 = r13
            android.net.Uri r13 = r5.l
            r21 = r2
            if (r13 == 0) goto L_0x0394
            e96 r2 = new e96
            r22 = r7
            int r7 = r5.c
            int r5 = r5.d
            r2.<init>(r13, r7, r5)
            r7 = r2
            goto L_0x0397
        L_0x0394:
            r22 = r7
            r7 = 0
        L_0x0397:
            if (r7 != 0) goto L_0x03d3
            java.lang.String r0 = r12.d
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x03a1
            goto L_0x0314
        L_0x03a1:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0314
            tn7 r2 = defpackage.tn7.X
            long r4 = r3.a
            tp6 r6 = r3.c
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r11)
            r7.append(r4)
            r7.append(r10)
            r7.append(r6)
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r3 = i0e.E(r3)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x0314
        L_0x03d3:
            ja2 r2 = r12.o
            java.lang.String r5 = r3.b
            java.lang.Object r2 = r2.c(r5)
            v1f r2 = (defpackage.v1f) r2
            if (r2 != 0) goto L_0x0464
            java.lang.String r2 = r12.d
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x03ea
        L_0x03e5:
            r23 = r4
            r24 = r7
            goto L_0x0420
        L_0x03ea:
            boolean r8 = r5.c()
            if (r8 == 0) goto L_0x03e5
            tn7 r8 = defpackage.tn7.X
            long r10 = r3.a
            java.lang.String r13 = r3.b
            r23 = r4
            tp6 r4 = r3.c
            android.net.Uri r4 = r4.b
            r24 = r7
            ja2 r7 = r12.o
            int r7 = r7.g()
            java.lang.StringBuilder r10 = defpackage.m4b.j(r14, r10, r15, r13)
            r10.append(r9)
            r10.append(r4)
            r10.append(r6)
            r10.append(r7)
            java.lang.String r4 = r10.toString()
            java.lang.String r4 = i0e.E(r4)
            r6 = 0
            r5.d(r8, r2, r4, r6)
        L_0x0420:
            t97 r2 = r12.f
            java.lang.Object r2 = r2.getValue()
            yya r2 = (defpackage.yya) r2
            k7f r5 = r2.get()
            v1f r2 = new v1f
            java.lang.String r4 = r3.b
            long r6 = r0.N0
            t97 r0 = r12.f
            java.lang.Object r0 = r0.getValue()
            r37 = r0
            yya r37 = (defpackage.yya) r37
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            ja2 r8 = r12.o
            r32 = r2
            r33 = r4
            r34 = r6
            r36 = r5
            r38 = r24
            r39 = r0
            r40 = r8
            r32.<init>(r33, r34, r36, r37, r38, r39, r40)
            java.lang.String r0 = r3.b
            r8.d(r0, r2)
            r0 = r41
            r4 = r23
            r6 = r24
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x0464:
            r23 = r4
            r24 = r7
            k7f r5 = r2.c
            java.lang.String r0 = r12.d
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0473
        L_0x0470:
            r25 = r3
            goto L_0x04c1
        L_0x0473:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0470
            tn7 r6 = defpackage.tn7.X
            long r7 = r2.b
            java.lang.String r10 = r2.a
            tp6 r11 = r3.c
            android.net.Uri r11 = r11.b
            boolean r13 = r1.r()
            boolean r14 = r1.m()
            boolean r12 = r5.a()
            r25 = r3
            r3 = r20
            java.lang.StringBuilder r3 = defpackage.m4b.j(r3, r7, r15, r10)
            r3.append(r9)
            r3.append(r11)
            r7 = r19
            r3.append(r7)
            r3.append(r13)
            r7 = r22
            r3.append(r7)
            r3.append(r14)
            r7 = r21
            r3.append(r7)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = i0e.E(r3)
            r7 = 0
            r4.d(r6, r0, r3, r7)
        L_0x04c1:
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x04d7
            java.lang.ref.WeakReference r0 = r2.Y
            java.lang.Object r0 = r0.get()
            h9f r0 = (defpackage.h9f) r0
            if (r0 == 0) goto L_0x0314
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0314
        L_0x04d7:
            r0 = r41
            r3 = r25
            r4 = r23
            r6 = r24
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x04e4:
            r0 = r41
            java.lang.String r1 = r0.d
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x04ee
            goto L_0x0316
        L_0x04ee:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0316
            tn7 r3 = defpackage.tn7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Don't find visible videoViewParent by this pos:"
            r4.<init>(r5)
            r10 = r18
            r4.append(r10)
            java.lang.String r5 = ", inVisibleArea:"
            r4.append(r5)
            r5 = r31
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6 = 0
            r2.d(r3, r1, r4, r6)
        L_0x0514:
            boolean r1 = r0.l
            if (r1 == 0) goto L_0x0525
            ja2 r1 = r0.o
            int r1 = r1.g()
            if (r1 <= 0) goto L_0x0525
            if (r5 == 0) goto L_0x0525
            if (r43 != 0) goto L_0x0525
            return
        L_0x0525:
            r1 = r17
        L_0x0527:
            if (r10 == r1) goto L_0x0534
            int r12 = r10 + 1
            r8 = r42
            r7 = r0
            r11 = r1
            r10 = r16
            r9 = 0
            goto L_0x0044
        L_0x0534:
            return
        L_0x0535:
            java.lang.String r0 = r0.d
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x053c
            goto L_0x0554
        L_0x053c:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0554
            tn7 r3 = defpackage.tn7.X
            java.lang.String r4 = "Player autoplay. Can't start autoplay because invalid positions, first:"
            java.lang.String r5 = ", last:"
            java.lang.String r6 = "."
            r7 = r16
            java.lang.String r1 = defpackage.rf0.g(r4, r7, r5, r1, r6)
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x0554:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1f.e(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}
