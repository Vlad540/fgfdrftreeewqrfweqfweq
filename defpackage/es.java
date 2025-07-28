package defpackage;

import android.view.Menu;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: es  reason: default package */
public final class es implements dyc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ es(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new u1(2, (Object[]) this.b);
            case 1:
                return new u1(1, (float[]) this.b);
            case 2:
                return ((Iterable) this.b).iterator();
            case 3:
                return new gp4(this);
            case 4:
                return new jd7(this);
            case 5:
                return new u1(3, (Menu) this.b);
            case 6:
                return r1g.r((i26) this.b);
            case 7:
                return (Iterator) this.b;
            default:
                return new u1(4, (ViewGroup) this.b);
        }
    }
}
