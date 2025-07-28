package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: us5  reason: default package */
public final /* synthetic */ class us5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ us5(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final void onClick(View view) {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = FoldersPickerScreen.w0;
                ft5 l0 = widget.l0();
                l0.getClass();
                hu3 plus = sk9.a.plus(l0.X.b());
                et5 et5 = new et5(l0, (Continuation) null);
                xs7.D(l0.a, plus, ru3.c, et5);
                widget.getRouter().C();
                return;
            default:
                k77[] k77Arr2 = FoldersPickerScreen.w0;
                er5 er5 = er5.c;
                widget.getClass();
                k77 k77 = FoldersPickerScreen.w0[0];
                long longValue = ((Number) widget.b.a(widget)).longValue();
                er5.P1().d();
                d34 P1 = er5.P1();
                P1.b(":settings/folder/create?chat_id=" + longValue, (Bundle) null);
                return;
        }
    }
}
