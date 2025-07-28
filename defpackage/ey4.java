package defpackage;

import android.text.Editable;

/* renamed from: ey4  reason: default package */
public final class ey4 extends zge {
    public final /* synthetic */ gy4 a;

    public ey4(gy4 gy4) {
        this.a = gy4;
    }

    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
