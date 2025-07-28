package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l5e  reason: default package */
public abstract class l5e extends er3 implements v26 {
    public final int o;

    public l5e(int i, Continuation continuation) {
        super(continuation);
        this.o = i;
    }

    public final int getArity() {
        return this.o;
    }

    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        m7c.a.getClass();
        return n7c.a(this);
    }
}
