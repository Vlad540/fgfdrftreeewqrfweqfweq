package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hpc  reason: default package */
public final class hpc implements rcf {
    public final /* synthetic */ j1c a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public hpc(j1c j1c, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = j1c;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    public final void a() {
    }

    public final void b() {
        j1c j1c = this.a;
        RecyclerView recyclerView = (View) j1c.c;
        RecyclerView recyclerView2 = recyclerView instanceof RecyclerView ? recyclerView : null;
        if (recyclerView2 != null) {
            z3d.L(recyclerView2, new qta(recyclerView2, 1));
        }
        j1c.c = null;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.graphics.Rect r6, android.view.View r7) {
        /*
            r5 = this;
            j1c r0 = r5.a
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            if (r1 != 0) goto L_0x002a
            android.view.View r1 = j1c.i(r7)
            if (r1 != 0) goto L_0x0015
            android.view.ViewParent r1 = r7.getParent()
            android.view.View r1 = (android.view.View) r1
        L_0x0015:
            r0.c = r1
            boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r3 == 0) goto L_0x001e
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x002a
            qta r3 = new qta
            r4 = 2
            r3.<init>(r1, r4)
            z3d.L(r1, r3)
        L_0x002a:
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r3 = r5.b
            defpackage.mcf.d(r3, r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r4 = r1 instanceof defpackage.z0b
            if (r4 == 0) goto L_0x003e
            r2 = r1
            z0b r2 = (defpackage.z0b) r2
        L_0x003e:
            if (r2 == 0) goto L_0x004b
            t0b r1 = r2.getCallback()
            if (r1 == 0) goto L_0x004b
            int r1 = r1.c()
            goto L_0x004d
        L_0x004b:
            int r1 = r3.top
        L_0x004d:
            java.lang.Object r0 = r0.c
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r2 = r5.c
            if (r0 == 0) goto L_0x0058
            defpackage.mcf.d(r2, r0)
        L_0x0058:
            int r0 = r2.top
            int r3 = r5.e
            int r0 = r0 + r3
            android.graphics.Rect r5 = r5.d
            r5.top = r0
            int r1 = r1 - r3
            r5.bottom = r1
            int r0 = r2.left
            r5.left = r0
            int r0 = r2.right
            r5.right = r0
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x007b
            hhd r7 = j1c.h(r7)
            if (r7 == 0) goto L_0x007b
            r7.u(r6, r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpc.c(android.graphics.Rect, android.view.View):void");
    }
}
