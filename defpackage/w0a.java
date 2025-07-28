package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: w0a  reason: default package */
public final class w0a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ OneMeButton o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w0a(one.me.sdk.uikit.common.button.OneMeButton r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x002c;
                case 2: goto L_0x0022;
                case 3: goto L_0x0019;
                case 4: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            v0a r2 = defpackage.v0a.b
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0019:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>((int) r2, (java.lang.Object) r1)
            return
        L_0x0022:
            s0a r2 = defpackage.s0a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x002c:
            u0a r2 = defpackage.u0a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0a.<init>(one.me.sdk.uikit.common.button.OneMeButton, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [a9a, android.view.View] */
    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton = this.o;
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    v0a v0a = (v0a) obj2;
                    v0a v0a2 = (v0a) obj;
                    k77[] k77Arr = OneMeButton.F0;
                    oneMeButton.k();
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    u0a u0a = (u0a) obj2;
                    u0a u0a2 = (u0a) obj;
                    k77[] k77Arr2 = OneMeButton.F0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 2:
                if (!hhd.f(obj, obj2)) {
                    s0a s0a = (s0a) obj2;
                    s0a s0a2 = (s0a) obj;
                    k77[] k77Arr3 = OneMeButton.F0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 3:
                if (!hhd.f(obj, obj2)) {
                    pda pda = (pda) obj;
                    if (((pda) obj2) == null) {
                        km4.y0.r(oneMeButton);
                    }
                    oneMeButton.e();
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (booleanValue) {
                        ((View) oneMeButton.x0.getValue()).setVisibility(0);
                        OneMeButton.a(oneMeButton, qhc.h, false);
                    } else {
                        t97 t97 = oneMeButton.x0;
                        if (t97.a()) {
                            ((a9a) t97.getValue()).setVisibility(8);
                            OneMeButton.a(oneMeButton, qhc.h, true);
                        }
                    }
                    k77[] k77Arr4 = OneMeButton.F0;
                    oneMeButton.k();
                    return;
                }
                return;
        }
    }
}
