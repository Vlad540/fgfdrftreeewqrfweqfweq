package defpackage;

import android.util.AttributeSet;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: ss5  reason: default package */
public final /* synthetic */ class ss5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ ss5(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final Object invoke() {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = FoldersPickerScreen.w0;
                foldersPickerScreen.getClass();
                k77 k77 = FoldersPickerScreen.w0[0];
                return new ft5(((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue());
            default:
                k77[] k77Arr2 = FoldersPickerScreen.w0;
                p4a p4a = new p4a(foldersPickerScreen.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.P);
                p4a.setTitle(new hge(f5a.p));
                p4a.x(p4a.getContext().getString(f5a.m), new us5(foldersPickerScreen, 1));
                return p4a;
        }
    }
}
