package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: up7  reason: default package */
public final /* synthetic */ class up7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq7 b;

    public /* synthetic */ up7(kq7 kq7, int i) {
        this.a = i;
        this.b = kq7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [i26, l5e] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ik5(ez3.H(new ik5(new tj5(1, this.b.b.g()), 14), new l5e(2, (Continuation) null)), 15);
            case 1:
                kq7 kq7 = this.b;
                kq7.w0.m((Object) null, o23.s0((List) kq7.Z.take()));
                return jue.a;
            default:
                kq7 kq72 = this.b;
                kq72.Y.m((Object) null, o23.s0((List) kq72.X.take()));
                return jue.a;
        }
    }
}
