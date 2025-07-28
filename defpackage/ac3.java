package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: ac3  reason: default package */
public final /* synthetic */ class ac3 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ ac3(int i) {
        this.a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                return bc3.b.a(charSequence) ? charSequence : "";
            default:
                k77[] k77Arr = jq8.U0;
                return "";
        }
    }
}
