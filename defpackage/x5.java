package defpackage;

import android.os.Handler;
import androidx.viewpager.widget.ViewPager;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.contacts.profile.FrgContactAvatarsLoader;

/* renamed from: x5  reason: default package */
public final /* synthetic */ class x5 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActContactAvatars b;
    public final /* synthetic */ long c;

    public /* synthetic */ x5(ActContactAvatars actContactAvatars, long j, int i) {
        this.a = i;
        this.b = actContactAvatars;
        this.c = j;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, ru.ok.messages.contacts.profile.ActContactAvatars, r5, java.lang.Object] */
    public final void run() {
        long j = this.c;
        Class<pk> cls = pk.class;
        int i = 0;
        ? r7 = this.b;
        switch (this.a) {
            case 0:
                int i2 = ActContactAvatars.l1;
                ((di3) ((k93) r7.O0.b).getAccessor().c(di3.class)).d(0, (String) null, (String) null);
                gy9 gy9 = (gy9) ((pk) ((k93) r7.O0.b).getAccessor().c(cls));
                long d = sce.d(gy9.A(), new a9c(((j2b) gy9.z()).a.n(), j), false, 0, 12);
                if (r7.c1 == null) {
                    r7.c1 = new zt3();
                }
                r7.c1.add(Long.valueOf(d));
                return;
            case 1:
                int i3 = ActContactAvatars.l1;
                r7.getClass();
                int i4 = cic.p2;
                Handler handler = a06.h;
                a06.H(0, r7, r7.getString(i4));
                int currentItem = r7.Z0.getCurrentItem();
                FrgContactAvatarsLoader frgContactAvatarsLoader = r7.b1;
                Iterator it = frgContactAvatarsLoader.H1.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                        it.remove();
                        int i6 = frgContactAvatarsLoader.K1 - 1;
                        if (i5 == i6) {
                            frgContactAvatarsLoader.K1 = i6;
                            if (i6 <= 0) {
                                i6 = 0;
                            }
                            frgContactAvatarsLoader.K1 = i6;
                        } else {
                            int i7 = frgContactAvatarsLoader.J1 - 1;
                            frgContactAvatarsLoader.J1 = i7;
                            if (i7 <= 0) {
                                i7 = 0;
                            }
                            frgContactAvatarsLoader.J1 = i7;
                        }
                    }
                    i5++;
                }
                if (r7.b1.H1.isEmpty()) {
                    r7.finish();
                    return;
                }
                int i8 = currentItem - 1;
                if (currentItem > 0 && r7.g1 == currentItem) {
                    r7.g1 = i8;
                    r7.a1.k = i8;
                }
                FrgContactAvatarsLoader frgContactAvatarsLoader2 = r7.b1;
                r7.j0(frgContactAvatarsLoader2.J1 + frgContactAvatarsLoader2.K1, frgContactAvatarsLoader2.H1);
                if (currentItem > 0) {
                    ViewPager viewPager = r7.Z0;
                    viewPager.N0 = false;
                    viewPager.v(i8, 0, false, false);
                    return;
                }
                return;
            default:
                int i9 = ActContactAvatars.l1;
                r7.getClass();
                int i10 = cic.h2;
                Handler handler2 = a06.h;
                a06.H(0, r7, r7.getString(i10));
                long j2 = this.c;
                if (j2 != 0) {
                    if (r7.d1 == null) {
                        r7.d1 = new ArrayList();
                    }
                    r7.d1.add(Long.valueOf(((gy9) ((pk) ((k93) r7.O0.b).getAccessor().c(cls))).I(2, j2, (d10) null, (String) null, (String) null, (String) null, (String) null, (String) null)));
                }
                while (true) {
                    ArrayList arrayList = r7.e1;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i)).getValue()).equals(Long.valueOf(j2))) {
                        r7.g1 = i;
                        r7.a1.k = i;
                        FrgContactAvatarsLoader frgContactAvatarsLoader3 = r7.b1;
                        r7.j0(frgContactAvatarsLoader3.J1 + frgContactAvatarsLoader3.K1, frgContactAvatarsLoader3.H1);
                        return;
                    }
                    i++;
                }
        }
    }
}
