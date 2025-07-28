package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w84  reason: default package */
public class w84 extends k6c {
    public static TimeInterpolator s;
    public boolean g = true;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    public w84() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120;
        this.d = 120;
        this.e = 250;
        this.f = 250;
    }

    public static void h(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((b7c) list.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [u84, java.lang.Object] */
    public final boolean a(b7c b7c, b7c b7c2, ms msVar, ms msVar2) {
        int i2;
        int i3;
        int i4 = msVar.b;
        int i5 = msVar.c;
        if (b7c2.w()) {
            int i6 = msVar.b;
            i2 = msVar.c;
            i3 = i6;
        } else {
            i3 = msVar2.b;
            i2 = msVar2.c;
        }
        if (b7c == b7c2) {
            return g(b7c, i4, i5, i3, i2);
        }
        View view = b7c.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m(b7c);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m(b7c2);
        View view2 = b7c2.a;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ? obj = new Object();
        obj.a = b7c;
        obj.b = b7c2;
        obj.c = i4;
        obj.d = i5;
        obj.e = i3;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(b7c b7c) {
        View view = b7c.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((v84) arrayList.get(size)).a == b7c) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b7c);
                arrayList.remove(size);
            }
        }
        j(this.k, b7c);
        if (this.h.remove(b7c)) {
            view.setAlpha(1.0f);
            l();
            c(b7c);
        }
        if (this.i.remove(b7c)) {
            view.setAlpha(1.0f);
            c(b7c);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, b7c);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((v84) arrayList5.get(size4)).a == b7c) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b7c);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b7c)) {
                view.setAlpha(1.0f);
                c(b7c);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(b7c);
        this.o.remove(b7c);
        this.r.remove(b7c);
        this.p.remove(b7c);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v84 v84 = (v84) arrayList.get(size);
            View view = v84.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(v84.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            l();
            c((b7c) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b7c b7c = (b7c) arrayList3.get(size3);
            b7c.a.setAlpha(1.0f);
            c(b7c);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            u84 u84 = (u84) arrayList4.get(size4);
            b7c b7c2 = u84.a;
            if (b7c2 != null) {
                k(u84, b7c2);
            }
            b7c b7c3 = u84.b;
            if (b7c3 != null) {
                k(u84, b7c3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    v84 v842 = (v84) arrayList6.get(size6);
                    View view2 = v842.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(v842.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    b7c b7c4 = (b7c) arrayList8.get(size8);
                    b7c4.a.setAlpha(1.0f);
                    c(b7c4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    u84 u842 = (u84) arrayList10.get(size10);
                    b7c b7c5 = u842.a;
                    if (b7c5 != null) {
                        k(u842, b7c5);
                    }
                    b7c b7c6 = u842.b;
                    if (b7c6 != null) {
                        k(u842, b7c6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                hr1.r(arrayList11.get(0));
                throw null;
            }
        }
    }

    public final boolean f() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [v84, java.lang.Object] */
    public final boolean g(b7c b7c, int i2, int i3, int i4, int i5) {
        View view = b7c.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) b7c.a.getTranslationY());
        m(b7c);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(b7c);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.j;
        ? obj = new Object();
        obj.a = b7c;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                hr1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(ArrayList arrayList, b7c b7c) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u84 u84 = (u84) arrayList.get(size);
            if (k(u84, b7c) && u84.a == null && u84.b == null) {
                arrayList.remove(u84);
            }
        }
    }

    public final boolean k(u84 u84, b7c b7c) {
        if (u84.b == b7c) {
            u84.b = null;
        } else if (u84.a != b7c) {
            return false;
        } else {
            u84.a = null;
        }
        b7c.a.setAlpha(1.0f);
        View view = b7c.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(b7c);
        return true;
    }

    public void l() {
    }

    public final void m(b7c b7c) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b7c.a.animate().setInterpolator(s);
        d(b7c);
    }
}
