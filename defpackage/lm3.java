package defpackage;

import java.io.Serializable;

/* renamed from: lm3  reason: default package */
public final class lm3 implements Serializable {
    public final String a;
    public final String b;

    public lm3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactNameWrapper{name=");
        sb.append(this.a);
        sb.append(", lastName=");
        return wn6.l(sb, this.b, "}");
    }
}
