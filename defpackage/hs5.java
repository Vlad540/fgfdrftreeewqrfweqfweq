package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: hs5  reason: default package */
public final class hs5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hs5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hs5 hs5 = new hs5(continuation, this.Y);
        hs5.X = obj;
        return hs5;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ds5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = FoldersListScreen.Z;
        FoldersListScreen foldersListScreen = this.Y;
        foldersListScreen.getClass();
        ((ds5) ((RecyclerView) foldersListScreen.Y.T0(foldersListScreen, FoldersListScreen.Z[0])).getAdapter()).F((List) this.X, new re(22, foldersListScreen));
        return jue.a;
    }
}
