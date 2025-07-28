package defpackage;

import android.view.View;
import one.me.folders.edit.FolderEditScreen;

/* renamed from: yp5  reason: default package */
public final /* synthetic */ class yp5 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditScreen b;

    public /* synthetic */ yp5(FolderEditScreen folderEditScreen, int i) {
        this.a = i;
        this.b = folderEditScreen;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.folders.edit.FolderEditScreen] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ? r1 = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                k77[] k77Arr = FolderEditScreen.w0;
                r1.n0();
                ex9 onBackPressedDispatcher = r1.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                k77[] k77Arr2 = FolderEditScreen.w0;
                r1.m0().u();
                r1.n0();
                return jue;
        }
    }
}
