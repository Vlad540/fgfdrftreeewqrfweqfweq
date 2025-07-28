package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: icc  reason: default package */
public abstract class icc extends hcc implements v26 {
    public final int b;

    public icc(int i, Continuation continuation) {
        super(continuation);
        this.b = i;
    }

    public final int getArity() {
        return this.b;
    }

    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        m7c.a.getClass();
        return n7c.a(this);
    }
}
