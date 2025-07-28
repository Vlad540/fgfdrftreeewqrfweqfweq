package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: aq5  reason: default package */
public final class aq5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((aq5) n((dq5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aq5 aq5 = new aq5(this.Y, continuation);
        aq5.X = obj;
        return aq5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dq5 dq5 = (dq5) this.X;
        boolean z = dq5 instanceof bq5;
        xda xda = yda.a;
        FolderEditScreen folderEditScreen = this.Y;
        if (z) {
            FolderEditScreen.l0(folderEditScreen).setTitle(f5a.k);
            k77[] k77Arr = FolderEditScreen.w0;
            k77 k77 = k77Arr[3];
            n0c n0c = folderEditScreen.Z;
            ((OneMeButton) n0c.T0(folderEditScreen, k77)).setVisibility(0);
            ((OneMeButton) n0c.T0(folderEditScreen, k77Arr[3])).setEnabled(((bq5) dq5).b);
            FolderEditScreen.l0(folderEditScreen).setRightActions(xda);
        } else if (dq5 instanceof cq5) {
            FolderEditScreen.l0(folderEditScreen).setTitle(f5a.l);
            ((OneMeButton) folderEditScreen.Z.T0(folderEditScreen, FolderEditScreen.w0[3])).setVisibility(8);
            nea l0 = FolderEditScreen.l0(folderEditScreen);
            if (((cq5) dq5).c) {
                xda = new xda(new yp5(folderEditScreen, 1));
            }
            l0.setRightActions(xda);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
