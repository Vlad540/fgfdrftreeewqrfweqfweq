package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blc  reason: default package */
public abstract class blc {
    public static final List a;
    public static final List b;

    static {
        Class<tkc> cls = tkc.class;
        a = p23.B(Application.class, cls);
        b = Collections.singletonList(cls);
    }

    public static final Constructor a(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            List g0 = cs.g0(constructor.getParameterTypes());
            if (list.equals(g0)) {
                return constructor;
            }
            if (list.size() != g0.size() || !g0.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final uaf b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (uaf) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
