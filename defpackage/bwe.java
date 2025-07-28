package defpackage;

import java.util.ArrayList;

/* renamed from: bwe  reason: default package */
public final /* synthetic */ class bwe implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wve b;

    public /* synthetic */ bwe(wve wve, int i) {
        this.a = i;
        this.b = wve;
    }

    public void accept(Object obj) {
        wve wve = this.b;
        switch (this.a) {
            case 0:
                udd.t("ewe", "putUploadInRepository: failed, upload=%s", new Object[]{wve, (Throwable) obj});
                return;
            default:
                m00 m00 = (m00) obj;
                m00.i = g10.X;
                fwe fwe = wve.a;
                m00.m = fwe.a;
                m00.u = fwe.b;
                m00.k = wve.e;
                m00.o = wve.f;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r2v1, types: [tu1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, pxe] */
    public Object apply(Object obj) {
        pxe pxe;
        switch (this.a) {
            case 1:
                lbe lbe = (lbe) obj;
                boolean z = lbe instanceof x8f;
                wve wve = this.b;
                if (z) {
                    ArrayList arrayList = ((x8f) lbe).c;
                    y8f y8f = (y8f) (arrayList != null ? o23.s0(arrayList) : hw4.a).get(0);
                    vve b2 = wve.b();
                    b2.d = y8f.a;
                    ? obj2 = new Object();
                    obj2.a = y8f.c;
                    obj2.b = y8f.b;
                    b2.h = new qxe(obj2);
                    return new wve(b2);
                } else if (lbe instanceof of5) {
                    pf5 pf5 = (pf5) ((of5) lbe).c.get(0);
                    vve b3 = wve.b();
                    b3.d = pf5.c;
                    ? obj3 = new Object();
                    obj3.a = pf5.b;
                    obj3.b = pf5.a;
                    b3.h = new qxe(obj3);
                    return new wve(b3);
                } else if (lbe instanceof qpa) {
                    vve b4 = wve.b();
                    b4.d = ((qpa) lbe).c;
                    return new wve(b4);
                } else if (lbe instanceof tud) {
                    vve b5 = wve.b();
                    b5.d = ((tud) lbe).c;
                    return new wve(b5);
                } else {
                    throw new RuntimeException("requestUrlSingle, can't request url for unknown media type= ".concat(sxe.s(wve.a.c)));
                }
            case 3:
                return new bt8(this.b, (osd) obj);
            default:
                yxe yxe = (yxe) obj;
                gwe gwe = new gwe();
                wve wve2 = this.b;
                fwe fwe = wve2.a;
                gwe.b = fwe.d;
                ? obj4 = new Object();
                obj4.c = fwe.a;
                obj4.a = fwe.c;
                obj4.b = fwe.b;
                gwe.a = obj4;
                gwe.c = wve2.b;
                gwe.d = wve2.c;
                gwe.e = wve2.d;
                gwe.f = wve2.e;
                gwe.g = wve2.f;
                gwe.h = wve2.g;
                qxe qxe = wve2.h;
                if (qxe == null) {
                    pxe = null;
                } else {
                    ? obj5 = new Object();
                    obj5.b = qxe.b;
                    obj5.a = qxe.a;
                    pxe = obj5;
                }
                gwe.i = pxe;
                gwe.j = wve2.i;
                yxe.getClass();
                return new y63(2, new uh(yxe, 26, gwe));
        }
    }
}
