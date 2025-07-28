package defpackage;

/* renamed from: wt8  reason: default package */
public final class wt8 implements au8 {
    public final jv5 a;

    public wt8(jv5 jv5) {
        this.a = jv5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt8) && hhd.f(this.a, ((wt8) obj).a);
    }

    public final int hashCode() {
        jv5 jv5 = this.a;
        if (jv5 == null) {
            return 0;
        }
        return jv5.hashCode();
    }

    public final String toString() {
        return "OnMessageSend(forwardMessagesSendData=" + this.a + ")";
    }
}
