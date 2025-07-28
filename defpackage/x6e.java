package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* renamed from: x6e  reason: default package */
public final class x6e implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6e b;

    public /* synthetic */ x6e(y6e y6e, float f, int i) {
        this.a = i;
        this.b = y6e;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        rr3 l0;
        switch (this.a) {
            case 0:
                y6e y6e = this.b;
                boolean b2 = y6e.b();
                ViewGroup viewGroup = y6e.c;
                if (b2) {
                    pa2.C(viewGroup, y6e.a(), (View) null, (View) null, 1.0f);
                } else {
                    pa2.E(viewGroup, y6e.a(), (View) null, (View) null, 1.0f);
                }
                y6e y6e2 = this.b;
                y6e2.m = null;
                ViewGroup viewGroup2 = y6e2.c;
                viewGroup2.removeView(viewGroup2.findViewById(ypb.swipe_fade));
                t6e t6e = this.b.q;
                if (t6e != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) t6e;
                    swipeWidget.b = false;
                    vgc vgc = (vgc) o23.f0(swipeWidget.getRouter().e());
                    if (!(vgc == null || (l0 = swipeWidget.l0()) == null)) {
                        SwipeWidget.q0(l0);
                        View view = l0.getView();
                        if (view != null) {
                            wr3 b3 = vgc.b();
                            if (b3 == null || b3.d()) {
                                if (view.getParent() != null) {
                                    String str = swipeWidget.a;
                                    fn6 fn6 = udd.e;
                                    if (fn6 != null && fn6.c()) {
                                        fn6.d(tn7.X, str, "clearUnderlyingViewsOnCancel: detaching underlying view", (Throwable) null);
                                    }
                                    ((ViewGroup) view.getParent()).removeView(view);
                                }
                                if (l0.getRetainViewMode() != qr3.b) {
                                    String str2 = swipeWidget.a;
                                    fn6 fn62 = udd.e;
                                    if (fn62 != null && fn62.c()) {
                                        fn62.d(tn7.X, str2, "clearUnderlyingViewsOnCancel: destroying underlying view", (Throwable) null);
                                    }
                                    Context context = swipeWidget.getContext();
                                    Method method = (Method) zr3.c.T0((Object) null, zr3.a[1]);
                                    if (method != null) {
                                        method.invoke(l0, new Object[]{context});
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str3 = swipeWidget.a;
                                fn6 fn63 = udd.e;
                                if (fn63 != null && fn63.c()) {
                                    fn63.d(tn7.X, str3, "clearUnderlyingViewsOnCancel: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", (Throwable) null);
                                }
                            }
                        }
                    }
                    swipeWidget.n0();
                    return;
                }
                return;
            default:
                y6e y6e3 = this.b;
                View view2 = y6e3.b;
                d7e d7e = view2 instanceof d7e ? (d7e) view2 : null;
                if (d7e != null) {
                    d7e.setOnTouch((u16) null);
                    d7e.setOnRequestInterceptTouchEvent((s16) null);
                }
                ViewGroup viewGroup3 = y6e3.c;
                viewGroup3.removeView(y6e3.b);
                viewGroup3.removeView(viewGroup3.findViewById(ypb.swipe_fade));
                t6e t6e2 = y6e3.q;
                if (t6e2 != null) {
                    SwipeWidget swipeWidget2 = (SwipeWidget) t6e2;
                    swipeWidget2.b = false;
                    swipeWidget2.getRouter().C();
                }
                y6e3.q = null;
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
