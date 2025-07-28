package defpackage;

import android.content.Context;
import android.widget.Button;
import androidx.appcompat.widget.TamAlertDialogLayout;

/* renamed from: cae  reason: default package */
public final class cae extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ TamAlertDialogLayout o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cae(TamAlertDialogLayout tamAlertDialogLayout, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = tamAlertDialogLayout;
    }

    public final void L1(Object obj, Object obj2) {
        Button e;
        db4 db4;
        Button c2;
        db4 db42;
        TamAlertDialogLayout tamAlertDialogLayout = this.o;
        switch (this.c) {
            case 0:
                if (((vce) obj) != ((vce) obj2) && (e = tamAlertDialogLayout.getButtonNeutral()) != null) {
                    if (tamAlertDialogLayout.isInEditMode()) {
                        db4 = db4.e0;
                    } else {
                        Context context = tamAlertDialogLayout.getContext();
                        r7e r7e = wce.a0;
                        db4 = fja.E(context);
                    }
                    tamAlertDialogLayout.g(e, db4);
                    return;
                }
                return;
            default:
                if (((vce) obj) != ((vce) obj2) && (c2 = tamAlertDialogLayout.getButtonNegative()) != null) {
                    if (tamAlertDialogLayout.isInEditMode()) {
                        db42 = db4.e0;
                    } else {
                        Context context2 = tamAlertDialogLayout.getContext();
                        r7e r7e2 = wce.a0;
                        db42 = fja.E(context2);
                    }
                    tamAlertDialogLayout.f(c2, db42);
                    return;
                }
                return;
        }
    }
}
