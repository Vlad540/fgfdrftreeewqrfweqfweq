package defpackage;

/* renamed from: sm  reason: default package */
public final class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;

    public /* synthetic */ sm(dn dnVar, int i) {
        this.a = i;
        this.b = dnVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r1 = r0.P0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            dn r0 = r5.b
            android.widget.PopupWindow r1 = r0.L0
            androidx.appcompat.widget.ActionBarContextView r2 = r0.K0
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            zbf r1 = r0.N0
            if (r1 == 0) goto L_0x0018
            r1.b()
        L_0x0018:
            boolean r1 = r0.O0
            if (r1 == 0) goto L_0x0028
            android.view.ViewGroup r1 = r0.P0
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.isLaidOut()
            if (r1 == 0) goto L_0x0028
            r1 = 1
            goto L_0x0029
        L_0x0028:
            r1 = r4
        L_0x0029:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0048
            androidx.appcompat.widget.ActionBarContextView r1 = r0.K0
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.K0
            zbf r1 = defpackage.eaf.a(r1)
            r1.a(r2)
            r0.N0 = r1
            tm r0 = new tm
            r2 = 0
            r0.<init>(r2, r5)
            r1.d(r0)
            goto L_0x0052
        L_0x0048:
            androidx.appcompat.widget.ActionBarContextView r5 = r0.K0
            r5.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r5 = r0.K0
            r5.setVisibility(r4)
        L_0x0052:
            return
        L_0x0053:
            dn r5 = r5.b
            int r0 = r5.o1
            r0 = r0 & 1
            r1 = 0
            if (r0 == 0) goto L_0x005f
            r5.u(r1)
        L_0x005f:
            int r0 = r5.o1
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            r0 = 108(0x6c, float:1.51E-43)
            r5.u(r0)
        L_0x006a:
            r5.n1 = r1
            r5.o1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm.run():void");
    }
}
