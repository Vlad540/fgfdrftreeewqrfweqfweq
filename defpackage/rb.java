package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* renamed from: rb  reason: default package */
public final class rb extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;
    public final /* synthetic */ ryd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb(ryd ryd, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = ryd;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                rb rbVar = new rb(this.Z, continuation, 0);
                rbVar.Y = recyclerView;
                jue jue = jue.a;
                rbVar.o(jue);
                return jue;
            case 1:
                rb rbVar2 = new rb(this.Z, continuation, 1);
                rbVar2.Y = recyclerView;
                jue jue2 = jue.a;
                rbVar2.o(jue2);
                return jue2;
            case 2:
                rb rbVar3 = new rb(this.Z, continuation, 2);
                rbVar3.Y = recyclerView;
                jue jue3 = jue.a;
                rbVar3.o(jue3);
                return jue3;
            case 3:
                rb rbVar4 = new rb(this.Z, continuation, 3);
                rbVar4.Y = recyclerView;
                jue jue4 = jue.a;
                rbVar4.o(jue4);
                return jue4;
            default:
                rb rbVar5 = new rb(this.Z, continuation, 4);
                rbVar5.Y = recyclerView;
                jue jue5 = jue.a;
                rbVar5.o(jue5);
                return jue5;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                RecyclerView recyclerView = this.Y;
                this.Z.j();
                recyclerView.Y();
                return jue.a;
            case 1:
                wx3.H(obj);
                RecyclerView recyclerView2 = this.Y;
                this.Z.j();
                recyclerView2.Y();
                return jue.a;
            case 2:
                wx3.H(obj);
                RecyclerView recyclerView3 = this.Y;
                this.Z.j();
                recyclerView3.Y();
                return jue.a;
            case 3:
                wx3.H(obj);
                RecyclerView recyclerView4 = this.Y;
                this.Z.j();
                recyclerView4.Y();
                return jue.a;
            default:
                wx3.H(obj);
                RecyclerView recyclerView5 = this.Y;
                this.Z.j();
                recyclerView5.Y();
                return jue.a;
        }
    }
}
