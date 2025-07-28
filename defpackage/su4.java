package defpackage;

import android.text.TextUtils;

/* renamed from: su4  reason: default package */
public final class su4 implements ru4 {
    public final String a;

    public /* synthetic */ su4(String str) {
        this.a = str;
    }

    public Object h() {
        return this;
    }

    public boolean n(CharSequence charSequence, int i, int i2, hte hte) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        hte.c = (hte.c & 3) | 4;
        return false;
    }
}
