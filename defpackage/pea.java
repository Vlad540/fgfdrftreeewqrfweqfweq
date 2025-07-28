package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: pea  reason: default package */
public final class pea extends LinearLayout implements cxc {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final ArrayList c = new ArrayList();
    public AnimatorSet o;
    public int w0 = 1;
    public final t97 x0 = ez3.O(3, new my9(27));
    public final t97 y0 = ez3.O(3, new my9(28));
    public final t97 z0;

    public pea(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(qhc.M0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(km4.y0.r(appCompatTextView).getText().e);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        nte.x.b(appCompatTextView, yq4.b);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setMode(u0a.o);
        oneMeButton.setSize(v0a.b);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setId(qhc.B0);
        oneMeButton.d(Integer.valueOf(phc.p0), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(marginLayoutParams);
        this.b = oneMeButton;
        this.z0 = ez3.O(3, new t2a(context, 11));
        setElevation(dh4.c().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(oneMeButton);
        addView(appCompatTextView);
    }

    public static void d(pea pea, u16 u16, kea kea) {
        pea.getPopupWindow().dismiss();
        u16.invoke(Integer.valueOf(kea.a));
    }

    private final LinearInterpolator getAppearInterpolator() {
        return (LinearInterpolator) this.x0.getValue();
    }

    private final LinearInterpolator getDisappearInterpolator() {
        return (LinearInterpolator) this.y0.getValue();
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.z0.getValue();
    }

    public final void a() {
        this.w0 = 1;
        e(false);
    }

    public final boolean b() {
        return this.w0 == 2;
    }

    public final void c(String str, List list, s16 s16, u16 u16) {
        List<kea> list2;
        PopupWindow popupWindow;
        char c2;
        OneMeButton oneMeButton;
        List list3 = list;
        u16 u162 = u16;
        setSelectionTitle(str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List n0 = o23.n0(list3, 5);
        int size = list.size() - 5;
        if (size <= 0) {
            list2 = hw4.a;
        } else if (size == 1) {
            list2 = Collections.singletonList(o23.d0(list));
        } else {
            ArrayList arrayList2 = new ArrayList(size);
            if (list3 instanceof RandomAccess) {
                int size2 = list.size();
                for (int i = 5; i < size2; i++) {
                    arrayList2.add(list3.get(i));
                }
            } else {
                ListIterator listIterator = list3.listIterator(5);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            list2 = arrayList2;
        }
        boolean z = false;
        if (!list2.isEmpty()) {
            b1b b1b = new b1b(getContext(), false);
            b1b.setId(qhc.J0);
            for (kea kea : list2) {
                a1b a1b = new a1b(b1b.getContext(), z);
                a1b a1b2 = a1b;
                a1b.c(a1b, new hge(kea.b), (Integer) null, true, true);
                a1b2.b(Integer.valueOf(kea.c), Integer.valueOf(olb.global_icon_primary));
                a24.a0(a1b2, new sx0(this, u162, kea, 2));
                b1b.addView(a1b2, -1, -2);
                z = false;
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(b1b);
        } else {
            popupWindow = null;
        }
        int i2 = 0;
        for (Object next : n0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                kea kea2 = (kea) next;
                s0a s0a = s0a.o;
                v0a v0a = v0a.b;
                u0a u0a = u0a.o;
                if (i2 != 4 || !(!list2.isEmpty())) {
                    OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
                    oneMeButton2.setMode(u0a);
                    oneMeButton2.setSize(v0a);
                    oneMeButton2.setAppearance(s0a);
                    oneMeButton2.setId(qhc.C0);
                    oneMeButton2.d(Integer.valueOf(kea2.c), true);
                    c2 = 65534;
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginStart(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                    oneMeButton2.setLayoutParams(marginLayoutParams);
                    a24.a0(oneMeButton2, new xv5(u162, 20, kea2));
                    oneMeButton = oneMeButton2;
                } else {
                    oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
                    oneMeButton.setMode(u0a);
                    oneMeButton.setSize(v0a);
                    oneMeButton.setAppearance(s0a);
                    oneMeButton.setId(qhc.I0);
                    oneMeButton.d(Integer.valueOf(mnb.ic_more_vertical_filled_16), true);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams2.setMarginStart(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                    oneMeButton.setLayoutParams(marginLayoutParams2);
                    a24.a0(oneMeButton, new eu5(21, popupWindow));
                    c2 = 65534;
                }
                arrayList.add(oneMeButton);
                x87.H(oneMeButton, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
                addView(oneMeButton);
                i2 = i3;
                char c3 = c2;
            } else {
                p23.G();
                throw null;
            }
        }
        if (this.w0 != 2) {
            this.w0 = 2;
            setCloseListener(new zu4((Object) this, 28, (Object) s16));
            e(true);
        }
    }

    public final void e(boolean z) {
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            vx3.f(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float alpha = getAlpha();
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = 200;
        if (!(alpha == 0.0f || alpha == 1.0f)) {
            j = (long) (Math.abs(alpha - f2) * ((float) 200));
        }
        animatorSet2.setDuration(j);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{alpha, f2});
        ofFloat.setInterpolator(z ? getAppearInterpolator() : getDisappearInterpolator());
        ofFloat.addListener(new tf2(this, alpha, z));
        boolean z2 = !z;
        if (z2) {
            f = 1.0f;
        }
        animatorSet2.playTogether(o23.j0(myc.U(new vqe(myc.L(new es(8, (ViewGroup) getParent()), new e98(11, this)), new oea(f, z2 ? getAppearInterpolator() : getDisappearInterpolator()))), ofFloat));
        animatorSet2.start();
        this.o = animatorSet2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
            }
        }
        return true;
    }

    public final void setCloseListener(s16 s16) {
        a24.a0(this.b, new q6(17, s16));
    }

    public final void setSelectionTitle(String str) {
        this.a.setText(str);
    }
}
