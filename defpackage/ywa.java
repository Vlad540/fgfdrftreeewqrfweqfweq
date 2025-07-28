package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import java.util.Set;

/* renamed from: ywa  reason: default package */
public final class ywa extends n0 {
    public final fr6 p;
    public final kv2 q;
    public ImagePerfDataListener r;

    public ywa(Context context, kv2 kv2, fr6 fr6, Set set, Set set2) {
        super(context, set, set2);
        this.p = fr6;
        this.q = kv2;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            this.e = null;
            return;
        }
        ur6 d = ur6.d(uri);
        d.e = rfc.c;
        this.e = d.a();
    }
}
