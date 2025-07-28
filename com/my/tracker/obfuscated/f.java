package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class f {
    private static final e a = new e(Collections.EMPTY_LIST);

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).a);
        }
        return TextUtils.join(",", arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new e.a(applicationInfo.packageName, x0.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public e a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> list;
        if (installedPackagesProvider == null) {
            return a;
        }
        try {
            list = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            y0.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return a;
        }
        List b = b(list);
        if (b.isEmpty()) {
            return a;
        }
        String a2 = a(b);
        String f = p0.a(context).f();
        String a3 = s.a(a2);
        if (f.equals(a3)) {
            y0.a("AppsDataProvider: Apps hash did not changed");
            return a;
        }
        y0.a("AppsDataProvider: Apps hash changed");
        p0.a(context).h(a3);
        return new e(b);
    }
}
