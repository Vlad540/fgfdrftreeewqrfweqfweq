package defpackage;

import java.util.Arrays;

/* renamed from: q1b  reason: default package */
public final class q1b {
    public final CharSequence a;
    public final String[] b;

    public q1b(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static q1b a() {
        return new q1b("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1b)) {
            return false;
        }
        q1b q1b = (q1b) obj;
        if (!this.a.equals(q1b.a)) {
            return false;
        }
        return Arrays.equals(this.b, q1b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreProcessedText{text=");
        sb.append(h2g.s(this.a));
        sb.append(", tokens=");
        return hr1.h(sb, this.b.length, '}');
    }
}
