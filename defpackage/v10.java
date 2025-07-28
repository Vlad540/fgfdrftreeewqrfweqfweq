package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: v10  reason: default package */
public final class v10 extends fi5 {
    public final c i;
    public final ArrayList j = new ArrayList();
    public final List k;
    public final Context l;
    public final boolean m;
    public final boolean n;
    public final HashMap o = new HashMap();
    public String p;
    public String q;

    public v10(vx5 vx5, List list, Context context, boolean z, boolean z2) {
        super(vx5);
        this.i = vx5;
        this.k = list;
        this.l = context;
        this.m = z;
        this.n = z2;
    }

    public final void a(ViewGroup viewGroup, int i2, a aVar) {
        super.a(viewGroup, i2, aVar);
        yia l2 = l(i2);
        if (l2 != null) {
            this.o.remove(((o10) l2.a).q);
        }
    }

    public final int b() {
        return this.j.size();
    }

    public final int c(a aVar) {
        int indexOf;
        if (!(aVar instanceof FrgAttachView) || (indexOf = this.j.indexOf(((FrgAttachView) aVar).H1.q)) == -1) {
            return -2;
        }
        return indexOf;
    }

    public final a g(int i2) {
        a aVar;
        String str;
        yia l2 = l(i2);
        Object obj = l2.a;
        o10 o10 = (o10) obj;
        boolean z = o10.s;
        j10 j10 = j10.c;
        Object obj2 = l2.b;
        if (z || (o10.a != j10 && !ete.J(o10))) {
            o10 o102 = (o10) obj;
            boolean z2 = o102.s;
            j10 j102 = j10.o;
            if (z2 || (o102.a != j102 && !ete.L(o102))) {
                if (o102.s) {
                    vl vlVar = vl.o;
                    int i3 = che.a;
                    j10 j103 = o102.a;
                    str = j103 == j102 ? vlVar.getString(cic.T) : j103 == j10 ? vlVar.getString(cic.S) : vlVar.getString(cic.R);
                } else {
                    str = this.l.getString(cic.d3);
                }
                a frgAttachUnknown = new FrgAttachUnknown();
                Bundle t1 = FrgAttachView.t1(o102, (xm8) obj2, false, false, false);
                t1.putString("ru.ok.tamtam.extra.TEXT", str);
                frgAttachUnknown.Y0(t1);
                aVar = frgAttachUnknown;
            } else {
                boolean equals = TextUtils.equals(o102.q, this.q);
                if (equals) {
                    this.q = null;
                }
                Bundle t12 = FrgAttachView.t1(o102, (xm8) obj2, false, o102.q.equals(this.p), false);
                t12.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", equals);
                aVar = new FrgAttachVideo();
                aVar.Y0(t12);
            }
        } else {
            o10 o103 = (o10) obj;
            boolean equals2 = o103.q.equals(this.p);
            Bundle t13 = FrgAttachView.t1(o103, (xm8) obj2, false, equals2, equals2 && this.m);
            aVar = new FrgAttachPhoto();
            aVar.Y0(t13);
        }
        aVar.Z.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", this.n);
        this.o.put(((o10) obj).q, new WeakReference(aVar));
        return aVar;
    }

    public final String h(int i2) {
        return (String) this.j.get(i2);
    }

    public final void i(Bundle bundle) {
        Bundle bundle2;
        o10 a;
        super.i(bundle);
        for (String str : bundle.keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith("f")) {
                FrgAttachView H = this.i.H(str, bundle);
                if (!(!(H instanceof FrgAttachView) || (bundle2 = H.Z) == null || (a = fu7.a(bundle2.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"))) == null)) {
                    this.o.put(a.q, new WeakReference(H));
                }
            }
        }
    }

    public final void j(List list, boolean z) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((xm8) list.get(i2)).a.D0.v();
        }
        List<xm8> list2 = this.k;
        if (z) {
            list2.addAll(list);
        } else {
            list2.addAll(0, list);
        }
        ArrayList arrayList = this.j;
        arrayList.clear();
        for (xm8 xm8 : list2) {
            for (int i3 = 0; i3 < xm8.a.D0.v(); i3++) {
                arrayList.add(xm8.a.D0.u(i3).q);
            }
        }
    }

    public final FrgAttachView k(String str) {
        WeakReference weakReference = (WeakReference) this.o.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (FrgAttachView) weakReference.get();
    }

    public final yia l(int i2) {
        int i3 = 0;
        for (xm8 xm8 : this.k) {
            if (xm8 != null) {
                vo8 vo8 = xm8.a;
                if (!vo8.m()) {
                    continue;
                } else {
                    for (int i4 = 0; i4 < vo8.D0.v(); i4++) {
                        o10 u = vo8.D0.u(i4);
                        if (i3 == i2) {
                            if (u.g()) {
                                f10 f10 = u.g;
                                if (f10.a()) {
                                    u = f10.g;
                                }
                            }
                            return new yia(u, xm8);
                        }
                        i3++;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
