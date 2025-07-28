package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: mz9  reason: default package */
public final class mz9 extends View implements mhe {
    public static final /* synthetic */ int O0 = 0;
    public final t97 A0;
    public final t97 B0;
    public boolean C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public s16 G0;
    public s16 H0;
    public boolean I0;
    public tb0 J0;
    public rc0 K0;
    public final qcc L0;
    public final o5 M0;
    public List N0;
    public final String a = mz9.class.getName();
    public final mn4 b;
    public gz9 c;
    public int o;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public final t97 z0;

    public mz9(Context context) {
        super(context, (AttributeSet) null);
        mn4 mn4 = new mn4(new z66(getResources()).a());
        lfc e = mn4.e();
        if (e != null) {
            e.setCallback(this);
        }
        y66 y66 = mn4.o;
        y66.getClass();
        r75 r75 = y66.e;
        r75.A0 = 50;
        if (r75.z0 == 1) {
            r75.z0 = 0;
        }
        this.b = mn4;
        this.c = dz9.a;
        this.o = 1;
        this.z0 = ez3.O(3, new cc3(context, 19));
        this.A0 = ez3.O(3, new cc3(context, 20));
        this.B0 = ez3.O(3, new cc3(context, 21));
        this.D0 = ez3.O(3, new cz9(this, 0));
        this.E0 = ez3.O(3, new cz9(this, 1));
        this.F0 = ez3.O(3, new cz9(this, 2));
        this.L0 = new qcc();
        this.M0 = new o5(2, this);
        mn4.i(f());
    }

    public static LayerDrawable a(mz9 mz9) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{mz9.getCallBadgeBackgroundDrawable(), mz9.getCallIconDrawable()});
        int X = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        layerDrawable.setLayerSize(0, X, X);
        layerDrawable.setLayerSize(1, X2, X2);
        layerDrawable.setLayerInset(1, X3, X3, X3, X3);
        return layerDrawable;
    }

    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.z0.getValue();
    }

    private final GradientDrawable getCallBadgeBackgroundDrawable() {
        return (GradientDrawable) this.D0.getValue();
    }

    private final LayerDrawable getCallBadgeDrawable() {
        return (LayerDrawable) this.F0.getValue();
    }

    private final Drawable getCallIconDrawable() {
        return (Drawable) this.E0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.B0.getValue();
    }

    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.A0.getValue();
    }

    public static void h(mz9 mz9, Drawable drawable, gz9 gz9, int i) {
        if ((i & 2) != 0) {
            gz9 = mz9.c;
        }
        gz9 gz92 = gz9;
        pda r = km4.y0.r(mz9);
        rc0 rc0 = null;
        u16 p8Var = (i & 8) != 0 ? new p8(2, r) : null;
        u16 p8Var2 = (i & 16) != 0 ? new p8(3, r) : null;
        mz9.setAvatarShape(gz92);
        if (drawable != null) {
            rc0 = new rc0(drawable, gz92, r, p8Var, p8Var2);
        }
        mz9.setCustomPlaceholder(rc0);
        mz9.invalidate();
    }

    public final xwa f() {
        ywa a2 = a06.a.a();
        a2.g = this.L0;
        a2.h = this.M0;
        a2.l = this.b.X;
        a2.k = true;
        return a2.a();
    }

    public final void g(ub0 ub0, boolean z) {
        mn4 mn4 = this.b;
        if (ub0 != null && (ub0.a != 0 || ub0.b.length() != 0)) {
            tb0 tb0 = new tb0(this.c, ub0, km4.y0.n(getContext()).g());
            tb0.x0.o1(tb0, tb0.y0[0], Boolean.valueOf(z));
            this.J0 = tb0;
            y66 y66 = mn4.o;
            y66.getClass();
            y66.i(tb0, 1);
            y66 y662 = mn4.o;
            y662.getClass();
            y662.i(tb0, 5);
            this.o = 3;
        } else if (this.o == 3) {
            y66 y663 = mn4.o;
            y663.getClass();
            y663.i((Drawable) null, 1);
            this.J0 = null;
            this.o = 1;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new iz9(this, drawable, 0));
        } else {
            post(new jz9(this, drawable, 0));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.g();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.h();
    }

    public final void onDraw(Canvas canvas) {
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        lfc e = this.b.e();
        if (e != null) {
            e.setBounds(0, 0, min, min);
        }
        if (e != null) {
            e.draw(canvas);
        }
        if (this.w0) {
            int X = min >= a24.X(((float) 72) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 24) * dh4.c().getDisplayMetrics().density) : min >= a24.X(((float) 54) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 20) * dh4.c().getDisplayMetrics().density) : min >= a24.X(((float) 40) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            getCloseBadgeDrawable().setBounds(min - X, 0, min, X);
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.x0) {
            int X2 = min - (min >= a24.X(((float) 72) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 24) * dh4.c().getDisplayMetrics().density) : min >= a24.X(((float) 54) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 20) * dh4.c().getDisplayMetrics().density) : min >= a24.X(((float) 40) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
            float f = (float) 3;
            getOnlineBadgeDrawable().setBounds(me4.c(f, dh4.c().getDisplayMetrics().density, X2), me4.c(f, dh4.c().getDisplayMetrics().density, X2), me4.c(f, dh4.c().getDisplayMetrics().density, min), me4.c(f, dh4.c().getDisplayMetrics().density, min));
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.y0) {
            float f2 = (float) 28;
            getAddBadgeDrawable().setBounds(me4.p(f2, dh4.c().getDisplayMetrics().density, min), me4.p(f2, dh4.c().getDisplayMetrics().density, min), min, min);
            getAddBadgeDrawable().draw(canvas);
        }
        if (this.C0) {
            float f3 = (float) 24;
            getCallBadgeDrawable().setBounds(me4.p(f3, dh4.c().getDisplayMetrics().density, min), me4.p(f3, dh4.c().getDisplayMetrics().density, min), min, min);
            getCallBadgeDrawable().draw(canvas);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.g();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.h();
    }

    public final void onThemeChanged(pda pda) {
        tb0 tb0;
        EnhancedVectorDrawable addBadgeDrawable = getAddBadgeDrawable();
        xs7.P(addBadgeDrawable, "background", pda.b().a.f);
        xs7.P(addBadgeDrawable, "plus", pda.getIcon().b);
        EnhancedVectorDrawable onlineBadgeDrawable = getOnlineBadgeDrawable();
        xs7.P(onlineBadgeDrawable, "online", pda.getIcon().e);
        nd0 b2 = pda.b();
        VectorPath findPath = onlineBadgeDrawable.findPath("online");
        if (findPath != null) {
            findPath.setStrokeColor(b2.i);
            onlineBadgeDrawable.invalidatePath();
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        xs7.P(closeBadgeDrawable, "cross", -1);
        xs7.P(closeBadgeDrawable, "circle_background", pda.getIcon().i);
        getCallIconDrawable().setTint(-1);
        GradientDrawable callBadgeBackgroundDrawable = getCallBadgeBackgroundDrawable();
        int X = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        s59 s59 = km4.y0;
        callBadgeBackgroundDrawable.setStroke(X, s59.r(this).b().i);
        s59.r(this);
        callBadgeBackgroundDrawable.setColor(-16745729);
        int t = hr1.t(this.o);
        if (t == 1) {
            rc0 rc0 = this.K0;
            if (rc0 != null) {
                rc0.onThemeChanged(pda);
            }
        } else if (t == 2 && (tb0 = this.J0) != null) {
            tb0.onThemeChanged(pda);
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s16 s16;
        if (!this.w0 || this.H0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.I0 && getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (s16 = this.H0) != null) {
                s16.invoke();
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean contains = getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.I0 = contains;
        if (contains) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new kz9(this, drawable, runnable, j, 0));
            return;
        }
        post(new kz9(this, drawable, runnable, j, 1));
    }

    public final void setAddBadgeVisibility(boolean z) {
        this.y0 = z;
        if (z) {
            this.x0 = false;
        }
        invalidate();
    }

    public final void setAvatarShape(gz9 gz9) {
        if (!hhd.f(this.c, gz9)) {
            this.c = gz9;
            invalidate();
        }
    }

    public final void setAvatarUrl(String str) {
        tr6 tr6;
        List list = this.N0;
        if (list != null && list.size() == 1) {
            List list2 = this.N0;
            if (hhd.f(list2 != null ? (String) o23.V(list2) : null, str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.N0 = null;
            tr6 = null;
        } else {
            this.N0 = Collections.singletonList(str);
            vb0 vb0 = bz9.a;
            tr6 = bz9.b(str, this.c, 4);
        }
        mn4 mn4 = this.b;
        if (tr6 != null) {
            fr6 u = a06.u();
            u.getClass();
            this.L0.a(new er6(u, tr6, str));
            if (mn4.X == null) {
                mn4.i(f());
                return;
            }
            return;
        }
        mn4.i((gn4) null);
    }

    public final void setAvatarUrls(List<String> list) {
        if (list == null || list.isEmpty() || !hhd.f(this.N0, list)) {
            mn4 mn4 = this.b;
            if (list == null || list.isEmpty()) {
                mn4.i((gn4) null);
                this.N0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (String str : list) {
                vb0 vb0 = bz9.a;
                tr6 b2 = bz9.b(str, this.c, 4);
                fr6 u = a06.u();
                u.getClass();
                arrayList.add(new er6(u, b2, str));
            }
            nv6 nv6 = new nv6(arrayList, true);
            this.N0 = list;
            this.L0.a(nv6);
            if (mn4.X == null) {
                mn4.i(f());
            }
        }
    }

    public final void setCallBadgeVisibility(boolean z) {
        this.C0 = z;
        if (z) {
            this.x0 = false;
            this.y0 = false;
        }
        invalidate();
    }

    public final void setCloseBadgeClickListener(s16 s16) {
        this.H0 = s16;
    }

    public final void setCloseBadgeVisibility(boolean z) {
        this.w0 = z;
        invalidate();
    }

    public final void setCustomOverlay(oc0 oc0) {
        mn4 mn4 = this.b;
        if (oc0 == null) {
            y66 y66 = mn4.o;
            y66.getClass();
            y66.k((Drawable) null);
            return;
        }
        y66 y662 = mn4.o;
        y662.getClass();
        y662.k(oc0);
    }

    public final void setCustomPlaceholder(rc0 rc0) {
        mn4 mn4 = this.b;
        if (rc0 != null) {
            this.K0 = rc0;
            y66 y66 = mn4.o;
            y66.getClass();
            y66.i(rc0, 1);
            this.o = 2;
        } else if (this.o == 2) {
            y66 y662 = mn4.o;
            y662.getClass();
            y662.i((Drawable) null, 1);
            this.K0 = null;
            this.o = 1;
        }
    }

    public final void setOnImageLoadedListener(s16 s16) {
        this.G0 = s16;
    }

    public final void setOnlineBadgeVisibility(boolean z) {
        this.x0 = z;
        if (z) {
            this.y0 = false;
        }
        invalidate();
    }

    public final void setOverlay(Drawable drawable) {
        oc0 oc0;
        if (drawable != null) {
            gz9 gz9 = this.c;
            Context context = getContext();
            oc0 = new oc0(drawable, gz9, context, new nc0(context, 0), new nc0(context, 1));
        } else {
            oc0 = null;
        }
        setCustomOverlay(oc0);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new lz9(this, drawable, runnable, 0));
        } else {
            post(new lz9(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.b.e() == drawable || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new iz9(this, drawable, 1));
        } else {
            post(new jz9(this, drawable, 1));
        }
    }
}
