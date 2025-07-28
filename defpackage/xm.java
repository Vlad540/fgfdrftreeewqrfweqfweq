package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: xm  reason: default package */
public abstract class xm {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, dn dnVar) {
        Objects.requireNonNull(dnVar);
        wm wmVar = new wm(0, dnVar);
        f4.n(obj).registerOnBackInvokedCallback(1000000, wmVar);
        return wmVar;
    }

    public static void c(Object obj, Object obj2) {
        f4.n(obj).unregisterOnBackInvokedCallback(f4.j(obj2));
    }
}
