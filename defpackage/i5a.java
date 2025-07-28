package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: i5a  reason: default package */
public final class i5a {
    public final Context a;
    public final w6a b;

    public i5a(Context context, w6a w6a) {
        this.a = context;
        this.b = w6a;
    }

    public final CharSequence a(String str, List list, boolean z, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            CharSequence charSequence = "";
            w6a w6a = this.b;
            if (i < length) {
                String str2 = strArr[i];
                if (str2 == null || str2.length() == 0 || !udd.J(str2, list)) {
                    i++;
                } else {
                    CharSequence e = w6a.j.e(str);
                    if (udd.J(str2.toString(), list)) {
                        String obj = str2.toString();
                        charSequence = udd.F(obj, nqc.a.r().d(obj.toString(), list), km4.y0.n(this.a).g());
                    }
                    return TextUtils.concat(new CharSequence[]{e, " ", charSequence});
                }
            } else if (!z) {
                return charSequence;
            } else {
                if (!(!(strArr.length == 0))) {
                    return charSequence;
                }
                CharSequence e2 = w6a.j.e(str);
                if (strArr.length != 0) {
                    return TextUtils.concat(new CharSequence[]{e2, " ", strArr[0]});
                }
                throw new NoSuchElementException("Array is empty.");
            }
        }
    }
}
