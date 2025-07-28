package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: tvc  reason: default package */
public final class tvc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SelectAlbumWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvc(Continuation continuation, SelectAlbumWidget selectAlbumWidget) {
        super(2, continuation);
        this.Y = selectAlbumWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tvc tvc = new tvc(continuation, this.Y);
        tvc.X = obj;
        return tvc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dvc dvc = (dvc) this.X;
        if (dvc instanceof dvc) {
            k77[] k77Arr = SelectAlbumWidget.Y;
            this.Y.m0().j(dvc.a);
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
