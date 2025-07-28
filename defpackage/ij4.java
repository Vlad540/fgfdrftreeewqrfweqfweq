package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: ij4  reason: default package */
public final class ij4 implements dyc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ij4(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new hj4(((dyc) this.c).iterator(), (u16) this.b);
            case 1:
                return new v66(this, (byte) 0);
            case 2:
                return new wm8(this);
            case 3:
                ArrayList arrayList = new ArrayList();
                myc.T((dyc) this.c, arrayList);
                t23.J(arrayList, (Comparator) this.b);
                return arrayList.iterator();
            default:
                return new v66(this);
        }
    }
}
