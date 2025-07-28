package defpackage;

import android.text.SpannableString;
import android.text.Spanned;

/* renamed from: bmd  reason: default package */
public final class bmd extends SpannableString {
    public static final /* synthetic */ int a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Spanned) || !hhd.f(toString(), obj.toString())) {
            return false;
        }
        Spanned spanned = (Spanned) obj;
        Class<Object> cls = Object.class;
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        Object[] spans2 = getSpans(0, length(), cls);
        if (spans2.length != spans.length) {
            return false;
        }
        int length = spans2.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = spans2[i];
            Object obj3 = spans[i];
            if (obj2 == this) {
                if (obj != obj3 || getSpanStart(obj2) != spanned.getSpanStart(obj3) || getSpanEnd(obj2) != spanned.getSpanEnd(obj3) || getSpanFlags(obj2) != spanned.getSpanFlags(obj3)) {
                    return false;
                }
            } else if (!hhd.f(obj2, obj3) || getSpanStart(obj2) != spanned.getSpanStart(obj3) || getSpanEnd(obj2) != spanned.getSpanEnd(obj3) || getSpanFlags(obj2) != spanned.getSpanFlags(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return xie.i(this);
    }
}
