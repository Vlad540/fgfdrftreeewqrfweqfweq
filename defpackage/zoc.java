package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: zoc  reason: default package */
public final class zoc extends LinearLayout {
    public static final AccelerateDecelerateInterpolator B0 = new AccelerateDecelerateInterpolator();
    public final EnumMap A0;
    public s16 a = new vfc(5);
    public final t97 b;
    public s16 c;
    public final t97 o;
    public s16 w0;
    public final t97 x0;
    public final EnumMap y0;
    public final EnumMap z0;

    public zoc(Context context) {
        super(context);
        this.b = ez3.O(3, new soc(context, this, 0));
        this.c = new vfc(5);
        this.o = ez3.O(3, new soc(context, this, 1));
        this.w0 = new vfc(5);
        this.x0 = ez3.O(3, new soc(context, this, 2));
        Class<toc> cls = toc.class;
        this.y0 = new EnumMap(cls);
        this.z0 = new EnumMap(cls);
        this.A0 = new EnumMap(cls);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(toc toc, EnumMap enumMap, EnumMap enumMap2, u16 u16) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(toc);
        if (valueAnimator != null) {
            vx3.f(valueAnimator);
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(toc);
        if (valueAnimator2 != null) {
            vx3.f(valueAnimator2);
        }
        enumMap2.put(toc, (Object) null);
        enumMap.put(toc, u16.invoke(valueAnimator));
    }

    private final qoc getMentionButton() {
        return (qoc) this.o.getValue();
    }

    private final qoc getReactionButton() {
        return (qoc) this.x0.getValue();
    }

    private final qoc getScrollToBottomButton() {
        return (qoc) this.b.getValue();
    }

    public final void b(toc toc) {
        qoc d = d(toc);
        EnumMap enumMap = this.z0;
        if (enumMap.get(toc) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.y0;
            if (parent != null || enumMap2.get(toc) != null) {
                EnumMap enumMap3 = this.A0;
                s16 s16 = (s16) enumMap3.remove(toc);
                if (s16 != null) {
                    s16.invoke();
                }
                ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(toc);
                if (valueAnimator != null) {
                    vx3.f(valueAnimator);
                }
                enumMap.put(toc, (Object) null);
                ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(toc);
                if (valueAnimator2 != null) {
                    vx3.f(valueAnimator2);
                }
                enumMap2.put(toc, (Object) null);
                if (isInLayout()) {
                    enumMap.put(toc, new ValueAnimator());
                    enumMap3.put(toc, mcf.b(this, new voc(this, toc)));
                    return;
                }
                qoc d2 = d(toc);
                a(toc, enumMap, enumMap2, new yoc(d2, this, toc, this, d2));
            }
        }
    }

    public final void c(toc toc) {
        qoc d = d(toc);
        EnumMap enumMap = this.y0;
        if (enumMap.get(toc) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.z0;
            if (parent == null || enumMap2.get(toc) != null) {
                EnumMap enumMap3 = this.A0;
                s16 s16 = (s16) enumMap3.remove(toc);
                if (s16 != null) {
                    s16.invoke();
                }
                ValueAnimator valueAnimator = (ValueAnimator) enumMap2.get(toc);
                if (valueAnimator != null) {
                    vx3.f(valueAnimator);
                }
                enumMap2.put(toc, (Object) null);
                ValueAnimator valueAnimator2 = (ValueAnimator) enumMap.get(toc);
                if (valueAnimator2 != null) {
                    vx3.f(valueAnimator2);
                }
                enumMap.put(toc, (Object) null);
                if (isInLayout()) {
                    enumMap.put(toc, new ValueAnimator());
                    enumMap3.put(toc, mcf.b(this, new kq2(d, this, toc)));
                    return;
                }
                if (d.getParent() != null) {
                    removeView(d);
                }
                if (toc == toc.a) {
                    addView(d, getChildCount());
                } else {
                    addView(d, 0);
                }
                a(toc, enumMap, enumMap2, new to1(d, this, toc, 13));
            }
        }
    }

    public final qoc d(toc toc) {
        int i = uoc.$EnumSwitchMapping$0[toc.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setOnClickListener(u16 u16) {
        this.a = new r8b(1, u16);
        this.c = new r8b(2, u16);
        this.w0 = new r8b(3, u16);
    }
}
