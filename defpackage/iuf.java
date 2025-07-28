package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: iuf  reason: default package */
public abstract class iuf {
    public static final String a = a24.e0("WorkerFactory");

    public abstract hh7 a(Context context, String str, WorkerParameters workerParameters);

    public final hh7 b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        String str2 = a;
        hh7 a2 = a(context, str, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(hh7.class);
            } catch (Throwable th) {
                a24 B = a24.B();
                B.y(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (hh7) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    a24 B2 = a24.B();
                    B2.y(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a2 == null || !a2.isUsed()) {
            return a2;
        }
        throw new IllegalStateException(c3d.i("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
