package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ga1  reason: default package */
public final class ga1 extends taf {
    public static final /* synthetic */ k77[] F0;
    public static final wia G0 = new wia(new ub0(BuildConfig.FLAVOR, Long.MIN_VALUE), fye.c(phc.S1).toString());
    public final grd A0;
    public final grd B0;
    public final e3 C0;
    public volatile Long D0;
    public final l05 E0;
    public final fna X;
    public final t97 Y;
    public final t97 Z;
    public final String b;
    public final d4b c;
    public final jrf o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0 = ez3.O(3, new c6(25, this));

    static {
        hc9 hc9 = new hc9(ga1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        F0 = new k77[]{hc9};
    }

    public ga1(String str, d4b d4b, jrf jrf, fna fna, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.b = str;
        this.c = d4b;
        this.o = jrf;
        this.X = fna;
        this.Y = t97;
        this.Z = t974;
        this.w0 = t975;
        this.x0 = t976;
        this.y0 = t973;
        hy7 hy7 = hy7.a;
        grd a = hrd.a(new y91((mc0) null, hy7, hy7, true, new lge(BuildConfig.FLAVOR), (List) null, (mge) null));
        this.A0 = a;
        this.B0 = a;
        this.C0 = hwf.t();
        this.E0 = new l05(0);
        xs7.E(this.a, ((pae) t973.getValue()).b(), (ru3) null, new w91(this, (Continuation) null), 2);
        ez3.N(new ck5(new uv(new s0c(((jp1) t972.getValue()).a), 19), new x91(this, (Continuation) null), 5), this.a);
        if (this.D0 == null) {
            xs7.E(this.a, (hu3) null, (ru3) null, new z91(this, (Continuation) null), 3);
        }
    }

    public static final mge q(ga1 ga1, List list, int i) {
        List i2;
        ii3 ii3;
        ga1.getClass();
        if (i == 0) {
            return new hge(r1a.V1);
        }
        String str = null;
        if (i == 1) {
            tf3 tf3 = (tf3) o23.X(list);
            if (!(tf3 == null || (i2 = tf3.i()) == null || (ii3 = (ii3) o23.X(i2)) == null)) {
                str = ii3.a();
            }
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            return new lge(str);
        } else if (i != 2) {
            return new dge(q1a.b, i);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ii3 ii32 = (ii3) o23.X(((tf3) it.next()).i());
                String str2 = ii32 != null ? ii32.a : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            return new lge(o23.c0(arrayList, (String) null, (String) null, (String) null, (u16) null, 63));
        }
    }

    public final void r(boolean z) {
        grd grd;
        Object value;
        fna fna = this.X;
        qna a = fna.a();
        String[] strArr = qna.h;
        if (!a.b(strArr)) {
            qna a2 = fna.a();
            int i = r1a.E;
            a2.getClass();
            int i2 = iub.permissions_audio_title;
            int i3 = baa.g;
            jrf jrf = this.o;
            if (qna.i(jrf, strArr)) {
                jrf.c(strArr, 160, i2, i, i3);
            } else {
                a2.f(jrf, strArr, 160);
            }
        } else {
            iq1 iq1 = (iq1) this.Z.getValue();
            iq1.getClass();
            iq1.c(iq1, "AUDIO_ENABLED", (String) null, (String) null, Integer.valueOf(z ? 1 : 0), (String) null, (String) null, true, 52);
            do {
                grd = this.A0;
                value = grd.getValue();
            } while (!grd.b(value, y91.a((y91) value, (mc0) null, !fna.a().b(qna.h) ? hy7.X : z ? hy7.b : hy7.a, (hy7) null, false, (mge) null, (ArrayList) null, (mge) null, 125)));
        }
    }

    public final void s(boolean z) {
        grd grd;
        Object value;
        fna fna = this.X;
        if (!fna.a().b(qna.l)) {
            fna.a().h(this.o);
            return;
        }
        iq1 iq1 = (iq1) this.Z.getValue();
        iq1.getClass();
        iq1.c(iq1, "VIDEO_ENABLED", (String) null, (String) null, Integer.valueOf(z ? 1 : 0), (String) null, (String) null, true, 52);
        do {
            grd = this.A0;
            value = grd.getValue();
        } while (!grd.b(value, y91.a((y91) value, (mc0) null, (hy7) null, !fna.a().b(qna.l) ? hy7.X : z ? hy7.b : hy7.a, false, (mge) null, (ArrayList) null, (mge) null, 123)));
    }
}
