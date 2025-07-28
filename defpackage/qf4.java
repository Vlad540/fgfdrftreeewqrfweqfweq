package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: qf4  reason: default package */
public final /* synthetic */ class qf4 implements vzc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                rf4 rf4 = (rf4) this.b;
                rf4.getClass();
                if (((rf4) ((WeakReference) this.c).get()) != null) {
                    rf4.e.b();
                    return;
                }
                return;
            default:
                r1g.e((Context) this.b, (g2b) this.c);
                return;
        }
    }
}
