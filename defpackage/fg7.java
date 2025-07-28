package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: fg7  reason: default package */
public final class fg7 {
    public final String a;
    public final boolean b;

    public fg7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fg7)) {
            return false;
        }
        fg7 fg7 = (fg7) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fg7.a)) {
            return false;
        }
        boolean z = this.b;
        String str2 = fg7.a;
        if (z) {
            return str.equals(str2);
        }
        Pattern pattern = ehe.a;
        return str.length() == str2.length() && str2.regionMatches(true, 0, str, 0, str.length());
    }
}
