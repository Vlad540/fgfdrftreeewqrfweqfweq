package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* renamed from: yp8  reason: default package */
public final /* synthetic */ class yp8 implements rx9 {
    public final /* synthetic */ u16 a;

    public /* synthetic */ yp8(qu8 qu8) {
        this.a = qu8;
    }

    public final xp3 a(View view, xp3 xp3) {
        Pair pair;
        nfc nfc;
        up3 up3;
        wp3 wp3 = xp3.a;
        ClipData a2 = wp3.a();
        boolean z = true;
        Uri uri = null;
        if (a2.getItemCount() == 1) {
            if (a2.getItemAt(0).getUri() == null) {
                z = false;
            }
            xp3 xp32 = z ? xp3 : null;
            if (z) {
                xp3 = null;
            }
            pair = Pair.create(xp32, xp3);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < a2.getItemCount(); i++) {
                ClipData.Item itemAt = a2.getItemAt(i);
                if (itemAt.getUri() != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair create = arrayList == null ? Pair.create((Object) null, a2) : arrayList2 == null ? Pair.create(a2, (Object) null) : Pair.create(xp3.a(a2.getDescription(), arrayList), xp3.a(a2.getDescription(), arrayList2));
            if (create.first == null) {
                pair = Pair.create((Object) null, xp3);
            } else if (create.second == null) {
                pair = Pair.create(xp3, (Object) null);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    nfc = new nfc(xp3);
                } else {
                    nfc = new vp3();
                    nfc.b = wp3.a();
                    nfc.c = wp3.l();
                    nfc.o = wp3.getFlags();
                    nfc.X = wp3.d();
                    nfc.Y = wp3.getExtras();
                }
                nfc.h((ClipData) create.first);
                xp3 build = nfc.build();
                if (i2 >= 31) {
                    up3 = new nfc(xp3);
                } else {
                    up3 vp3 = new vp3();
                    vp3.b = wp3.a();
                    vp3.c = wp3.l();
                    vp3.o = wp3.getFlags();
                    vp3.X = wp3.d();
                    vp3.Y = wp3.getExtras();
                    up3 = vp3;
                }
                up3.h((ClipData) create.second);
                pair = Pair.create(build, up3.build());
            }
        }
        xp3 xp33 = (xp3) pair.first;
        xp3 xp34 = (xp3) pair.second;
        if (xp33 != null) {
            wp3 wp32 = xp33.a;
            if (wp32.a().getItemCount() > 0) {
                uri = wp32.a().getItemAt(0).getUri();
            }
        }
        if (uri != null) {
            this.a.invoke(uri);
        }
        return xp34;
    }
}
