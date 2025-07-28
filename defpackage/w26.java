package defpackage;

/* renamed from: w26  reason: default package */
public abstract class w26 extends mn1 implements v26, y67 {
    private final int arity;
    private final int flags;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w26(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    public v67 computeReflected() {
        m7c.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w26) {
            w26 w26 = (w26) obj;
            return getName().equals(w26.getName()) && getSignature().equals(w26.getSignature()) && this.flags == w26.flags && this.arity == w26.arity && hhd.f(getBoundReceiver(), w26.getBoundReceiver()) && hhd.f(getOwner(), w26.getOwner());
        } else if (obj instanceof y67) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        v67 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public y67 getReflected() {
        v67 compute = compute();
        if (compute != this) {
            return (y67) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
