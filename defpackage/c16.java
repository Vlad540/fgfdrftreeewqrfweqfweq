package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* renamed from: c16  reason: default package */
public final /* synthetic */ class c16 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgPermissions b;

    public /* synthetic */ c16(FrgDlgPermissions frgDlgPermissions, int i) {
        this.a = i;
        this.b = frgDlgPermissions;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FrgDlgPermissions frgDlgPermissions = this.b;
        switch (this.a) {
            case 0:
                if (frgDlgPermissions.J1) {
                    d16 c0 = frgDlgPermissions.c0();
                    if (c0 instanceof d16) {
                        c0.x();
                    }
                    d16 d16 = frgDlgPermissions.M0;
                    if (d16 instanceof d16) {
                        d16.x();
                        return;
                    }
                    return;
                } else if (frgDlgPermissions.U0().getBoolean("use.result.api", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("dialog:permissions:result", true);
                    frgDlgPermissions.g0().e0(frgDlgPermissions.P0, bundle);
                    return;
                } else {
                    String[] stringArray = frgDlgPermissions.U0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                    a j0 = frgDlgPermissions.j0(true);
                    if (j0 != null) {
                        urd.I(j0, stringArray, frgDlgPermissions.k0());
                        return;
                    }
                    b c02 = frgDlgPermissions.c0();
                    if (c02 != null) {
                        int k0 = frgDlgPermissions.k0();
                        String[] strArr = urd.c;
                        d8.B(c02, stringArray, k0);
                        urd.L(urd.u(c02), stringArray);
                        return;
                    }
                    return;
                }
            default:
                int i2 = FrgDlgPermissions.K1;
                b c03 = frgDlgPermissions.c0();
                if (c03 != null) {
                    String[] strArr2 = urd.c;
                    c03.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", c03.getPackageName(), (String) null)));
                }
                d16 c04 = frgDlgPermissions.c0();
                if (c04 instanceof d16) {
                    c04.u();
                }
                d16 d162 = frgDlgPermissions.M0;
                if (d162 instanceof d16) {
                    d162.u();
                    return;
                }
                return;
        }
    }
}
