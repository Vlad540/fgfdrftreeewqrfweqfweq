package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: r8  reason: default package */
public final class r8 implements u16 {
    public static final r8 a = new Object();

    public final Object invoke(Object obj) {
        return String.valueOf(((WeakReference) obj).get());
    }
}
