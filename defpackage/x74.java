package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: x74  reason: default package */
public final /* synthetic */ class x74 implements i83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjb b;

    public /* synthetic */ x74(pjb pjb, int i) {
        this.a = i;
        this.b = pjb;
    }

    public final Object h(uwb uwb) {
        switch (this.a) {
            case 0:
                return new z74((Context) uwb.a(Context.class), ((ih5) uwb.a(ih5.class)).c(), uwb.b(pjb.a(gf6.class)), uwb.c(dc4.class), (Executor) uwb.f(this.b));
            default:
                return hr1.r(uwb.a(nh5.class));
        }
    }
}
