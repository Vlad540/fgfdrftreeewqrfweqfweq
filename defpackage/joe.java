package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: joe  reason: default package */
public abstract class joe {
    public static final AtomicReference a = new AtomicReference();

    public static final void a(Context context) {
        String string;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            AtomicReference atomicReference = a;
            do {
                Boolean bool = null;
                if (atomicReference.compareAndSet((Object) null, applicationContext)) {
                    String packageName = context.getPackageName();
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("tracer_is_disabled", "bool", packageName);
                    if (identifier != 0) {
                        bool = Boolean.valueOf(resources.getBoolean(identifier));
                    }
                    if (bool != null ? bool.booleanValue() : false) {
                        nne.b = true;
                        return;
                    }
                    PackageManager packageManager = applicationContext.getPackageManager();
                    String packageName2 = applicationContext.getPackageName();
                    Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? f4.b(packageManager, packageName2, f4.d((long) 128)) : packageManager.getApplicationInfo(packageName2, 128)).metaData;
                    ArrayList arrayList = new ArrayList();
                    for (String next : bundle.keySet()) {
                        if (p0e.Q(next, "ru.ok.tracer.startup.Initializer@", false) && (string = bundle.getString(next)) != null) {
                            arrayList.add(Class.forName(string));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b(arrayList2, (Class) it.next());
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((sw6) it2.next()).b(applicationContext);
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == null);
            if (applicationContext != a.get()) {
                throw new IllegalStateException("Trying to initialize again with different app context".toString());
            }
            return;
        }
        throw new IllegalArgumentException("applicationContext required".toString());
    }

    public static void b(ArrayList arrayList, Class cls) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((sw6) it.next()).getClass() == cls) {
                    return;
                }
            }
        }
        sw6 sw6 = (sw6) cls.newInstance();
        for (Class b : sw6.a()) {
            b(arrayList, b);
        }
        arrayList.add(sw6);
    }
}
