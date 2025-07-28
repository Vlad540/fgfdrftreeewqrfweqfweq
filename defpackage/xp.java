package defpackage;

import android.os.Bundle;

/* renamed from: xp  reason: default package */
public final /* synthetic */ class xp implements tx9, of3, d1a, au, yx5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ xp(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                this.b.invoke((y52) obj);
                return;
            case 3:
                p10 p10 = (p10) obj;
                vw6 vw6 = p10.b;
                if (vw6 != null) {
                    uw6 uw6 = new uw6();
                    uw6.a = vw6.a;
                    uw6.b = vw6.b;
                    this.b.invoke(uw6);
                    p10.b = new vw6(uw6);
                    return;
                }
                return;
            default:
                this.b.invoke((m00) obj);
                return;
        }
    }

    public ch7 apply(Object obj) {
        return (ch7) this.b.invoke(obj);
    }

    public void b(String str, Bundle bundle) {
        bmc bmc = (bmc) bundle.getParcelable(str);
        if (bmc != null) {
            this.b.invoke(bmc);
        }
    }

    public void c(int i) {
        this.b.invoke(Integer.valueOf(i));
    }
}
