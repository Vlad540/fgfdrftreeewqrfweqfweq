package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pd9  reason: default package */
public final /* synthetic */ class pd9 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pd9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void run() {
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                vd9 vd9 = (vd9) obj3;
                vd9.getClass();
                mif mif = (mif) obj;
                mif.Y = (Uri) obj2;
                vd9.y0 = mif.d();
                vd9.d2();
                vd9.f2(new od9(vd9, 1));
                return;
            default:
                long m = ((lqc) ((n2c) obj3).b).m();
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(j2c.a((f2c) list.get(i), m - ((long) i)));
                }
                b2c b2c = (b2c) obj;
                aec aec = b2c.a;
                aec.c();
                try {
                    new w63(new y63(2, new g74(11, b2c)), 0, new y63(2, new a2c(b2c, arrayList, 0))).a();
                    aec.r();
                    return;
                } finally {
                    aec.l();
                }
        }
    }
}
