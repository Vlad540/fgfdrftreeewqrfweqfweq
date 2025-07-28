package defpackage;

import java.util.Objects;

/* renamed from: an5  reason: default package */
public abstract class an5 implements bjb {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static an5 a(Object... objArr) {
        if (objArr.length == 0) {
            return jn5.b;
        }
        if (objArr.length != 1) {
            return new kn5(1, objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "item is null");
        return new wn5(obj);
    }

    public final void d(ko5 ko5) {
        Objects.requireNonNull(ko5, "subscriber is null");
        try {
            g(ko5);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void f(b1e b1e) {
        if (b1e instanceof ko5) {
            d((ko5) b1e);
            return;
        }
        Objects.requireNonNull(b1e, "subscriber is null");
        d(new vzd(b1e));
    }

    public abstract void g(b1e b1e);
}
