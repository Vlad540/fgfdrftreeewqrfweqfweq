package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: x06  reason: default package */
public final /* synthetic */ class x06 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x06(a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                FrgCachingSettings frgCachingSettings = this.b;
                frgCachingSettings.getClass();
                int progress = ((jfd) this.c).getProgress();
                kp kpVar = frgCachingSettings.I1;
                if (progress == 0) {
                    kpVar.k("app.media.caching.limit", 536870912L);
                } else if (progress == 1) {
                    kpVar.k("app.media.caching.limit", 1073741824L);
                } else if (progress == 2) {
                    kpVar.k("app.media.caching.limit", 2147483648L);
                } else if (progress == 3) {
                    kpVar.k("app.media.caching.limit", 4294967296L);
                } else if (progress == 4) {
                    kpVar.k("app.media.caching.limit", -1L);
                }
                frgCachingSettings.w1();
                return;
            case 1:
                FrgCachingSettings frgCachingSettings2 = this.b;
                frgCachingSettings2.getClass();
                CharSequence charSequence = ((CharSequence[]) this.c)[i];
                boolean equals = charSequence.equals(frgCachingSettings2.i0(cic.R0));
                kp kpVar2 = frgCachingSettings2.I1;
                if (equals) {
                    kpVar2.j(0, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.i0(cic.T0))) {
                    kpVar2.j(1, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.i0(cic.S0))) {
                    kpVar2.j(2, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.i0(cic.U0))) {
                    kpVar2.j(3, "app.media.caching.time");
                }
                frgCachingSettings2.w1();
                return;
            case 2:
                FrgCachingSettings frgCachingSettings3 = this.b;
                frgCachingSettings3.getClass();
                HashSet hashSet = new HashSet();
                for (cv0 cv0 : (List) this.c) {
                    if (cv0.d) {
                        hashSet.add(cv0.b);
                    }
                }
                uv0 uv0 = frgCachingSettings3.L1;
                synchronized (uv0) {
                    if (uv0.k == null) {
                        udd.s("uv0", "onClearCacheTypesPicked: invalid state no cacheData", (Throwable) null);
                        ((FrgBase) uv0.h).k1();
                        uv0.h.L();
                        return;
                    }
                    uv0.h.G();
                    nu9 n = new lx7(new o73(new y63(1, new rv0(uv0, hashSet, 0)).f(new rv0(uv0, hashSet, 1)), 0, "uv0"), new qv0(uv0, 1), 3).r(uv0.f).n(uv0.g);
                    c97 c97 = new c97(new qv0(uv0, 2), new qv0(uv0, 3), z3d.i);
                    n.a(c97);
                    uv0.a(c97);
                    return;
                }
            case 3:
                FrgDlgStopLiveLocation frgDlgStopLiveLocation = this.b;
                frgDlgStopLiveLocation.getClass();
                long j = ((i22) this.c).a;
                a aVar = frgDlgStopLiveLocation.M0;
                Class cls = e16.class;
                ((e16) (aVar != null ? cls.cast(aVar) : cls.cast(frgDlgStopLiveLocation.c0()))).s(j);
                return;
            case 4:
                q2f q2f = new q2f(((n2f[]) this.c)[i]);
                udd.q("ru.ok.messages.views.dialogs.VideoCompressionModeDialog", "set fragment result " + q2f);
                this.b.g0().e0("VideoCompressionModeDialog:result:request", jjd.j(new wia[]{new wia("VideoCompressionModeDialog:result:key", q2f)}));
                return;
            default:
                this.b.p1(new v7f(((ujb) ((ArrayList) this.c).get(i)).a.a));
                return;
        }
    }
}
