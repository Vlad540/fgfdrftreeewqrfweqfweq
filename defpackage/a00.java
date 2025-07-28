package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* renamed from: a00  reason: default package */
public final /* synthetic */ class a00 implements of3, yx7, j26 {
    public final /* synthetic */ b00 a;

    public /* synthetic */ a00(b00 b00) {
        this.a = b00;
    }

    public void accept(Object obj) {
        b00 b00 = this.a;
        Throwable th = (Throwable) obj;
        b00.getClass();
        udd.s("AttachPreviewDiskCache", "onError", th);
        b00.b.c(new HandledException(th), true);
    }

    public Object apply(Object obj) {
        this.a.getClass();
        HashMap hashMap = new HashMap();
        for (File file : (List) obj) {
            String name = file.getName();
            String str = !name.endsWith(".png") ? null : name.split("_")[1];
            if (!r1g.p(str)) {
                hashMap.put(str, Uri.fromFile(file));
            }
        }
        return hashMap;
    }

    public void c(ex7 ex7) {
        mg5 mg5 = (mg5) this.a.c;
        mg5.getClass();
        File g = mg5.g(mg5.b(), "previewVideoCache");
        if (!lp.n(g) && !ex7.h()) {
            ex7.b();
        }
        File[] listFiles = g.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Arrays.sort(listFiles, new yz(0));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < listFiles.length && i < 200) {
                arrayList.add(listFiles[i]);
                i++;
            }
            if (!ex7.h()) {
                ex7.a(arrayList);
            }
        } else if (!ex7.h()) {
            ex7.b();
        }
    }
}
