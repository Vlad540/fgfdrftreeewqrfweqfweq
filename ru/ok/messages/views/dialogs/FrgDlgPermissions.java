package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.material.ComGoogleAndroidMaterialR;

public class FrgDlgPermissions extends FrgDlgBase {
    public static final int K1 = cic.b3;
    public static final int L1 = cic.G;
    public boolean J1;

    public static FrgDlgPermissions o1(String[] strArr, int i, int i2, int i3, boolean z) {
        FrgDlgPermissions frgDlgPermissions = new FrgDlgPermissions();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ru.ok.tamtam.extra.PERMISSIONS", strArr);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", i3);
        bundle.putInt("ru.ok.tamtam.extra.TITLE", i);
        bundle.putInt("ru.ok.tamtam.extra.CONTENT", i2);
        bundle.putBoolean("ru.ok.tamtam.extra.MODE_SETTINGS", z);
        frgDlgPermissions.Y0(bundle);
        return frgDlgPermissions;
    }

    public final Dialog i1() {
        Bundle U0 = U0();
        this.J1 = U0.getBoolean("ru.ok.tamtam.extra.MODE_SETTINGS");
        int i = U0.getInt("ru.ok.tamtam.extra.CONTENT");
        int i2 = U0.getInt("ru.ok.tamtam.extra.TITLE", K1);
        int i3 = U0.getInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", L1);
        ov7 ov7 = new ov7(new ar3(V0(), ComGoogleAndroidMaterialR.style.Theme_MaterialComponents));
        pc pcVar = ov7.a;
        pcVar.d = pcVar.a.getText(i2);
        ov7.b(i);
        ov7 d = ov7.d(i3, new c16(this, 0));
        pc pcVar2 = d.a;
        pcVar2.m = false;
        if (this.J1) {
            int i4 = cic.W1;
            c16 c16 = new c16(this, 1);
            pcVar2.k = pcVar2.a.getText(i4);
            pcVar2.l = c16;
        }
        return d.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        d16 c0 = c0();
        if (c0 instanceof d16) {
            c0.d();
        }
        d16 d16 = this.M0;
        if (d16 instanceof d16) {
            d16.d();
        }
    }
}
