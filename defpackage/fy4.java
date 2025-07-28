package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: fy4  reason: default package */
public final class fy4 {
    public final /* synthetic */ gy4 a;

    public fy4(gy4 gy4) {
        this.a = gy4;
    }

    public final void a(TextInputLayout textInputLayout) {
        gy4 gy4 = this.a;
        if (gy4.K0 != textInputLayout.getEditText()) {
            EditText editText = gy4.K0;
            ey4 ey4 = gy4.N0;
            if (editText != null) {
                editText.removeTextChangedListener(ey4);
                if (gy4.K0.getOnFocusChangeListener() == gy4.b().e()) {
                    gy4.K0.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            gy4.K0 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(ey4);
            }
            gy4.b().m(gy4.K0);
            gy4.j(gy4.b());
        }
    }
}
