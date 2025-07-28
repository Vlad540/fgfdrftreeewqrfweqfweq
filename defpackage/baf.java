package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: baf  reason: default package */
public abstract class baf {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static xp3 b(View view, xp3 xp3) {
        ContentInfo i = xp3.a.i();
        Objects.requireNonNull(i);
        ContentInfo m = p20.m(i);
        ContentInfo performReceiveContent = view.performReceiveContent(m);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m ? xp3 : new xp3(new lv1(performReceiveContent));
    }

    public static void c(View view, String[] strArr, rx9 rx9) {
        if (rx9 == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new caf(rx9));
        }
    }
}
