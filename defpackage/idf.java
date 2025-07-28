package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: idf  reason: default package */
public final /* synthetic */ class idf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kdf b;

    public /* synthetic */ idf(kdf kdf, int i) {
        this.a = i;
        this.b = kdf;
    }

    public final void run() {
        kdf kdf = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                kdf.getClass();
                k4b.w0.Y.a(kdf.m);
                return;
            case 1:
                ((ldf) kdf.a.getValue()).a();
                nae nae = (nae) kdf.c.getValue();
                nae.getClass();
                udd.q("nae", "syncAll");
                nae.e.b(new vr2(nae, Collections.emptyList(), true, 4));
                return;
            default:
                ldf ldf = (ldf) kdf.a.getValue();
                qna qna = (qna) kdf.e.getValue();
                qna.getClass();
                String[] strArr = qna.d;
                int i = 0;
                while (true) {
                    if (i < 2) {
                        String str = strArr[i];
                        otf otf = qna.c;
                        if (((SharedPreferences) ((r7e) otf.b).getValue()).getBoolean(str, false) || d8.d(qna.a, str) != 0) {
                            i++;
                        } else {
                            udd.q("kdf", "forceContactsSync");
                            String[] strArr2 = qna.d;
                            boolean b2 = qna.b(qna.f);
                            SharedPreferences.Editor edit = ((SharedPreferences) ((r7e) otf.b).getValue()).edit();
                            for (int i2 = 0; i2 < 2; i2++) {
                                edit.putBoolean(strArr2[i2], b2);
                            }
                            edit.apply();
                        }
                    } else {
                        z = false;
                    }
                }
                ldf.b(z);
                return;
        }
    }
}
