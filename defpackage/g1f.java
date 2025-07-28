package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: g1f  reason: default package */
public abstract class g1f {
    public final yr a;
    public final yr b;
    public final yr c;

    public g1f(yr yrVar, yr yrVar2, yr yrVar3) {
        this.a = yrVar;
        this.b = yrVar2;
        this.c = yrVar3;
    }

    public abstract h1f a();

    public final Class b(Class cls) {
        String name = cls.getName();
        yr yrVar = this.c;
        Class cls2 = (Class) yrVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        yrVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        yr yrVar = this.a;
        Method method = (Method) yrVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<g1f> cls = g1f.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        yrVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        yr yrVar = this.b;
        Method method = (Method) yrVar.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, g1f.class});
        yrVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((h1f) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((h1f) this).e.readParcelable(h1f.class.getClassLoader());
    }

    public final i1f h() {
        String readString = ((h1f) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (i1f) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((h1f) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((h1f) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(i1f i1f) {
        if (i1f == null) {
            ((h1f) this).e.writeString((String) null);
            return;
        }
        try {
            ((h1f) this).e.writeString(b(i1f.getClass()).getName());
            h1f a2 = a();
            try {
                d(i1f.getClass()).invoke((Object) null, new Object[]{i1f, a2});
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(i1f.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
