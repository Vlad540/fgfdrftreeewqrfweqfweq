package defpackage;

/* renamed from: jx8  reason: default package */
public final class jx8 implements mx8 {
    public final String a;

    public jx8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx8) && hhd.f(this.a, ((jx8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ProcessBotCommand(botCommand="), this.a, ")");
    }
}
