package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* renamed from: yaf  reason: default package */
public final class yaf extends abf {
    public static yaf c;
    public static final bqc d = new Object();
    public final Application b;

    public yaf(Application application) {
        this.b = application;
    }

    public static uaf d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return pa2.h(cls);
        }
        try {
            return (uaf) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public final uaf a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final uaf b(Class cls, pb9 pb9) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) pb9.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return pa2.h(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
