package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: w7a  reason: default package */
public final /* synthetic */ class w7a implements InputFilter {
    public final /* synthetic */ y7a a;

    public /* synthetic */ w7a(y7a y7a) {
        this.a = y7a;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return this.a.o.a(charSequence) ? charSequence : "";
    }
}
