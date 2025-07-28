package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.Continuation;

/* renamed from: bh0  reason: default package */
public abstract class bh0 implements Continuation, qu3, Serializable {
    public final Continuation a;

    public bh0(Continuation continuation) {
        this.a = continuation;
    }

    public qu3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof qu3) {
            return (qu3) continuation;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        s14 s14 = (s14) getClass().getAnnotation(s14.class);
        String str2 = null;
        if (s14 == null) {
            return null;
        }
        int v = s14.v();
        if (v <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = s14.l()[i];
            }
            duf duf = at7.Y;
            duf duf2 = at7.X;
            if (duf == null) {
                try {
                    duf duf3 = new duf((Object) Class.class.getDeclaredMethod("getModule", (Class[]) null), (Object) getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), (Object) getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
                    at7.Y = duf3;
                    duf = duf3;
                } catch (Exception unused2) {
                    at7.Y = duf2;
                    duf = duf2;
                }
            }
            if (duf != duf2) {
                Method method = (Method) duf.a;
                Object invoke = method != null ? method.invoke(getClass(), (Object[]) null) : null;
                if (invoke != null) {
                    Method method2 = (Method) duf.b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, (Object[]) null) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) duf.c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, (Object[]) null) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = s14.c();
            } else {
                str = str2 + '/' + s14.c();
            }
            return new StackTraceElement(str, s14.m(), s14.f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public Continuation n(Object obj, Continuation continuation) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: bh0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: kotlin.coroutines.Continuation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: bh0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resumeWith(java.lang.Object r3) {
        /*
            r2 = this;
        L_0x0000:
            bh0 r2 = (defpackage.bh0) r2
            kotlin.coroutines.Continuation r0 = r2.a
            java.lang.Object r3 = r2.o(r3)     // Catch:{ all -> 0x000d }
            pu3 r1 = defpackage.pu3.a     // Catch:{ all -> 0x000d }
            if (r3 != r1) goto L_0x0014
            return
        L_0x000d:
            r3 = move-exception
            kcc r1 = new kcc
            r1.<init>(r3)
            r3 = r1
        L_0x0014:
            r2.p()
            boolean r2 = r0 instanceof defpackage.bh0
            if (r2 == 0) goto L_0x001d
            r2 = r0
            goto L_0x0000
        L_0x001d:
            r0.resumeWith(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh0.resumeWith(java.lang.Object):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
