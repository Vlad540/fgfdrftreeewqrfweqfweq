package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.obfuscated.o0;
import me.leolin.shortcutbadger.BuildConfig;

public abstract class g0 {
    public static void a(z0 z0Var, t tVar, Context context) {
        h.a((Runnable) new ncd(context, z0Var, tVar, 17));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, z0 z0Var, t tVar) {
        String str;
        String str2;
        char c;
        z0 z0Var2;
        long j;
        Context context2;
        t tVar2 = tVar;
        PackageInfo a = o.a(context);
        if (a != null) {
            str2 = Long.toString(a.getLongVersionCode());
            str = a.versionName;
        } else {
            str2 = BuildConfig.FLAVOR;
            str = str2;
        }
        p0 a2 = p0.a(context);
        String a3 = a2.a();
        String g = z0Var.g();
        if (!g.equals(a2.b())) {
            y0.a("InstallHandler: tracking install");
            if (a != null) {
                j = x0.b(a.firstInstallTime);
                context2 = context;
                z0Var2 = z0Var;
            } else {
                context2 = context;
                z0Var2 = z0Var;
                j = 0;
            }
            o0 a4 = o0.a(tVar2, z0Var2, context2);
            o0.a a5 = a4.a();
            tVar2.a(j, o.b(context), a5);
            if (a5 == null) {
                a4.c();
            }
            a2.e(g);
            c = 1;
        } else {
            Context context3 = context;
            z0 z0Var3 = z0Var;
            if (!str2.equals(a3)) {
                if (a3.isEmpty()) {
                    y0.a("InstallHandler: tracking update");
                } else {
                    y0.a("InstallHandler: tracking update from" + a3 + " to " + str2);
                }
                tVar.a(a2.e(), a3, str, str2, o.b(context));
                c = 2;
            } else {
                c = 0;
            }
        }
        long i = a2.i();
        long a6 = x0.a();
        String a7 = z0Var.a();
        if (!TextUtils.isEmpty(a7)) {
            if (a6 - i < 604800 || i == 0) {
                y0.a("InstallHandler: tracking apkPreinstallParams");
                tVar2.b(a7);
            } else {
                y0.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            y0.a("InstallHandler: no install/update");
            return;
        }
        if (c == 1) {
            a2.a(a6);
        }
        a2.d(str2);
        a2.g(str);
        a2.b(a6);
    }
}
