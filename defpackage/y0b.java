package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: y0b  reason: default package */
public final class y0b extends iu7 {
    public int r;
    public final /* synthetic */ z0b s;

    public y0b(z0b z0b) {
        this.s = z0b;
    }

    public final int C(View view) {
        return view.getHeight();
    }

    public final void L(View view, int i, int i2) {
        float f;
        int i3;
        z0b z0b = this.s;
        z0b.getHalfExpandedViewHelper().a(i2);
        t0b callback = z0b.getCallback();
        if (callback != null) {
            if (z0b.x0.a == 2 && z0b.getScrollState() == x0b.a) {
                int e = callback.e();
                if (z0b.getStackFromBottom()) {
                    int i4 = this.r;
                    f = (float) (i2 - i4);
                    i3 = e - i4;
                } else {
                    int i5 = this.r;
                    f = (float) (i5 - i2);
                    i3 = i5 - e;
                }
                z0b.setBackgroundAlpha(((float) 1) - Math.abs(f / ((float) i3)));
                if (z0b.getStackFromBottom() && i2 >= e) {
                    callback.h();
                }
                if (!z0b.getStackFromBottom() && i2 <= e) {
                    callback.h();
                }
            }
            callback.m(i2);
        }
    }

    public final void M(View view, float f, float f2) {
        x0b x0b;
        this.r = view.getTop();
        z0b z0b = this.s;
        t0b callback = z0b.getCallback();
        if (callback != null) {
            double d = (double) f2;
            if (Math.abs(d) > 200.0d) {
                if (Math.abs(d) < 8000.0d) {
                    int b = callback.b();
                    if (b != 0) {
                        int i = u0b.$EnumSwitchMapping$0[hr1.t(b)];
                        if (i == 1) {
                            x0b = z0b.getStackFromBottom() ? this.r < callback.c() ? f2 > 0.0f ? x0b.b : x0b.c : f2 > 0.0f ? x0b.a : x0b.b : this.r > callback.c() ? f2 < 0.0f ? x0b.b : x0b.c : f2 < 0.0f ? x0b.a : x0b.b;
                        } else if (i == 2) {
                            x0b = z0b.getScrollState();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw null;
                    }
                } else {
                    x0b = z0b.getStackFromBottom() ? f2 > 0.0f ? x0b.a : x0b.c : f2 < 0.0f ? x0b.a : x0b.c;
                }
            } else if (z0b.getStackFromBottom()) {
                if (this.r < callback.c() / 2) {
                    x0b = x0b.c;
                } else {
                    x0b = this.r > ((callback.e() - callback.c()) / 2) + callback.c() ? x0b.a : x0b.b;
                }
            } else if (this.r > callback.c() / 2) {
                x0b = x0b.c;
            } else {
                x0b = this.r < ((callback.e() - callback.c()) / 2) + callback.c() ? x0b.a : x0b.b;
            }
            z0b.setScrollState(callback.g(z0b.getScrollState(), x0b));
            if (this.r == z0b.getScrollStateOffset() && z0b.getScrollState() == x0b.a) {
                callback.h();
                z0b.setBackgroundAlpha(0.0f);
                return;
            }
            z0b.x0.n(view.getLeft(), z0b.getScrollStateOffset());
            callback.l(z0b.getScrollState());
            z0b.invalidate();
        }
    }

    public final boolean c0(View view, int i) {
        z0b z0b = this.s;
        t0b callback = z0b.getCallback();
        return view == (callback != null ? callback.f() : null) && z0b.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(android.view.View r4, int r5) {
        /*
            r3 = this;
            z0b r3 = r3.s
            boolean r4 = r3.getStackFromBottom()
            r0 = 0
            if (r4 == 0) goto L_0x001a
            t0b r4 = r3.getCallback()
            if (r4 == 0) goto L_0x0018
            int r4 = r4.a()
        L_0x0013:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0025
        L_0x0018:
            r4 = r0
            goto L_0x0025
        L_0x001a:
            t0b r4 = r3.getCallback()
            if (r4 == 0) goto L_0x0018
            int r4 = r4.e()
            goto L_0x0013
        L_0x0025:
            r1 = 0
            if (r4 == 0) goto L_0x002d
            int r4 = r4.intValue()
            goto L_0x002e
        L_0x002d:
            r4 = r1
        L_0x002e:
            boolean r2 = r3.getStackFromBottom()
            t0b r3 = r3.getCallback()
            if (r2 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x004a
            int r3 = r3.e()
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x0043:
            if (r3 == 0) goto L_0x004a
            int r3 = r3.a()
            goto L_0x003e
        L_0x004a:
            if (r0 == 0) goto L_0x0050
            int r1 = r0.intValue()
        L_0x0050:
            int r3 = gwf.j(r5, r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0b.h(android.view.View, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r0.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int y(int r4) {
        /*
            r3 = this;
            z0b r3 = r3.s
            r4 = 0
            t0b r0 = r3.getCallback()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r0.f()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            int r3 = r3.indexOfChild(r0)     // Catch:{ all -> 0x0018 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0022
        L_0x0018:
            r3 = move-exception
            goto L_0x001c
        L_0x001a:
            r3 = r4
            goto L_0x0022
        L_0x001c:
            kcc r0 = new kcc
            r0.<init>(r3)
            r3 = r0
        L_0x0022:
            java.lang.Throwable r0 = mcc.a(r3)
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "PopupLayout"
            java.lang.String r2 = "getOrderedChildIndex fail, issue ONEME-9645"
            udd.s(r1, r2, r0)
        L_0x002f:
            boolean r0 = r3 instanceof kcc
            if (r0 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x003e
            int r3 = r4.intValue()
            goto L_0x003f
        L_0x003e:
            r3 = -1
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0b.y(int):int");
    }
}
