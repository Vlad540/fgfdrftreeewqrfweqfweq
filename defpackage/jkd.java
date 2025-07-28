package defpackage;

import android.text.Editable;

/* renamed from: jkd  reason: default package */
public final class jkd extends b7c implements hx6 {
    public final int J0;
    public final cx6 K0;
    public final bc3 L0;
    public final /* synthetic */ kkd M0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jkd(kkd kkd, int i, cx6 cx6, bc3 bc3) {
        super(bc3);
        this.M0 = kkd;
        this.J0 = i;
        this.K0 = cx6;
        this.L0 = bc3;
    }

    public final String A() {
        Editable text = this.L0.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    public final void B(String str) {
        bc3 bc3 = this.L0;
        bc3.setText(str);
        bc3.setSelection(bc3.length());
    }
}
