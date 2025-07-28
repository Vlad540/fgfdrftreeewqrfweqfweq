package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: az2  reason: default package */
public final class az2 {
    public static final az2 c = new az2();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, zy2 zy2, nb7 nb7, Class cls) {
        nb7 nb72 = (nb7) hashMap.get(zy2);
        if (nb72 != null && nb7 != nb72) {
            Method method = zy2.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + nb72 + ", new value " + nb7);
        } else if (nb72 == null) {
            hashMap.put(zy2, nb7);
        }
    }

    public final yy2 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            yy2 yy2 = (yy2) hashMap2.get(superclass);
            if (yy2 == null) {
                yy2 = a(superclass, (Method[]) null);
            }
            hashMap.putAll(yy2.b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            yy2 yy22 = (yy2) hashMap2.get(cls2);
            if (yy22 == null) {
                yy22 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : yy22.b.entrySet()) {
                b(hashMap, (zy2) entry.getKey(), (nb7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            lx9 lx9 = (lx9) method.getAnnotation(lx9.class);
            if (lx9 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (nc7.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                nb7 value = lx9.value();
                if (parameterTypes.length > 1) {
                    if (!nb7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == nb7.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new zy2(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        yy2 yy23 = new yy2(hashMap);
        hashMap2.put(cls, yy23);
        this.b.put(cls, Boolean.valueOf(z));
        return yy23;
    }
}
