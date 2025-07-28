package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nea  reason: default package */
public final class nea extends FrameLayout implements cxc, mhe {
    public static final /* synthetic */ k77[] L0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public OneMeButton E0;
    public View F0;
    public View G0;
    public final Rect H0;
    public boolean I0;
    public boolean J0;
    public s16 K0;
    public final mea a = new mea(this, 0, false);
    public final mea b = new mea(this, 1);
    public final mea c = new mea(this, 2);
    public final mea o = new mea(this, 3);
    public final mea w0 = new mea(this, 4, false);
    public final mea x0 = new mea(this, 5);
    public final TextView y0;
    public final t97 z0;

    static {
        Class<nea> cls = nea.class;
        L0 = new k77[]{new hc9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), c3d.g(m7c.a, cls, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;"), new hc9(cls, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;"), new hc9(cls, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;"), new hc9(cls, "actionsHorizontalPadding", "getActionsHorizontalPadding()Lkotlin/Pair;"), new hc9(cls, "isTextShimmerEnabled", "isTextShimmerEnabled()Z")};
    }

    public nea(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        TextView textView = new TextView(context);
        textView.setId(qhc.M0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(km4.y0.r(textView).getText().e);
        textView.setTextAlignment(5);
        textView.setSingleLine();
        this.y0 = textView;
        this.z0 = ez3.O(3, new uda(context, this, 0));
        this.A0 = ez3.O(3, new uda(context, this, 1));
        this.B0 = ez3.O(3, new uda(context, this, 2));
        this.C0 = ez3.O(3, new qk8(18, this));
        this.D0 = ez3.O(3, new uda(context, this, 3));
        this.H0 = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        k();
        l();
        addOnLayoutChangeListener(new mp0(9, this));
        if (isLaidOut()) {
            e(this);
        }
    }

    public static final void d(nea nea, dea dea) {
        View view;
        OneMeButton oneMeButton;
        nea.removeView(nea.F0);
        nea.removeView(nea.G0);
        Context context = nea.getContext();
        lea searchViewInteraction = nea.getSearchViewInteraction();
        boolean z = dea instanceof aea;
        View view2 = null;
        aea aea = z ? (aea) dea : null;
        View B = xy6.B(context, aea != null ? aea.a : null, searchViewInteraction);
        if (B != null) {
            B.setId(qhc.s0);
        } else {
            B = null;
        }
        nea.G0 = B;
        Context context2 = nea.getContext();
        lea searchViewInteraction2 = nea.getSearchViewInteraction();
        pda customTheme = nea.getCustomTheme();
        if (z) {
            view = xy6.B(context2, ((aea) dea).b, searchViewInteraction2);
        } else {
            if (dea instanceof cea) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.setCustomTheme(customTheme);
                oneMeButton.d(Integer.valueOf(mnb.ic_more_vertical_filled_16), true);
                a24.a0(oneMeButton, new ame(dea, 0));
            } else if (dea instanceof xda) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(mnb.ic_done_28), true);
                a24.a0(oneMeButton, new ame(dea, 1));
            } else if (dea instanceof wda) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(mnb.ic_cancel_outline_28), true);
                a24.a0(oneMeButton, new ame(dea, 2));
            } else if (dea instanceof yda) {
                view = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            view = oneMeButton;
        }
        if (view != null) {
            view.setId(qhc.r0);
            view2 = view;
        }
        nea.F0 = view2;
        if (view2 != null) {
            nea.addView(view2);
            x87.H(view2, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        }
        View view3 = nea.G0;
        if (view3 != null) {
            nea.addView(view3);
            x87.H(view3, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        }
    }

    public static final void e(nea nea) {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        int i;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo2;
        Rect bounds2;
        int i2;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo3;
        Rect bounds3;
        TextView textView = nea.y0;
        int left = textView.getLeft();
        int right = textView.getRight();
        int height = nea.getHeight();
        Rect rect = nea.H0;
        rect.set(left, 0, right, height);
        t97 t97 = nea.A0;
        if (t97.a()) {
            rect.left = Math.min(((mz9) t97.getValue()).getLeft(), rect.left);
        }
        t97 t972 = nea.z0;
        if (t972.a()) {
            ddd ddd = (ddd) t972.getValue();
            rect.left = Math.min(ddd.getLeft(), rect.left);
            rect.right = Math.max(ddd.getRight(), rect.right);
        }
        OneMeButton oneMeButton = nea.E0;
        int i3 = -1;
        Region region = null;
        if (oneMeButton != null) {
            TouchDelegate touchDelegate = oneMeButton.getTouchDelegate();
            if (!(touchDelegate == null || (touchDelegateInfo3 = touchDelegate.getTouchDelegateInfo()) == null)) {
                Region regionAt = touchDelegateInfo3.getRegionCount() <= 0 ? null : touchDelegateInfo3.getRegionAt(0);
                if (!(regionAt == null || (bounds3 = regionAt.getBounds()) == null)) {
                    i2 = bounds3.right;
                    rect.left = Math.max(i2, oneMeButton.getRight());
                }
            }
            i2 = -1;
            rect.left = Math.max(i2, oneMeButton.getRight());
        }
        t97 t973 = nea.B0;
        if (t973.a()) {
            rect.right = Math.max(((ImageView) t973.getValue()).getRight(), rect.right);
        }
        View view = nea.F0;
        if (view != null) {
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            if (!(touchDelegate2 == null || (touchDelegateInfo2 = touchDelegate2.getTouchDelegateInfo()) == null)) {
                Region regionAt2 = touchDelegateInfo2.getRegionCount() <= 0 ? null : touchDelegateInfo2.getRegionAt(0);
                if (!(regionAt2 == null || (bounds2 = regionAt2.getBounds()) == null)) {
                    i = bounds2.left;
                    rect.right = Math.min(i, view.getLeft());
                }
            }
            i = -1;
            rect.right = Math.min(i, view.getLeft());
        }
        View view2 = nea.G0;
        if (view2 != null) {
            TouchDelegate touchDelegate3 = view2.getTouchDelegate();
            if (!(touchDelegate3 == null || (touchDelegateInfo = touchDelegate3.getTouchDelegateInfo()) == null)) {
                if (touchDelegateInfo.getRegionCount() > 0) {
                    region = touchDelegateInfo.getRegionAt(0);
                }
                if (!(region == null || (bounds = region.getBounds()) == null)) {
                    i3 = bounds.left;
                }
            }
            rect.right = Math.min(i3, view2.getLeft());
        }
    }

    private final pda getCurrentTheme() {
        pda customTheme = getCustomTheme();
        return customTheme == null ? km4.y0.r(this) : customTheme;
    }

    private final lea getSearchViewInteraction() {
        return (lea) this.C0.getValue();
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void h(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void i(View view, int i, int i2) {
        view.layout(i, i2 - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + (i2 - (view.getMeasuredHeight() / 2)));
    }

    public final void a() {
        ((pea) this.D0.getValue()).a();
    }

    public final boolean b() {
        t97 t97 = this.D0;
        return t97.a() && ((pea) t97.getValue()).b();
    }

    public final void c(String str, List list, s16 s16, u16 u16) {
        ((pea) this.D0.getValue()).c(str, list, s16, u16);
    }

    public final void f(boolean z) {
        this.J0 = !z;
        int i = 8;
        this.y0.setVisibility(z ? 0 : 8);
        t97 t97 = this.z0;
        if (t97.a()) {
            ((ddd) t97.getValue()).setVisibility(z ? 0 : 8);
        }
        t97 t972 = this.A0;
        if (t972.a()) {
            ((mz9) t972.getValue()).setVisibility(z ? 0 : 8);
        }
        t97 t973 = this.B0;
        if (t973.a()) {
            ((ImageView) t973.getValue()).setVisibility(z ? 0 : 8);
        }
        OneMeButton oneMeButton = this.E0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(z ? 0 : 8);
        }
        View view = this.F0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.G0;
        if (view2 != null) {
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public final boolean g() {
        raa searchView = getSearchView();
        paa state = searchView != null ? searchView.getState() : null;
        return state == paa.c || state == paa.o || state == paa.b;
    }

    public final wia getActionsHorizontalPadding() {
        k77 k77 = L0[4];
        return (wia) this.w0.b;
    }

    public final pda getCustomTheme() {
        k77 k77 = L0[0];
        return (pda) this.a.b;
    }

    public final fea getForm() {
        k77 k77 = L0[1];
        return (fea) this.b.b;
    }

    public final bea getLeftActions() {
        k77 k77 = L0[3];
        return (bea) this.o.b;
    }

    public final dea getRightActions() {
        k77 k77 = L0[2];
        return (dea) this.c.b;
    }

    public final raa getSearchView() {
        View view = this.F0;
        raa raa = view instanceof raa ? (raa) view : null;
        if (raa != null) {
            return raa;
        }
        View view2 = this.G0;
        if (view2 instanceof raa) {
            return (raa) view2;
        }
        return null;
    }

    public final TextView getTitle() {
        return this.y0;
    }

    public final int j(int i, int i2, int i3, int i4, View view, View view2) {
        int measuredWidth;
        if (view == null || view2 == null) {
            if (view != null) {
                measureChild(view, i, i2);
                measuredWidth = view.getMeasuredWidth();
            } else if (view2 == null) {
                return 0;
            } else {
                measureChild(view2, i, i2);
                measuredWidth = view2.getMeasuredWidth();
            }
            return measuredWidth + i3;
        }
        measureChild(view, i, i2);
        measureChild(view2, i, i2);
        return view2.getMeasuredWidth() + view.getMeasuredWidth() + i4 + i3;
    }

    public final void k() {
        int ordinal = getForm().ordinal();
        TextView textView = this.y0;
        if (ordinal == 0) {
            nte.z.b(textView, yq4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton = this.E0;
            if (oneMeButton != null) {
                n06.c(oneMeButton, getLeftActions(), getCustomTheme());
            }
            View view = this.G0;
            if (view != null) {
                n06.d(view, getRightActions(), false);
            }
            View view2 = this.F0;
            if (view2 != null) {
                n06.d(view2, getRightActions(), true);
            }
        } else if (ordinal == 1) {
            nte.y.b(textView, yq4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view3 = this.G0;
            if (view3 != null) {
                n06.e(view3, getRightActions(), false);
            }
            View view4 = this.F0;
            if (view4 != null) {
                n06.e(view4, getRightActions(), true);
            }
        } else if (ordinal == 2) {
            nte.z.b(textView, yq4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton2 = this.E0;
            if (oneMeButton2 != null) {
                n06.c(oneMeButton2, getLeftActions(), getCustomTheme());
            }
            View view5 = this.G0;
            if (view5 != null) {
                n06.d(view5, getRightActions(), false);
            }
            View view6 = this.F0;
            if (view6 != null) {
                n06.d(view6, getRightActions(), true);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t97 t97 = this.z0;
        if (t97.a()) {
            ddd ddd = (ddd) t97.getValue();
            k77 k77 = L0[5];
            if (((Boolean) this.x0.b).booleanValue()) {
                nte.i.b(ddd, yq4.b);
                ddd.setTextColor(getCurrentTheme().getText().g);
                return;
            }
            nte.o.b(ddd, yq4.b);
            ddd.setTextColor(getCurrentTheme().getText().f);
        }
    }

    public final void l() {
        int ordinal = getForm().ordinal();
        t97 t97 = this.A0;
        TextView textView = this.y0;
        if (ordinal == 0) {
            textView.setGravity(17);
            if (t97.a()) {
                mz9 mz9 = (mz9) t97.getValue();
                ViewGroup.LayoutParams layoutParams = mz9.getLayoutParams();
                if (layoutParams != null) {
                    float f = (float) 24;
                    layoutParams.width = a24.X(dh4.c().getDisplayMetrics().density * f);
                    layoutParams.height = a24.X(f * dh4.c().getDisplayMetrics().density);
                    mz9.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            wia actionsHorizontalPadding = getActionsHorizontalPadding();
            int intValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            wia actionsHorizontalPadding2 = getActionsHorizontalPadding();
            setPadding(intValue, 0, actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), 0);
        } else if (ordinal == 1) {
            textView.setGravity(8388611);
            if (t97.a()) {
                mz9 mz92 = (mz9) t97.getValue();
                ViewGroup.LayoutParams layoutParams2 = mz92.getLayoutParams();
                if (layoutParams2 != null) {
                    float f2 = (float) 24;
                    layoutParams2.width = a24.X(dh4.c().getDisplayMetrics().density * f2);
                    layoutParams2.height = a24.X(f2 * dh4.c().getDisplayMetrics().density);
                    mz92.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            wia actionsHorizontalPadding3 = getActionsHorizontalPadding();
            int intValue2 = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            wia actionsHorizontalPadding4 = getActionsHorizontalPadding();
            setPadding(intValue2, 0, actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), 0);
        } else if (ordinal == 2) {
            textView.setGravity(8388611);
            if (t97.a()) {
                mz9 mz93 = (mz9) t97.getValue();
                ViewGroup.LayoutParams layoutParams3 = mz93.getLayoutParams();
                if (layoutParams3 != null) {
                    float f3 = (float) 40;
                    layoutParams3.width = a24.X(dh4.c().getDisplayMetrics().density * f3);
                    layoutParams3.height = a24.X(f3 * dh4.c().getDisplayMetrics().density);
                    mz93.setLayoutParams(layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            wia actionsHorizontalPadding5 = getActionsHorizontalPadding();
            int intValue3 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.a).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            wia actionsHorizontalPadding6 = getActionsHorizontalPadding();
            setPadding(intValue3, 0, actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int verticalPaddingOffset;
        int measuredHeight2;
        int verticalPaddingOffset2;
        int measuredHeight3;
        int verticalPaddingOffset3;
        int ordinal = getForm().ordinal();
        t97 t97 = this.A0;
        t97 t972 = this.B0;
        TextView textView = this.y0;
        t97 t973 = this.z0;
        t97 t974 = this.D0;
        if (ordinal == 0) {
            View B = ek8.B(t974);
            if (B != null) {
                i(B, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            OneMeButton oneMeButton = this.E0;
            if (oneMeButton != null) {
                oneMeButton.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton.getMeasuredWidth() + getPaddingLeft(), (oneMeButton.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View B2 = ek8.B(t973);
            if (B2 != null) {
                measuredHeight = (((getMeasuredHeight() - B2.getMeasuredHeight()) - textView.getMeasuredHeight()) - a24.X(((float) 2) * dh4.c().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset = getVerticalPaddingOffset();
            } else {
                measuredHeight = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset = getVerticalPaddingOffset();
            }
            int i5 = measuredHeight + verticalPaddingOffset;
            View view = this.F0;
            View view2 = this.G0;
            if ((view2 instanceof raa) && g()) {
                raa raa = (raa) view2;
                raa.layout((getMeasuredWidth() - getPaddingRight()) - raa.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (raa.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (raa.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null && view2 != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                float f = (float) 12;
                view2.layout(me4.p(f, dh4.c().getDisplayMetrics().density, xy6.s(view) - view2.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), me4.p(f, dh4.c().getDisplayMetrics().density, xy6.s(view)), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view2 != null) {
                view2.layout((getMeasuredWidth() - getPaddingRight()) - view2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View B3 = ek8.B(t97);
            View B4 = ek8.B(t972);
            int measuredHeight4 = (textView.getMeasuredHeight() / 2) + i5;
            int i6 = 0;
            int X = B3 != null ? (a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) + B3.getMeasuredWidth()) / 2 : 0;
            if (B4 != null) {
                i6 = (a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) + B4.getMeasuredWidth()) / 2;
            }
            int measuredWidth = (((getMeasuredWidth() / 2) - X) - i6) - (textView.getMeasuredWidth() / 2);
            if (B3 != null) {
                i(B3, measuredWidth, measuredHeight4);
                measuredWidth = rf0.b((float) 8, dh4.c().getDisplayMetrics().density, B3.getMeasuredWidth(), measuredWidth);
            }
            h(textView, measuredWidth, i5);
            float f2 = (float) 2;
            int b2 = rf0.b(f2, dh4.c().getDisplayMetrics().density, textView.getMeasuredWidth(), measuredWidth);
            if (B4 != null) {
                i(B4, b2, measuredHeight4);
            }
            if (B2 != null) {
                int measuredWidth2 = (getMeasuredWidth() / 2) - (B2.getMeasuredWidth() / 2);
                View B5 = ek8.B(t97);
                h(B2, measuredWidth2, a24.X(f2 * dh4.c().getDisplayMetrics().density) + (B5 != null ? B5.getBottom() : textView.getBottom()));
            }
        } else if (ordinal == 1) {
            View B6 = ek8.B(t974);
            if (B6 != null) {
                i(B6, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View B7 = ek8.B(t973);
            if (B7 != null) {
                measuredHeight2 = (((getMeasuredHeight() - B7.getMeasuredHeight()) - textView.getMeasuredHeight()) - a24.X(((float) 2) * dh4.c().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            } else {
                measuredHeight2 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            }
            int i7 = measuredHeight2 + verticalPaddingOffset2;
            h(textView, getPaddingLeft(), i7);
            View B8 = ek8.B(t972);
            if (B8 != null) {
                i(B8, me4.c((float) 2, dh4.c().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i7);
            }
            if (B7 != null) {
                h(B7, getPaddingLeft(), a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) + textView.getBottom());
            }
            View view3 = this.F0;
            View view4 = this.G0;
            if ((view4 instanceof raa) && g()) {
                raa raa2 = (raa) view4;
                raa2.layout((getMeasuredWidth() - getPaddingRight()) - raa2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (raa2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (raa2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view3 != null && view4 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                float f3 = (float) 16;
                view4.layout(me4.p(f3, dh4.c().getDisplayMetrics().density, xy6.s(view3) - view4.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), me4.p(f3, dh4.c().getDisplayMetrics().density, xy6.s(view3)), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view4 != null) {
                view4.layout((getMeasuredWidth() - getPaddingRight()) - view4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view3 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else if (ordinal == 2) {
            View B9 = ek8.B(t974);
            if (B9 != null) {
                i(B9, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View B10 = ek8.B(t973);
            if (B10 != null) {
                measuredHeight3 = ((getMeasuredHeight() - B10.getMeasuredHeight()) - textView.getMeasuredHeight()) / 2;
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            } else {
                measuredHeight3 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            }
            int i8 = measuredHeight3 + verticalPaddingOffset3;
            int paddingLeft = getPaddingLeft();
            OneMeButton oneMeButton2 = this.E0;
            if (oneMeButton2 != null) {
                oneMeButton2.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton2.getMeasuredWidth() + getPaddingLeft(), (oneMeButton2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft += oneMeButton2.getMeasuredWidth();
            }
            View B11 = ek8.B(t97);
            if (B11 != null) {
                int X2 = paddingLeft + (this.E0 != null ? a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) / 2 : a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                i(B11, X2, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft = X2 + B11.getMeasuredWidth();
            }
            float f4 = (float) 8;
            int X3 = a24.X(dh4.c().getDisplayMetrics().density * f4) + paddingLeft;
            h(textView, X3, i8);
            View B12 = ek8.B(t972);
            if (B12 != null) {
                i(B12, me4.c((float) 2, dh4.c().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i8);
            }
            if (B10 != null) {
                h(B10, X3, textView.getBottom());
            }
            View view5 = this.F0;
            View view6 = this.G0;
            if ((view6 instanceof raa) && g()) {
                raa raa3 = (raa) view6;
                raa3.layout((getMeasuredWidth() - getPaddingRight()) - raa3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (raa3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (raa3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view5 != null && view6 != null) {
                view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                view6.layout(me4.p(f4, dh4.c().getDisplayMetrics().density, xy6.s(view5) - view6.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), me4.p(f4, dh4.c().getDisplayMetrics().density, xy6.s(view5)), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view6 != null) {
                view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view5 != null) {
                view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int ordinal = getForm().ordinal();
        t97 t97 = this.A0;
        TextView textView = this.y0;
        t97 t972 = this.B0;
        t97 t973 = this.z0;
        t97 t974 = this.D0;
        if (ordinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingTop = getPaddingTop() + a24.X(((float) 52) * dh4.c().getDisplayMetrics().density) + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View B = ek8.B(t974);
            if (B != null) {
                B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
            }
            if (B != null) {
                measureChild(B, i3, i4);
            }
            int paddingRight = getPaddingRight();
            View view = this.F0;
            View view2 = this.G0;
            float f = (float) 12;
            int i5 = size;
            float f2 = f;
            View view3 = view2;
            int i6 = paddingTop;
            TextView textView2 = textView;
            int j = paddingRight + j(i, i2, a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), view, view3);
            int paddingLeft2 = getPaddingLeft();
            OneMeButton oneMeButton = this.E0;
            if (oneMeButton != null) {
                measureChild(oneMeButton, i3, i4);
                paddingLeft2 = rf0.b(f2, dh4.c().getDisplayMetrics().density, oneMeButton.getMeasuredWidth(), paddingLeft2);
            }
            int max = i5 - (Math.max(paddingLeft2, j) * 2);
            View B2 = ek8.B(t973);
            if (B2 != null) {
                B2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View B3 = ek8.B(t97);
            if (B3 != null) {
                measureChild(B3, i3, i4);
                max -= a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) + B3.getMeasuredWidth();
            }
            View B4 = ek8.B(t972);
            if (B4 != null) {
                measureChild(B4, i3, i4);
                max -= a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) + B4.getMeasuredWidth();
            }
            textView2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(i5, i6);
        } else if (ordinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingBottom = getPaddingBottom() + getPaddingTop() + a24.X(((float) 52) * dh4.c().getDisplayMetrics().density);
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View B5 = ek8.B(t974);
            if (B5 != null) {
                B5.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
            }
            int i7 = paddingBottom;
            int j2 = paddingLeft3 - j(i, i2, a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), this.F0, this.G0);
            View B6 = ek8.B(t973);
            if (B6 != null) {
                B6.measure(View.MeasureSpec.makeMeasureSpec(j2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View B7 = ek8.B(t972);
            if (B7 != null) {
                measureChild(B7, i3, i4);
                j2 -= a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) + B7.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(j2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, i7);
        } else if (ordinal == 2) {
            int size3 = View.MeasureSpec.getSize(i);
            float f3 = (float) 64;
            int paddingBottom2 = getPaddingBottom() + getPaddingTop() + a24.X(dh4.c().getDisplayMetrics().density * f3);
            int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
            View B8 = ek8.B(t974);
            if (B8 != null) {
                B8.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824));
            }
            View view4 = this.F0;
            View view5 = this.G0;
            float f4 = (float) 8;
            int i8 = paddingLeft4;
            int X = a24.X(dh4.c().getDisplayMetrics().density * f4);
            float f5 = f3;
            int i9 = size3;
            int j3 = i8 - j(i, i2, X, a24.X(dh4.c().getDisplayMetrics().density * f4), view4, view5);
            OneMeButton oneMeButton2 = this.E0;
            if (oneMeButton2 != null) {
                measureChild(oneMeButton2, i3, i4);
                j3 -= oneMeButton2.getMeasuredWidth();
            }
            View B9 = ek8.B(t97);
            if (B9 != null) {
                measureChild(B9, i3, i4);
                j3 -= a24.X(f4 * dh4.c().getDisplayMetrics().density) + (B9.getMeasuredWidth() + (this.E0 != null ? a24.X(dh4.c().getDisplayMetrics().density * f4) / 2 : a24.X(dh4.c().getDisplayMetrics().density * f4)));
            }
            View B10 = ek8.B(t973);
            if (B10 != null) {
                B10.measure(View.MeasureSpec.makeMeasureSpec(j3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View B11 = ek8.B(t972);
            if (B11 != null) {
                measureChild(B11, i3, i4);
                j3 -= a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) + B11.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(j3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(i9, getPaddingBottom() + getPaddingTop() + a24.X(f5 * dh4.c().getDisplayMetrics().density));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        km4 n = s59.n(getContext());
        pda currentTheme = getCurrentTheme();
        n.getClass();
        km4.c(this, currentTheme);
        k();
        t97 t97 = this.z0;
        if (t97.a()) {
            ddd ddd = (ddd) t97.getValue();
            CharSequence text = ddd.getText();
            Object[] objArr = null;
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, ddd.getText().length(), mhe.class);
            }
            if (objArr == null) {
                objArr = new mhe[0];
            }
            for (Object obj : objArr) {
                mhe mhe = (mhe) obj;
                mhe.onThemeChanged(getCurrentTheme());
                tge.b(ddd, mhe);
            }
        }
        t97 t972 = this.B0;
        if (t972.a()) {
            ImageView imageView = (ImageView) t972.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).getIcon().f));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        OneMeButton oneMeButton;
        if (motionEvent == null || this.J0) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            if (this.H0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                s16 s16 = this.K0;
                if (s16 != null) {
                    s16.invoke();
                }
                performClick();
                return true;
            }
        }
        OneMeButton oneMeButton2 = this.E0;
        if (oneMeButton2 == null || (touchDelegate3 = oneMeButton2.getTouchDelegate()) == null || !touchDelegate3.onTouchEvent(motionEvent)) {
            View view3 = this.G0;
            if (view3 == null || (touchDelegate2 = view3.getTouchDelegate()) == null || !touchDelegate2.onTouchEvent(motionEvent)) {
                View view4 = this.F0;
                if (!(view4 == null || (touchDelegate = view4.getTouchDelegate()) == null || !touchDelegate.onTouchEvent(motionEvent) || motionEvent.getAction() != 1 || (view = this.F0) == null)) {
                    view.performClick();
                }
                return true;
            }
            if (motionEvent.getAction() == 1 && (view2 = this.G0) != null) {
                view2.performClick();
            }
            return true;
        }
        if (motionEvent.getAction() == 1 && (oneMeButton = this.E0) != null) {
            oneMeButton.performClick();
        }
        return true;
    }

    public final void setActionsHorizontalPadding(wia wia) {
        this.w0.o1(this, L0[4], wia);
    }

    public final void setAvatar(eea eea) {
        if (getForm() != fea.b) {
            t97 t97 = this.A0;
            int i = 8;
            if (eea != null) {
                mz9 mz9 = (mz9) t97.getValue();
                mz9.g(new ub0(eea.b, eea.c), true);
                mz9.setAvatarUrl(eea.a);
                mz9.h(mz9, eea.d, (gz9) null, 30);
                if (!g() && !this.J0) {
                    i = 0;
                }
                mz9.setVisibility(i);
            } else if (t97.a()) {
                ((mz9) t97.getValue()).setVisibility(8);
            }
            if (!g()) {
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalStateException("setAvatar can't be applied for Form.Main");
    }

    public final void setAvatarAlpha(float f) {
        t97 t97 = this.A0;
        if (t97.a()) {
            ((mz9) t97.getValue()).setAlpha(f);
        }
    }

    public final void setCustomTheme(pda pda) {
        this.a.o1(this, L0[0], pda);
    }

    public final void setDropdownRotationProgress(float f) {
        t97 t97 = this.B0;
        if (t97.a()) {
            ((ImageView) t97.getValue()).setRotation(gwf.i(f, 0.0f, 1.0f) * 180.0f);
        }
    }

    public final void setForm(fea fea) {
        this.b.o1(this, L0[1], fea);
    }

    public final void setLeftActions(bea bea) {
        this.o.o1(this, L0[3], bea);
    }

    public final void setRightActions(dea dea) {
        this.c.o1(this, L0[2], dea);
    }

    public final void setShowDropdown(boolean z) {
        ((View) this.B0.getValue()).setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public final void setTextShimmerEnabled(boolean z) {
        this.x0.o1(this, L0[5], Boolean.valueOf(z));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.y0.setAlpha(f);
    }

    public final void setTitleClickListener(s16 s16) {
        this.K0 = s16;
    }

    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i = 0;
        this.I0 = charSequence != null;
        t97 t97 = this.z0;
        if (charSequence != null) {
            ((ddd) t97.getValue()).setText(charSequence);
            View view = (View) t97.getValue();
            if (g() || this.J0) {
                i = 8;
            }
            view.setVisibility(i);
        } else if (t97.a()) {
            ((ddd) t97.getValue()).setVisibility(8);
        }
        if (!g()) {
            requestLayout();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.y0.setText(charSequence);
    }
}
