package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

public final class v {
    private static volatile v h;
    private final d a = new d();
    private final r b = new r();
    private final z c = new z();
    private final e0 d = new e0();
    private final f e = new f();
    private final k f = new k();
    private final x g = new x();

    private v() {
    }

    public static v a() {
        v vVar;
        v vVar2 = h;
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (v.class) {
            try {
                vVar = h;
                if (vVar == null) {
                    vVar = new v();
                    h = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public u a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, Context context) {
        w wVar;
        d0 d0Var;
        y yVar;
        c a2 = this.a.a(context);
        q a3 = this.b.a(context);
        e a4 = this.e.a(installedPackagesProvider, context);
        if (z) {
            yVar = null;
            d0Var = null;
            wVar = null;
        } else {
            d0Var = this.d.a(context);
            yVar = this.c.a(context);
            wVar = this.g.a(context);
        }
        return new u(a2, a3, yVar, d0Var, a4, this.f.a(context), wVar);
    }
}
