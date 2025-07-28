package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fc3  reason: default package */
public final class fc3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hc3 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fc3(defpackage.hc3 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            ec3 r2 = defpackage.ec3.NORMAL
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc3.<init>(hc3, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, android.view.View, java.lang.Object] */
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    ec3 ec3 = (ec3) obj2;
                    ec3 ec32 = (ec3) obj;
                    s59 s59 = km4.y0;
                    ? r0 = this.o;
                    int i = s59.r(r0).i(ec3.a);
                    int ordinal = ec3.ordinal();
                    ru3 ru3 = ru3.b;
                    vkd vkd = r0.f2;
                    if (ordinal == 0) {
                        r0.setInputsEnabled(false);
                        ArrayList G0 = hc3.G0(r0);
                        gc3 gc3 = new gc3(r0, ec3, 0);
                        vkd.getClass();
                        skd skd = new skd(G0, gc3, vkd, new okd(vkd, i, 0), (Continuation) null);
                        ou3 ou3 = vkd.a;
                        qod E = xs7.E(ou3, (hu3) null, ru3, skd, 1);
                        k77[] k77Arr = vkd.e;
                        vkd.d.o1(vkd, k77Arr[1], E);
                        qod E2 = xs7.E(ou3, (hu3) null, ru3, new ukd(G0, vkd, new kbb(2, vkd, vkd.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 4), (Continuation) null), 1);
                        vkd.c.o1(vkd, k77Arr[0], E2);
                        return;
                    } else if (ordinal == 1) {
                        r0.setInputsEnabled(!r0.getDisableInputsForError());
                        if (Build.VERSION.SDK_INT >= 30) {
                            lp.K(r0, je6.REJECT);
                        }
                        ArrayList G02 = hc3.G0(r0);
                        gc3 gc32 = new gc3(r0, ec3, 1);
                        vkd.b();
                        fnd fnd = new fnd(r0, fnd.p);
                        gnd gnd = new gnd(0.0f);
                        gnd.b(1500.0f);
                        gnd.a(0.2f);
                        fnd.m = gnd;
                        fnd.a = 3000.0f;
                        fnd.g();
                        qod E3 = xs7.E(vkd.a, (hu3) null, ru3, new qkd(G02, gc32, new okd(vkd, i, 1), 200, (Continuation) null), 1);
                        vkd.d.o1(vkd, vkd.e[1], E3);
                        return;
                    } else if (ordinal == 2) {
                        r0.setInputsEnabled(true);
                        ArrayList G03 = hc3.G0(r0);
                        gc3 gc33 = new gc3(r0, ec3, 2);
                        vkd.b();
                        qod E4 = xs7.E(vkd.a, (hu3) null, ru3, new qkd(G03, gc33, new su6(vkd, i), 300, (Continuation) null), 1);
                        vkd.d.o1(vkd, vkd.e[1], E4);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!hhd.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    hc3 hc3 = this.o;
                    hc3.setAdapter(new kkd(intValue, hc3, new oh2(2, hc3)));
                    return;
                }
                return;
        }
    }
}
