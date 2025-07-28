package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: ys5  reason: default package */
public final class ys5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ys5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ys5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ys5 ys5 = new ys5(continuation, this.Y);
        ys5.X = obj;
        return ys5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Set set = (Set) this.X;
        k77[] k77Arr = FoldersPickerScreen.w0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        ((RecyclerView) foldersPickerScreen.X.T0(foldersPickerScreen, FoldersPickerScreen.w0[1])).invalidate();
        return jue.a;
    }
}
