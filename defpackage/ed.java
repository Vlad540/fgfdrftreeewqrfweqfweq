package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.concurrent.SingleCoreActivity;

/* renamed from: ed  reason: default package */
public final class ed implements pf4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ed(t97 t97, t97 t972, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = t97;
                this.c = t972;
                this.d = new t0c(hrd.a(Collections.singletonList(new z14(System.nanoTime(), new lge("Пуши заново"), phc.O1, (mge) null, (n06) null, 24))));
                return;
            default:
                long nanoTime = System.nanoTime();
                this.b = t97;
                this.c = t972;
                this.d = new t0c(hrd.a(Collections.singletonList(new z14(nanoTime, new lge("Отправить аналитику"), phc.W, (mge) null, (n06) null, 24))));
                return;
        }
    }

    public final zqd c() {
        switch (this.a) {
            case 0:
                return (t0c) this.d;
            case 1:
                return (t0c) this.d;
            default:
                return (grd) this.c;
        }
    }

    public final void d(z14 z14) {
        switch (this.a) {
            case 0:
                in7.g((in7) ((t97) this.c).getValue(), true, 2);
                hba hba = (hba) ((t97) this.b).getValue();
                hba.i("Логи отправлены");
                hba.j();
                return;
            case 1:
                zb9 zb9 = new zb9((Object) null);
                Iterator it = ((t52) ((t97) this.b).getValue()).w((ak0) null).iterator();
                while (it.hasNext()) {
                    i22 i22 = (i22) it.next();
                    if (i22.b.m > 0) {
                        zb9.a(i22.a);
                    }
                }
                ((p7a) ((t97) this.c).getValue()).g(zb9);
                return;
            default:
                Class<hhd> cls = hhd.class;
                udd.p(cls.getName(), "switch", new Object[0]);
                Context context = (Context) this.b;
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName()), hhd.G(context) ? 2 : 1, 1);
                } catch (Throwable th) {
                    udd.s(cls.getName(), "fail to update component state", th);
                }
                ((grd) this.c).m((Object) null, e());
                hba hba2 = (hba) ((w4) this.d).c(hba.class);
                hba2.i("Перезапустите приложение");
                hba2.b("Для применения конфига перезапустите приложение");
                hba2.j();
                return;
        }
    }

    public List e() {
        SpannedString spannedString;
        boolean G = hhd.G((Context) this.b);
        long nanoTime = System.nanoTime();
        lge lge = new lge("Включить single-core mode");
        if (G) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            udd.d(spannableStringBuilder, "включено‼️", new ForegroundColorSpan(-65536));
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            udd.d(spannableStringBuilder2, "выключено", new ForegroundColorSpan(Color.parseColor("#4CAF50")));
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return Collections.singletonList(new z14(nanoTime, lge, 0, new lge(spannedString), new y14(G), 4));
    }

    public ed(w4 w4Var) {
        this.a = 2;
        this.d = w4Var;
        this.b = (Context) w4Var.c(Context.class);
        this.c = hrd.a(e());
    }
}
