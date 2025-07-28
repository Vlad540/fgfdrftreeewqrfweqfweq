package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: rm  reason: default package */
public abstract class rm {
    public static Boolean X = null;
    public static boolean Y = false;
    public static final bs Z = new bs(0);
    public static final qm a = new qm(new mh4(4));
    public static final int b = -100;
    public static xl7 c = null;
    public static xl7 o = null;
    public static final Object w0 = new Object();
    public static final Object x0 = new Object();

    public static boolean b(Context context) {
        if (X == null) {
            try {
                int i = bp.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, bp.class), ap.a() | 128).metaData;
                if (bundle != null) {
                    X = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                X = Boolean.FALSE;
            }
        }
        return X.booleanValue();
    }

    public static void f(rm rmVar) {
        synchronized (w0) {
            try {
                bs bsVar = Z;
                bsVar.getClass();
                ur urVar = new ur(bsVar);
                while (urVar.hasNext()) {
                    rm rmVar2 = (rm) ((WeakReference) urVar.next()).get();
                    if (rmVar2 == rmVar || rmVar2 == null) {
                        urVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
