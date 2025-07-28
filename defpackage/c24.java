package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: c24  reason: default package */
public final class c24 implements n0c {
    public static final Object X = new Object();
    public final s16 a;
    public final String b;
    public final Class[] c;
    public volatile Object o;

    public c24(s16 s16, String str, Class... clsArr) {
        this.a = s16;
        this.b = str;
        this.c = clsArr;
        this.o = X;
    }

    public final Object T0(Object obj, k77 k77) {
        Method method;
        if (this.o == X) {
            try {
                String str = this.b;
                Class[] clsArr = this.c;
                method = ((Class) this.a.invoke()).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                method.setAccessible(true);
            } catch (Exception unused) {
                method = null;
            }
            this.o = method;
        }
        return (Method) this.o;
    }

    public /* synthetic */ c24(oh2 oh2, String str) {
        this(oh2, str, new Class[0]);
    }
}
