package defpackage;

import java.util.Map;

/* renamed from: w89  reason: default package */
public final class w89 extends lbe {
    public final Map c;

    public w89(yr yrVar) {
        this.c = yrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w89) && hhd.f(this.c, ((w89) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Response(messagesReactions=" + this.c + ")";
    }
}
