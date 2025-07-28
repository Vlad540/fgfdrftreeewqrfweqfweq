package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* renamed from: bve  reason: default package */
public class bve {
    public final String a;
    public final jk9 b = oyb.h;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public bve(String str) {
        this.a = str;
    }

    public hnc a() {
        jk9 jk9 = this.b;
        boolean z = false;
        String str = this.a;
        if (jk9 != null) {
            try {
                if (hr1.b(2, 2) >= 0) {
                    jk9.j(jk9, "Start initialization of scope \"" + str + '\"');
                }
            } catch (Exception e2) {
                throw new ScopeInitializationException(str, e2);
            }
        }
        ArrayList arrayList = this.h;
        if (!(!arrayList.isEmpty())) {
            hnc hnc = new hnc(this.a, this.c, this.d, this.e, this.f, this.g);
            if (jk9 != null) {
                if (hr1.b(2, 2) >= 0) {
                    z = true;
                }
                if (z) {
                    jk9.j(jk9, "Finish initialization of \"" + str + '\"');
                }
            }
            return hnc;
        }
        throw new IllegalOverridesException(str, arrayList);
    }

    public /* bridge */ void b(Class cls, wy6 wy6) {
        c(cls, wy6);
    }

    public void c(Class cls, wy6 wy6) {
        HashMap hashMap = this.e;
        Object obj = hashMap.get(cls);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(cls, obj);
        }
        ((List) obj).add(wy6);
    }

    public /* bridge */ void d(Class cls, wy6 wy6) {
        e(cls, wy6);
    }

    public void e(Class cls, wy6 wy6) {
        if (this.d.put(cls, wy6) != null) {
            this.h.add(cls);
        }
    }
}
