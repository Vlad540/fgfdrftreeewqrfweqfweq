package defpackage;

import java.io.Serializable;

/* renamed from: kh0  reason: default package */
public abstract class kh0 implements Serializable {
    public final long a;

    public kh0() {
        this(Long.MIN_VALUE);
    }

    public String toString() {
        return m4b.i(new StringBuilder("BaseEvent{requestId="), this.a, '}');
    }

    public kh0(long j) {
        this.a = j;
    }
}
