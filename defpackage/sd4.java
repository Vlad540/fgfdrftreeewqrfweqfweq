package defpackage;

import java.util.Iterator;

/* renamed from: sd4  reason: default package */
public final /* synthetic */ class sd4 implements iy7 {
    public final /* synthetic */ td4 a;

    public /* synthetic */ sd4(td4 td4) {
        this.a = td4;
    }

    public final void q(jy7 jy7) {
        td4 td4 = this.a;
        td4.d = jy7;
        Iterator it = td4.c.iterator();
        while (it.hasNext()) {
            ((iy7) it.next()).q(jy7);
        }
    }
}
