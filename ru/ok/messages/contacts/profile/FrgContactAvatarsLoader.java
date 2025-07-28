package ru.ok.messages.contacts.profile;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgContactAvatarsLoader extends FrgBaseNonUi {
    public long F1;
    public uj3 G1;
    public final ArrayList H1 = new ArrayList();
    public int I1;
    public int J1;
    public int K1;
    public long L1;
    public boolean M1;
    public b16 N1;

    @a1e
    public void onEvent(rm3 rm3) {
        List list;
        if (this.L1 == rm3.a && (list = rm3.b) != null) {
            this.L1 = 0;
            if (list.isEmpty()) {
                this.I1 = Integer.MAX_VALUE;
                return;
            }
            udd.q("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "onEvent = " + rm3);
            this.I1 = list.size() + this.I1;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = this.H1;
            linkedHashSet.addAll(arrayList);
            linkedHashSet.addAll(list);
            arrayList.clear();
            arrayList.addAll(linkedHashSet);
            int i = rm3.c;
            this.J1 = i;
            b16 b16 = this.N1;
            if (b16 != null) {
                ((ActContactAvatars) b16).j0(i + this.K1, arrayList);
            }
        }
    }

    public final void s1() {
        int i = this.I1;
        if ((i == 0 || i < this.J1) && this.L1 == 0) {
            udd.q("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "loadNext");
            long j = this.F1;
            int i2 = this.I1;
            gy9 gy9 = (gy9) ((pk) vl.b().getAccessor().c(pk.class));
            this.L1 = gy9.v(gy9, new ut(((j2b) gy9.z()).a.n(), j, i2));
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID", -1);
        this.F1 = j;
        if (j == -1) {
            uj3 uj3 = ((yj3) this.Z.getParcelable("ru.ok.tamtam.extra.CONTACT_INFO")).a;
            this.G1 = uj3;
            if (uj3 != null) {
                this.F1 = uj3.a;
            } else {
                throw new IllegalArgumentException("contact_id or contact's SearchResult must be defined");
            }
        }
        if (!this.M1) {
            this.M1 = true;
            uj3 uj32 = this.G1;
            ArrayList arrayList = this.H1;
            if (uj32 != null) {
                lg7 g = wx3.g(fj0.a, fj0.X, new gw2(16, this));
                if (!g.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(g, Long.valueOf(this.G1.Y)));
                }
            } else {
                tf3 i = this.u1.g().i(this.F1, true);
                lg7 f = wx3.f(new a16(i, 0), new a16(i, 1));
                if (!f.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(f, Long.valueOf(i.a.c.e)));
                }
            }
            int size = arrayList.size();
            this.K1 = size;
            b16 b16 = this.N1;
            if (b16 != null) {
                ((ActContactAvatars) b16).j0(size, arrayList);
            }
            s1();
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        if (this.L1 == jh0.a) {
            this.L1 = 0;
            s1();
        }
    }
}
