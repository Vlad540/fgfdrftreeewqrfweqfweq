package defpackage;

/* renamed from: m7c  reason: default package */
public abstract class m7c {
    public static final n7c a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: n7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: n7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: n7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: n7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: n7c} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            n7c r1 = (defpackage.n7c) r1     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            n7c r0 = new n7c
            r0.<init>()
        L_0x0016:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7c.<clinit>():void");
    }

    public static xy2 a(Class cls) {
        a.getClass();
        return new xy2(cls);
    }
}
