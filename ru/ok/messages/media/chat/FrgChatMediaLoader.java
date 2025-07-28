package ru.ok.messages.media.chat;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgChatMediaLoader extends FrgBaseNonUi {
    public bd2 F1;

    public static ArrayList s1(List list, HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xm8 xm8 = (xm8) it.next();
            int i = 0;
            while (true) {
                if (i >= xm8.a.D0.v()) {
                    break;
                } else if (hashSet.contains(xm8.a.D0.u(i).a)) {
                    arrayList.add(xm8);
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        HashSet hashSet = new HashSet(this.Z.getIntegerArrayList("ru.ok.tamtam.extra.TYPES"));
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.DESC_ORDER");
        long j2 = this.Z.getLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", -1);
        zc2 zc2 = (zc2) this.u1.getAccessor().c(zc2.class);
        Long valueOf = Long.valueOf(j2);
        zc2.getClass();
        qmc qmc = zc2.b;
        qmc qmc2 = zc2.c;
        tt0 tt0 = zc2.d;
        t52 t52 = zc2.e;
        to8 to8 = zc2.f;
        hb2 hb2 = zc2.g;
        n1b n1b = zc2.h;
        rp8 rp8 = zc2.i;
        qmc qmc3 = zc2.a;
        qmc qmc4 = qmc2;
        HashSet hashSet2 = hashSet;
        bd2 bd2 = r3;
        bd2 bd22 = new bd2(j, valueOf, z, hashSet, tt0, t52, to8, hb2, n1b, rp8, qmc3, qmc, qmc4);
        this.F1 = bd2;
        bd2.p.d(bd2);
        if (hashSet2.equals(kg8.d)) {
            bd2 bd23 = this.F1;
            if (!bd23.k) {
                udd.q("bd2", "load: start");
                bd23.d.clear();
                bd23.b(false);
            }
        }
    }

    public final void z0() {
        bd2 bd2 = this.F1;
        bd2.p.f(bd2);
        super.z0();
    }
}
