package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hba  reason: default package */
public final class hba {
    public final WeakReference a;
    public fca b;
    public final k40 c;
    public final int d;
    public final int e;

    public hba(FrameLayout frameLayout) {
        WeakReference weakReference = new WeakReference(frameLayout);
        this.a = weakReference;
        this.b = fca.Z;
        if (frameLayout != null) {
            this.c = new k40(weakReference);
        }
    }

    public final void a(mge mge) {
        ViewGroup viewGroup;
        Context context;
        fca fca = this.b;
        CharSequence charSequence = null;
        if (!(mge == null || (viewGroup = (ViewGroup) this.a.get()) == null || (context = viewGroup.getContext()) == null)) {
            charSequence = mge.a(context);
        }
        this.b = fca.a(fca, (zba) null, (CharSequence) null, charSequence, (eca) null, (pba) null, (tba) null, 59);
    }

    public final void b(CharSequence charSequence) {
        this.b = fca.a(this.b, (zba) null, (CharSequence) null, charSequence, (eca) null, (pba) null, (tba) null, 59);
    }

    public final void c(pba pba) {
        this.b = fca.a(this.b, (zba) null, (CharSequence) null, (CharSequence) null, (eca) null, pba, (tba) null, 47);
    }

    public final void d(iba iba) {
        k40 k40 = this.c;
        if (k40 != null) {
            k40.Y = iba;
        }
    }

    public final void e(int i) {
        fca fca = this.b;
        this.b = fca.a(fca, (zba) null, (CharSequence) null, (CharSequence) null, (eca) null, pba.a(fca.X, i, 0, 0, 6), (tba) null, 47);
    }

    public final void f(zba zba) {
        fca fca = this.b;
        this.b = fca.a(fca, zba, (CharSequence) null, (CharSequence) null, (eca) null, (pba) null, zba instanceof yba ? sba.b : fca.Y, 30);
    }

    public final void g(eca eca) {
        this.b = fca.a(this.b, (zba) null, (CharSequence) null, (CharSequence) null, eca, (pba) null, (tba) null, 55);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.mge r9) {
        /*
            r8 = this;
            fca r0 = r8.b
            java.lang.ref.WeakReference r1 = r8.a
            java.lang.Object r1 = r1.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0017
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0017
            java.lang.CharSequence r9 = r9.a(r1)
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            if (r9 != 0) goto L_0x001c
            java.lang.String r9 = ""
        L_0x001c:
            r2 = r9
            r5 = 0
            r6 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 61
            fca r9 = defpackage.fca.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hba.h(mge):void");
    }

    public final void i(CharSequence charSequence) {
        this.b = fca.a(this.b, (zba) null, charSequence, (CharSequence) null, (eca) null, (pba) null, (tba) null, 61);
    }

    public final gba j() {
        k40 k40;
        tba tba = null;
        if (this.a.get() == null || (k40 = this.c) == null) {
            return null;
        }
        fca fca = this.b;
        pba pba = fca.X;
        fca a2 = fca.a(fca, (zba) null, (CharSequence) null, (CharSequence) null, (eca) null, pba.a(pba, 0, pba.b + this.e, pba.c + this.d, 1), (tba) null, 47);
        k40.o = a2;
        AtomicBoolean atomicBoolean = nba.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            mba mba = nba.b;
            kba kba = (kba) k40.w0;
            if (mba != null ? hhd.f(mba.b.get(), kba) : false) {
                mba mba2 = nba.b;
                if (mba2 != null) {
                    tba = mba2.a;
                }
                if (hhd.f(tba, qba.b)) {
                    atomicBoolean.set(false);
                }
            }
            mba mba3 = nba.b;
            if (mba3 != null ? hhd.f(mba3.b.get(), kba) : false) {
                nba.a.removeCallbacksAndMessages(nba.b);
                nba.c(nba.b);
            } else {
                nba.c = new mba(kba, a2.Y);
                if (nba.b == null) {
                    nba.d();
                }
            }
            atomicBoolean.set(false);
        }
        return new gba(k40);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hba(one.me.sdk.arch.Widget r9) {
        /*
            r8 = this;
            r0 = r9
        L_0x0001:
            rr3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x000c
            rr3 r0 = r0.getParentController()
            goto L_0x0001
        L_0x000c:
            android.view.View r0 = r0.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0020
            android.view.View r0 = (android.view.View) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0028
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            r8.<init>((android.widget.FrameLayout) r0)
            android.view.View r0 = r9.getView()
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = defpackage.ek8.x(r0)
            if (r0 == 0) goto L_0x003e
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            sy6 r3 = r9.getInsetsConfig()
            int r3 = r3.a
            if (r3 != 0) goto L_0x0048
            r3 = r2
        L_0x0048:
            r4 = -1
            if (r3 != 0) goto L_0x004d
            r3 = r4
            goto L_0x0055
        L_0x004d:
            int[] r5 = defpackage.fba.$EnumSwitchMapping$0
            int r3 = hr1.t(r3)
            r3 = r5[r3]
        L_0x0055:
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x0074
            if (r3 == r5) goto L_0x005d
        L_0x005b:
            r3 = r2
            goto L_0x007e
        L_0x005d:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x005b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x006e
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x006f
        L_0x006e:
            r3 = r1
        L_0x006f:
            if (r3 == 0) goto L_0x005b
            int r3 = r3.topMargin
            goto L_0x007e
        L_0x0074:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x005b
            int r3 = r3.getPaddingTop()
        L_0x007e:
            r8.e = r3
            sy6 r3 = r9.getInsetsConfig()
            up0 r3 = r3.b
            if (r3 == 0) goto L_0x008b
            int r3 = r3.a
            goto L_0x008c
        L_0x008b:
            r3 = r2
        L_0x008c:
            if (r3 != 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            int[] r4 = defpackage.fba.$EnumSwitchMapping$0
            int r3 = hr1.t(r3)
            r4 = r4[r3]
        L_0x0097:
            if (r4 == r6) goto L_0x00b3
            if (r4 == r5) goto L_0x009c
            goto L_0x00bd
        L_0x009c:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00bd
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00ad
            r1 = r9
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00ad:
            if (r1 == 0) goto L_0x00b1
            int r2 = r1.bottomMargin
        L_0x00b1:
            r0 = r2
            goto L_0x00bd
        L_0x00b3:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00bd
            int r0 = r9.getPaddingBottom()
        L_0x00bd:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hba.<init>(one.me.sdk.arch.Widget):void");
    }
}
