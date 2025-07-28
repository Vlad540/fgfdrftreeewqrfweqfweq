package defpackage;

/* renamed from: ix0  reason: default package */
public final class ix0 extends l6c {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int o;

    public ix0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                this.o = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                return;
            case 3:
                this.b = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                this.o = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                return;
            case 4:
                this.b = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                this.o = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                return;
            case 5:
                this.b = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                this.o = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                return;
            case 6:
                this.b = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 7) * dh4.c().getDisplayMetrics().density);
                this.o = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                return;
            default:
                float f = (float) 8;
                this.b = a24.X(dh4.c().getDisplayMetrics().density * f);
                a24.X(f * dh4.c().getDisplayMetrics().density);
                float f2 = (float) 16;
                this.c = a24.X(dh4.c().getDisplayMetrics().density * f2);
                this.o = a24.X(f2 * dh4.c().getDisplayMetrics().density);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: ig7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: ig7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: fc1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: g7d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: ig7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.x6c r9) {
        /*
            r5 = this;
            int r9 = r5.a
            switch(r9) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x0249;
                case 2: goto L_0x0222;
                case 3: goto L_0x0197;
                case 4: goto L_0x011b;
                case 5: goto L_0x009f;
                case 6: goto L_0x006a;
                default: goto L_0x0005;
            }
        L_0x0005:
            f6c r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x000c
            goto L_0x0069
        L_0x000c:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            if (r7 < 0) goto L_0x0069
            int r9 = r9.j()
            if (r7 >= r9) goto L_0x0069
            r9 = 81
            float r9 = (float) r9
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r9 = r9 * r0
            int r9 = defpackage.a24.X(r9)
            int r0 = r5.b
            int r9 = defpackage.hwf.b(r8, r9, r0)
            androidx.recyclerview.widget.GridLayoutManager r1 = gp0.p(r8)
            if (r1 == 0) goto L_0x0069
            gc6 r1 = r1.K
            if (r1 == 0) goto L_0x0069
            int r1 = r1.b(r7, r0)
            androidx.recyclerview.widget.GridLayoutManager r8 = gp0.p(r8)
            r2 = 1
            if (r8 == 0) goto L_0x004e
            gc6 r8 = r8.K
            if (r8 == 0) goto L_0x004e
            int r7 = r8.c(r7)
            goto L_0x004f
        L_0x004e:
            r7 = r2
        L_0x004f:
            if (r7 != r0) goto L_0x0056
            int r5 = r5.o
            r6.top = r5
            goto L_0x0069
        L_0x0056:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r1 * r9
            int r5 = r5 / r0
            r6.left = r5
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 / r0
            int r9 = r9 - r1
            r6.right = r9
        L_0x0069:
            return
        L_0x006a:
            b7c r9 = r8.T(r7)
            if (r9 != 0) goto L_0x0071
            goto L_0x009e
        L_0x0071:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            int r9 = r9.Y
            if (r9 == 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            if (r7 < 0) goto L_0x009e
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x009e
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            int r8 = r5.b
            if (r7 != 0) goto L_0x0094
            r6.top = r8
            goto L_0x009e
        L_0x0094:
            int r7 = rca.s
            if (r9 != r7) goto L_0x009e
            r6.top = r8
            int r5 = r5.c
            r6.bottom = r5
        L_0x009e:
            return
        L_0x009f:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            boolean r9 = r8 instanceof v8d
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            v8d r8 = (v8d) r8
            goto L_0x00b3
        L_0x00b2:
            r8 = r0
        L_0x00b3:
            if (r8 != 0) goto L_0x00b7
            goto L_0x011a
        L_0x00b7:
            if (r7 < 0) goto L_0x011a
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x011a
            java.lang.Object r9 = r8.C(r7)
            pg7 r9 = (pg7) r9
            boolean r1 = r9 instanceof etc
            if (r1 == 0) goto L_0x00cc
            etc r9 = (etc) r9
            goto L_0x00cd
        L_0x00cc:
            r9 = r0
        L_0x00cd:
            int r1 = r7 + 1
            pg7 r8 = r8.G(r1)
            boolean r1 = r8 instanceof etc
            if (r1 == 0) goto L_0x00da
            etc r8 = (etc) r8
            goto L_0x00db
        L_0x00da:
            r8 = r0
        L_0x00db:
            r1 = 0
            if (r7 != 0) goto L_0x00e0
            r7 = 1
            goto L_0x00e1
        L_0x00e0:
            r7 = r1
        L_0x00e1:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x00ed
            r7 = r2
            goto L_0x00ee
        L_0x00ed:
            r7 = r1
        L_0x00ee:
            r6.top = r7
            if (r9 == 0) goto L_0x00fb
            int r7 = r9.u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00fc
        L_0x00fb:
            r7 = r0
        L_0x00fc:
            if (r8 == 0) goto L_0x0106
            int r8 = r8.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0106:
            boolean r7 = defpackage.hhd.f(r7, r0)
            if (r7 != 0) goto L_0x010e
            r1 = r2
            goto L_0x0118
        L_0x010e:
            if (r9 == 0) goto L_0x0118
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0118
            int r1 = r5.c
        L_0x0118:
            r6.bottom = r1
        L_0x011a:
            return
        L_0x011b:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            boolean r9 = r8 instanceof e8d
            r0 = 0
            if (r9 == 0) goto L_0x012e
            e8d r8 = (e8d) r8
            goto L_0x012f
        L_0x012e:
            r8 = r0
        L_0x012f:
            if (r8 != 0) goto L_0x0133
            goto L_0x0196
        L_0x0133:
            if (r7 < 0) goto L_0x0196
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x0196
            java.lang.Object r9 = r8.C(r7)
            pg7 r9 = (pg7) r9
            boolean r1 = r9 instanceof itc
            if (r1 == 0) goto L_0x0148
            itc r9 = (itc) r9
            goto L_0x0149
        L_0x0148:
            r9 = r0
        L_0x0149:
            int r1 = r7 + 1
            pg7 r8 = r8.G(r1)
            boolean r1 = r8 instanceof itc
            if (r1 == 0) goto L_0x0156
            itc r8 = (itc) r8
            goto L_0x0157
        L_0x0156:
            r8 = r0
        L_0x0157:
            r1 = 0
            if (r7 != 0) goto L_0x015c
            r7 = 1
            goto L_0x015d
        L_0x015c:
            r7 = r1
        L_0x015d:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x0169
            r7 = r2
            goto L_0x016a
        L_0x0169:
            r7 = r1
        L_0x016a:
            r6.top = r7
            if (r9 == 0) goto L_0x0177
            int r7 = r9.u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0178
        L_0x0177:
            r7 = r0
        L_0x0178:
            if (r8 == 0) goto L_0x0182
            int r8 = r8.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0182:
            boolean r7 = defpackage.hhd.f(r7, r0)
            if (r7 != 0) goto L_0x018a
            r1 = r2
            goto L_0x0194
        L_0x018a:
            if (r9 == 0) goto L_0x0194
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0194
            int r1 = r5.c
        L_0x0194:
            r6.bottom = r1
        L_0x0196:
            return
        L_0x0197:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.t93
            r0 = 0
            if (r9 == 0) goto L_0x01aa
            t93 r8 = (defpackage.t93) r8
            goto L_0x01ab
        L_0x01aa:
            r8 = r0
        L_0x01ab:
            if (r8 != 0) goto L_0x01af
            goto L_0x0221
        L_0x01af:
            android.util.Pair r8 = r8.E(r7)
            java.lang.Object r9 = r8.first
            boolean r9 = r9 instanceof g7d
            if (r9 == 0) goto L_0x01be
            java.lang.Object r9 = r8.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x01c3
        L_0x01be:
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x01c3:
            java.lang.Object r8 = r8.first
            boolean r1 = r8 instanceof g7d
            if (r1 == 0) goto L_0x01d0
            boolean r1 = r8 instanceof g7d
            if (r1 == 0) goto L_0x01d0
            r0 = r8
            g7d r0 = (g7d) r0
        L_0x01d0:
            if (r0 != 0) goto L_0x01d3
            goto L_0x0221
        L_0x01d3:
            int r8 = r0.j()
            int r1 = r9.intValue()
            if (r1 < 0) goto L_0x0221
            if (r1 >= r8) goto L_0x0221
            int r8 = r9.intValue()
            java.lang.Object r8 = r0.C(r8)
            pg7 r8 = (pg7) r8
            e7d r8 = (e7d) r8
            int r1 = r9.intValue()
            r2 = 1
            int r1 = r1 + r2
            pg7 r0 = r0.G(r1)
            e7d r0 = (e7d) r0
            int r9 = r9.intValue()
            r1 = 0
            if (r9 != 0) goto L_0x0201
            if (r7 != 0) goto L_0x0201
            goto L_0x0202
        L_0x0201:
            r2 = r1
        L_0x0202:
            int r7 = r5.o
            r6.left = r7
            r6.right = r7
            if (r2 == 0) goto L_0x020d
            int r7 = r5.b
            goto L_0x020e
        L_0x020d:
            r7 = r1
        L_0x020e:
            r6.top = r7
            if (r0 == 0) goto L_0x021d
            int r7 = r8.u()
            int r8 = r0.u()
            if (r7 != r8) goto L_0x021d
            goto L_0x021f
        L_0x021d:
            int r1 = r5.c
        L_0x021f:
            r6.bottom = r1
        L_0x0221:
            return
        L_0x0222:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            if (r8 == 0) goto L_0x0248
            if (r7 < 0) goto L_0x0248
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x0248
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            if (r7 != 0) goto L_0x0244
            int r5 = r5.b
            r6.top = r5
            goto L_0x0248
        L_0x0244:
            int r5 = r5.c
            r6.top = r5
        L_0x0248:
            return
        L_0x0249:
            f6c r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x0250
            goto L_0x02a3
        L_0x0250:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            if (r7 < 0) goto L_0x02a3
            int r0 = r9.j()
            if (r7 >= r0) goto L_0x02a3
            r0 = 32
            float r0 = (float) r0
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.a24.X(r0)
            int r1 = r5.b
            int r0 = defpackage.hwf.b(r8, r0, r1)
            androidx.recyclerview.widget.GridLayoutManager r8 = gp0.p(r8)
            if (r8 == 0) goto L_0x02a3
            gc6 r8 = r8.K
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.b(r7, r1)
            int r7 = r9.l(r7)
            int r9 = defpackage.x5a.q
            if (r7 != r9) goto L_0x028f
            int r5 = r5.o
            r6.top = r5
            goto L_0x02a3
        L_0x028f:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r8 * r0
            int r5 = r5 / r1
            r6.left = r5
            int r8 = r8 + 1
            int r8 = r8 * r0
            int r8 = r8 / r1
            int r0 = r0 - r8
            r6.right = r0
        L_0x02a3:
            return
        L_0x02a4:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.fc1
            r0 = 0
            if (r9 == 0) goto L_0x02b7
            fc1 r8 = (defpackage.fc1) r8
            goto L_0x02b8
        L_0x02b7:
            r8 = r0
        L_0x02b8:
            if (r8 != 0) goto L_0x02bc
            goto L_0x031f
        L_0x02bc:
            if (r7 < 0) goto L_0x031f
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x031f
            java.lang.Object r9 = r8.C(r7)
            pg7 r9 = (pg7) r9
            boolean r1 = r9 instanceof defpackage.jx0
            if (r1 == 0) goto L_0x02d1
            jx0 r9 = (defpackage.jx0) r9
            goto L_0x02d2
        L_0x02d1:
            r9 = r0
        L_0x02d2:
            int r1 = r7 + 1
            pg7 r1 = r8.G(r1)
            boolean r2 = r1 instanceof defpackage.jx0
            if (r2 == 0) goto L_0x02df
            jx0 r1 = (defpackage.jx0) r1
            goto L_0x02e0
        L_0x02df:
            r1 = r0
        L_0x02e0:
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x02e6
            r4 = r2
            goto L_0x02e7
        L_0x02e6:
            r4 = r3
        L_0x02e7:
            int r8 = r8.j()
            int r8 = r8 - r2
            if (r7 != r8) goto L_0x02ef
            goto L_0x02f0
        L_0x02ef:
            r2 = r3
        L_0x02f0:
            int r7 = r5.c
            r6.left = r7
            r6.right = r7
            int r7 = r5.b
            if (r4 == 0) goto L_0x02fc
            r8 = r3
            goto L_0x02fd
        L_0x02fc:
            r8 = r7
        L_0x02fd:
            r6.top = r8
            if (r2 == 0) goto L_0x0304
            int r3 = r5.o
            goto L_0x031d
        L_0x0304:
            if (r9 == 0) goto L_0x030d
            int r5 = r9.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x030e
        L_0x030d:
            r5 = r0
        L_0x030e:
            if (r1 == 0) goto L_0x0316
            int r8 = r1.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0316:
            boolean r5 = defpackage.hhd.f(r5, r0)
            if (r5 != 0) goto L_0x031d
            r3 = r7
        L_0x031d:
            r6.bottom = r3
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix0.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, x6c):void");
    }

    public ix0(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 7:
                this.b = i;
                this.c = i2;
                this.o = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
                return;
            default:
                this.b = i;
                this.c = i2;
                this.o = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
                return;
        }
    }
}
