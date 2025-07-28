package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: je  reason: default package */
public abstract class je {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final float b = 1.0f;

    public static int a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil((double) (b * f));
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Bitmap bitmap = (Bitmap) arrayList.get(i);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList2.add(new WeakReference(bitmap));
                }
            }
            d(new ie(arrayList2, 0));
        }
    }

    public static void d(Runnable runnable) {
        e(runnable, 0);
    }

    public static void e(Runnable runnable, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        Handler handler = a;
        if (i == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
    }
}
