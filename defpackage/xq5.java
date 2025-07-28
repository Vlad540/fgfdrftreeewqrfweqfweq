package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.picker.FolderMemberPickerScreen;

/* renamed from: xq5  reason: default package */
public final class xq5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xq5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xq5 xq5 = new xq5(continuation, this.Y);
        xq5.X = obj;
        return xq5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = !((Set) this.X).isEmpty();
        FolderMemberPickerScreen folderMemberPickerScreen = this.Y;
        if (z) {
            k77[] k77Arr = FolderMemberPickerScreen.C0;
            folderMemberPickerScreen.t0().setRightActions(new xda(new ty0(4, folderMemberPickerScreen)));
        } else {
            k77[] k77Arr2 = FolderMemberPickerScreen.C0;
            folderMemberPickerScreen.t0().setRightActions(yda.a);
        }
        return jue.a;
    }
}
