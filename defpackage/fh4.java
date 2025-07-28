package defpackage;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: fh4  reason: default package */
public final class fh4 implements xr0 {
    public static final /* synthetic */ k77[] c;
    public final c24 a = new c24(new oh2(3, "sun.nio.ch.DirectBuffer"), "cleaner");
    public final c24 b = new c24(new oh2(3, "sun.misc.Cleaner"), "clean");

    static {
        Class<fh4> cls = fh4.class;
        c = new k77[]{new khb(cls, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), wn6.e(m7c.a, cls, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    }

    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public final void b(ByteBuffer byteBuffer) {
        Object invoke;
        k77[] k77Arr = c;
        Method method = (Method) this.a.T0(this, k77Arr[0]);
        if (method != null && (invoke = method.invoke(byteBuffer, (Object[]) null)) != null) {
            Method method2 = (Method) this.b.T0(this, k77Arr[1]);
            if (method2 != null) {
                method2.invoke(invoke, (Object[]) null);
            }
        }
    }
}
