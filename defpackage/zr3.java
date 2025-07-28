package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: zr3  reason: default package */
public abstract class zr3 {
    public static final /* synthetic */ k77[] a;
    public static final c24 b = new c24(yr3.b, "inflate", (Class[]) Arrays.copyOf(new Class[]{ViewGroup.class}, 1));
    public static final c24 c = new c24(yr3.c, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
    public static final c24 d = new c24(yr3.o, "setNeedsAttach", (Class[]) Arrays.copyOf(new Class[]{Boolean.TYPE}, 1));

    static {
        k77 jhb = new jhb("methodInflate", "getMethodInflate()Ljava/lang/reflect/Method;");
        m7c.a.getClass();
        a = new k77[]{jhb, new jhb("methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;"), new jhb("methodSetNeedsAttach", "getMethodSetNeedsAttach()Ljava/lang/reflect/Method;")};
    }
}
