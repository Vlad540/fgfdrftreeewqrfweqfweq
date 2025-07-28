package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.arch.Widget;

/* renamed from: ck  reason: default package */
public final class ck implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ck(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    /* JADX WARNING: type inference failed for: r7v23, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r7v29, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            int r2 = r6.a
            switch(r2) {
                case 0: goto L_0x0114;
                case 1: goto L_0x0113;
                case 2: goto L_0x009f;
                case 3: goto L_0x0095;
                case 4: goto L_0x006d;
                case 5: goto L_0x004e;
                case 6: goto L_0x004d;
                case 7: goto L_0x0017;
                case 8: goto L_0x0016;
                case 9: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.util.WeakHashMap r0 = eaf.a
            r9f.c(r7)
            kc9 r7 = defpackage.ty6.a
            java.lang.Object r6 = r6.b
            rrd r6 = (defpackage.rrd) r6
            r7.a(r6)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r6 = r6.b
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            android.graphics.drawable.Drawable r7 = r6.getDrawable()
            boolean r2 = r7 instanceof android.graphics.drawable.Animatable
            if (r2 == 0) goto L_0x0026
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            goto L_0x0027
        L_0x0026:
            r7 = r1
        L_0x0027:
            if (r7 == 0) goto L_0x002c
            r7.start()
        L_0x002c:
            android.graphics.drawable.Drawable r7 = r6.getDrawable()
            boolean r2 = r7 instanceof defpackage.zj
            if (r2 == 0) goto L_0x0037
            r1 = r7
            zj r1 = (defpackage.zj) r1
        L_0x0037:
            if (r1 == 0) goto L_0x004d
            android.graphics.drawable.Drawable r7 = r1.b()
            one.me.rlottie.RLottieDrawable r2 = r1.B0
            if (r7 != r2) goto L_0x004d
            if (r2 == 0) goto L_0x0046
            r2.setMasterParent(r6)
        L_0x0046:
            one.me.rlottie.RLottieDrawable r6 = r1.B0
            if (r6 == 0) goto L_0x004d
            r6.setAllowDecodeSingleFrame(r0)
        L_0x004d:
            return
        L_0x004e:
            java.lang.Object r6 = r6.b
            gy4 r6 = (gy4) r6
            r34 r7 = r6.M0
            if (r7 == 0) goto L_0x006c
            android.view.accessibility.AccessibilityManager r7 = r6.L0
            if (r7 == 0) goto L_0x006c
            java.util.WeakHashMap r0 = eaf.a
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x006c
            r34 r6 = r6.M0
            c4 r0 = new c4
            r0.<init>(r6)
            r7.addTouchExplorationStateChangeListener(r0)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r6 = r6.b
            ht4 r6 = (ht4) r6
            android.view.View r7 = r6.a
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.drawable.Drawable r7 = r7.getDrawable()
            boolean r0 = r7 instanceof defpackage.zj
            if (r0 == 0) goto L_0x0080
            r1 = r7
            zj r1 = (defpackage.zj) r1
        L_0x0080:
            if (r1 == 0) goto L_0x0094
            android.graphics.drawable.Drawable r7 = r1.b()
            one.me.rlottie.RLottieDrawable r0 = r1.B0
            if (r7 != r0) goto L_0x0091
            if (r0 == 0) goto L_0x0091
            gi r6 = r6.K0
            r0.addParentView(r6)
        L_0x0091:
            r1.start()
        L_0x0094:
            return
        L_0x0095:
            java.lang.Object r6 = r6.b
            v13 r6 = (defpackage.v13) r6
            xp0 r6 = r6.e
            r6.r()
            return
        L_0x009f:
            java.lang.Object r7 = r6.b
            one.me.chats.tab.ChatsTabWidget r7 = (one.me.chats.tab.ChatsTabWidget) r7
            java.lang.String r0 = r7.b
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x00aa
            goto L_0x00c3
        L_0x00aa:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00c3
            tn7 r3 = defpackage.tn7.X
            yb7 r7 = r7.getLifecycleScope()
            boolean r7 = n1g.A(r7)
            java.lang.String r4 = "ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: "
            java.lang.String r7 = defpackage.us8.k(r4, r7)
            r2.d(r3, r0, r7, r1)
        L_0x00c3:
            java.lang.Object r7 = r6.b
            one.me.chats.tab.ChatsTabWidget r7 = (one.me.chats.tab.ChatsTabWidget) r7
            qt5 r0 = r7.o0()
            t0c r0 = r0.A0
            kw2 r2 = new kw2
            java.lang.Object r3 = r6.b
            one.me.chats.tab.ChatsTabWidget r3 = (one.me.chats.tab.ChatsTabWidget) r3
            r2.<init>(r1, r3)
            ck5 r1 = new ck5
            r3 = 5
            r1.<init>(r0, r2, r3)
            java.lang.Object r0 = r6.b
            one.me.chats.tab.ChatsTabWidget r0 = (one.me.chats.tab.ChatsTabWidget) r0
            yb7 r0 = r0.getViewLifecycleScope()
            qod r0 = ez3.N(r1, r0)
            r7.E0 = r0
            java.lang.Object r6 = r6.b
            one.me.chats.tab.ChatsTabWidget r6 = (one.me.chats.tab.ChatsTabWidget) r6
            qt5 r7 = r6.o0()
            t0c r7 = r7.z0
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r1 = r7.intValue()
            androidx.viewpager2.widget.ViewPager2 r7 = r6.m0()
            r0 = 0
            r7.e(r1, r0)
            hda r0 = r6.l0()
            r2 = 0
            r5 = 1
            r3 = 1
            r4 = 1
            r0.q(r1, r2, r3, r4, r5)
        L_0x0113:
            return
        L_0x0114:
            java.lang.Object r6 = r6.b
            dk r6 = (defpackage.dk) r6
            java.lang.Object r7 = r6.Z
            hj r7 = (defpackage.hj) r7
            if (r7 != 0) goto L_0x0130
            boolean r7 = r6.c
            if (r7 == 0) goto L_0x0130
            hj r7 = new hj
            java.lang.Object r1 = r6.o
            android.view.View r1 = (android.view.View) r1
            r7.<init>(r1)
            r6.Z = r7
            r7.a()
        L_0x0130:
            java.lang.Object r7 = r6.Z
            hj r7 = (defpackage.hj) r7
            if (r7 == 0) goto L_0x0143
            boolean r7 = r7.c
            if (r7 != r0) goto L_0x0143
            java.lang.Object r6 = r6.Z
            hj r6 = (defpackage.hj) r6
            if (r6 == 0) goto L_0x0143
            r6.a()
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.onViewAttachedToWindow(android.view.View):void");
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        RLottieDrawable rLottieDrawable;
        switch (this.a) {
            case 0:
                dk dkVar = (dk) this.b;
                hj hjVar = (hj) dkVar.Z;
                if (hjVar != null) {
                    hjVar.c = true;
                    hj.o.removeCallbacks(hjVar);
                }
                dkVar.Z = null;
                return;
            case 1:
                dx1 dx1 = (dx1) this.b;
                ViewTreeObserver viewTreeObserver = dx1.N0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        dx1.N0 = view.getViewTreeObserver();
                    }
                    dx1.N0.removeGlobalOnLayoutListener(dx1.y0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str, us8.k("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", n1g.A(chatsTabWidget.getLifecycleScope())), (Throwable) null);
                }
                g37 g37 = ((ChatsTabWidget) this.b).E0;
                if (g37 != null) {
                    g37.cancel((CancellationException) null);
                }
                ((ChatsTabWidget) this.b).E0 = null;
                return;
            case 3:
                ((v13) this.b).e.t();
                return;
            case 4:
                ((ht4) this.b).F(false);
                return;
            case 5:
                gy4 gy4 = (gy4) this.b;
                r34 r34 = gy4.M0;
                if (r34 != null && (accessibilityManager = gy4.L0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new c4(r34));
                    return;
                }
                return;
            case 6:
                Handler handler = nba.a;
                nba.b((kba) ((k40) this.b).w0, jba.o);
                return;
            case 7:
                ImageView imageView = (ImageView) this.b;
                Drawable drawable = imageView.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.stop();
                }
                Drawable drawable2 = imageView.getDrawable();
                zj zjVar = drawable2 instanceof zj ? (zj) drawable2 : null;
                if (zjVar != null && zjVar.b() == (rLottieDrawable = zjVar.B0)) {
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setMasterParent((View) null);
                    }
                    RLottieDrawable rLottieDrawable2 = zjVar.B0;
                    if (rLottieDrawable2 != null) {
                        rLottieDrawable2.setAllowDecodeSingleFrame(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                tod tod = (tod) this.b;
                ViewTreeObserver viewTreeObserver2 = tod.E0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        tod.E0 = view.getViewTreeObserver();
                    }
                    tod.E0.removeGlobalOnLayoutListener(tod.y0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ty6.a.f((rrd) this.b);
                return;
            default:
                Widget widget = (Widget) this.b;
                udd.q(xie.w(widget), "lifecycle: preAttach invoke onViewDetachedFromWindow");
                view.removeOnAttachStateChangeListener(this);
                widget.finalizeCleanActions(widget);
                return;
        }
    }
}
