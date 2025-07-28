package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class FragmentManagerViewModel extends uaf {
    public static final d h = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    public FragmentManagerViewModel(boolean z) {
        this.e = z;
    }

    public final void d() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(a aVar) {
        if (!this.g) {
            HashMap hashMap = this.b;
            if (!hashMap.containsKey(aVar.Y)) {
                hashMap.put(aVar.Y, aVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.b.equals(fragmentManagerViewModel.b) && this.c.equals(fragmentManagerViewModel.c) && this.d.equals(fragmentManagerViewModel.d);
    }

    public final void f(String str, boolean z) {
        HashMap hashMap = this.c;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) hashMap.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.f((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        bbf bbf = (bbf) hashMap2.get(str);
        if (bbf != null) {
            bbf.a();
            hashMap2.remove(str);
        }
    }

    public final void g(a aVar) {
        if (!this.g && this.b.remove(aVar.Y) != null && Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
