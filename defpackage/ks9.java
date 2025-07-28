package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* renamed from: ks9  reason: default package */
public final class ks9 extends bzf implements un6 {
    public final Object d;

    public ks9(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.d = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [vyf, un6] */
    public static un6 K0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof un6 ? (un6) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object L0(un6 un6) {
        if (un6 instanceof ks9) {
            return ((ks9) un6).d;
        }
        IBinder asBinder = un6.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            a24.o(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(wn6.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
    }
}
