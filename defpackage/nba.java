package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nba  reason: default package */
public abstract class nba {
    public static final Handler a = new Handler(Looper.getMainLooper(), new Object());
    public static mba b;
    public static mba c;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(mba mba, jba jba) {
        WeakReference weakReference;
        kba kba;
        if (mba != null && (weakReference = mba.b) != null && (kba = (kba) weakReference.get()) != null) {
            a.removeCallbacksAndMessages(kba);
            kba.a.d(jba);
        }
    }

    public static void b(kba kba, jba jba) {
        AtomicBoolean atomicBoolean = d;
        boolean z = false;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            mba mba = b;
            if (mba != null ? hhd.f(mba.b.get(), kba) : false) {
                a(b, jba);
                return;
            }
            mba mba2 = c;
            if (mba2 != null) {
                z = hhd.f(mba2.b.get(), kba);
            }
            if (z) {
                a(c, jba);
            }
        }
    }

    public static void c(mba mba) {
        tba tba;
        if (!hhd.f(mba != null ? mba.a : null, qba.b)) {
            Handler handler = a;
            handler.removeCallbacksAndMessages(mba);
            if (mba == null || (tba = mba.a) == null) {
                tba = rba.b;
            }
            handler.sendMessageDelayed(Message.obtain(handler, 0, mba), tba.a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: hca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r7v2, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d() {
        /*
            r0 = 20
            r1 = 1
            mba r2 = c
            if (r2 == 0) goto L_0x0188
            b = r2
            r3 = 0
            c = r3
            java.lang.ref.WeakReference r2 = r2.b
            if (r2 == 0) goto L_0x0186
            java.lang.Object r2 = r2.get()
            kba r2 = (defpackage.kba) r2
            if (r2 == 0) goto L_0x0186
            k40 r2 = r2.a
            java.lang.Object r4 = r2.X
            b7e r4 = (defpackage.b7e) r4
            r5 = 0
            if (r4 == 0) goto L_0x0026
            r4.d()
            goto L_0x0164
        L_0x0026:
            java.lang.Object r6 = r2.c
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            if (r4 != 0) goto L_0x0147
            java.lang.Object r4 = r6.get()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0039
            android.content.Context r4 = r4.getContext()
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 != 0) goto L_0x003e
            goto L_0x0146
        L_0x003e:
            java.lang.Object r7 = r2.o
            fca r7 = (defpackage.fca) r7
            java.lang.Object r8 = r6.get()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L_0x004f
            android.content.Context r8 = r8.getContext()
            goto L_0x0050
        L_0x004f:
            r8 = r3
        L_0x0050:
            if (r8 != 0) goto L_0x0054
            r9 = r3
            goto L_0x007d
        L_0x0054:
            hca r9 = new hca
            r9.<init>(r8, r3)
            java.lang.CharSequence r8 = r7.b
            r9.setTitle((java.lang.CharSequence) r8)
            java.lang.CharSequence r8 = r7.c
            r9.setCaption((java.lang.CharSequence) r8)
            zba r8 = r7.a
            r9.setLeftElement(r8)
            eca r7 = r7.o
            r9.setRightElement(r7)
            boolean r7 = r7 instanceof defpackage.cca
            if (r7 == 0) goto L_0x0075
            r9.setRightBtnAction$snackbar_release(r3)
            goto L_0x007d
        L_0x0075:
            eu5 r7 = new eu5
            r7.<init>(r0, r2)
            r9.setRightBtnAction$snackbar_release(r7)
        L_0x007d:
            if (r9 != 0) goto L_0x0081
            goto L_0x0146
        L_0x0081:
            b7e r3 = new b7e
            r3.<init>(r4)
            l7c r7 = new l7c
            r7.<init>()
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r11 = -2
            r8.<init>(r10, r11)
            java.lang.Object r10 = r2.o
            fca r10 = (defpackage.fca) r10
            pba r10 = r10.X
            int r11 = r10.a
            r12 = r11 & 1
            if (r12 == 0) goto L_0x00a1
            r12 = 48
            goto L_0x00a3
        L_0x00a1:
            r12 = 80
        L_0x00a3:
            r8.gravity = r12
            r11 = r11 & r1
            if (r11 == 0) goto L_0x00ad
            int r10 = r10.b
            r8.topMargin = r10
            goto L_0x00b1
        L_0x00ad:
            int r10 = r10.c
            r8.bottomMargin = r10
        L_0x00b1:
            r3.setLayoutParams(r8)
            boolean r8 = r3.isAttachedToWindow()
            if (r8 == 0) goto L_0x00be
            r3.requestApplyInsets()
            goto L_0x00c7
        L_0x00be:
            q40 r8 = new q40
            r10 = 6
            r8.<init>(r3, r10, r3)
            r3.addOnAttachStateChangeListener(r8)
        L_0x00c7:
            int r8 = defpackage.e87.a
            int r8 = defpackage.e87.c
            boolean r8 = defpackage.e87.b(r8)
            r2.b = r8
            w48 r8 = new w48
            r10 = 15
            r8.<init>(r2, r10, r4)
            java.util.WeakHashMap r4 = eaf.a
            t9f.u(r3, r8)
            r3.addView(r9)
            r4 = 12
            float r4 = (float) r4
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r4
            int r8 = a24.X(r8)
            float r10 = (float) r5
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            int r10 = a24.X(r10)
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r4
            int r11 = a24.X(r11)
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r4 = r4 * r12
            int r4 = a24.X(r4)
            r3.setPadding(r8, r10, r11, r4)
            r3.setClipToPadding(r5)
            r3.setClipChildren(r5)
            r3.setClipToOutline(r5)
            r4 = 1092616192(0x41200000, float:10.0)
            r3.setElevation(r4)
            j8e r4 = new j8e
            r4.<init>(r2, r7, r9, r3)
            r3.setCallback(r4)
            vp6 r4 = new vp6
            r4.<init>(r0, r3, r3)
            afa r0 = afa.a(r3, r4)
            r7.a = r0
            r2.X = r3
        L_0x0146:
            r4 = r3
        L_0x0147:
            if (r4 != 0) goto L_0x014a
            goto L_0x0164
        L_0x014a:
            java.lang.Object r0 = r6.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0155
            r0.addView(r4)
        L_0x0155:
            java.lang.Object r0 = r6.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0164
            java.lang.Object r3 = r2.Z
            ck r3 = (defpackage.ck) r3
            r0.addOnAttachStateChangeListener(r3)
        L_0x0164:
            java.util.concurrent.atomic.AtomicBoolean r0 = d
            boolean r0 = r0.compareAndSet(r1, r5)
            if (r0 == 0) goto L_0x0188
            mba r0 = b
            if (r0 == 0) goto L_0x017e
            java.lang.ref.WeakReference r0 = r0.b
            java.lang.Object r0 = r0.get()
            java.lang.Object r1 = r2.w0
            kba r1 = (defpackage.kba) r1
            boolean r5 = hhd.f(r0, r1)
        L_0x017e:
            if (r5 == 0) goto L_0x0188
            mba r0 = b
            c(r0)
            goto L_0x0188
        L_0x0186:
            b = r3
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nba.d():void");
    }
}
