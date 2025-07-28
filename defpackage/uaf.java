package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: uaf  reason: default package */
public abstract class uaf {
    public final jr3 a = new jr3();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        jr3 jr3 = this.a;
        if (jr3 == null) {
            return;
        }
        if (jr3.a) {
            jr3.b(autoCloseable);
            return;
        }
        synchronized (((jk9) jr3.b)) {
            autoCloseable2 = (AutoCloseable) ((LinkedHashMap) jr3.c).put(str, autoCloseable);
        }
        jr3.b(autoCloseable2);
    }

    public final void b() {
        jr3 jr3 = this.a;
        if (jr3 != null && !jr3.a) {
            jr3.a = true;
            synchronized (((jk9) jr3.b)) {
                try {
                    for (AutoCloseable b : ((LinkedHashMap) jr3.c).values()) {
                        jr3.b(b);
                    }
                    for (AutoCloseable b2 : (LinkedHashSet) jr3.d) {
                        jr3.b(b2);
                    }
                    ((LinkedHashSet) jr3.d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        jr3 jr3 = this.a;
        if (jr3 == null) {
            return null;
        }
        synchronized (((jk9) jr3.b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) jr3.c).get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
