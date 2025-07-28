package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Lt6e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor_release"}, k = 1, mv = {2, 0, 0})
public abstract class SwipeWidget extends Widget implements t6e {
    public static final /* synthetic */ int c = 0;
    public final String a = "SwipeWidget";
    public boolean b;

    public SwipeWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
    }

    public static void q0(rr3 rr3) {
        for (sgc e : rr3.getChildRouters()) {
            Iterator it = e.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    vgc vgc = (vgc) it.next();
                    rr3 rr32 = vgc.a;
                    Method method = (Method) zr3.d.T0((Object) null, zr3.a[2]);
                    if (method != null) {
                        method.invoke(rr32, new Object[]{Boolean.TRUE});
                        q0(vgc.a);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
        }
    }

    public boolean handleBack() {
        return this.b || SwipeWidget.super.handleBack();
    }

    public final rr3 l0() {
        vgc vgc = (vgc) o23.Y(p23.A(getRouter().e()) - 1, getRouter().e());
        rr3 rr3 = vgc != null ? vgc.a : null;
        if (rr3 == null) {
            String str = this.a;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.Z, str, "No underlying controller! Swiping won't work properly", (Throwable) null);
            }
        }
        return rr3;
    }

    public boolean m0() {
        return !(this instanceof ChatMediaViewerScreen);
    }

    public void n0() {
    }

    public void o0() {
    }

    public final void onChangeEnded(wr3 wr3, xr3 xr3) {
        SwipeWidget.super.onChangeEnded(wr3, xr3);
        d7e d7e = null;
        if (!R()) {
            String str = this.a;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "onChangeEnded: swipe is disabled", (Throwable) null);
                return;
            }
            return;
        }
        View view = getView();
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                rr3 l0 = l0();
                k61 k61 = l0 == null ? null : new k61(l0, this, viewGroup, 13);
                if (k61 != null && xr3.b) {
                    String str2 = this.a;
                    fn6 fn62 = udd.e;
                    if (fn62 != null && fn62.c()) {
                        fn62.d(tn7.X, str2, "onChangeEnded: setup swipe callbacks on new view", (Throwable) null);
                    }
                    boolean z = view instanceof d7e;
                    if (z) {
                        y6e y6e = new y6e(s0(), new q6e(2, this), view, viewGroup, k61, m0() ? 2 : 1);
                        y6e.q = this;
                        y6e.r = r0();
                        if (z) {
                            d7e = (d7e) view;
                        }
                        if (d7e != null) {
                            d7e.setOnTouch(new h87(1, y6e, y6e.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", 0, 16));
                            d7e.setOnRequestInterceptTouchEvent(new e78(0, y6e, y6e.class, "resetDraggingState", "resetDraggingState()V", 0, 14));
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("'To' view must realize SwipeTouchHandler for work".toString());
                }
            }
        }
    }

    public void onChangeStarted(wr3 wr3, xr3 xr3) {
        super.onChangeStarted(wr3, xr3);
        if (!xr3.b) {
            View view = getView();
            d7e d7e = view instanceof d7e ? (d7e) view : null;
            if (d7e != null) {
                d7e.setOnTouch((u16) null);
                d7e.setOnRequestInterceptTouchEvent((s16) null);
            }
        }
    }

    public void p0() {
    }

    public Long r0() {
        return null;
    }

    public Integer s0() {
        return null;
    }
}
