package defpackage;

import android.content.Intent;

/* renamed from: uy1  reason: default package */
public final /* synthetic */ class uy1 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ uy1() {
        this.a = 0;
        this.b = null;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((y52) obj).h = this.b;
                return jue.a;
            case 1:
                ((y52) obj).g = this.b;
                return jue.a;
            case 2:
                Intent intent = (Intent) obj;
                String str = this.b;
                if (str != null) {
                    intent.putExtra("external_callback_param_arg", str);
                }
                return jue.a;
            case 3:
                mt0.O("watchdog-".concat(this.b), new b25((Runnable) obj, 2));
                return jue.a;
            case 4:
                mt0.O("watchdog-".concat(this.b), new b25((Runnable) obj, 3));
                return jue.a;
            default:
                String str2 = (String) obj;
                return Boolean.valueOf(str2.length() > 0 && nqc.a.r().h(str2, this.b));
        }
    }

    public /* synthetic */ uy1(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
