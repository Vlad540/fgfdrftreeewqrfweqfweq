package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: m27  reason: default package */
public final class m27 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ o27 b;

    public m27(o27 o27) {
        this.b = o27;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r4 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLongPress(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            o27 r4 = r4.b
            android.view.View r0 = r4.n(r5)
            if (r0 == 0) goto L_0x0058
            androidx.recyclerview.widget.RecyclerView r1 = r4.G0
            b7c r0 = r1.T(r0)
            if (r0 == 0) goto L_0x0058
            n27 r0 = r4.B0
            androidx.recyclerview.widget.RecyclerView r1 = r4.G0
            int r2 = r0.b
            int r0 = r0.c
            r3 = r2 | r0
            int r2 = r2 << 8
            r2 = r2 | r3
            int r0 = r0 << 16
            r0 = r0 | r2
            java.util.WeakHashMap r2 = defpackage.eaf.a
            int r1 = r1.getLayoutDirection()
            int r0 = defpackage.n27.b(r0, r1)
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0058
            r0 = 0
            int r0 = r5.getPointerId(r0)
            int r1 = r4.A0
            if (r0 != r1) goto L_0x0058
            int r0 = r5.findPointerIndex(r1)
            float r1 = r5.getX(r0)
            float r5 = r5.getY(r0)
            r4.o = r1
            r4.X = r5
            r5 = 0
            r4.x0 = r5
            r4.w0 = r5
            n27 r4 = r4.B0
            r4.getClass()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m27.onLongPress(android.view.MotionEvent):void");
    }
}
