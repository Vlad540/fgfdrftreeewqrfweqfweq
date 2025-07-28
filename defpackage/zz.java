package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Locale;

/* renamed from: zz  reason: default package */
public final /* synthetic */ class zz implements of3, yx7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ o10 c;

    public /* synthetic */ zz(b00 b00, o10 o10, int i) {
        this.a = i;
        this.b = b00;
        this.c = o10;
    }

    public void accept(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.a) {
            case 0:
                this.b.d.put(this.c.q, uri);
                return;
            default:
                this.b.d.put(this.c.q, uri);
                return;
        }
    }

    public void c(ex7 ex7) {
        File[] listFiles;
        b00 b00 = this.b;
        b00.getClass();
        Locale locale = Locale.ENGLISH;
        String i = wn6.i("preview_", this.c.q, "_.png");
        mg5 mg5 = (mg5) b00.c;
        mg5.getClass();
        File g = mg5.g(mg5.b(), "previewVideoCache");
        File file = null;
        if (lp.n(g) && (listFiles = g.listFiles()) != null && listFiles.length != 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file2 = listFiles[i2];
                if (r1g.c(file2.getName(), i)) {
                    file = file2;
                    break;
                }
                i2++;
            }
        }
        if (ex7.h()) {
            return;
        }
        if (file == null) {
            ex7.b();
        } else {
            ex7.a(file);
        }
    }
}
