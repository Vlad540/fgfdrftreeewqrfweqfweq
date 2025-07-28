package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: jj2  reason: default package */
public final class jj2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ EndlessRecyclerView2 Y;
    public final /* synthetic */ ryd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj2(ryd ryd, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = ryd;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                jj2 jj2 = new jj2(this.Z, continuation, 0);
                jj2.Y = endlessRecyclerView2;
                jue jue = jue.a;
                jj2.o(jue);
                return jue;
            default:
                jj2 jj22 = new jj2(this.Z, continuation, 1);
                jj22.Y = endlessRecyclerView2;
                jue jue2 = jue.a;
                jj22.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = this.Y;
                this.Z.j();
                endlessRecyclerView2.Y();
                return jue.a;
            default:
                wx3.H(obj);
                EndlessRecyclerView2 endlessRecyclerView22 = this.Y;
                this.Z.j();
                endlessRecyclerView22.Y();
                return jue.a;
        }
    }
}
