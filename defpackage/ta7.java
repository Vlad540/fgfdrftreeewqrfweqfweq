package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.HashSet;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: ta7  reason: default package */
public final /* synthetic */ class ta7 implements e8 {
    public final /* synthetic */ xm8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ta7(xm8 xm8, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = xm8;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final void a(sgc sgc) {
        v00 v00;
        o10 o10;
        Activity C = jjd.C(sgc);
        xm8 xm8 = this.a;
        long j = xm8.a.x0;
        HashSet hashSet = ActAttachesView.D1;
        Intent intent = new Intent(C, ActAttachesView.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        String str = this.b;
        intent.putExtra("ru.ok.tamtam.extra.START_LOCAL_ID", str);
        intent.putExtra("ru.ok.tamtam.extra.START_MESSAGE", new nr8(xm8));
        intent.putExtra("ru.ok.tamtam.extra.DESC_ORDER", this.c);
        vo8 vo8 = xm8.a;
        intent.putExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", vo8.r() ? true : this.d);
        if (this.e) {
            intent.putExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID", str);
        }
        intent.putExtra("ru.ok.tamtam.extra.CAST_ENABLED", this.f);
        jj7 jj7 = vo8.D0;
        if (jj7.v() > 0) {
            int i = 0;
            while (true) {
                if (i >= jj7.v()) {
                    break;
                }
                o10 u = jj7.u(i);
                if (u.g()) {
                    f10 f10 = u.g;
                    if (f10.a()) {
                        u = f10.g;
                    }
                }
                boolean f2 = u.f();
                String str2 = u.r;
                if (f2) {
                    a10 a10 = u.b;
                    if (!a10.X && u.q.equals(str)) {
                        if (r1g.p(str2)) {
                            str2 = a10.a();
                        }
                        Uri r = mg5.r(str2);
                        if (r != null) {
                            fr6 u2 = a06.u();
                            ur6 d2 = ur6.d(r);
                            d2.d = z3d.A(C, u, false);
                            u2.f(d2.a(), (m18) null);
                        }
                    }
                }
                if (u.i()) {
                    a06.u().f(tr6.a(mg5.r(u.d.d)), (m18) null);
                } else if (u.c() && (o10 = v00.d) != null) {
                    if (!o10.f()) {
                        o10 o102 = (v00 = u.j).d;
                        str2 = o102.i() ? o102.d.d : null;
                    }
                    if (!r1g.p(str2)) {
                        a06.u().f(tr6.a(at7.x(str2)), (m18) null);
                    }
                }
                i++;
            }
        }
        intent.putExtra("ru.ok.tamtam.extra.COMPAT_MODE", true);
        intent.putExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", true);
        jjd.C(sgc).startActivity(intent);
    }
}
