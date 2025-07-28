package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: zz0  reason: default package */
public final class zz0 extends ConstraintLayout {
    public static final /* synthetic */ int W0 = 0;
    public final t97 K0 = ez3.O(3, new m(25));
    public final t97 L0 = ez3.O(3, new m(26));
    public final dgc M0;
    public final dgc N0;
    public final dgc O0;
    public final dgc P0;
    public e01 Q0;
    public hy7 R0;
    public hy7 S0;
    public l31 T0;
    public jme U0;
    public final t97 V0 = ez3.O(3, new c6(15, this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        setLayoutParams(new re3(0, -2));
        View view = new View(context2);
        view.setId(uob.call_bottom_panel_background);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        view.setBackground(shapeDrawable);
        addView(view, -1, a24.X(((float) 76) * dh4.c().getDisplayMetrics().density));
        dgc dgc = new dgc(context2, (AttributeSet) null);
        dgc.setId(uob.call_dinamic);
        dgc.setListener(new j9(this, 6, dgc));
        float f = (float) 50;
        dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc.setButtonPadding(a24.X(((float) 3) * dh4.c().getDisplayMetrics().density));
        this.M0 = dgc;
        addView(dgc);
        dgc dgc2 = new dgc(context2, (AttributeSet) null);
        dgc2.setId(uob.call_microphone);
        dgc2.y(phc.E0, -855638017);
        dgc2.setListener(new yz0(this, 0));
        dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        float f2 = (float) 4;
        dgc2.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        this.N0 = dgc2;
        addView(dgc2);
        dgc dgc3 = new dgc(context2, (AttributeSet) null);
        dgc3.setId(uob.call_video);
        dgc3.y(phc.R0, -855638017);
        dgc3.setListener(new yz0(this, 1));
        dgc3.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc3.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        this.O0 = dgc3;
        addView(dgc3);
        dgc dgc4 = new dgc(context2, (AttributeSet) null);
        dgc4.setId(uob.call_more);
        dgc4.y(phc.s0, -855638017);
        dgc4.setAccessibility(Integer.valueOf(ftb.call_more_accessibility));
        dgc4.setListener(new yz0(this, 2));
        dgc4.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc4.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        this.P0 = dgc4;
        addView(dgc4);
        dgc dgc5 = new dgc(context2, (AttributeSet) null);
        dgc5.setId(uob.call_cancel);
        dgc5.y(phc.K0, -855638017);
        dgc5.setAccessibility(Integer.valueOf(ftb.call_cancel_accessibility));
        dgc5.setListener(new yz0(this, 3));
        dgc5.setMode(yfc.c);
        dgc5.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        dgc5.setButtonPadding(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        addView(dgc5);
        bf3 p = a06.p(this);
        int id = dgc.getId();
        p.d(id, 4, dgc3.getId(), 4);
        p.d(id, 7, dgc2.getId(), 6);
        p.d(id, 6, 0, 6);
        p.d(id, 3, dgc3.getId(), 3);
        int id2 = dgc2.getId();
        p.d(id2, 4, dgc3.getId(), 4);
        p.d(id2, 7, dgc3.getId(), 6);
        p.d(id2, 6, dgc.getId(), 7);
        p.d(id2, 3, dgc3.getId(), 3);
        int id3 = dgc3.getId();
        p.d(id3, 4, 0, 4);
        p.d(id3, 3, 0, 3);
        p.d(id3, 7, dgc4.getId(), 6);
        p.d(id3, 6, dgc2.getId(), 7);
        int id4 = dgc4.getId();
        p.d(id4, 4, dgc3.getId(), 4);
        p.d(id4, 7, dgc5.getId(), 6);
        p.d(id4, 6, dgc3.getId(), 7);
        p.d(id4, 3, dgc3.getId(), 3);
        int id5 = dgc5.getId();
        p.d(id5, 4, dgc3.getId(), 4);
        p.d(id5, 7, 0, 7);
        p.d(id5, 6, dgc4.getId(), 7);
        p.d(id5, 3, dgc3.getId(), 3);
        int id6 = view.getId();
        p.d(id6, 4, dgc3.getId(), 4);
        p.d(id6, 7, 0, 7);
        p.d(id6, 6, 0, 6);
        p.d(id6, 3, dgc3.getId(), 3);
        p.a(this);
    }

    public static void A(dgc dgc, int i, mge mge) {
        dgc.y(i, -15987442);
        dgc.setMode(yfc.o);
        dgc.setAccessibility(mge);
    }

    public static void G(dgc dgc, int i, int i2, hy7 hy7, mge mge, mge mge2) {
        dgc.setVisibility(hy7 != hy7.o ? 0 : 8);
        int ordinal = hy7.ordinal();
        if (ordinal == 0) {
            A(dgc, i2, mge2);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            dgc.y(i2, -3259817);
            dgc.setMode(yfc.w0);
            dgc.setAccessibility(mge2);
        } else {
            x(dgc, i, mge);
        }
    }

    private final float[] getBgRadius() {
        return (float[]) this.K0.getValue();
    }

    private final f21 getCallContextMenuDelegate() {
        return (f21) this.L0.getValue();
    }

    private final View getContainer() {
        return (View) this.V0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return me4.c((float) 6, dh4.c().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    public static void w(zz0 zz0) {
        lv1 lv1 = zz0.Q0;
        if (lv1 != null) {
            zz0.getContainer();
            k77[] k77Arr = CallBottomPanelWidget.w0;
            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) lv1.b;
            if (!((aj1) callBottomPanelWidget.c.getValue()).u()) {
                h01 l0 = callBottomPanelWidget.l0();
                aj1 aj1 = callBottomPanelWidget.m0().c;
                u81 u81 = (u81) aj1.G0.a.getValue();
                boolean z = true;
                boolean z2 = !u81.g;
                y11 y11 = u81.f;
                if ((y11 != null ? y11.a : null) == null) {
                    z = false;
                }
                boolean a = u81.i.a();
                boolean u = aj1.u();
                lg7 c = hwf.c();
                if (z2) {
                    c.add(new s6());
                }
                if (z) {
                    c.add(new v6());
                }
                if (u) {
                    if (a) {
                        c.add(new u6());
                    } else {
                        c.add(new t6());
                    }
                }
                l0.g(hwf.a(c));
            }
        }
    }

    public static void x(dgc dgc, int i, mge mge) {
        dgc.y(i, -1);
        dgc.setMode(yfc.w0);
        dgc.setAccessibility(mge);
    }

    public final void B(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            f21 callContextMenuDelegate = getCallContextMenuDelegate();
            Context context = getContext();
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    l31 l31 = (l31) next;
                    arrayList2.add(new hx3(l31.getIcon(), i, l31.getTitle()));
                    i = i2;
                } else {
                    p23.G();
                    throw null;
                }
            }
            zq3 a = callContextMenuDelegate.a(context, arrayList2, new xz(callContextMenuDelegate, this, arrayList, 1));
            int X = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            int contextHeight = getContextHeight();
            dgc dgc = this.M0;
            a.showAtLocation(dgc, 8388691, X, contextHeight);
            a.setOnDismissListener(new xz0(this, 1));
            l31 l312 = this.T0;
            if (l312 == null) {
                return;
            }
            if (l312 instanceof h31) {
                h31 h31 = (h31) l312;
                x(dgc, h31.c, h31.f);
                return;
            }
            A(dgc, l312.a(), l312.getContentDescription());
        }
    }

    public final void C() {
        hge hge = new hge(r1a.I1);
        int i = n1a.V;
        int[] iArr = new int[2];
        dgc dgc = this.N0;
        dgc.getLocationOnScreen(iArr);
        Point point = new Point(me4.p((float) 8, dh4.c().getDisplayMetrics().density, Integer.valueOf(iArr[0]).intValue() - (dgc.getWidth() / 2)), getContextHeight());
        jme jme = this.U0;
        if (jme == null || !jme.isShowing()) {
            jme jme2 = this.U0;
            if (jme2 != null) {
                jme2.dismiss();
            }
            jme jme3 = new jme(getContext(), dgc, new m(27), new m(28), 0, 0, 96);
            jme3.d(hge);
            jme3.c(Integer.valueOf(i));
            jme3.e(point, 8388691, 3000);
            jme3.setOnDismissListener(new xz0(this, 0));
            this.U0 = jme3;
            return;
        }
        jme jme4 = this.U0;
        if (jme4 != null) {
            jme4.e(point, 8388691, 3000);
        }
    }

    public final void F(lg7 lg7) {
        if (!lg7.isEmpty()) {
            f21 callContextMenuDelegate = getCallContextMenuDelegate();
            zq3 a = callContextMenuDelegate.a(getContext(), lg7, new j9(callContextMenuDelegate, 5, this));
            int contextHeight = getContextHeight();
            dgc dgc = this.P0;
            a.showAtLocation(dgc, 81, 0, contextHeight);
            a.setOnDismissListener(new xz0(this, 2));
            A(dgc, phc.s0, new hge(ftb.call_more_accessibility));
        }
    }

    public final void setAudioInfo(l31 l31) {
        if (!hhd.f(this.T0, l31)) {
            this.T0 = l31;
            int a = l31.a();
            mge contentDescription = l31.getContentDescription();
            G(this.M0, a, a, l31 instanceof h31 ? hy7.b : hy7.a, contentDescription, contentDescription);
        }
    }

    public final void setClickListener(e01 e01) {
        this.Q0 = e01;
    }

    public final void setMicrophoneEnabled(hy7 hy7) {
        if (this.R0 != hy7) {
            this.R0 = hy7;
            G(this.N0, phc.F0, phc.E0, hy7, new hge(ftb.call_microphone_enabled_accessibility), new hge(ftb.call_microphone_disabled_accessibility));
        }
    }

    public final void setVideoEnabled(hy7 hy7) {
        if (this.S0 != hy7) {
            this.S0 = hy7;
            G(this.O0, phc.S0, phc.R0, hy7, new hge(ftb.call_video_enabled_accessibility), new hge(ftb.call_video_disabled_accessibility));
        }
    }

    public final void y() {
        f21 callContextMenuDelegate = getCallContextMenuDelegate();
        zq3 zq3 = callContextMenuDelegate.a;
        if (zq3 != null) {
            zq3.dismiss();
        }
        callContextMenuDelegate.a = null;
        jme jme = this.U0;
        if (jme != null) {
            jme.dismiss();
        }
    }
}
