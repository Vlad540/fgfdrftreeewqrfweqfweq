package defpackage;

import java.util.List;

/* renamed from: wp7  reason: default package */
public final /* synthetic */ class wp7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq7 b;
    public final /* synthetic */ List c;

    public /* synthetic */ wp7(kq7 kq7, List list, int i) {
        this.a = i;
        this.b = kq7;
        this.c = list;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.X.put(this.c);
                return jue.a;
            default:
                this.b.Z.put(this.c);
                return jue.a;
        }
    }
}
