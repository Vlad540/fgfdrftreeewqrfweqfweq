package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ru.ok.messages.views.dialogs.ConfirmationDialog;

/* renamed from: nc3  reason: default package */
public final /* synthetic */ class nc3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmationDialog b;

    public /* synthetic */ nc3(ConfirmationDialog confirmationDialog, int i) {
        this.a = i;
        this.b = confirmationDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ConfirmationDialog confirmationDialog = this.b;
                Bundle bundle = confirmationDialog.Z;
                Bundle bundle2 = bundle != null ? bundle.getBundle("ru.ok.tamtam.extra.DATA") : null;
                confirmationDialog.g0().e0("ConfirmationDialog:request_key", jjd.j(new wia[]{new wia("POSITIVE", pc3.a)}));
                oc3 j0 = confirmationDialog.j0(true);
                if (j0 == null) {
                    oc3 c0 = confirmationDialog.c0();
                    if (c0 instanceof oc3) {
                        c0.S(bundle2);
                    } else if (c0 instanceof r5) {
                        Intent intent = new Intent();
                        intent.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                        ((r5) c0).onActivityResult(confirmationDialog.k0(), -1, intent);
                    }
                } else if (j0 instanceof oc3) {
                    j0.S(bundle2);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                    j0.t0(confirmationDialog.k0(), -1, intent2);
                }
                confirmationDialog.F1 = true;
                return;
            default:
                this.b.m1();
                return;
        }
    }
}
