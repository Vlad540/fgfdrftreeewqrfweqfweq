package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: u06  reason: default package */
public final class u06 implements qf3 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ FrgAttachVideo b;

    public u06(FrgAttachVideo frgAttachVideo, HashMap hashMap) {
        this.b = frgAttachVideo;
        this.a = hashMap;
    }

    public final void accept(Object obj) {
        int intValue;
        qjb qjb = (qjb) obj;
        udd.p("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onQualitySelected %s", new Object[]{qjb});
        for (Map.Entry entry : this.a.entrySet()) {
            if (((rjb) entry.getValue()).a == qjb) {
                poe poe = (poe) entry.getKey();
                fd9 fd9 = this.b.R1;
                if (fd9 != null) {
                    udd.p("fd9", "selectTrackContainer %s", new Object[]{poe});
                    if (fd9.b2()) {
                        al7 al7 = (al7) fd9.c;
                        if (al7.f != null) {
                            n35 n35 = al7.b;
                            n35.getClass();
                            udd.p("n35", "selectTrackContainer: %s", new Object[]{poe});
                            n35.u();
                            kv2 kv2 = n35.b;
                            kv2.getClass();
                            ((i03) kv2.X).j(poe.a.X, "app.video.play.quality");
                            if (poe == poe.c) {
                                ac4 ac4 = (ac4) kv2.a;
                                bu7 bu7 = ac4.c;
                                if (bu7 != null && (intValue = ((Integer) kv2.k(bu7).first).intValue()) >= 0) {
                                    ob4 b2 = ac4.b();
                                    SparseArray sparseArray = b2.M;
                                    Map map = (Map) sparseArray.get(intValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(intValue);
                                    }
                                    ac4.h(b2);
                                }
                            } else {
                                kv2.q(poe.a.X);
                            }
                        }
                        oa7 oa7 = fd9.Y;
                        if (oa7.get() != null) {
                            ((bd) oa7.get()).d(poe.a.X, "VIDEO_QUALITY_SELECTED");
                        }
                    }
                }
            }
        }
    }
}
