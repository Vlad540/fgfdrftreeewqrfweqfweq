package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: jmd  reason: default package */
public final class jmd {
    public int a;
    public int b;
    public final a c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i = true;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;

    public jmd(int i2, int i3, e eVar) {
        a aVar = eVar.c;
        this.a = i2;
        this.b = i3;
        this.c = aVar;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = eVar;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (!this.e) {
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (imd imd : o23.s0(this.k)) {
                if (!imd.b) {
                    imd.a(viewGroup);
                }
                imd.b = true;
            }
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.C0 = false;
        this.l.k();
    }

    public final void c(imd imd) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(imd) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        int t = hr1.t(i3);
        a aVar = this.c;
        if (t != 0) {
            if (t != 1) {
                if (t == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar);
                    }
                    this.a = 1;
                    this.b = 3;
                    this.i = true;
                }
            } else if (this.a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(aVar);
                }
                this.a = 2;
                this.b = 2;
                this.i = true;
            }
        } else if (this.a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
                if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4)) {
                    throw null;
                }
            }
            this.a = i2;
        }
    }

    public final String toString() {
        StringBuilder m = hr1.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i2 = this.a;
        m.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        m.append(" lifecycleImpact = ");
        int i3 = this.b;
        m.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        m.append(" fragment = ");
        m.append(this.c);
        m.append('}');
        return m.toString();
    }
}
