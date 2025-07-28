package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: hy4  reason: default package */
public abstract class hy4 {
    public final TextInputLayout a;
    public final gy4 b;
    public final Context c;
    public final CheckableImageButton d;

    public hy4(gy4 gy4) {
        this.a = gy4.a;
        this.b = gy4;
        this.c = gy4.getContext();
        this.d = gy4.y0;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public r34 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof kp4;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(l4 l4Var) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
