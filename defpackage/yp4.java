package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: yp4  reason: default package */
public final class yp4 implements cn0 {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    public final void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.a.remove(bitmap);
        bitmap.recycle();
    }

    public final Object get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(createBitmap);
        return createBitmap;
    }
}
