package defpackage;

import java.util.List;

/* renamed from: y85  reason: default package */
public final /* synthetic */ class y85 implements j26, zt {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ y85(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public Object m83apply(Object obj) {
        switch (this.a) {
            case 0:
                return new y63(1, new z85((ha5) obj, this.b, this.c, 0));
            case 1:
                return new w63(((p95) obj).a(), 2, new y85(this.c, 2, this.b));
            default:
                return new y63(1, new z85((y95) obj, this.b, this.c, 1));
        }
    }

    public /* synthetic */ y85(int i, long j) {
        this.a = 3;
        this.c = i;
        this.b = j;
    }

    public ch7 apply(Object obj) {
        return swb.A(new jc8(this.c, this.b, (List) obj));
    }
}
