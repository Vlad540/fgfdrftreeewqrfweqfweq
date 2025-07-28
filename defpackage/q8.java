package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieFactory;

/* renamed from: q8  reason: default package */
public final /* synthetic */ class q8 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q8(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                b7c b7c = (b7c) obj;
                return ((RecyclerView) this.c).getRecycledViewPool().getRecycledView(this.b);
            case 1:
                ei eiVar = (ei) obj;
                int i2 = this.b;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url((String) this.c, true, i2, i2, true), false, true, true, false, 18, (x54) null));
            case 2:
                Integer num = (Integer) obj;
                bv4 bv4 = (bv4) this.c;
                return xs7.E((ou3) bv4.f.getValue(), (hu3) null, (ru3) null, new av4(this.b, bv4, (Continuation) null), 3);
            default:
                ((Integer) obj).getClass();
                uv4 uv4 = (uv4) this.c;
                int i3 = 0;
                for (Object next : ((rv4) uv4.y0.a.getValue()).b) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        hx1 hx1 = (pg7) next;
                        if ((hx1 instanceof hx1) && hx1.a == (i = this.b)) {
                            uv4.Y.m((Object) null, new sv4(i, i3, 0, 4));
                        }
                        i3 = i4;
                    } else {
                        p23.G();
                        throw null;
                    }
                }
                return jue.a;
        }
    }
}
