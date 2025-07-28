package defpackage;

import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: qi7  reason: default package */
public final class qi7 {
    public static void a(mtf mtf, boolean z) {
        udd.q(LoadEmojiFontWorker.TAG, "start");
        bfa backoffCriteria = new bfa(LoadEmojiFontWorker.class).setBackoffCriteria(he0.a, 10000, TimeUnit.MILLISECONDS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = z ? 2 : 3;
        wia[] wiaArr = {new wia(LoadEmojiFontWorker.WAITING_FOR_WIFI, Boolean.valueOf(z))};
        x3a x3a = new x3a(9);
        wia wia = wiaArr[0];
        x3a.H(wia.b, (String) wia.a);
        cfa build = backoffCriteria.setConstraints(new if3(i, false, false, false, false, -1, -1, o23.w0(linkedHashSet))).setExpedited(vga.a).addTag(LoadEmojiFontWorker.TAG).setInputData(x3a.k()).build();
        UUID id = build.getId();
        udd.q(LoadEmojiFontWorker.TAG, "work " + id);
        mtf mtf2 = mtf;
        mtf.b(LoadEmojiFontWorker.TAG, a35.b, build, false).O();
    }
}
