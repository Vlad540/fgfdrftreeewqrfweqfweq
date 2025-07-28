package ru.ok.messages.views.dialogs;

import android.app.Dialog;

public class FrgDlgStopLiveLocation extends FrgDlgChecked<e16> {
    public final Dialog i1() {
        i22 B = vl.b().e().B(this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID"));
        ov7 ov7 = new ov7(V0());
        B.h0();
        ov7 e = ov7.e(B.y0);
        e.b(cic.q0);
        ov7 c = e.c(whc.D, new x06(this, B, 3));
        int i = cic.r;
        g00 g00 = new g00(2, this);
        pc pcVar = c.a;
        pcVar.k = pcVar.a.getText(i);
        pcVar.l = g00;
        return c.a();
    }

    public final Class o1() {
        return e16.class;
    }
}
