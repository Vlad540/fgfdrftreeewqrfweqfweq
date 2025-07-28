package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ji0  reason: default package */
public class ji0 implements z4b {
    public static final ht6 B0;
    public static final Object C0 = new Object();
    public final hr6 A0;
    public final sr6 X;
    public final HashMap Y;
    public boolean Z;
    public final tr6 a;
    public final String b;
    public final c5b c;
    public final Object o;
    public u3b w0;
    public boolean x0;
    public boolean y0;
    public final ArrayList z0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet, ht6] */
    static {
        String[] strArr = {HasExtraData.KEY_ID, HasExtraData.KEY_URI_SOURCE};
        int i = ht6.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        B0 = new HashSet(hashSet);
    }

    public ji0(tr6 tr6, String str, String str2, wz6 wz6, Object obj, sr6 sr6, boolean z, boolean z2, u3b u3b, hr6 hr6) {
        this.a = tr6;
        this.b = str;
        HashMap hashMap = new HashMap();
        this.Y = hashMap;
        hashMap.put(HasExtraData.KEY_ID, str);
        hashMap.put(HasExtraData.KEY_URI_SOURCE, tr6 == null ? "null-request" : tr6.b);
        this.c = wz6;
        this.o = obj == null ? C0 : obj;
        this.X = sr6;
        this.Z = z;
        this.w0 = u3b;
        this.x0 = z2;
        this.y0 = false;
        this.z0 = new ArrayList();
        this.A0 = hr6;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ki0) it.next()).b();
            }
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ki0) it.next()).c();
            }
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ki0) it.next()).d();
            }
        }
    }

    public final void a(ki0 ki0) {
        boolean z;
        synchronized (this) {
            this.z0.add(ki0);
            z = this.y0;
        }
        if (z) {
            ki0.a();
        }
    }

    public final void e() {
        ArrayList<ki0> arrayList;
        synchronized (this) {
            if (this.y0) {
                arrayList = null;
            } else {
                this.y0 = true;
                ArrayList arrayList2 = new ArrayList(this.z0);
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (ki0 a2 : arrayList) {
                a2.a();
            }
        }
    }

    public final synchronized boolean f() {
        return this.x0;
    }

    public final synchronized boolean g() {
        return this.Z;
    }

    public final Object getExtra(String str) {
        return this.Y.get(str);
    }

    public final Map getExtras() {
        return this.Y;
    }

    public final void h(String str, String str2) {
        HashMap hashMap = this.Y;
        hashMap.put(HasExtraData.KEY_ORIGIN, str);
        hashMap.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    public final synchronized ArrayList i(u3b u3b) {
        if (u3b == this.w0) {
            return null;
        }
        this.w0 = u3b;
        return new ArrayList(this.z0);
    }

    public final void putExtra(String str, Object obj) {
        if (!B0.contains(str)) {
            this.Y.put(str, obj);
        }
    }

    public final void putExtras(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                putExtra((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.Y.get(str);
        return obj2 == null ? obj : obj2;
    }
}
