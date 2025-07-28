package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: fi5  reason: default package */
public abstract class fi5 extends tia {
    public final c c;
    public hd0 d = null;
    public final kr7 e = new kr7(10);
    public final boolean f;
    public final HashMap g;
    public a h;

    public fi5(vx5 vx5) {
        new lhd(19, (byte) 0);
        this.g = new HashMap();
        this.h = null;
        this.c = vx5;
        this.f = false;
    }

    public void a(ViewGroup viewGroup, int i, a aVar) {
        String str;
        hd0 hd0 = this.d;
        c cVar = this.c;
        if (hd0 == null) {
            cVar.getClass();
            this.d = new hd0(cVar);
        }
        HashMap hashMap = this.g;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (aVar.equals((a) hashMap.get(str))) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            boolean p0 = aVar.p0();
            kr7 kr7 = this.e;
            if (!p0) {
                kr7.e(str);
            } else {
                kr7.d(str, new ei5(str, cVar.b0(aVar)));
            }
            hashMap.remove(str);
        }
        this.d.h(aVar);
    }

    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    ei5 ei5 = (ei5) parcelable2;
                    this.e.d(ei5.a, ei5);
                }
            }
            i(bundle);
        }
    }

    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract a g(int i);

    public abstract String h(int i);

    public void i(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("f")) {
                try {
                    a H = this.c.H(str, bundle);
                    if (H != null) {
                        H.a1(false);
                        this.g.put(str.substring(1), H);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
