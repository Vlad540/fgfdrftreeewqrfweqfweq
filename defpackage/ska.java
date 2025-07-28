package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: ska  reason: default package */
public final class ska extends hy4 {
    public final int e = bob.design_password_eye;
    public EditText f;
    public final eu5 g = new eu5(23, this);

    public ska(gy4 gy4, int i) {
        super(gy4);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return wsb.password_toggle_content_description;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
