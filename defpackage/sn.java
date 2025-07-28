package defpackage;

import android.view.View;

/* renamed from: sn  reason: default package */
public final class sn extends sw5 {
    public final /* synthetic */ zn y0;
    public final /* synthetic */ co z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn(co coVar, View view, zn znVar) {
        super(view);
        this.z0 = coVar;
        this.y0 = znVar;
    }

    public final ped b() {
        return this.y0;
    }

    public final boolean c() {
        co coVar = this.z0;
        if (coVar.getInternalPopup().a()) {
            return true;
        }
        coVar.x0.m(coVar.getTextDirection(), coVar.getTextAlignment());
        return true;
    }
}
