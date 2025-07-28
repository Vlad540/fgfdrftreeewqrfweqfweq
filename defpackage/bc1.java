package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bc1  reason: default package */
public final class bc1 extends jgd {
    public final f5f A0;
    public final b B0;
    public final t97 C0;
    public final t97 D0;
    public final dwa X;
    public final gk1 Y;
    public final q51 Z;
    public final tj1 w0;
    public final bk1 x0;
    public final Executor y0;
    public final al1 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bc1(defpackage.dwa r2, defpackage.yg1 r3, defpackage.pg1 r4, defpackage.xg1 r5, defpackage.bk1 r6, defpackage.t97 r7, defpackage.t97 r8, defpackage.al1 r9, defpackage.f5f r10, androidx.recyclerview.widget.b r11) {
        /*
            r1 = this;
            nqc r0 = nqc.a
            x4a r0 = r0.p()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1.<init>(r0)
            r1.X = r2
            r1.Y = r3
            r1.Z = r4
            r1.w0 = r5
            r1.x0 = r6
            r1.y0 = r0
            r1.z0 = r9
            r1.A0 = r10
            r1.B0 = r11
            r1.C0 = r7
            r1.D0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc1.<init>(dwa, yg1, pg1, xg1, bk1, t97, t97, al1, f5f, androidx.recyclerview.widget.b):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bc1, ig7] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        chd.A((pg7) C(i));
    }

    /* renamed from: I */
    public final void y(chd chd) {
        chd.D();
        kk1 kk1 = chd instanceof kk1 ? (kk1) chd : null;
        if (kk1 != null) {
            kk1.J0.a.remove(kk1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [bc1, ig7] */
    public final void s(b7c b7c, int i, List list) {
        u2 u2Var;
        chd chd = (chd) b7c;
        if (!list.isEmpty()) {
            ac1 ac1 = (pg7) C(i);
            if (ac1 instanceof zb1) {
                u2Var = new u2(7);
                for (Object next : list) {
                    yb1 yb1 = next instanceof yb1 ? (yb1) next : null;
                    if (yb1 != null) {
                        u2Var.M1(yb1);
                    }
                }
            } else if (ac1 instanceof vb1) {
                u2Var = new u2(7);
                for (Object next2 : list) {
                    ub1 ub1 = next2 instanceof ub1 ? (ub1) next2 : null;
                    if (ub1 != null) {
                        u2Var.M1(ub1);
                    }
                }
            } else if (ac1 instanceof xb1) {
                u2Var = new u2(7);
                for (Object next3 : list) {
                    wb1 wb1 = next3 instanceof wb1 ? (wb1) next3 : null;
                    if (wb1 != null) {
                        u2Var.M1(wb1);
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            chd.B(ac1, u2Var);
            return;
        }
        r(chd, i);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [b7c] */
    /* JADX WARNING: type inference failed for: r8v7, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r8v10, types: [rx0, b7c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b7c t(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            t97 r0 = r8.C0
            t97 r1 = r8.D0
            r2 = 111(0x6f, float:1.56E-43)
            androidx.recyclerview.widget.b r3 = r8.B0
            f5f r4 = r8.A0
            r5 = 0
            r6 = -1
            r7 = 0
            if (r10 == r2) goto L_0x0093
            r2 = 222(0xde, float:3.11E-43)
            if (r10 == r2) goto L_0x0050
            r0 = 225(0xe1, float:3.15E-43)
            if (r10 != r0) goto L_0x0038
            uj1 r10 = new uj1
            android.content.Context r9 = r9.getContext()
            r10.<init>(r9, r7)
            re3 r9 = new re3
            r9.<init>(r6, r6)
            r10.setLayoutParams(r9)
            r10.setVisibility(r5)
            tj1 r8 = r8.w0
            r10.setListener(r8)
            rx0 r8 = new rx0
            r9 = 5
            r8.<init>(r10, r9)
            goto L_0x00e3
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "unknown item view type "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0050:
            r51 r10 = new r51
            android.content.Context r9 = r9.getContext()
            r10.<init>(r9, r7)
            re3 r9 = new re3
            r9.<init>(r6, r6)
            r10.setLayoutParams(r9)
            r10.setVisibility(r5)
            java.lang.Object r9 = r0.getValue()
            android.view.View$OnTouchListener r9 = (android.view.View.OnTouchListener) r9
            r10.setOnTouchListener(r9)
            java.lang.Object r9 = r1.getValue()
            rs3 r9 = (defpackage.rs3) r9
            r10.setControlsMediator(r9)
            q51 r8 = r8.Z
            r10.setListener(r8)
            r10.setVideoLayoutUpdatesController(r4)
            r10.setOpponentsViewPool(r3)
            java.lang.Object r8 = r1.getValue()
            rs3 r8 = (defpackage.rs3) r8
            java.util.LinkedHashSet r8 = r8.a
            r8.add(r10)
            rx0 r8 = new rx0
            r9 = 2
            r8.<init>(r10, r9)
            goto L_0x00e3
        L_0x0093:
            ik1 r10 = new ik1
            android.content.Context r9 = r9.getContext()
            r10.<init>(r9, r7)
            re3 r9 = new re3
            r9.<init>(r6, r6)
            r10.setLayoutParams(r9)
            r10.setVisibility(r5)
            java.lang.Object r9 = r0.getValue()
            android.view.View$OnTouchListener r9 = (android.view.View.OnTouchListener) r9
            r10.setOnTouchListener(r9)
            java.lang.Object r9 = r1.getValue()
            rs3 r9 = (defpackage.rs3) r9
            r10.setControlsMediator(r9)
            r10.setVideoLayoutUpdatesController(r4)
            bk1 r9 = r8.x0
            r10.setCallSpeakerMediator(r9)
            gk1 r9 = r8.Y
            r10.setListener(r9)
            r10.setOpponentsViewPool(r3)
            java.lang.Object r9 = r1.getValue()
            rs3 r9 = (defpackage.rs3) r9
            java.util.LinkedHashSet r9 = r9.a
            r9.add(r10)
            dwa r9 = r8.X
            java.util.ArrayList r9 = r9.a
            r9.add(r10)
            kk1 r9 = new kk1
            al1 r8 = r8.z0
            r9.<init>(r10, r8)
            r8 = r9
        L_0x00e3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc1.t(android.view.ViewGroup, int):b7c");
    }
}
