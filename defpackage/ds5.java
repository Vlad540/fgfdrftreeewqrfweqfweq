package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ds5  reason: default package */
public final class ds5 extends jgd implements h27 {
    public final u16 X;
    public final k26 Y;
    public final za6 Z;

    public ds5(ExecutorService executorService, f fVar, ps0 ps0, za6 za6) {
        super(executorService);
        this.X = fVar;
        this.Y = ps0;
        this.Z = za6;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [ds5, ig7] */
    /* JADX WARNING: type inference failed for: r6v0, types: [zye, java.lang.Object, b7c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.zye r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r7 = r5.C(r7)
            pg7 r7 = (pg7) r7
            xye r7 = (defpackage.xye) r7
            android.view.View r0 = r6.a
            r1 = r0
            yye r1 = (defpackage.yye) r1
            wye r2 = r7.b
            r1.setType(r2)
            mge r2 = r7.c
            r2.getClass()
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.CharSequence r2 = r2.b(r3)
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = ""
        L_0x0027:
            r1.setTitle(r2)
            za6 r1 = r5.Z
            r6.J0 = r1
            wye r1 = defpackage.wye.a
            wye r2 = r7.b
            if (r2 != r1) goto L_0x003c
            r1 = r0
            yye r1 = (defpackage.yye) r1
            r3 = 0
            r1.setOnClickListener(r3)
            goto L_0x0047
        L_0x003c:
            hr5 r1 = new hr5
            u16 r3 = r5.X
            r4 = 1
            r1.<init>(r3, r7, r4)
            defpackage.a24.Z(r0, 300, r1)
        L_0x0047:
            wye r1 = defpackage.wye.b
            if (r2 != r1) goto L_0x0063
            yye r0 = (defpackage.yye) r0
            bk r1 = new bk
            r2 = 20
            r1.<init>(r2, r6)
            r0.setOnDragIconTouchListener(r1)
            to1 r1 = new to1
            k26 r5 = r5.Y
            r2 = 14
            r1.<init>(r5, r7, r6, r2)
            r0.setActionMenuIconClickListener(r1)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds5.r(zye, int):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ds5, ig7] */
    public final void V(int i, int i2) {
        boolean z = false;
        boolean z2 = ((pg7) C(i2)).b == wye.b;
        if (i2 <= 0 || i2 >= j()) {
            z = true;
        }
        if (z2 && !z) {
            ArrayList arrayList = new ArrayList(this.o.f);
            Object obj = arrayList.get(i);
            arrayList.remove(i);
            arrayList.add(i2, obj);
            F(arrayList, new wg1((ds5) this, i, i2, arrayList));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ds5, ig7] */
    public final int l(int i) {
        int ordinal = ((pg7) C(i)).b.ordinal();
        if (ordinal == 0) {
            return d5a.h;
        }
        if (ordinal == 1) {
            return d5a.p;
        }
        if (ordinal == 2) {
            return d5a.i;
        }
        if (ordinal == 3) {
            return d5a.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        wye wye;
        if (i == d5a.h) {
            wye = wye.a;
        } else if (i == d5a.p) {
            wye = wye.b;
        } else if (i == d5a.i) {
            wye = wye.c;
        } else if (i == d5a.l) {
            wye = wye.o;
        } else {
            throw new IllegalStateException(wn6.h(i, "Unknown viewtype in "));
        }
        return new b7c(new yye(wye, viewGroup.getContext()));
    }
}
