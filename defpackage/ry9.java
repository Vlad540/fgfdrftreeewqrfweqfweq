package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;

/* renamed from: ry9  reason: default package */
public final class ry9 extends zv4 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final /* synthetic */ OneMeApplication b;

    public ry9(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.add(new WeakReference(activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.removeIf(new eq5(2, new wp(activity, 1)));
    }

    public final void onActivityResumed(Activity activity) {
        Object value;
        grd grd = (grd) km4.y0.n(this.b).w0;
        do {
            value = grd.getValue();
        } while (!grd.b(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }
}
