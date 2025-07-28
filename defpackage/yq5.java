package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: yq5  reason: default package */
public final class yq5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yq5) n((uq5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yq5 yq5 = new yq5(continuation, this.Y);
        yq5.X = obj;
        return yq5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        uq5 uq5 = (uq5) this.X;
        if (uq5 instanceof uq5) {
            k77[] k77Arr = FolderMemberPickerScreen.C0;
            Widget widget = this.Y;
            widget.getClass();
            k77[] k77Arr2 = FolderMemberPickerScreen.C0;
            k77 k77 = k77Arr2[1];
            jr jrVar = widget.B0;
            if (!h0e.c0((String) jrVar.a(widget))) {
                sgc router = widget.getRouter();
                k77 k772 = k77Arr2[1];
                rr3 g = router.g((String) jrVar.a(widget));
                gr5 gr5 = g instanceof gr5 ? (gr5) g : null;
                if (gr5 != null) {
                    Set set = uq5.a;
                    rq5 m0 = ((FolderEditScreen) gr5).m0();
                    m0.G0.o1(m0, rq5.H0[1], xs7.D(m0.a, m0.o.b(), ru3.b, new kq5(m0, set, (Continuation) null)));
                }
            }
            widget.getRouter().C();
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
