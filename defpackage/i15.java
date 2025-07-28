package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i15  reason: default package */
public abstract class i15 {
    public static final h15 a = new Throwable("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (true) {
                if (atomicReference.compareAndSet(th2, compositeException)) {
                    return true;
                }
                if (atomicReference.get() != th2) {
                }
            }
        }
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw b(str);
        }
    }

    public static Throwable d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        h15 h15 = a;
        return th != h15 ? (Throwable) atomicReference.getAndSet(h15) : th;
    }

    public static String e(long j, TimeUnit timeUnit) {
        StringBuilder k = hr1.k(j, "The source did not signal an event for ", " ");
        k.append(timeUnit.toString().toLowerCase());
        k.append(" and has been terminated.");
        return k.toString();
    }

    public static RuntimeException f(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
