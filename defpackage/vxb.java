package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: vxb  reason: default package */
public final /* synthetic */ class vxb implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ xxb a;
    public final /* synthetic */ Chip b;
    public final /* synthetic */ int c;

    public /* synthetic */ vxb(xxb xxb, Chip chip, int i) {
        this.a = xxb;
        this.b = chip;
        this.c = i;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, z, this.c);
    }
}
