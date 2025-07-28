package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: kp4  reason: default package */
public final class kp4 extends hy4 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final d5 i = new d5(26, this);
    public final tz2 j = new tz2(1, this);
    public final r34 k = new r34(7, (Object) this);
    public boolean l;
    public boolean m;
    public boolean n;
    public long o = Long.MAX_VALUE;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public kp4(gy4 gy4) {
        super(gy4);
        this.f = ct0.H(wlb.motionDurationShort3, 67, gy4.getContext());
        this.e = ct0.H(wlb.motionDurationShort3, 50, gy4.getContext());
        this.g = ct0.I(gy4.getContext(), wlb.motionEasingLinearInterpolator, og.a);
    }

    public final void a() {
        if (this.p.isTouchExplorationEnabled() && bm3.t(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new oc4(4, this));
    }

    public final int c() {
        return wsb.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return bob.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final r34 h() {
        return this.k;
    }

    public final boolean i(int i2) {
        return i2 != 0;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean l() {
        return this.n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new jg1(2, this));
            this.h.setOnDismissListener(new jp4(this));
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!bm3.t(editText) && this.p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = eaf.a;
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(l4 l4Var) {
        if (!bm3.t(this.h)) {
            l4Var.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && !bm3.t(this.h)) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                u();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new c00(7, (Object) this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new c00(7, (Object) this));
        this.q = ofFloat2;
        ofFloat2.addListener(new l6(4, (Object) this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.m = false;
            }
            if (!this.m) {
                t(!this.n);
                if (this.n) {
                    this.h.requestFocus();
                    this.h.showDropDown();
                    return;
                }
                this.h.dismissDropDown();
                return;
            }
            this.m = false;
        }
    }
}
