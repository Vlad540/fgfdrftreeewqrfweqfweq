package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: zs5  reason: default package */
public final class zs5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zs5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zs5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zs5 zs5 = new zs5(continuation, this.Y);
        zs5.X = obj;
        return zs5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = FoldersPickerScreen.w0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        ((OneMeButton) foldersPickerScreen.Y.T0(foldersPickerScreen, FoldersPickerScreen.w0[3])).setEnabled(booleanValue);
        return jue.a;
    }
}
