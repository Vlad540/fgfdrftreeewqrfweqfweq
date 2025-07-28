package defpackage;

import java.util.List;

/* renamed from: w04  reason: default package */
public final class w04 extends urd {
    public static final w04 k = new w04(0);
    public static final w04 l = new w04(1);
    public static final w04 m = new w04(2);
    public static final w04 n = new w04(3);
    public final /* synthetic */ int j;

    public /* synthetic */ w04(int i) {
        this.j = i;
    }

    public final boolean c(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((v04) obj).equals((v04) obj2);
            case 1:
                return ((i56) obj).equals((i56) obj2);
            case 2:
                return ((zie) obj).equals((zie) obj2);
            case 3:
                return ((qwc) obj).equals((qwc) obj2);
            case 4:
                return ((k68) obj).equals((k68) obj2);
            case 5:
                return ((un3) obj).equals((un3) obj2);
            case 6:
                sz9 sz9 = (sz9) obj;
                sz9 sz92 = (sz9) obj2;
                return hhd.f(sz9.a, sz92.a) && hhd.f(sz9.d, sz92.d) && p0e.J(sz9.b, sz92.b);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case 8:
                nrc nrc = (nrc) obj;
                nrc nrc2 = (nrc) obj2;
                if (!new bs(nrc.b).equals(new bs(nrc2.b))) {
                    return false;
                }
                return nrc.k(nrc2);
            default:
                return ((pg7) obj).t((pg7) obj2);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((v04) obj).a == ((v04) obj2).a;
            case 1:
                return hhd.f(((i56) obj).a(), ((i56) obj2).a());
            case 2:
                return ((zie) obj).a == ((zie) obj2).a;
            case 3:
                return ((qwc) obj).a.a == ((qwc) obj2).a.a;
            case 4:
                return ((k68) obj).g((k68) obj2);
            case 5:
                return ((un3) obj).a == ((un3) obj2).a;
            case 6:
                return hhd.f(((sz9) obj).a, ((sz9) obj2).a);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case 8:
                nrc nrc = (nrc) obj;
                nrc nrc2 = (nrc) obj2;
                if (nrc.a != nrc2.a) {
                    return false;
                }
                return nrc.m(nrc2);
            default:
                return ((pg7) obj).g((pg7) obj2);
        }
    }

    public Object s(Object obj, Object obj2) {
        switch (this.j) {
            case 9:
                return ((pg7) obj).n((pg7) obj2);
            default:
                return w04.super.s(obj, obj2);
        }
    }
}
