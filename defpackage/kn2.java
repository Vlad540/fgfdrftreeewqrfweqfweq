package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: kn2  reason: default package */
public final /* synthetic */ class kn2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn2 b;

    public /* synthetic */ kn2(nn2 nn2, int i) {
        this.a = i;
        this.b = nn2;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        nn2 nn2 = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                taf.o(nn2.c1, zl2.a);
                return jue;
            default:
                k77[] k77Arr = nn2.g1;
                taf.n(nn2, nn2.u().b(), (ru3) null, new om2(nn2, view, (Continuation) null), 2);
                return jue;
        }
    }
}
