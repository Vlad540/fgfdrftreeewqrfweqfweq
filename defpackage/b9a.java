package defpackage;

import android.content.res.ColorStateList;

/* renamed from: b9a  reason: default package */
public final class b9a extends nn implements mhe {
    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.CompoundButton, b9a] */
    public final void b(boolean z, pda pda) {
        int i;
        if (z) {
            pda.getIcon();
            i = -16745729;
        } else {
            i = pda.h().j;
        }
        setButtonTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.CompoundButton, b9a] */
    public final void onThemeChanged(pda pda) {
        b(isChecked(), pda);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.CompoundButton, android.view.View, b9a] */
    public void setChecked(boolean z) {
        b9a.super.setChecked(z);
        b(z, km4.y0.r(this));
    }
}
