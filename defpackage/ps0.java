package defpackage;

import android.view.View;
import java.util.Collection;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import one.me.folders.list.FoldersListScreen;

/* renamed from: ps0  reason: default package */
public final /* synthetic */ class ps0 extends x26 implements k26 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Collection collection;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                OnUndeliveredElementKt.callUndeliveredElement(((us0) this.receiver).b, obj2, (hu3) obj3);
                return jue;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj4 = ((m12) obj2).a;
                hu3 hu3 = (hu3) obj3;
                u16 u16 = ((us0) this.receiver).b;
                if (obj4 instanceof l12) {
                    obj4 = null;
                }
                OnUndeliveredElementKt.callUndeliveredElement(u16, obj4, hu3);
                return jue;
            default:
                xye xye = (xye) obj2;
                ((Number) obj3).intValue();
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                k77[] k77Arr = FoldersListScreen.Z;
                foldersListScreen.l0().x0 = xye;
                mq3 j = pfa.a(1).j((View) obj);
                foldersListScreen.l0().getClass();
                ep5 ep5 = xye.a;
                if (ep5 == null) {
                    collection = hw4.a;
                } else {
                    lg7 c = hwf.c();
                    c.add(new pq3(d5a.j, new hge(f5a.n), Integer.valueOf(l9a.g), (Integer) null, 20));
                    if (!ep5.G0.contains(fr5.c)) {
                        int i = d5a.k;
                        hge hge = new hge(f5a.o);
                        int i2 = phc.x;
                        int i3 = j9a.J;
                        int i4 = j9a.F;
                        c.add(new pq3(i, hge, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                    }
                    collection = hwf.a(c);
                }
                j.e(collection).b().build().q(foldersListScreen);
                return jue;
        }
    }
}
