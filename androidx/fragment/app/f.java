package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class f {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(a aVar) {
        if (!this.a.contains(aVar)) {
            synchronized (this.a) {
                this.a.add(aVar);
            }
            aVar.A0 = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + aVar);
    }

    public final a b(String str) {
        e eVar = (e) this.b.get(str);
        if (eVar != null) {
            return eVar.c;
        }
        return null;
    }

    public final a c(String str) {
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                a aVar = eVar.c;
                if (!str.equals(aVar.Y)) {
                    aVar = aVar.L0.c.c(str);
                }
                if (aVar != null) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar.c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(e eVar) {
        a aVar = eVar.c;
        String str = aVar.Y;
        HashMap hashMap = this.b;
        if (hashMap.get(str) == null) {
            hashMap.put(aVar.Y, eVar);
            if (aVar.T0) {
                if (aVar.S0) {
                    this.d.e(aVar);
                } else {
                    this.d.g(aVar);
                }
                aVar.T0 = false;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                aVar.toString();
            }
        }
    }

    public final void h(e eVar) {
        a aVar = eVar.c;
        if (aVar.S0) {
            this.d.g(aVar);
        }
        HashMap hashMap = this.b;
        if (hashMap.get(aVar.Y) == eVar && ((e) hashMap.put(aVar.Y, (Object) null)) != null && Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap hashMap = this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
